package racetrack

class User {

	String name
	String password
	String role = "user"

    static constraints = {
    	name(blank:false, nullable:false, unique:true)
    	password(password:true)
    	role(inList:["user", "admin"])
    }

    String toString() {
    	login
    }
}
