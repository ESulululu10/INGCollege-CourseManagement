package Courses;
public class AcademicCourse extends Course{
  //Academic Course attributes
  private String lecturerName;
  private String level;
  private String credit;
  private String startingDate;
  private String completionDate;
  private int numberOfAssessments;
  private boolean isRegistered;
    
  //parameters
  public AcademicCourse(String courseID, String courseName, int duration, String level, String credit, int noOfAssements){
        super(courseID, courseName, duration);
        this.level = level;
        this.credit = credit;
        this.numberOfAssessments = numberOfAssessments;
        this.lecturerName = "";
        this.startingDate = "";
        this.completionDate = "";
        this.isRegistered = false;
  }
  
  //using getter method
  public String getLecturerName(){
        return this.lecturerName;
  }
   
  public String getLevel(){
        return this.level;
  }
  
  public String getCredit(){
        return this.credit;
  }
  
  public String getStartingDate(){
        return this.startingDate;
  }
   
  public String getCompletionDate(){
        return this.completionDate;
  }
    
  public int getNumberOfAssessments(){
        return this.numberOfAssessments;
  }
    
  public boolean getIsRegistered(){
        return this.isRegistered;
  }
  
  //using setter method
  public void setNumberOfAssessments(int numberOfAssessments){
        this.numberOfAssessments = numberOfAssessments;
  }
            
  public void setLecturerName(String lecturerName){
        this.lecturerName = lecturerName;
  }
        
  public void register(String courseLeader, String lecturerName, String startingDate,String completionDate){
    if(isRegistered == true){
        System.out.println("The course module lecturer name is " + lecturerName + ".");
        System.out.println("The course module was started in " + startingDate + ".");
        System.out.println("The course module completes in " + completionDate + ".");
        
    }else{
        super.setCourseLeader(courseLeader);
        this.lecturerName = lecturerName;
        this.startingDate = startingDate;
        this.completionDate = completionDate;
        this.isRegistered = true; //changing registered status 
    }
  }
    
   public void display(){
    super.display();
    if(isRegistered == true){
        System.out.println("The name of given course lecturer is " + lecturerName + "."); 
        System.out.println("The level of given course is " + level + " level.");
        System.out.println("The credit of given course is " + credit + "."); 
        System.out.println("The date when given course started is " + startingDate + ".");
        System.out.println("The date when given course completed is " + completionDate + ".");
        System.out.println("The number of assessments of given course is " + numberOfAssessments + ".");      
    }
  }
}
