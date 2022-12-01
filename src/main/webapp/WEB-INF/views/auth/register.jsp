<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous" />
</head>
<body>

	<div class="container">
		<c:choose>
			<c:when test="${notifi == true}">
				<div class="alert alert-success">
					<strong>Success!</strong> Create Account Of User
				</div>
			</c:when>
			<c:when test="${notifi == false}">
				<div class="alert alert-danger">
					<strong>Danger!</strong> Not Create Account
				</div>
			</c:when>
		</c:choose>
		<form action="<c:url value='/register'/>" method="post">
			<!-- Email input -->
			<div class="form-outline mb-4">
				<label class="form-label" for="usernameInput">User name</label> <input
					type="text" id="usernameInput" class="form-control" name="username" />
			</div>

			<!-- Email input -->
			<div class="form-outline mb-4">
				<label class="form-label" for="form2Example1">Email address</label>
				<input type="email" id="form2Example1" class="form-control"
					name="email" />
			</div>

			<!-- Password input -->
			<div class="form-outline mb-4">
				<label class="form-label" for="passInput">Password</label> <input
					type="password" id="passInput" class="form-control" name="password" />
			</div>

			<!-- Re-Password input -->
			<div class="form-outline mb-4">
				<label class="form-label" for="repassInput">Re Password</label> <input
					type="password" id="repassInput" class="form-control" />
			</div>

			<!-- Submit button -->
			<button type="submit" class="btn btn-primary btn-block mb-4">Register</button>

			<!-- Register buttons -->
			<div class="text-center">
				<p>
					you already account? <a href="<c:url value='/login' />">Login</a>
				</p>
			</div>
		</form>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>