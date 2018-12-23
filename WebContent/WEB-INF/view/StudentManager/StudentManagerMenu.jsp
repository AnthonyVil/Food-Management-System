<sec:authorize access="hasAnyRole('ROLE_STUDENT_MANAGER')">

	<form
		action="${pageContext.request.contextPath}/studentmanager/AddStudent">
		<input style="font-size: 35px" type="submit" value="Add a Student">
	</form>
	<br>
	<form
		action="${pageContext.request.contextPath}/studentmanager/DeleteStudent">
		<input style="font-size: 35px" type="submit" value="Delete a Student">
	</form>
	<br>
	<form
		action="${pageContext.request.contextPath}/studentmanager/UpdateStudent">
		<input style="font-size: 35px" type="submit" value="Update a Student">
	</form>
	<br>
	<form
		action="${pageContext.request.contextPath}/studentmanager/CheckStudent">
		<input style="font-size: 35px" type="submit" value="Check for Student">
	</form>
	<br>
	<form
		action="${pageContext.request.contextPath}/studentmanager/GetStudentTable">
		<input style="font-size: 35px" type="submit" value="Print Students">
	</form>
	<br>
	<form
		action="${pageContext.request.contextPath}/studentmanager/SubmitForm">
		<input style="font-size: 35px" type="submit" value="Submit Form">
	</form>

</sec:authorize>