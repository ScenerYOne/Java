import java.util.ArrayList;

public class LoginVerification {
    public static void main(String[] args) {
        Login login  = new Login("SD0010", "Sd5648**");
        Login login1 = new Login("SD0011", "Sd0001**");
        Login login2 = new Login("SD0012", "Sd0002**");
        Login login3 = new Login("SD0013", "Sd000**");
        Login login4 = new Login("SD0014", "Sd5648#55**");

        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("65100000", "AAA", login));
        s.add(new Student("65110000", "BBB", login1));
        s.add(new Student("65120000", "CCC", login2));
        ArrayList<Student> s1 = new ArrayList<>();
        s1.add(new Student("65130000", "DDD", login3));
        s1.add(new Student("65140000", "FFF", login4));
        Major coeMajor = new Major("COE", s);
        Major cpeMajor = new Major("CPE", s1);

        if (coeMajor != null && cpeMajor != null) {
            System.out.println(coeMajor.toString());
            for (int i = 0; i < s.size(); i++) {
                System.out.println((i + 1) + s.get(i).toString());
                System.out.println(s.get(i).getLogin().toString());
            }
            System.out.println("\n" + cpeMajor.toString());
            for (int i = 0; i < s1.size(); i++) {
                System.out.println((i + 1)  + s1.get(i).toString());
                System.out.println(s1.get(i).getLogin().toString());
            }
            
        }  
        


}

}