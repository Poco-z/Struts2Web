<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/21 0021
  Time: 下午 4:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="convert">
    <s:textfield name="student1" label="student1"/>
    <s:textfield name="student2" label="student2"/>
    <s:submit name="submit">
    </s:submit>
</s:form>

</body>
</html>
