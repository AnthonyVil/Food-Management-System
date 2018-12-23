<sec:authorize access="hasAnyRole('ROLE_ADMIN')">	
		<div id="content">
			<!--  add our HTML table here -->
			<table class="ui celled  striped table">
				<tr>
					<th>Service</th>
					<th>Administrator</th>
					<th>Supervisor</th>
					<th>Document Manager</th>
					<th>Student Manager</th>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="cAdmin" items="${admin}">
					<tr>
						<td>${cAdmin.services}</td>
						<td>${cAdmin.administrator}</td>
						<td>${cAdmin.supervisor}</td>
						<td>${cAdmin.student_manager}</td>
						<td>${cAdmin.document_manager}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</sec:authorize>
	