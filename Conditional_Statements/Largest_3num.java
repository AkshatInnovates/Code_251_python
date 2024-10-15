public class Largest_3num {
    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 55;
        int num3 = 12;

        if((num1>num2) && (num1>num3)){
                System.out.println(num1+" is Greater");
        }
        else if(num2>num3){
            System.out.println(num2+" is Greater");
        }
        else{
            System.out.println(num3+" is Greater");
        }
    }
}
