$(document).ready(function () {
    $("form").on("submit", function (e) {
        var pass = $(".password");
        pass.val(md5(pass.val()));
    })
})