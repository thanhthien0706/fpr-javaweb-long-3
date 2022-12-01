<%@ include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>User Profile</title>

<body>
	<h3 class="mb-4 font-weight-bold">View User Content</h3>
	<form action="<c:url value='/admin/user/profile/${user.id }'/>"
		method="post">
		<div class="form-group">
			<label for="firstNameInput">First Name</label> <input type="text"
				class="form-control" id="firstNameInput" name="firstname"
				placeholder="Enter first name" value="${user.firstname }">
		</div>

		<div class="form-group">
			<label for="lastNameInput">Last Name</label> <input type="text"
				class="form-control" id="lastNameInput"
				placeholder="Enter last name" value="${user.lastname }"
				name="lastname">
		</div>

		<div class="form-group">
			<label for="lastNameInput">User Name</label> <input type="text"
				class="form-control" id="lastNameInput"
				placeholder="Enter last name" value="${user.username }"
				name="username">
		</div>

		<div class="form-group">
			<label for="lastNameInput">Email</label>
			<p class="">${user.email }</p>
		</div>

		<div class="form-group">
			<label for="phoneInput">Phone</label> <input type="text"
				class="form-control" id="phoneInput" placeholder="Enter phone"
				value="${user.phone }" name="phone">
		</div>

		<div class="form-group">
			<label for="descriptionInput">Description</label>
			<textarea class="form-control" id="descriptionInput" rows="5"
				name="description">${user.description  }</textarea>
		</div>
		<div>
			<button type="submit" class="btn btn-primary">Submit</button>
			<a type="submit" class="btn btn-secondary"
				href="<c:url value='/admin/user/profile'/>">Reset</a>
		</div>
	</form>
</body>

