package me3x;

import io.cucumber.java.en.Given;
import io.cucumber.java8.En;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ParticipantStepdef implements En {

    @Autowired
    PartRepo repo;

    @Autowired
    TestRestTemplate restTemplate;

    private PartRoleProjectionTestResoulrce partRole;

    public ParticipantStepdef() {
        Given("participant exists", () -> {
            Iterable<Part> parts = repo.findAll();
            assertThat(parts).isNotEmpty();
        });

        When("search for participant", () -> {
            partRole = restTemplate.getForObject("/api/roles/1", PartRoleProjectionTestResoulrce.class);
        });

        Then("participant found", () -> {
            assertRoleFound();
//            assertThat(true).isFalse();
        });
    }

    private void assertRoleFound() {
        assertThat(partRole.getFunction()).isEqualTo("DEPOSITORY");
    }

    @Given("part exists")
    public void partExists() {

    }

}
