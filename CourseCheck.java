public class CourseCheck {
    public static void main(String[] args) {

        GenEdCourse[] students = new GenEdCourse[3];
        students[0] = new GenEdCourse("GEN64-124", 4, "D+"); 
        students[1] = new GenEdCourse("GEN64-183", 1, "A");
        students[2] = new GenEdCourse("ITD-172", 2, "C+");

        int totalStudents = students.length;
        int passedStudents = calPassSubject(students);

        System.out.println("General Education Course: ");
        for (Course course : students) {
            System.out.println(course.toString());
        } 
        System.out.println("Enrol: " + totalStudents);
        System.out.println("Pass: " + passedStudents);


        System.out.println("=============================================");


        System.out.println("Major Courses: ");
        
        MajorCourse [] m = new MajorCourse [3];
         m[0] = new MajorCourse("COE64-211", 4, "D", "Year : 2"); 
         m[1] = new MajorCourse("COE64-212", 4, "D", "Year : 2");
         m[2] = new MajorCourse("CoE64-322", 4, "W", "Year : 3");

        for (MajorCourse majorCourse : m) {
            System.out.println(majorCourse.toString());
        } 
        int totalStudents1 = m.length;
        int passedStudents1 = totalStudents1;
        System.out.println("Enrol: " + totalStudents1);
        System.out.println("Pass: " + passedStudents1);


    }


    public static void displayCourse(Course [] c){
        
            
            
    }

    public static int calPassSubject1(Course[] courses) {
        int passedStudents = 0;
        
        for (int i=0; i < courses.length; i++) {
            if (!courses[i].getGrade().equals("W") || !courses[i].getGrade().equals("F") ) {
                passedStudents++;
            }
        }
        return passedStudents;
 }

    public static  void searchCounrse(Course[] c , String name, char grade ){
        int passedStudents1 = 0;
        for (int j=0; j < majorCourse.length; j++) {
            if (!name[j].getGrade().equals("W") || !name[j].getGrade().equals("F") ) {
                passedStudents1++;
            }
        }
        System.out.println("pass: "+passedStudents1);

    }

    
   

}


        


  
