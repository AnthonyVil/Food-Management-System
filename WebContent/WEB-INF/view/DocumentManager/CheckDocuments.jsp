<sec:authorize access="hasAnyRole('ROLE_DOCUMENT_MANAGER')">	
	<div>
	   <form:form  action="CheckedDocuments" method="POST" class="ui form">
	   		<p>Which student's documents you want to check:</p> <input type="text" name="username">
	   		<p>Approved Documents:</p>
	   		<select name="appdoc">
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