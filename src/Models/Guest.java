package Models;

import java.util.ArrayList;
import java.util.List;

public class Guest {
    private String firstName, lastName, phone;
    private Integer age;
    private List<Children> childrens = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Children> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Children> childrens) {
        this.childrens = childrens;
    }

    public void addChildren(Children children) {
        this.childrens.add(children);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}