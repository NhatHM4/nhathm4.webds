<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container py-5">
		<h4 class="text-uppercase text-center">HTML 5 form inputs in
			bootstrap 4</h4>
		<div class="card">
			<div class="card-header bg-danger text-white">
				<h4 class="text-uppercase text-center">HTML 5 from inputs</h4>
			</div>
			<div class="card-body">
				<form:form method="POST"
					action="${pageContext.request.contextPath}/editduAn"
					modelAttribute="duAnBDS" enctype="multipart/form-data">
					
					<div class="form-row">
						<div class="col-md-12">
						<form:hidden class="form-control" path="Id" />
							<label>Tên Dự Án</label>
							<form:input type="text" class="form-control" path="tenDuAn" />
						</div>
						<div class="col-md-12 pt-2">
							<label>Mô tả</label>
							<form:textarea rows="5" cols="30" path="moTa"
								class="form-control" />
						</div>
					</div>
					<div class = "row">
					<div class="col-md-5 pt-2">
						File to upload:
						<form:input type="file" name="file" path="file" />
					</div>
					
					<div class="col-md-6 pt-2">
						<img src="${duAnBDS.linkImage }" class="img-thumbnail" alt="Responsive image" style = "height: 200px; width: 200px">
						
					</div></div>
					
					<div style="margin-top: 15px;">
						<button type="submit" class="btn btn-primary rounded-0">Submit</button>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>