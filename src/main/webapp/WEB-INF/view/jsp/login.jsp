<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body onload='document.loginForm.username.focus();' class="body">
	<div id="login-box">

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg-error">${msg}</div>
		</c:if>

		<form name='loginForm'
			action="<c:url value='j_spring_security_check' />" method='POST'>
			<table>
				<tr>
					<td>Nombre de usuario:</td>
					<td><input type='text' name='username' value='' class="txt"></td>
				</tr>
				<tr>
					<td>Contraseña:</td>
					<td><input type='password' name='password' class="txt" /></td>
				</tr>
				<tr class="center">
					<td colspan='2'><input name="submit" type="submit"
						value="Entrar"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
