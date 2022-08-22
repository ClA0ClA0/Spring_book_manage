function askVerifyCode() {//¶ÔÓ¦registerÒ³Ãæid×Ö¶Îemail
    $.get('/api/auth/verify-code', {
        email: $("#email").val()
    }, function (data) {
        alert(data.reason)
    })
}
function register() {
    $.post('/api/auth/register', {
        verify: $("#verify").val(),
        username: $("#username").val(),
        password: $("#password").val(),
        email: $("#email").val(),
    }, function (data) {
        if (data.code == 200)
            window.location = "/login"
        else
            alert(data.reason)
    })
}