package ab.tjl.dianping.request;

import javax.validation.constraints.NotBlank;

/**
 * @Author:TangJiLin
 * @Description:登录数据处理
 * @Date: Created in 2020/2/6 21:52
 * @Modified By:
 */
public class LoginReq {
    @NotBlank(message = "手机号不能为空")
    private String telphone;
    @NotBlank(message = "密码不能为空")
    private String password;

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
