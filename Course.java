package Courses;
public class Course
{
    //attributes of Course 
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
    
    //parameters for constructors
    public Course(String courseID, String courseName, int duration){
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseLeader = "";
        this.duration = duration;
    }   
    
    //using getter method
    public String getCourseID(){
        return this.courseID;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public String getCourseLeader(){
        return this.courseLeader;
    }

    public int getDuration(){
        return this.duration;
    }
    
    //using setter method
    public void setCourseLeader(String leadername){
        this.courseLeader = leadername;
    }

    public void display(){
        System.out.println("The course ID of this course is " + courseID + ".");
        System.out.println("The course name of this course is " + courseName + ".");
        System.out.println("The duration of this course is " + duration + ".");
    
        if (courseLeader !=""){
        System.out.println("The course leader of this course is " + courseLeader + ".");
        }
    }
}

