function askVerifyCode() {//��Ӧregisterҳ��id�ֶ�email
    $.get('/api/auth/verify-code', {
        email: $("#email").val()
    })
}
