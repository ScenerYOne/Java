public class Course {
    String couresID;
    int unit;
    String grede;


    public Course(){

    }

    public Course(String id,int u, String g){
        this.couresID = id;
        this.unit = u;
        this.grede = g;
    }

    public String getCouresID(){
        return couresID;
    }

    public int getUnit(){
        return unit;
    }

    public String getGrade(){
        return  grede;
       
    }

    public String toString(){
        return "   " + couresID  + "   " +  unit + "   " + grede;
    }


    
}
