<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<script>

$('table').on('click','.rooms',function(){
	openWindow('detail/'+this.id,'600','720');
});

$('#searchBtn').on('click',function(){
	
	$('#searchForm').attr('action','<%request.getContextPath();%>/dsp/admin/location/list');
	var form = $('#searchForm');
	form.submit();
});






</script>