<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	${message}
	<form:form action="insert.htm" modelAttribute="record" method="post">
		<div>
			<label>Nhân viên</label>
			<form:select path="staff.id" items="${staffs}" itemValue="id"
				itemLabel="name" />
		</div>
		<div>
			<label>Nhân viên</label>
			<form:select path="staff.id" items="${staffs}" itemValue="id"
				itemLabel="name" />
		</div>
		<div>
			<label>Nhân viên</label>
			<form:select path="staff.id" items="${staffs}" itemValue="id"
				itemLabel="name" />
		</div>
		<div>
			<label>Nhân viên</label>
			<form:select path="staff.id" items="${staffs}" itemValue="id"
				itemLabel="name" />
		</div>
		<div>
			<label>Nhân viên</label>
			<form:select path="staff.id" items="${staffs}" itemValue="id"
				itemLabel="name" />
		</div>
		<div>
			<label>Nhân viên</label>
			<form:select path="staff.id" items="${staffs}" itemValue="id"
				itemLabel="name" />
		</div>
		<div>
			<button>Insert</button>
		</div>
	</form:form>
</body>
</html>