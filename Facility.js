// Facility Class 
var facility = {school: "",sfacility: "", price: 0, id : 0, availability : true, size: 0 , occupants: 0}
function bookFacility(facility){
	if(facility.availability == true){
		facility.availability = false;
		return true;
	}

}
function addFacility(school, sfacility, price, id, availability, size, occupants){
	 var x = new facility(school, sfacility, price, id, availability, size,occupants);
	
}
function deleteFacility(facility){
	facility.address ="";
	facility.price = null;
	facility.id = null;
	facility.availability = null;
	facility.size = null;
}

