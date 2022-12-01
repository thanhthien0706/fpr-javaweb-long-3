<%@ include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>User Profile</title>

<body>
	<h3 class="mb-4 font-weight-bold">View User Content
	</h3>
	<form>
		<div class="form-group">
			<label for="firstNameInput">First Name</label> <input type="text"
				class="form-control" id="firstNameInput"
				placeholder="Enter first name">
		</div>

		<div class="form-group">
			<label for="lastNameInput">Last Name</label> <input type="text"
				class="form-control" id="lastNameInput"
				placeholder="Enter last name">
		</div>

		<div class="form-group">
			<label for="lastNameInput">Last Name</label>
			<p class="">thanhthien@gmail.com</p>
		</div>

		<div class="form-group">
			<label for="phoneInput">Phone</label> <input type="text"
				class="form-control" id="phoneInput" placeholder="Enter phone">
		</div>

		<div class="form-group">
			<label for="descriptionInput">Description</label>
			<textarea class="form-control" id="descriptionInput" rows="5"></textarea>
		</div>
		<div>
			<button type="submit" class="btn btn-primary">Submit</button>
			<button type="submit" class="btn btn-secondary">Reset</button>
		</div>
	</form>
</body>

