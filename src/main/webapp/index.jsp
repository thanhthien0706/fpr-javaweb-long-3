<%@ include file="/common/taglib.jsp"%>
<security:authorize access="isAnonymous()">
	<c:redirect url="/login" />
</security:authorize>
<security:authorize access="isAuthenticated()">
	<c:redirect url="/admin/home" />
</security:authorize>