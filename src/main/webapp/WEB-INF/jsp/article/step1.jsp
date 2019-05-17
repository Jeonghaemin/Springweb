<!doctype html>
<!--
p.284 [리스트 11.13] 회원가입 성공 화면
-->
<html>
<head>
<base href="${pageContext.request.contextPath }/" />
<title>게시글</title>
</head>
<body>
		<table>
			<tr><td>게시글번호</td><td>${article.articleId }</td></tr>
			<tr><td>학번</td><td>${article.userId }</td></tr>
			<tr><td>제목</td><td>${article.title }</td></tr>
			<tr><td>이름</td><td>${article.name }</td></tr>
			<tr><td>등록시간</td><td>${article.udate }</td></tr>
						<tr><td>내용</td><td>${article.contentHtml }</td></tr>

	</table>
</body>
</html>