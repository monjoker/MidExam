<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
}
label{
	color: red
}
</style>
</head>
<body>
	<form>
		<h1>Danh sách sách</h1>
		<button name="insert">Thêm</button>
		<label>${message}</label>
	</form>
	<table class="table">
		<tr>
			<th>Mã sách</th>
			<th>Tên sách</th>
			<th>Thể loại</th>
			<th>Giá</th>
			<th>Năm xuất bản</th>
			<th>Số lượng</th>
			<th></th>
		</tr>
		<c:forEach var="u" items="${sach}">
			<tr>
				<td>${u.maSach}</td>
				<td>${u.tenSach}</td>
				<td>${u.loaiSach.tenLoai}</td>
				<td>${u.gia}</td>
				<td>${u.namXuatBan}</td>
				<td>${u.soLuong}</td>
				<td><a href="delete/${fn:trim(u.maSach)}.htm">Delete</a> <a
					href="update/${fn:trim(u.maSach)}.htm">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>