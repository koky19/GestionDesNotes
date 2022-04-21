/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information;


public class Grade {
    
    private int course_ID;

    
    
    private int student_ID;
    
    private double grade;
    
    public Grade() {
    }

    public Grade(int course_ID, int student_ID, double grade) {
        this.course_ID = course_ID;
        this.student_ID = student_ID;
        this.grade = grade;
    }

    public int getCourse_ID() {
        return course_ID;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public double getGrade() {
        return grade;
    }

    public void setCourse_ID(int course_ID) {
        this.course_ID = course_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    
    
}
