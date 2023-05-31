<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>${score.studentNumber}번 학생 ${score.name} 성적 상세 정보 </h1>
    <table class="table table-info">
          <tr>
            <th>이름</th>
            <td class="table-primary">${score.name}</td>
          </tr>
          <tr>
              <th>국어</th>
              <td class="table-primary">${score.korScore}</td>
          </tr>
          <tr>
              <th>수학</th>
              <td class="table-primary">${score.mathScore}</td>
          </tr>
          <tr>
              <th>영어</th>
              <td class="table-primary">${score.engScore}</td>
          </tr>
          <tr>
              <th>총점</th>
              <td class="table-primary">${score.korScore + score.mathScore + score.engScore}</td>
          </tr>
          <tr>
              <th>평균</th>
              <td class="table-primary">${(score.korScore + score.mathScore + score.engScore) / 3}</td>
          </tr>
      </table>
      <a class="btn btn-primary" href="/score/list" role="button">리스트로 돌아가기</a>

      <form action="http://localhost:8181/score/remove" method="post">
        <input type="hidden" name="studentNumber" value="${score.studentNumber}">
        <input type="submit" class="btn btn-danger" value="삭제하기"></button>
      </form>
    </div>
</body>
</html>