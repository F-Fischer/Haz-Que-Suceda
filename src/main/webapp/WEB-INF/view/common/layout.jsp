<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<?xml version="1.0" encoding="utf-8" ?>
<!DOCTYPE HTML>
<html> 
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
		<!-----------------------------------------
		[Styles]
		------------------------------------------>
		<link 	rel="stylesheet"	type="text/css" 	href="resources/css/<tiles:getAsString name="style"/>"	/>
		<link 	rel="stylesheet"	type="text/css" 	href="resources/js/bootstrap-3.3.5-dist/css/bootstrap.min.css"	/>
		<link 	rel="stylesheet"	type="text/css" 	href="resources/js/bootstrap-3.3.5-dist/css/bootstrap-theme.css"	/>
		
		<!-----------------------------------------
		[Scripts]
		------------------------------------------>
		
		<script type="text/javascript" src="resources/js/jquery-1.11.3.js"></script>
		<script type="text/javascript" src="resources/js/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="resources/js/welcome.js"></script>
		
		<title>
			<tiles:getAsString name="title"/>
		</title>
	</head> 

	<body> 
    	<tiles:insertAttribute name="header"/> 
		<tiles:insertAttribute name="body"	/>
    	<tiles:insertAttribute name="footer"/> 
	</body> 
</html>
