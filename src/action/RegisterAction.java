package action;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String sex;
    private String datebath;
    private String email;
    private String address;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDatebath() {
        return datebath;
    }

    public void setDatebath(String datebath) {
        this.datebath = datebath;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
