<%@ page contentType="text/html; charset=UTF-8" import = "java.util.*, signUp.*"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="memMgr" class="signUp.MemberMgrPool" scope="page"/>
<%
String mem_id = (String)session.getAttribute("memID");
if(mem_id == null){
%>
  <script>
  alert("You are not logged in.");
  location.href="SessionMemberLogin.jsp";
  </script>
<% }
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to Minjoo's Website!</title>
<link href="style2.css" rel="stylesheet" type="text/css">
<script language = "JavaScript">
function inputCheck(theform){
	if(theform.name.value == ""){
		alert("Enter your name.");
		theform.name.focus();
		return false;
	}
	if(theform.email.value == ""){
	    alert("Enter your email.");
	    theform.email.focus();
	    return false;
	  }
	if(theform.title.value == ""){
	    alert("Enter the title.");
	    theform.title.focus();
	    return false;
	  }
	if(theform.content.value == ""){
	    alert("This post is empty.");
	    theform.content.focus();
	    return false;
	  }
	if(theform.pwd.value == ""){
	    alert("Enter the password.");
	    theform.pwd.focus();
	    return false;
	  }
	theform.submit();
	
}
</script>
</head>
<body>
<jsp:include page="header.html"/>
<%
String memberId = (String)session.getAttribute("memID");
Vector info = memMgr.findInfo(memberId);
int count = info.size();
for(int i = 0; i<count; i++){
  RegisterBean regBean = (RegisterBean)info.elementAt(i);
  String firstname = regBean.getMem_firstname();
  String lastname = regBean.getMem_lastname();
  System.out.println("firstname length: " + firstname.length() + " last name length: " + lastname.length() );
%>
<br>
<br>
<br>
<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;<img style="position:relative; LEFT:3%;" src = "<%=request.getContextPath() %>/images/writenewpost.gif"></div>
<form method="post" action="write_ok.jsp" name="wform">
<hr>
<table border="1" cellpadding="18" cellspacing="1" width="80%" align="center">
  <tr>
    <th width="13%" align="center" bgcolor="#EFEFEF">Name</th>
    <td width="60%"><%=firstname %>&nbsp;<%=lastname %>
    <input type="hidden" name="firstname" value="<%=firstname %>" >
    <input type="hidden" name="lastname" value="<%=lastname %>"/>
    <%
    System.out.println("first name: "+ firstname + " last name: "+ lastname);
    %></td>
    

  </tr>
  <tr>
    <th width="13%" align="center" bgcolor="#EFEFEF">Email</th>
    <td width="60%"><input type="text" name="email" size="40"></td>
  </tr>
  <tr>
    <th width="13%" align="center" bgcolor="#EFEFEF">Title</th>
    <td width="60%"><input type="text" name="title" size = "70"></td>
   </tr>
   <tr>
   <td colspan="2" width="100%"><textarea name="content" cols="50"></textarea></td>
   </tr>
   <tr>
      <th width="13%" align="center" bgcolor="#EFEFEF">Password</th>
      <td width="60%"><input type="password" name="pwd" size = "10"></td>
   </tr>
   <tr>
   <td style="border-bottom:transparent; 
   border-right:transparent;"><div>
   <a href="list.jsp"><img src="<%=request.getContextPath() %>/images/list.gif"></a></div></td>
   
   <td align="right" style="border-bottom:transparent;border-right:transparent;">
   <a href="#" onclick="history.back();"><img src="<%=request.getContextPath() %>/images/cancle.jpg"></a>
   <a href="#" onclick="inputCheck(wform);"><img src="<%=request.getContextPath() %>/images/submit.gif"></a></td>
   </tr>
<%} %>

</table>


</form>
</body>
</html>