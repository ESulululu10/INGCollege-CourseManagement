package Courses;
public class NonAcademicCourse extends Course
{
   //attributes of NonAcademicCourse
   private String instructorName;
   private String startDate;
   private String completionDate;
   private String examDate;
   private String prerequisite; 
   private boolean isRegistered;
   private boolean isRemoved;
    
   //parameters
   public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite){
        super(courseID, courseName, duration);
        this.prerequisite = prerequisite;
        this.startDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
   }
   
   //using getter method
   public String getInstructorName(){
        return this.instructorName;
   }
    
   public String getStartDate(){
        return this.startDate;
   }
    
   public String getCompletionDate(){
        return this.completionDate;
   }
    
   public String getExamDate(){
        return this.examDate;
   }
    
   public String getPrerequisite(){
        return this.prerequisite;
   }

   public boolean getIsRegistered(){
        return this.isRegistered;
   }
    
   public boolean getIsRemoved(){
        return this.isRemoved;
   }
   
   //using setter method
   public void setInstructorName(String instructorName){
        this.instructorName = instructorName;
   }

   public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
     if(isRegistered == false){
        super.setCourseLeader(courseLeader);
        this.instructorName = instructorName;
        this.startDate = startDate;
        this.completionDate = completionDate;
        this.examDate = examDate;
        this.isRegistered = true;
     }else{
        System.out.println("The course is already registered.");
     }
   }
    
   public void remove (String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
     if(isRemoved == true){
        System.out.println("The course is already removed.");
     }else{
        super.setCourseLeader("");
        this.instructorName = "";
        this.startDate = "";
        this.completionDate = "";
        this.examDate = ""; 
        this.isRegistered = false;
        this.isRemoved = true;
        }
   }
    
   public void display(){
     super.display();
     if(isRegistered == true){
        System.out.println("The instructor of given Course is " + instructorName + ".");
        System.out.println("The given course starts from " + startDate + ".");
        System.out.println("The given course completes in " + completionDate + ".");
        System.out.println("The exam of given course will be in " + examDate + ".");
     }
   }
}