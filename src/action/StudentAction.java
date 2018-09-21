package action;

import bean.Student;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

    private Student student1;
    private Student student2;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public Student getStudent1() {
        return student1;
    }

    public void setStudent1(Student student1) {
        this.student1 = student1;
    }

    public Student getStudent2() {
        return student2;
    }

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }
}
