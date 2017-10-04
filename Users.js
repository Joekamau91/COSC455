// Users Class
var user = {name:"", email:"", username:"", password:"", phone:0};
function createUser(name, email, username, password, phone){
	"use strict";
	document.getelementbyID("user") = {name, email, username, password, phone};
}
function resetPass(newPassword){
	"use strict";
	newPassword = document.getelementbyID("newPassword");
	while(newpPassword === user.password){

		window.alert("New password cannot be the same as the current password");
	}
	user.password = newPassword;
}
function adminUpdateInfo(admin, newEmail, newUsername, newPhone){
	"use strict";
	user.email = document.getelementbyID("newEmail");
	user.username = document.getelementbyID("newUsername");
	user.phone = document.getelementbyID("newPhone"); 
}

function updateInfo(user, newEmail, newUsername, newPhone){
	"use strict";
	newEmail = document.getelementbyID("user.email");
	newUsername = document.getelementbyID("user.username");
	newPhone = document.getelementbyID("user.phone"); 
}
var admin = {name:"", email:"", username:"", password:"", phone:0 , ID: 0};
function resetPass2(admin, newPassword){
	"use strict";
	newPassword = document.getElementById(admin.password);
	if(newPassword === admin.password){
		window.alert("New password cannot be the same as the current password");
	}
}

