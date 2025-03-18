import java.util.Scanner;

class Main {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int t = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < t; i++) {
            
            String inputString = scanner.nextLine();
            System.out.println(inputString);
        }

        scanner.close();
    }
}
