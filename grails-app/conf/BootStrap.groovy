import racetrack.*;
import grails.util.*;

class BootStrap {

    def init = { servletContext ->
    	switch(GrailsUtil.environment) {
    		case "development":
		    	def jane = new Runner(firstName:"Jane",
		    		lastName:"Doe",
		    		dateOfBirth: (new Date() - 365*30),
		    		gender: "F",
		    		address: "123 Main St",
		    		city: "Goose",
		    		state: "NC",
		    		zipCode: "12345",
		    		email: "rpeleias@hotmail.com")
		    	jane.save()

		    	if (jane.hasErrors()) {
		    		println jane.errors
		    	}

		    	def trot = new Race(
		    		name: "Turkey Trot",
		    		startDate: (new Date() + 90),
		    		city: "Duck",
		    		state: "NC",
		    		distance: 5.0,
		    		cost: 20.0,
		    		maxRunners: 350)
		    	
		    	trot.save()
		    	if (trot.hasErrors()) {
		    		println trot.errors
		    	}

		    	def reg = new Registration (
		    		paid: false,
		    		runner: jane,
		    		race: trot)

		    	reg.save()
		    	if (reg.hasErrors()) {
		    		println reg.errors
		    	}

		    	break
		    case "producion" : break	
    	}

    	
    }

    def destroy = {
    }
}
