import java.util.Scanner;
class Main{
    public static void main	(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String[] numbers=sc.nextLine().split(" ");
            int sum=0;
            for(String number:numbers){
                sum+=Integer.parseInt(number);
               
            }
             System.out.println(sum);
        }
        sc.close();
    }
    
}
