
$(document).ready(function() {
	//获取课程
	$("#submit").click(function() {
		if($("#year").val()=="" || $("#term").val()=="" || $("#major").val()==""){
			alert("筛选条件未选择")
			return ;
		}
		//添加选项
		var year1=$("#year").val();
		var term1=$("#term").val();
		var major1=$("#major").val();
		$.ajax({
			url : baseUrl+"teacher/choose/teaching/list",
			type: "post",
			data: {year:year1,term:term1,major:major1},
			success : function(result) {
				$("#course-list").empty();
				if(result.code!=1){
					alert(result.message);
					return;
				}
				var listTeaching=result.data;
				if(listTeaching.length==0){
					$("#course-list").append("<a href='javascript:void(0)' class='list-group-item'><span class='icon-eyeglass icons float-right'></span>未查询到课程信息</a>");
				}
				for(var i = 0; i < listTeaching.length; i++) { 
					var course={course:listTeaching[i].course,courseNoAndOrder:listTeaching[i].courseNoAndOrder};//封装课程信息
					$("#course-list").append("<a href='teacher/statistics/"+listTeaching[i].teachingId+"' class='list-group-item'><span class='icon-eyeglass icons float-right'></span>"+course.course+"("+course.courseNoAndOrder+")</a>");
				}
			}
		});
	});
});

