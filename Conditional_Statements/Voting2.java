import java.util.Scanner;
public class Voting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You is a Adult.");
        }
        else if (age>=13 && age<18)
        {
            System.out.println("You is a Teenager.");

        }
        else{
            System.out.println("You is a Child.");
        }
    }
}
