public class Main {

    public static void main(String[] args) {
        Course course1 = new Course(1,"Java","Engin DEMİROG","Course is started",0.1);
        Course course2 = new Course(2,"angular","Engin DEMİROĞ","Course is finished",1);
        Course course3 = new Course(3,"C#","Engin DEMİROĞ","Course is continue",0.5);
        
        Course[] courses={course1,course2,course3};
        for (Course course : courses){
            System.out.println("CourseName: "+ CourseName);
            System.out.println("CourseTeacher: "+ CourseTeacher);
            System.out.println("CourseStatus: "+ CourseStatus);
            System.out.println("CourseNumberArea: "+ CourseNumberArea);
            System.out.println("******************************************");
        }
        
        CourseManager courseManager = new CourseManager();
        courseManager.added(Course1);
        courseManager.Enter(Course3);
        courseManager.deleting(Course2);
        
        
        
    } 
    
}
