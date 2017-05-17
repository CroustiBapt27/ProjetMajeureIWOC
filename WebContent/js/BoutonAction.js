/*
 * Gestion des boutons
 * 
 */

$(document).ready(function(){
	// ____________ CHECK 1 ____________
	$("#checkbox1").click(function(){
		$.post("rest/cmd/CHECK1",
				{},
				function(data,status){
					alert("Post Done received data: " + data + "\nStatus: " + status);
				});    
		});
	
	// ____________ CHECK 2 ____________
	$("#checkbox2").click(function(){
		$.post("rest/cmd/CHECK2",
				{},
				function(data,status){
					alert("Post Done received data: " + data + "\nStatus: " + status);
				});    
		});
	
	// ____________ CHECK 3 ____________
	$("#checkbox3").click(function(){
		$.post("rest/cmd/CHECK3",
				{},
				function(data,status){
					alert("Post Done received data: " + data + "\nStatus: " + status);
				});    
		});
	
	// ____________ CHECK 4 ____________
	$("#checkbox4").click(function(){
		$.post("rest/cmd/CHECK4",
				{},
				function(data,status){
					alert("Post Done received data: " + data + "\nStatus: " + status);
				});    
		});
	
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
	
	// ____________ START ____________
	$("#ButtonStart").click(function(){
		$.post("rest/cmd/START",
				{},
				function(data,status){
					alert("Post Done received data: " + data + "\nStatus: " + status);
				});    
	});
	  
	// ____________ RESET ____________
	$("#ButtonReset").click(function(){
		$.post("rest/cmd/START",
				{},
				function(data,status){
					alert("Post Done received data: " + data + "\nStatus: " + status);
				});    
	});
	  
	  
	// ____________ START ____________
		$("#ButtonStart").click(function(){
			$.post("rest/cmd/START",
					{},
					function(data,status){
						alert("Post Done received data: " + data + "\nStatus: " + status);
					});    
		});
		
		// ____________ REFRESH ____________
		$("#ButtonRefresh").click(function(){
			$.post("rest/cmd/REFRESH",
					{},
					function(data,status){
						alert("Post Done received data: " + data + "\nStatus: " + status);
					});    
		});
		
		// ____________ STOP ____________
		$("#ButtonStop").click(function(){
			$.post("rest/cmd/STOP",
					{},
					function(data,status){
						alert("Post Done received data: " + data + "\nStatus: " + status);
					});    
		});
});


