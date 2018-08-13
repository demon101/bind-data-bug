package testb

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class SomeCompanySpec extends Specification implements DomainUnitTest<SomeCompany> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
