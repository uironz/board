<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<title>board</title>
</head>
<body>

 <s:authorize ifAnyGranted="ROLE_USER">
 	is log In <br/>
 </s:authorize>
 
 <s:authorize ifNotGranted ="ROLE_USER">
 	is log Out<br/>
 </s:authorize>
 <br/>
 usr ID  : <s:authentication property="name"/><br/>
 <a href="/j_spring_security_logout">log out</a>
 
 
 
<h2>게시판 목록</h2>
${fn:length(list)}////////
<table style="border:1px solid #ccc">
	<colgroup>
		<col width="10%"/>
		<col width="*"/>
		<col width="15%"/>
		<col width="20%"/>
	</colgroup>
	<thead>
		<tr>
			<th scope="col">글번호</th>
			<th scope="col">제목</th>
			<th scope="col">조회수</th>
			<th scope="col">작성일</th>
		</tr>
	</thead>
	<tbody>
		<c:choose>
			<c:when test="${fn:length(list) > 0}">
				<c:forEach items="${list }" var="row">
					<tr>
						<td>${row.idx }</td>
						<td>${row.usrId }</td>
						<td></td>
						<td></td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="4">조회된 결과가 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
		
	</tbody>
</table>
<a href="/insert">글 등록</a>

<br/><br/>

캐시된목록 
<table style="border:1px solid #ccc">
	<colgroup>
		<col width="10%"/>
		<col width="*"/>
		<col width="15%"/>
		<col width="20%"/>
	</colgroup>
	<thead>
		<tr>
			<th scope="col">글번호</th>
			<th scope="col">제목</th>
			<th scope="col">조회수</th>
			<th scope="col">작성일</th>
		</tr>
	</thead>
	<tbody>
		<c:choose>
			<c:when test="${fn:length(listCached) > 0}">
				<c:forEach items="${listCached }" var="row">
					<tr>
						<td>${row.idx }</td>
						<td>${row.usrId }</td>
						<td></td>
						<td></td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="4">조회된 결과가 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
		
	</tbody>
</table>

</body>
</html>