<sec:authorize access="hasAnyRole('ROLE_DOCUMENT_MANAGER')">	

	<form
		action="${pageContext.request.contextPath}/documentmanager/CheckDocuments">
		<input style="font-size: 35px" type="submit" value="Check Documents">
	</form>
	<br>
	<form
		action="${pageContext.request.contextPath}/documentmanager/UpdateRating">
		<input style="font-size: 35px" type="submit" value="Update Rating">
	</form>
	<br>
	
</sec:authorize>