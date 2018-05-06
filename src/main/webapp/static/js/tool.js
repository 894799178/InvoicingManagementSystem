function deleteStrusClass(array) {
    for (var i = 0; i < array.length; i++) {
        $(array[i]).removeClass("has-error");
        $(array[i]).removeClass("has-success");

    }
}


function chkUser(userName, password) {
    var userNameReg = /^[a-zA-Z0-9_]{3,16}$/;
    var passwordReg = /^[a-zA-Z0-9_]{6,18}$/;
    var msg = "";
    var pos = 0; //pos等于1 帐号错误, 2表示密码错误
    var flag = true;
    if (userName != undefined && password != undefined) {
        if (!userNameReg.test(userName)) {
            msg = "用户长度或类型不正常,只能是字母,数字,下划线,长度3-16";
            flag = false;
            var pos = 1;
        } else if (!passwordReg.test(password)) {
            msg = "密码长度或类型不正常,只能是字母,数字,下划线,长度为6-18";
            var pos = 2;
            flag = false;
        } else {
            msg = "登录成功"
        }
    } else {
        msg = "帐号或密码格式不正确"
    }
    return {"msg": msg, "flag": flag, "pos": pos};
}

//匹配整数
function chkInt(number) {
    var NumberChk = /^[0-9]+$/;
    if (NumberChk.test(number)) {
        return true;
    }
    return false;
}

//匹配小数
function chkNumber(number) {
    var NumberChk = /^[0-9]+$|^([0-9]+[.][0-9]+)$/;
    if (NumberChk.test(number)) {
        return true;
    } else {
        return false;
    }
}