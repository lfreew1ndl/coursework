var idBlocked = "0";
var idBlocked2 = "0";
var idBlocked3 = "0";



function off(id,offString,onString) {
	if (idBlocked !== "0" ){
		var but = document.getElementById(idBlocked);
		but.classList.remove("blocked");
		but.classList.add("button8");
		but.disabled = false;
	}	
	idBlocked = id;
	var but = document.getElementById(id);
	var offDiv = document.getElementById(offString);
	var onDiv = document.getElementById(onString);

	onDiv.style.display = 'none';
	offDiv.style.display = 'block';
	but.disabled = true;
	but.classList.remove("button8");
	but.classList.add("blocked");
}

function off2(id) {
	if (idBlocked2 !== "0" ){
		var but = document.getElementById(idBlocked2);
		but.classList.remove("blocked2");
		but.classList.add("button6");
		but.disabled = false;
	}	
	var tempId = idBlocked2;
	idBlocked2 = id;
	var but = document.getElementById(id);
	var firstId = "comp"+id.substring(1,id.length);
	if (tempId !== "0"){
		var secondId = "comp"+tempId.substring(1,tempId.length);
		var temp2 = document.getElementById(secondId);
		temp2.style.display = 'none';
	}
	var temp1 = document.getElementById(firstId);
	temp1.style.display = 'block';
	but.disabled = true;
	but.classList.remove("button6");
	but.classList.add("blocked2");
}

function off3(id) {
	if (idBlocked3 !== "0" ){
		var but = document.getElementById(idBlocked3);
		but.classList.remove("blocked2");
		but.classList.add("button6");
		but.disabled = false;
	}	
	idBlocked3 = id;
	var but = document.getElementById(id);

	but.disabled = true;
	but.classList.remove("button6");
	but.classList.add("blocked2");
}