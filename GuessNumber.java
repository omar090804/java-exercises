import java.util.Random; 
import java.util.Scanner; 
 
class GuessNumber { 
    public static void main (String[]args){ 
        Random r =new Random(); 
        Scanner S=new Scanner(System.in); 
        System.out.print("guess the number between 1 and 100> "); 
        int userNumber =S.nextInt(); 
        int num; 
        int attemps =1; 
        num = r.nextInt(1,101); 
        while (true){ 
            if(userNumber==num){ 
                System.out.println("your guess is right !!!"); 
                break; 
            } else if(num<userNumber){ 
                System.out.print("your guess is higher try again >"); 
                attemps++; 
                userNumber =S.nextInt(); 
 
            } else { 
                System.out.print("your guess is lower try again >"); 
                attemps++; 
                userNumber =S.nextInt(); 
 
            } 
        } 
        System.out.print("congrats!!!! you try "+attemps+" times"); 
        S.close();
 
    } 
} 
