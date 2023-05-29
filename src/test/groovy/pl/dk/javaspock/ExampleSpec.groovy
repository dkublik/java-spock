package pl.dk.javaspock

import spock.lang.Specification

class ExampleSpec extends Specification {

    def "should work"() {
        when:
        int result = 2 + 3

        then:
        result == 5
    }
}
