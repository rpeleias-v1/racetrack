package racetrack

class Runner {

    static constraints = {
    	firstName(blank:false)
    	lastName(blank:false)
    	dateOfBirth()
    	gender(inList:["M", "F"])
    	address()
    	state()
    	zipCode()
    	email(email:true)
    }

    static hasMany = [registrations:Registration]

    String firstName
    String lastName
    Date dateOfBirth
    String gender
    String address
    String city
    String state
    String zipCode
    String email

    String toString() {
    	"${lastName}, ${firstName} (${email})"
    }
}
