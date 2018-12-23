<sec:authorize access="hasAnyRole('ROLE_SUPERVISOR')">

	<div>
	   <form:form  action="UpdatedMaxStudents" method="POST" class="ui form"> 
	   		Maximum Students:<input type="number" min="0" name="numberofStudents">
	   		<input type="submit">
	   </form:form>
	</div>


</sec:authorize>