package lab1;

import javax.swing.*;
import java.util.ArrayList;

public abstract class Course {

    private String courseNumber;
    private String courseName;
    private double credits;
    private ArrayList<Course> prerequisites = new ArrayList<>();

    public Course(String courseNumber, String courseName, double credits, ArrayList<Course> prerequisites) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCredits(credits);
        setPrerequisites(prerequisites);
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    private void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public final String getCourseName() {
        return courseName;
    }

    private void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public final double getCredits() {
        return credits;
    }

    private void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println( "Invalid Credit amount given. Credits has been set to default of 1");
            this.credits = 1;
        }else{
            this.credits = credits;
        }

    }

    public final ArrayList<Course>  getPrerequisites() {
        return prerequisites;
    }

    private void setPrerequisites(ArrayList<Course> prerequisites) {
        if (prerequisites == null || prerequisites.size() == 0 ) {
            JOptionPane.showMessageDialog(null,
                    "This course has no listed prerequisites therefore it has been set to null ");
            this.prerequisites = null;
        }
        this.prerequisites = prerequisites;
    }


}
