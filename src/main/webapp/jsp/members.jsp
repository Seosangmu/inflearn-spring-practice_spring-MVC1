<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%@ page import="java.util.List" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  MemberRepository memberRepository = MemberRepository.getInstance();
  List<Member> members = memberRepository.findAll();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <a href="/index.html">메인</a>
  <table>
    <thead>
      <th>id</th>
      <th>username</th>
      <th>age</th>
    </thead>
    <tbody>
    <%
      for (Member m : members) {
    %>
      <tr>
        <td><%=m.getId()%></td>
        <td><%=m.getUsername()%></td>
        <td><%=m.getAge()%></td>
      </tr>
    <% } %>
    </tbody>
  </table>
</body>
</html>
