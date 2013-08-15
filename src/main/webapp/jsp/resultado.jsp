<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
	<%@include file="/jsp/head.jsp"%>
</head>

<body>
	<br> 
	uploadFicheroFileName:
	<ul>
		<s:iterator value="uploadFicheroFileName">
			<li><s:property /></li>
		</s:iterator>
	</ul>
	<br> 
	uploadFicheroContentType
	<ul>
	    <s:iterator value="uploadFicheroContentType">
			<li><s:property />
		</s:iterator></li>
	</ul>	
	
	<%@include file="/jsp/footer.jsp"%>
</body>
</html>