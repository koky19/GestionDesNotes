/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information;


public class Course {
    private int course_ID;
    
    private int course_code;
    
    private String title;

    public Course() {
    }

    public Course(int course_ID, int course_code, String title) {
        this.course_ID = course_ID;
        this.course_code = course_code;
        this.title = title;
    }

    public int getCourse_ID() {
        return course_ID;
    }

    public int getCourse_code() {
        return course_code;
    }

    public String getTitle() {
        return title;
    }

    public void setCourse_ID(int course_ID) {
        this.course_ID = course_ID;
    }

    public void setCourse_code(int course_code) {
        this.course_code = course_code;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
