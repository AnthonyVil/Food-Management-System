<sec:authorize access="hasAnyRole('ROLE_STUDENT_MANAGER')">

	<div>
	   <form:form  action="SaveStudent" method="POST" class="ui form">
	   		<p>Username:   <input type="text" name="username">
	   		<p>Password:   <input type="password" name="password">
			<p>Home Town:   <input type="text" name="homeTown">
			<p>Number of Documents:
			<select name="documents">
				<option value="Yes">Yes</option>
				<option value="No">No</option>
			</select>
	   		</p>
			<p>Student Income:   <input type="number" min="0" name="studentIncome">
			<p>Family Income:   <input type="number" min="0" name="familyIncome">
			<p>Mother Job:
			<select name="motherJob">
				<option value="Yes">Yes</option>
				<option value="No">No</option>
			</select>
	   		</p>
	   		<p>Father Job:
			<select name="fatherJob">
				<option value="Yes">Yes</option>
				<option value="No">No</option>
			</select>
	   		</p>
	   		<p>Siblings:
			<select name="siblings">
				<option value="Yes">Yes</option>
				<option value="No">No</option>
			</select>
	   		</p>
   			<input type="submit">
  		</form:form>
	</div>

</sec:authorize>