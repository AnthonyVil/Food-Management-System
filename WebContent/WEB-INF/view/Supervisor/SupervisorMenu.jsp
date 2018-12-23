<sec:authorize access="hasAnyRole('ROLE_SUPERVISOR')">
	
	<form action="${pageContext.request.contextPath}/supervisor/UpdateMaxStudents">
		<input style="font-size: 20px" type="submit" value="Update Max Number of Students">
	</form>

</sec:authorize>