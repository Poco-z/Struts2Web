package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author zxx
 * @date 2018/9/21 17:36
 */

public class LoginAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;

    @Override
    public String execute() throws Exception {
        if ("zxx".equals(username) && "123".equals(password)) {
            return SUCCESS;
        } else {
            return LOGIN;
        }
    }

    static { //用execute会执行，用method="changePsex"就不执行！！很烦恼 找不出问题
        System.out.println("进来了！");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
