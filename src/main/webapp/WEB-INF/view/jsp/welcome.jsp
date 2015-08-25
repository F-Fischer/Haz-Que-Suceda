<body>

	<div class="sr-content center">
		<br> <br>
		<h3 class="title">
			¡Bienvenido
			<%=request.getSession().getAttribute("user")%>!
		</h3>
	</div>

	<div>
		<h3>Proyectos</h3>
	</div>

	<div>
		<h4>Rubros</h4>
	</div>

	<div class="list-group col-md-3">
                    <a href="#" class="list-group-item">Proyecto generico</a>
                    <a href="#" class="list-group-item">Franquicias</a>
                    <a href="#" class="list-group-item">Start ups</a>
    </div>
    
	<div id="proyectos" class="col-md-9">
	
	</div>

	<!-- 
	<div>
		<a href="j_spring_security_logout"><button>Logout</button></a>
	</div>
	
	 -->
</body>