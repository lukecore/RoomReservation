package roomreservation

import grails.plugin.springsecurity.annotation.Secured

@Secured("permitAll")
class PersonController {

    static scaffold = Person

}
