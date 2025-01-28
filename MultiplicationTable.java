import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        int number = scanner.nextInt(); 
        int i=1;
        if(number>=0){
        while ( i <= 10) {
            
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
        }
        scanner.close();
    }
}