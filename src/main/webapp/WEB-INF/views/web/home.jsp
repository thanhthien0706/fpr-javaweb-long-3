<%@ include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>Home Page</title>

<body>
	<h3 class="mb-4 font-weight-bold">View Content</h3>

	<table class="table">
		<thead class="thead-light">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Title</th>
				<th scope="col">Brief</th>
				<th scope="col">Created Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${contents}">
				<tr>
					<th scope="row">${item.id }</th>
					<td>${item.title }</td>
					<td>${item.brief }</td>
					<td>${item.createdTime}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>