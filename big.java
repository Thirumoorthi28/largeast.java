import java.util.Scanner;
public class Greatest{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The First Value :");
        int a=s.nextInt();
        System.out.println("Enter The Second Value :");
        int b=s.nextInt();
        System.out.println("Enter The Third Value :");
        int c=s.nextInt();
        if (a > b)
        if (a > c)
        System.out.println("The greatest number is : " +a);
        if (b > a)
        if (b > c)
        System.out.println("The greatest number is : " + b);
        if (c > a)
        if (c > b)
        System.out.println("The greatest number is : " + c);
        
    }
}
