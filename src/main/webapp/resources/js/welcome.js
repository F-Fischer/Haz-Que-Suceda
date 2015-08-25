$(document).ready(function() {
	
	
	$.post("getProjects", function(response){
		
		var proyectos = JSON.parse(response);
		
		for(var i = 0; i < proyectos.length; i++){
			var proyecto = '<div class="col-sm-4 col-lg-4 col-md-4"> <div class="thumbnail"> <img src="http://placehold.it/320x150" alt=""> ' +
			'<div class="caption">  <h4>'+ proyectos[i].name +'<h4> <p> ' +proyectos[i].descripcion + ' </p> </div> <div class="ratings">' +
			'<p class="pull-right">15 reviews</p><p> <span class="glyphicon glyphicon-star"></span> <span class="glyphicon glyphicon-star"></span> <span ' +
			'class="glyphicon glyphicon-star"></span> <span	class="glyphicon glyphicon-star"></span> <span class="glyphicon glyphicon-star"></span> ' +
			'</p></div> </div></div>';
			$("#proyectos").append(proyecto);
		}
	});
});