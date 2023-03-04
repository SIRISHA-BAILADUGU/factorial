import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int check=0;
      while(check==0)
      {
      int n=sc.nextInt();
      int fact=1;
      for(int i=1;i<=n;i++)
      {
        fact=fact*i;
        if(fact==n)
        {
        System.out.println(i);
        check=1;
        break;
      }
      }
    }
    }
}