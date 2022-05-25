package excel.in.week1.day3;
//Its a pojo class
public class Employee {
    String name;
    public Integer age;
    public Boolean isPermanent;

    public Employee(){

    }

    public Employee(String name, Integer age, Boolean isPermanent) {
        this.name = name;
        this.age = age;
        this.isPermanent = isPermanent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getPermanent() {
        return isPermanent;
    }

    public void setPermanent(Boolean permanent) {
        isPermanent = permanent;
    }
}
