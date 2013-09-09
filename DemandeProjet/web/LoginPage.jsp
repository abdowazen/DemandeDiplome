<%-- 
    Document   : HomePage
    Created on : Aug 17, 2013, 9:46:52 PM
    Author     : abdo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<%@page import="java.util.*" %>
<%String str = request.getParameter("UserName");
  String pass = request.getParameter("UserName");
session.setAttribute("UserName", request.getParameter("UserName"));%>
Welcome to <%= session.getAttribute("UserName") %>
<% if (session.getAttribute("UserName").equals("a")){%>
<a href="index.jsp"><b>Login </b></a>
<%}
else{%>
<a href="LoginPage.html"><b>Logout</b></a>
<%}
%>