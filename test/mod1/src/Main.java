import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int itaji = input.nextInt();
        if(itaji <= 4 && itaji > 0){
            System.out.println("low-store-building))");
        }if(itaji >= 5 && itaji <=8){
            System.out.println("mid-rise-building///");
        }if(itaji >=9){
            System.out.println("multi-store-building");
        }if (itaji <=0){
                System.out.println("mistake");
            }


        }
    }
