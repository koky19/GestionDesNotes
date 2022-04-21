package information;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Student {
    
    private int student_ID;
    
    private String first_name;
    
    private String last_name;

    public Student() {
    }
    
    public Student(int student_ID, String first_name, String last_name) {
        this.student_ID = student_ID;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    
}
