import java.util.Scanner;

public class zadacha2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("incorrect expression");
            return;
        }for(int i = num1+1;i < num2;i++ ){
            if (i%5==0&&i%10!=0){
                System.out.println(i);
            }
        }
    }
}
