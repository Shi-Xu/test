var listTeaching = [];//教学记录

Array.prototype.pushNoRepeat = function () {
    for (var i = 0; i < arguments.length; i++) {
        var ele = arguments[i];
        if (this.indexOf(ele) == -1) {
            this.push(ele);
        }
    }

};

$(document).ready(function () {
    $("#courseNoAndOrder").add("#tchName").attr("disabled", true);
    //获取课程
    $("#year").add("#term").add("#major").change(function () {
        $("#courseNoAndOrder").add("#tchName").attr("disabled", true);
        if ($("#year").val() == "" || $("#term").val() == "" || $("#major").val() == "") {
            return;
        }
        //清空选项
        $("#courseNoAndOrder option:not(:first)").remove();
        $("#tchName option:not(:first)").remove();
        //添加选项
        var year1 = $("#year").val();
        var term1 = $("#term").val();
        var major1 = $("#major").val();
        $.ajax({
            url: baseUrl + "stu/choose/teaching/list",
            type: "post",
            data: {year: year1, term: term1, major: major1},
            success: function (result) {
                listTeaching = result.data;
                var listCourse = [];
                var listcourseNoAndOrder = [];
                for (var i = 0; i < listTeaching.length; i++) {
                    var course = {course: listTeaching[i].course, courseNoAndOrder: listTeaching[i].courseNoAndOrder};//封装课程信息
                    listCourse.push(course);
                    //去掉重复的课程
                    if (listcourseNoAndOrder.indexOf(course.courseNoAndOrder) == -1) {
                        listcourseNoAndOrder.push(course.courseNoAndOrder);
                        $("#courseNoAndOrder").append("<option value='" + course.courseNoAndOrder + "'>" + course.course + "(" + course.courseNoAndOrder + ")" + "</option>");
                    }
                }
                ;
                $("#courseNoAndOrder").attr("disabled", false);
            }
        });
    });
    //获取教师
    $("#courseNoAndOrder").change(function (e) {
        //清空选项
        $("#tchName option:not(:first)").remove();
        var courseNoAndOrder = $(this).val();
        for (var i = 0; i < listTeaching.length; i++) {
            if (listTeaching[i].courseNoAndOrder == courseNoAndOrder) {
                $("#tchName").append("<option value='" + listTeaching[i].tchName + "'>" + listTeaching[i].tchName + "</option>");
            }
        }
        $("#tchName").attr("disabled", false);
    });
    //提交
    $("#submit").click(function (e) {
        if ($("#claOpt").val()== null || "" && $("#tchOpt").val() == null || "") {
            alert("请选择课程和教师");
            return false;
        }

            $("#form").submit();


    });

    $("#form").submit(function (e) {
        $("#form").attr("action", baseUrl + "stu/questionnaire").attr("method", "post");
        return true;
    });

});


