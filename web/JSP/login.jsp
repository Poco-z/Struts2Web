<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/19 0019
  Time: 上午 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>欢迎登陆</title>
</head>
<body>

<s:form action="login" method="POST">
    <s:label value="欢迎登陆"/>
    <s:textfield name="username" label="账号"/>
    <s:password name="password" label="密码"/>
    <s:submit value="登陆"/>
</s:form>

<a href="JSP/register.jsp" ><button>注册</button>
</a>

<a href="JSP/input.jsp"><button>类型转换</button>
</a>
</body>
</html>
