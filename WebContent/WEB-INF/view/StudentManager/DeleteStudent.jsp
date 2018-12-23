<sec:authorize access="hasAnyRole('ROLE_STUDENT_MANAGER')">	
	<div>
	   <form:form  action="RemoveStudent" method="POST" class="ui form">
	   		<p>Username:    <input type="text" name="username">
	   		<p><input type="submit">
   		</form:form>
	</div>
</sec:authorize>