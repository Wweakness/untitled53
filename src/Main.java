
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
          char[] a=str.toCharArray();
          StringBuilder b=new StringBuilder();
          for(int i=0;i<a.length;i++){
              if(a[i]=='_'){
                  String d=String.valueOf(a[i+1]);
                  a[i+1]=d.toUpperCase().charAt(0);
              }
              if(a[i]!='_'){
                  b.append(a[i]);
              }
          }
            System.out.println(b.toString());

        }
    }

}
