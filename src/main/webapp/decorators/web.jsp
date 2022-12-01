<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title><dec:title default="Trang Chu" /></title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
	integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<style>
/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 550px
}

/* Set gray background color and 100% height */
.sidenav {
	background-color: #f1f1f1;
	height: 100vh;
}

/* On small screens, set height to 'auto' for the grid */
@media screen and (max-width: 767px) {
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>


	<div class="container-fluid">
		<div class="row content">
			<div class="col-sm-3 sidenav hidden-xs">
				<h2>Logo</h2>

				<div class="row mb-3">
					<div class="col-md-10">
						<input type="search" id="form1" class="form-control"
							placeholder="Search" />
					</div>
					<div class="col-md-2">
						<button type="button" class="btn btn-primary" style="width: 100%">
							<i class="fa-solid fa-magnifying-glass"></i>
						</button>
					</div>
				</div>
				<ul class="nav flex-column nav-pills nav-stacked">
					<li class="${pageName == 'home' ?'active': '' }"><a
						href="<c:url value='/admin/home' />">View Contents</a></li>
					<li class="${pageName == 'content-add' ?'active': '' }"><a
						href="<c:url value='/admin/content-add' />">Form Content</a></li>
				</ul>
				<br>
			</div>
			<br>

			<div class="col-sm-9">

				<div class="my-4 d-flex justify-content-end">
					<div class="btn-group dropleft">
						<button type="button" class="btn btn-secondary dropdown-toggle"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							<i class="fa-solid fa-user"></i>
						</button>
						<div class="dropdown-menu">
							<a class="dropdown-item"
								href="<c:url value='/admin/user/profile'/>"><i
								class="fa-solid fa-user mr-2" /></i>User Profile</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="<c:url value='/logout'/>"><i
								class="fa-solid fa-right-from-bracket mr-2"></i>Logout</a>
						</div>
					</div>
				</div>

				<dec:body />

			</div>
		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>