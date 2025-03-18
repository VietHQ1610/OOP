import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int numberOfTestCases= sc.nextInt();
        for(int i=0;i<numberOfTestCases;i++){
            int L= sc.nextInt();
            int R= sc.nextInt();
            int sum= tong(L,R);
            System.out.println(sum);
        }
        sc.close();
        
    }
    private static int tong(int L,int R){
        int sum=0;
        for(int j=L;j<=R;j++){
            sum+=j;
        }
    return sum;
    }
    
}
