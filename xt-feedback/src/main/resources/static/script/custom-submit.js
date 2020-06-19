$(document).ready(function () {
    var i = 1;
    $("#addSingle").click(function () {
        $("#addSingle").append(addsingle);
        i++;
    })

    $("#addOptSingle").click(function () {
        var addOptSingle ="<div class=\"radio-inline icheck-primary radio-screen\" id=\"btnSin2\"><input type=\"radio\" name=\"single2\" value=\"A\" id=\"extremely1\" class=\"optionAnswer\" ><label for=\"extremely2\"><input type=\"text\" class=\"sinOption\"></label></div>\n"
        $("#addSingle").append(addOptSingle);
    })

    $("#submit").click(function () {
        var stem = $(".sinTitle").val();
        var content = $(".sinOption").val();
        var item = $(".optionAnswer").val();
        $.ajax({
            url: baseUrl + "teacher/custom/createSubmit",
            type: 'POST',
            datatype: "json",
            /*contentType: "application/json;charset=UTF-8",*/
            data: {stem: stem, content: content, item: item},
            xhrFields: {
                withCredentials: true
            },


        })
    })

})