<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileUploadForm</title>
</head>
<body>
<form action="/springmvc3/fileUpload/fileUploadProc.do" method="post"
	enctype="multipart/form-data">
제목 : <input type="text" name="title" /><br />
파일 : <input type="file" name="uploadFile" /><br />
<input type="submit" value="전송" />
</form>
</body>
</html>