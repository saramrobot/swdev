<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
</head>
<body>
<h2>Note</h2>

	<table>
		<colgroup>
			<col style="width:5%;" />
			<col style="width:auto;" />
		</colgroup>
		<thead>
			<tr>
				<th>NO</th>
				<th>Text</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${empty noteList }" >
					<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
				</c:when> 
				<c:when test="${!empty noteList}">
					<c:forEach var="list" items="${noteList}">
						<tr>
							<td><c:out value="${list.n_uid}"/></td>
							<td><c:out value="${list.n_text}"/></td>
						</tr>
					</c:forEach>
				</c:when>
			</c:choose>
		</tbody>
	</table>
</body>
</html>