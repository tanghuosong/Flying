$(function() {
    $("#submit").click(function () {
        // $(this).button('loading');
        $.ajax({
            type: "POST",
            url: "/v1/admin/managerLogin",
            data: "name=" + $("#managerName").val() + "&password=" + $("#managerPwd").val(),
            success: function (msg) {
                if(msg.success){
                    window.location = "/admin/index.html";
                }else{
                    alert(msg.content);
                }
                $("#submit").button('reset');
            }
        });
    });
});