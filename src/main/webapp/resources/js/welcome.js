$(document).ready(function() {
	
	
	$.post("getProjects", function(response){
		
		var proyectos = JSON.parse(response);
		
		for(var i = 0; i < proyectos.length; i++){
			var tr = "<tr><td>" + proyectos[i].id + "</td><td>" + proyectos[i].name + "</td></tr>";
			$("#proyectosTable > tbody:last-child").append(tr);
		}
	});
});