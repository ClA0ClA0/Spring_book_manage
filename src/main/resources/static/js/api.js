function askVerifyCode() {//¶ÔÓ¦registerÒ³Ãæid×Ö¶Îemail
    $.get('/api/auth/verify-code', {
        email: $("#email").val()
    })
}
