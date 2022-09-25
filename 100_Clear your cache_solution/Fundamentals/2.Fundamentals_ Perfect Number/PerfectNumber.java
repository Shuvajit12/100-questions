import java.util.*;
public class PerfectNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        int i=1;
        while(i<=num/2){
            if(num%i==0){
                sum=sum+i;
            }
            i++;
        }
        if(temp==sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
