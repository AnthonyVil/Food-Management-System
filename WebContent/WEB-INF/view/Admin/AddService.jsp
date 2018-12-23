<sec:authorize access="hasAnyRole('ROLE_ADMIN')">	
	<div>
	   <form:form  action="AddedService" method="POST" class="ui form">
	   		<p>Service:   <input type="text" name="service">
	   		<p>Administrator Permission:   <input type="text" name="administrator">
	   		<p>Supervisor Permission:   <input type="text" name="supervisor">
	   		<p>Student Manager Permission:   <input type="text" name="studentmanager">
	   		<p>Document Manager Permission:   <input type="text" name="documentmanager">
	   		<p><input type="submit">
	   </form:form>
   </div>
</sec:authorize>