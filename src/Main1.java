import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] a=str.split("[^a-zA-Z]+");
        for(int i=a.length-1;i>=0;i--){


                if (i == 0) {
                    System.out.print(a[0]);
                } else {
                    System.out.print(a[i]);
                    System.out.print(" ");
                }


            }


    }
}
