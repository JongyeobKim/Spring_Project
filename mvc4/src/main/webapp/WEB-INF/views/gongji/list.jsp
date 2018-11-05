<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Gongji</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

	<script>
		function requestJson(id) {
			$.ajax({
				type: "GET",
				url: "api/gongji/one/json/" + id,
				async: false,
				contentType: "application/json; charset=utf-8",
				success: function(json) {
					console.log(json);
				}
			});
		}
		
		function requestXml(id) {
			$.ajax({
				type: "GET",
				url: "api/gongji/one/xml" + id,
				async: false,
				contentType: "application/xml; charset=utf-8",
				success: function(xml) {
					console.log(xml);
				}
			});
		}
	</script>
</head>
<body>
	<table border="1">
		<tbody align="center">
		<c:forEach items="${gongjis }" var="write">
            <tr>
                <td width="30px">${write.id }</td>
                <td width="80px">${write.title }</td>
                <td width="150px">${write.content }</td>
            </tr>
		</c:forEach>
		</tbody>
	</table>
	
	<a href="gongji_list?page=1&itemSizePerPage=2"><<</a>
	<a href="gongji_list?page=${pagination.leftPage }&itemSizePerPage=${pagination.itemSizePerPage }"><</a>&nbsp;
	<c:forEach begin="${pagination.start }" end="${pagination.end - pagination.start + 1 }" var="idx">
		<a href="gongji_list?page=${idx }&itemSizePerPage=${pagination.itemSizePerPage }">${idx }</a>
	</c:forEach>
	<a href="gongji_list?page=${pagination.rightPage }&itemSizePerPage=${pagination.itemSizePerPage }">></a>&nbsp;
	<a href="gongji_list?page=${pagination.lastPage }&itemSizePerPage=2">>></a>
</body>
</html>