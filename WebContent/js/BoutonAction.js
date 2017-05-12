/*
 * Gestion des boutons
 * 
 */

$(document).ready(function(){
	// ____________ UP ____________
	$("#ButtonUp").click(function(){
		$.post("rest/cmd/UP",
				{},
				function(data,status){
					alert("Post Done received data: " + data + "\nStatus: " + status);
				});    
		});
	
	// ____________ DOWN ____________
	$("#ButtonDown").click(function(){
		$.post("rest/cmd/DOWN",
				{},
				function(data,status){
					alert("Post Done received data: " + data + "\nStatus: " + status);
				});    
		});
	
	// ____________ LEFT ____________
	$("#ButtonLeft").click(function(){
		$.post("rest/cmd/LEFT",
				{},
				function(data,status){
					alert("Post Done received data: " + data + "\nStatus: " + status);
				});    
		});
	
	// ____________ RIGHT ____________
	$("#ButtonRight").click(function(){
		$.post("rest/cmd/RIGHT",
				{},
				function(data,status){
					alert("Post Done received data: " + data + "\nStatus: " + status);
				});    
		});
	  
	// ____________ RESET ____________
	  $("#ButtonReset").click(function(){
		  	$.get("rest/cmd/env",
	  		  function(data,status){
		  		
		  		for(i in data.data){
		  			$("#myContent").append("<h6>---------------------------</h6>");
		  			$("#myContent").append("<h5> X:"+data.data[i].x+",Y:"+data.data[i].y+"</h5>");
		  			$("#myContent").append("<h5> Value:"+data.data[i].val+"</h5>");
		  			$("#myContent").append("<h6>---------------------------</h6>");
		  			$("#mylastContent").text(data.data[i].val);
		  		}
	  		    alert("Get Done received data: " + data + "\nStatus: " + status);
	  	});    
	});
});


