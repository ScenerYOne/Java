import java.util.Scanner;

public class lky {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] a = new int[10];

     for (int i = 0; i < 10; i++)

            a[i] =  i ;

     for (int i = 0; i < 10; i++)

           a[i] = a[a[i]]+10;

       for (int i = 0; i < 10; i++)

           System.out.println(a[i]);



    }
}
