<%@ include file="/WEB-INF/layout/taglib.jsp" %>
<html>
<head>
<title><decorator:title default="Spring-SiteMesh" /></title>
<link href="/resources/layout.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<decorator:head /> 
</head> 
<body style="background-color:#F6F6F6;margin:0 auto;" > 
<!-- warp --> 
<div style="position:relative;height:100%;width:100%;">
<!-- left -->
<div style="position:static; bottom:0; float:left;background-color:#FF2424;width:15%;height:100%;text-align:left;padding-left:20px; ">
<span style="font-weight:900;color:#A50000;font-size:85px;">
L<br/> E<br/> F<br/> T<br/><br/> A<br/> R<br/> E<br/> A<br/><br/> 
</span>
</div> 
<!-- menu -->
<div style="width:100%;"> 
<div class="hand1" onclick="location.href='/';">HOME</div>
<div class="hand2">INTRO</div>
<div class="hand2">SERVICE</div>
<div class="hand2">COMMUNITY</div> 
<div class="hand3">SITEMAP</div> 
<!-- <span style="padding-left:80px;font-weight:900;color:#A6A6A6;font-size:85px; ">Header Area</span> -->
</div> 
<!-- header -->
<div style="width:100%;"> 
<div style="margin:0 auto;text-align:left;"><hr width="500" size="20" style="color:#FAED7D;" /></div>
<div style="text-align:left;padding-left:150px;"><hr width="500" size="20" style="color:red;" /></div>
<div style="text-align:left;padding-left:300px;"><hr width="500" size="20" style="color:#C900A7;" /></div>
<div style="text-align:left;padding-left:450px;"><hr width="500" size="20" style="color:#FFB2D9;" /></div>
</div> 

<div style="text-align:left;"><hr width="800" size="20" style="color:black;" /></div>
<!-- contents -->
<div style="width:100%;">
<decorator:body /> 
<!-- footer -->
<div style="position:absolute;bottom:0;height:80px; width:100%;background-color:#E4E4E4;"> 
<p style=" padding-top:20px;font-weight:900;font-size:32px;color:#9C9C9C;">Footer</p>
</div> 
</div> 
</div> 
</body> 
</html> 
