<sec:authorize access="hasAnyRole('ROLE_STUDENT_MANAGER')">	
	<div>
	   <form:form  action="SubmittedForm" method="POST" class="ui form">
	   		<p>Which student wants to submit the form:</p> <input type="text" name="username">
	   		<p>Submit Form:</p>
	   		<select name="subForm">
  					<option value="Yes">Yes</option>
					<option value="No">No</option>
			</select>
	   		<input type="submit">
	   </form:form>
   </div>
</sec:authorize>
<% if(request.getParameter("exist") == null){
	out.println("");
} else{
	out.println("<b>"+request.getParameter("exist")+"</b>");
}
%>