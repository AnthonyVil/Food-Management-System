<sec:authorize access="hasAnyRole('ROLE_STUDENT_MANAGER')">	
	<div id="container">
		<div id="content">
			<!--  add our HTML table here -->
			<table class="ui celled  striped table">
				<tr>
					<th>Username</th>
					<th>Password</th>
					<th>Home Town</th>
					<th>Documents</th>
					<th>Student Income</th>
					<th>Family Income</th>
					<th>Mother Job</th>
					<th>Father Job</th>
					<th>Siblings</th>
					<th>Document Validation</th>
					<th>Rating</th>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="cStudent" items="${student}">
					<tr>
						<td>${cStudent.username}</td>
						<td>${cStudent.password}</td>
						<td>${cStudent.home_town}</td>
						<td>${cStudent.documents}</td>
						<td>${cStudent.student_income}</td>
						<td>${cStudent.family_income}</td>
						<td>${cStudent.mother_job}</td>
						<td>${cStudent.father_job}</td>
						<td>${cStudent.siblings}</td>
						<td>${cStudent.document_isValidated}</td>
						<td>${cStudent.student_rating}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</sec:authorize>
	