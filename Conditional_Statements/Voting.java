import java.util.Scanner;
public class Voting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You can give the Vote...");
        }
        else{
            System.out.println("Sorry you to samll to select the candidate...");
        }

    }
}