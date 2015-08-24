<body>
	<div class="sr-content center">
		<h3 class="title">¡Bienvenida <%=request.getSession().getAttribute("user") %>!</h3>
	</div>
	
	<div>
		<h3>Proyectos</h3>
	</div>
	
	<table id="proyectosTable" class="table table-bordered">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nombre</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
	
	<!-- 
	<div>
		<a href="j_spring_security_logout"><button>Logout</button></a>
	</div>
	
	 -->
</body>
