<sec:authorize access="hasAnyRole('ROLE_STUDENT_MANAGER')">	
	<div>
	   <form:form  action="ModifiedStudent" method="POST" class="ui form">
	   		<p>What do you want to update</p>
	   		<select name="column">
  					<option value="username">username</option>
					<option value="password">password</option>
					<option value="home_town">home_town</option>
					<option value="documents">documents</option>
					<option value="student_income">student income</option>
					<option value="family_income">family income</option>
					<option value="mother_job">mother job</option>
					<option value="father_job">father job</option>
					<option value="siblings">siblings</option>
			</select>
	   		<p>Enter new value: <input type="text" name="value">
	   		<p>If you want to change mother_job,father_job,siblings,documents the available options are 'YES' and 'NO'</p>
	   		<p>Enter existent username: <input type="text" name="existUsername">
	   		<p><input type="submit">
	   </form:form>
   </div>
</sec:authorize>