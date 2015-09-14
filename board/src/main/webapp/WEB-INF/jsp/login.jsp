<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>board</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<body>

<c:if test="${param.ng != null }">
<br/><br/>
LOGIN NG<br/>
	<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != null }">
		message = ${SPRING_SECURITY_LAST_EXCEPTION.message }
	</c:if>
<br/><br/>	
</c:if>

<form name="form" method="post" action="/j_spring_security_check">
	id : <input type="text" id="j_username" name="j_username" value="admin" ><br/>
	pwd : <input type="text" id="j_password" name="j_password"  value="1234"><br/>
	<input type="submit" value="전송">
</form>


</body>
</html>