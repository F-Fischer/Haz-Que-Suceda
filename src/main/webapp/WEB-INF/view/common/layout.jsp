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
		<link   rel="stylesheet"	type="text/css" 	href="resources/js/bootstrap-3.3.5-dist/css/animate.min.css" >
		<link	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    	<link 	href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    	<link   rel="stylesheet"    type="text/css"    	href="resources/js/bootstrap-3.3.5-dist/font-awesome/css/font-awesome.min.css" >
    	<link   rel="stylesheet" 	type="text/css" 	href="resources/js/bootstrap-3.3.5-dist/css/creative.css" >
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
    	
    	
    	 <!-- jQuery -->
    <script src="resources/js/bootstrap-3.3.5-dist/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="resources/js/bootstrap-3.3.5-dist/js/jquery.easing.min.js"></script>
    <script src="resources/js/bootstrap-3.3.5-dist/js/jquery.fittext.js"></script>
    <script src="resources/js/bootstrap-3.3.5-dist/js/wow.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="resources/js/bootstrap-3.3.5-dist/js/creative.js"></script>
	</body> 
</html>
