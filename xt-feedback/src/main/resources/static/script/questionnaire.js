var qResult=[];
var onSubmit=false;

//表单验证
function validateForm(){
	var msg="";
	var singleIdx=[];
	var multipleIdx=[];
	//单选验证
	$("[data-type='1']").each(function(index){
		var val=$(this).find("input[type='radio']:checked").val();
		if(val==undefined || val==""){
			singleIdx.push(index+1);
	    }
	});
	//任选验证
	$("[data-type='2']").each(function(index){
		var checked=$(this).find("input[type='checkbox']:checked");
		if(checked.length==0 ){
			multipleIdx.push(index+1);
	    }
	});
	if(singleIdx.length>0){
		msg=msg+("必选题第"+singleIdx.toString()+"题未选择\n");
	}
	if(multipleIdx.length>0){
		msg=msg+("任选题第"+multipleIdx.toString()+"题未选择\n");
	}
	return msg;
}

$(document).ready(function() {
	//提交
	$("#submit").click(function(e) {
		//表单验证
		var error=validateForm();
		if(error.length>0){
			alert(error);
			return;
		}
		$("#input").attr("disabled",true);
		//处理上传数据
		//封装单选
		$("[data-type='1']").each(function(index){
		    var val=$(this).find("input[type='radio']:checked").val();
		    var result={uuid:$(this).attr("data-uuid"),result:val};
		    qResult.push(result);
		});
		//封装多选
		$("[data-type='2']").each(function(index){
			var listval=[];
			var checked=$(this).find("input[type='checkbox']:checked");
			checked.each(function(){
				listval.push($(this).val());
			});
			var result={uuid:$(this).attr("data-uuid"),result:listval.toString()};
			qResult.push(result);
		});
		var tchQuId1=$("form").attr("data-tchQuId");
		if(onSubmit){alert("请不要重复提交");return;}
		$.ajax({
			url : baseUrl+"/stu/result/create",
			type: "post",
			data: {tchQuId:tchQuId1,fixResult:JSON.stringify(qResult),freeResult:""},
			beforeSend: function() {onSubmit=true},
			success : function(result) {
				window.location.href=baseUrl+"/success";
			}
		});
	});
	
	$("#form").submit(function(e) {
		$("#form").attr("action",baseUrl+"stu/questionnaire").attr("method","post");
		return true;
	});
	
	
	
});


