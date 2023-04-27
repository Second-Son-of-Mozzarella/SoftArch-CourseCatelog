package lab2;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        AdvancedJavaCourse ajc = new AdvancedJavaCourse("Advanced Java", "2A");


        IntroJavaCourse ijc = new IntroJavaCourse("Intro to Java", "1A");

        IntroToProgrammingCourse ipc = new IntroToProgrammingCourse("Intro to Programming", "1B");


        // testing one
        ajc.setCredits(5);
        ajc.setPrerequisites("ijc");
        System.out.println(ajc.getCourseName() + " " + ajc.getCourseNumber() + " " + ajc.getCredits() + " " + ajc.getPrerequisites());

        ajc.setCourseNumber("");
        ajc.setCourseName("");
        ajc.setCredits(0);
        ajc.setPrerequisites("");
        System.out.println(ajc.getCourseName() + " " + ajc.getCourseNumber() + " " + ajc.getCredits() + " " + ajc.getPrerequisites());



        // Testing Two
        ijc.setCredits(5);
        ijc.setPrerequisites("ipc");
        System.out.println( " " + ijc.getCourseNumber() + " " + ijc.getCredits() + " " + ijc.getPrerequisites());



        ijc.setCourseNumber("");
        ijc.setCredits(0);
        ijc.setPrerequisites("");
        System.out.println(" " + ijc.getCourseNumber() + " " + ijc.getCredits() + " " + ijc.getPrerequisites());


        // testing three
        ipc.setCredits(5);
        System.out.println(ipc.getCourseName() + " " + ipc.getCourseNumber() + " " + ipc.getCredits());

        ipc.setCourseNumber("");
        ipc.setCourseName("");
        ipc.setCredits(0);
        System.out.println(ipc.getCourseName() + " " + ipc.getCourseNumber() + " " + ipc.getCredits());


/*
for the Liskov Substitution I guess we got rid of Course because why have an extra class when its not really being used
and can be replaced with an interface
 */





    }




}
