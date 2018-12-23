<sec:authorize access="hasAnyRole('ROLE_DOCUMENT_MANAGER')">	
	<div>
	   <form:form  action="UpdatedRating" method="POST" class="ui form">
	   		<p>Which student's rating you want to update:</p> <input type="text" name="username">
	   		<input type="submit" value="Calculate Rate">
	   </form:form>
   </div>
</sec:authorize>
<% if(request.getParameter("exist") == null){
	out.println("");
} else{
	out.println("<b>"+request.getParameter("exist")+"</b>");
}
%>