<%-- 
    Document   : response
    Created on : Aug 6, 2013, 7:47:38 PM
    Author     : abdo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--Import jstl library -->

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<%--<%@ page import="org.*" %> --%>
<%@page import = "java.util.List" %>
<%@page import = "org.*" %> 
<%@page import = "DAL.*"%>
<%@page import = "ObjectBusiness.*"%>
 <%--get the value from the form --%> 
<% String subjectID = request.getParameter("subject_id"); %> 
<%-- create an instance of AccessDB --%> 
<% AccessDB accessDB = new AccessDB(); %> 
 <%-- create an instance of SubjectCounselor using form value --%>
<% SubjectCounselor subCoun = accessDB.getSubCounselor(subjectID); %>  
<%-- create variables to hold data from SubjectCounselor --%> 
<% String name = subCoun.getSubjectName(); %> 
<% String description = subCoun.getDescription(); %>
<% String counselor = subCoun.getCounselorName(); %> 
<% String memberSince = subCoun.getMemberSinceDate(); %> 
<% String telephone = subCoun.getTelephone(); %> 
<% String email = subCoun.getEmail(); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='http://fonts.googleapis.com/css?family=Oswald:400,300' rel='stylesheet' type='text/css' />
        <link href='http://fonts.googleapis.com/css?family=Abel|Satisfy' rel='stylesheet' type='text/css' />
        <link href="default.css" rel="stylesheet" type="text/css" media="all" />
        <title>Response Page</title>
    </head>
    <body>
    <div id="header-wrapper">
            <div id="header">
                    <div id="logo">
                            <h1><a href="#"> Demande De Diplome </a></h1>
                    </div>
                    <div id="menu">
                            <ul>
                                    <li class="current_page_item"><a href="HomePage.html" accesskey="1" title="">Homepage</a></li>
                                    <li><a href="index.jsp" accesskey="2" title="">Our Clients</a></li>
                                    <li><a href="#" accesskey="3" title="">About Us</a></li>
                                    <li><a href="#" accesskey="4" title="">Careers</a></li>
                                    <li><a href="#" accesskey="5" title="">Contact Us</a></li>
                                    <li><a href="#" accesskey="6" title="">Login</a></li>


                            </ul>
                    </div>
            </div>
    </div>
      
      <div>
      <br> 
      <div id="wrapper">
      <div id="page-wrapper">
      <div id="page">
      <div id="wide-content">
    <br> 
        <h2 align="center">(Chosen Subject)</h2><br>
        <table width="60%" align="center" cellpadding="10">
            <tr> 
                <td valign="top" width="25%">
                    <strong>Description: </strong>
                </td> 
                <td>
                    <em><%= description %></em><br>
                </td> 
            </tr>
             <tr> 
                <td valign="top"><strong>Counselor: </strong>
                </td> 
                <td><span style="font-size:large"><strong><%= counselor %></strong></span> 
                     <br><span style="align:center"> 
                        <em>member since: <%= memberSince %></em></span></td> 
              </tr> 
            <tr> 
             <td valign="top">
                 <strong>Contact Details: </strong>
             </td>  
                <td><strong>email: </strong>
                    <a href="mailto:<%= email %>"><%= email %></a> 
                    <br><strong>phone: </strong><%= telephone %>
                </td> 
            </tr>
        </table>
      </div>
      </div>
      </div>
      </div>
      </div>
      
      <div id="footer" class="container">
	<p>Copyright (c) 2013 Sitename.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/" rel="nofollow">FreeCSSTemplates.org</a>. Photos by <a href="http://fotogrph.com/">Fotogrph</a>.</p>
      </div> 
    </body>
</html>
