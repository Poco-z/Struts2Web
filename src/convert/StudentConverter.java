package convert;

import bean.Student;
import org.apache.struts2.util.StrutsTypeConverter;
import java.util.Map;

public class StudentConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        Student student = new Student();
        String [] values = strings[0].split(",");
        String name =values[0].trim();
        String id = values[1].trim();
        student.setName(name);
        student.setId(id);
        return student;
    }

    @Override
    public String convertToString(Map map, Object o) {
        Student student = (Student)o;
        String name = student.getName();
        String id = student.getId();
        String result = "{ name:"+name+","+"id:"+id+"}";
        return result;
    }
}
