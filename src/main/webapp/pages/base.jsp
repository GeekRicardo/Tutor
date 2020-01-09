<%--
  Created by IntelliJ IDEA.
  User: ricardo
  Date: 2020/1/9
  Time: 上午11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <link href="static/css/toastr.min.css" rel="stylesheet" />

    <script src="static/js/jquery.min.js"></script>
    <script src="static/js/toastr.min.js"></script>
    <script>
        <c:if test="${not empty tips}" >
            toastr.info("${tips}");
        </c:if>
    </script>
</head>
</html>


