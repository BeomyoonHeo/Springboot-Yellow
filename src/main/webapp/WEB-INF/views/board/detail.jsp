<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../layout/header.jsp" %>
<h1>Detail page</h1>
<hr/>
<div>아이디가 2번인 페이지면 관리자 메시지를 걸어보자</div>
<c:if test="${board.id == 2}"><h2>관리자입니다.</h2><br/></c:if>
<hr/>
<div>아이디가 1번이면 OK를 출력하고, 1번이 아니면 NO를 출력하자.</div>
<c:choose>
<c:when test="${board.id == 1}">
<h2>OK</h2>
</c:when>
<c:otherwise>
<h2>NO</h2>
</c:otherwise>
</c:choose>
번호 : ${board.id}<br/>
제목 : ${board.title}<br/>
내용 : ${board.content}<br/>
<%@ include file="../layout/footer.jsp" %>