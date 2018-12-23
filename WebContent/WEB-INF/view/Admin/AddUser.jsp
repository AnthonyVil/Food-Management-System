<sec:authorize access="hasAnyRole('ROLE_ADMIN')">	
	<div>
	   <form:form  action="SaveUser" method="POST" class="ui form">
	   		<p>Username:   <input type="text" name="username">
	   		<p>Password:   <input type="password" name="password">
	   		<p>Role:       
				<select name="role">
  					<option value="ROLE_SUPERVISOR">Supervisor</option>
  					<option value="ROLE_STUDENT_MANAGER">Student Manager</option>
  					<option value="ROLE_DOCUMENT_MANAGER">Document Manager</option>
				</select>
   			<p><input type="submit">
  		</form:form>
	</div>
</sec:authorize>