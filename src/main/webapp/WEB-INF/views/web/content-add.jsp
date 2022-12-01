<%@ include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>Add Content Page</title>


<body>
	<h3 class="mb-4 font-weight-bold">Add Content</h3>
	<form action="<c:url value='/admin/content-add'/>" method="post">
		<div class="form-group">
			<label for="titleInput">Title</label> <input type="text"
				class="form-control" id="titleInput" placeholder="Enter title"
				name="title">
		</div>

		<div class="form-group">
			<label for="briefInput">Brief</label>
			<textarea class="form-control" id="briefInput" rows="3" name="brief"></textarea>
		</div>
		<div class="form-group">
			<label for="contentInput">Content</label>
			<textarea class="form-control" id="contentInput" rows="8"
				name="content"></textarea>
		</div>
		<div>
			<button type="submit" class="btn btn-primary">Submit</button>
			<a href="<c:url value='/admin/content-add'/>"
				class="btn btn-secondary">Reset</a>
		</div>
	</form>
</body>
