// Event Class

var event = {description: "", school: "", sDate:"",sTime:"", eTime:"", facility, maxUsers:0, ID:0};

function addEvent(description, school, sDate, sTime, eTime, facility, maxUsers, ID){
	"use strict";
	var x = new event(description, sDate, eDate, facility, maxUsers, ID);
	
}
function removeEvent(event){
	"use strict";
	event.description = null;
	event.sDate = null;
	event.sTime = null;
	event.eTime = null;
	event.maxUsers = null;
}

