<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>


<br/><br/>
<!-- 
<c:if test="${not empty pageContext.request.userPrincipal}">
	is log In 
</c:if>
<br/>

<c:if test="${empty pageContext.request.userPrincipal}">
	is log Out 
</c:if>
<br/>

usr Id = ${pageContext.request.userPrincipal.name}<br/>
<a href="/j_spring_security_logout">log out</a>
<br/>

 -->
 <s:authorize ifAnyGranted="ROLE_USER">
 	is log In <br/>
 </s:authorize>
 
 <s:authorize ifNotGranted ="ROLE_USER">
 	is log Out<br/>
 </s:authorize>
 <br/>
 usr ID  : <s:authentication property="name"/><br/>
 <a href="/j_spring_security_logout">log out</a>
 