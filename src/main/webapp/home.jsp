<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ include file="include/files.jsp" %>
</head>
<body>
<script>
$(document).ready(function(){
	$("#mutualFundTile").click(function(e){
		e.preventDefault();
		window.location.href="${'http://localhost:8080'}${pageContext.request.contextPath}/investments/mutualFunds.jsp";
	});
});
</script>
<%-- <%@ include file="include/header.jsp" %> --%>
<div class="dashboard">
<div class='tile leftFloated'>
Stocks <span class="iconRightFloated"><i class="fa fa-line-chart"></i></span>
<hr class="lessMargin" />
<div><img src="images/stock_graph.png" class="stockImage"></img></div>
<hr class="lessMargin" />
<p class="rightText">Rs. 22,121</p>
</div>
<div class='tile leftFloated'>
Bonds <span class="iconRightFloated"><i class="fa fa-file"></i></span>
<hr class="lessMargin" />
<div>
<table class="striped">
<tr>
<th>Date</th>
<th>Value</th>
</tr>
<tr>
<td>03<sup>rd</sup> March 2014</td>
<td>43,212</td>
</tr>
<tr>
<td>03<sup>rd</sup> March 2015</td>
<td>44,100</td>
</tr>
<tr>
<td>03<sup>rd</sup> March 2016</td>
<td>45,121</td>
</tr>
</table>
</div>
<hr class="lessMargin" />
<p class="rightText">Rs. 45,121</p>
</div>
<div class='tile leftFloated' id="mutualFundTile">
Mutual Fund <span class="iconRightFloated"><i class="fa fa-fax"></i></span>
<hr class="lessMargin" />
<p class="rightText">Rs. 2,121</p>
</div>
</div>
</body>