package racetrack

class Registration {

	String name
	Date dateOfBirth
	String gender
	String address
	String city
	String state
	String zipCode
	String email
	Date dateCreated
	Date lastCreated

	static belongsTo = [
		race: Race
	]
	
    static mapping = {
    	autoTimestamp false
    }

    def beforeInsert = {
    	println "Inserting a Registration"
    }

    def beforeUpdate = {
    	println "Updating a Registration"
    }

    def beforeDelete = {
    	println "Deleting a Registration"
    }

    def onLoad = {
    	println "Loading a Registration"
    }
}
