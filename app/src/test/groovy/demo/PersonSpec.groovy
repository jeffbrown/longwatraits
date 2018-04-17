package demo

import grails.gorm.MultiTenant
import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

    void "test something"() {
        expect:"fix me"
        MultiTenant.isAssignableFrom(Person)
    }
}
