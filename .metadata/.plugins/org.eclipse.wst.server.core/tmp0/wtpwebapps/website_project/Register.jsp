<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Welcome to Minjoo's Website!</title>
<link href="style.css" rel="stylesheet" type="text/css">

<script language="JavaScript" src="script.js"></script>
</head>
<body><br><br>
<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="<%=request.getContextPath() %>/images/basicInfo.JPG"/></div>
<hr>
<table border="1" cellpadding="18" cellspacing="1" width="80%" align="center">
<form name="regForm" method="post" action="RegisterProc.jsp">
	<tr>
		<td width="13%" align="center" bgcolor="#EFEFEF">
		ID
		</td>
		<td width="60%"><input type="text" name="mem_id" size="18">
		<input type="button" value="ID �ߺ�Ȯ��" onClick="idCheck(this.form.mem_id.value)"></td>
	</tr>
	<tr>
		<td width="13%" align="center" bgcolor="#EFEFEF">Password
</td>
		<td width="60%"><input type="password" name="mem_passwd" size="18">
	</tr>
	<tr>
		<td width="13%" align="center" bgcolor="#EFEFEF">Confirm Password</td>
		<td width="60%"><input type="password" name="mem_repasswd" size="18">
	</tr>
	<tr>
		<td width="13%" align="center" bgcolor="#EFEFEF">First Name</td>
		<td width="60%"><input type="text" name="mem_firstname" size="18"></td>
	</tr>
	<tr>
		<td width="13%" align="center" bgcolor="#EFEFEF">Last Name</td>
		<td width="60%"><input type="text" name="mem_lastname" size="18"></td>
	</tr>
	<tr>
		<td width="13%" align="center" bgcolor="#EFEFEF">EMAIL ADDRESS</td>
		<td width="60%"><input type="text" name="mem_email" size="27">
	</tr>
	<tr>
		<td width="13%" align="center" bgcolor="#EFEFEF">PHONE NUMBER</td>
		<td width="30%"><input type="text" name="mem_phone1" size="9">&nbsp;-&nbsp;
		<input type="text" name="mem_phone2" size="10">&nbsp;-&nbsp;<input type="text" name="mem_phone3" size="10"></td>
	</tr>
	
</table>
<br><br>
<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="<%=request.getContextPath() %>/images/additional.JPG"/></div>
<hr>
<table border="1" cellpadding="18" cellspacing="1" width="80%" align="center">
<tr>
		<td width="13%" align="center" bgcolor="#EFEFEF">BIRTHDAY</td>
		<td width="60%"><input type="text" name="mem_bday" size="18">
		(YYYYMMDD)</td>
</tr>
</table>
</form>
<br>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<div align="center">
<img src="<%=request.getContextPath() %>/images/submit.JPG"/>
<img src="<%=request.getContextPath() %>/images/goback.JPG"/></div>
</body>
</html>