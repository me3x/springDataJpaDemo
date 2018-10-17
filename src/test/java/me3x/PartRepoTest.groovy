package me3x

import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PartRepoTest extends Specification {

    @Autowired
    TestRestTemplate restTemplate

    @Value('${spring.data.rest.basePath}')
    String restBasePath

    void setup() {
    }

    void cleanup() {
    }

    def "Should return parts"() {
        when:
            def response = restTemplate.getForObject("${restBasePath}/participants", String.class)
        then:
            def json = new JsonSlurper().parseText(response)
            json._embedded.parts[0].name == 'Matt'
    }

    def "Should return part roles"() {
        when:
            def response = restTemplate.getForObject("${restBasePath}/participants/search/findBy", String.class)
        then:
            def json = new JsonSlurper().parseText(response)
            json._embedded.parts[0].name == 'Matt'
    }
}
