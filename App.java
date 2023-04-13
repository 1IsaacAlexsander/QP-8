import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        // int n = num_test;
       
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero que queira repetir o looping: ");
        int reps = sc.nextInt();

        for (int i = 1; i <= reps; i++) {
            //System.out.println("Looping "+ i + " de "+ reps);
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();
            
            if (num > 0 ) {
                System.out.println(num+" positivo");
            }else if (num < 0) {
                System.out.println(num+ " negativo");
            }else if (num == 0) {
                System.out.println(" o numero e neutro");
            }
        }

   
        
       
           

        }
    }

