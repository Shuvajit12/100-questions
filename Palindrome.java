import java.util.*;
class Palindrome{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r;
    int sum=0;
    int temp=n;
    while(n>0){
       r=n%10;
       sum=10*sum+r;
       n=n/10;
    }
    if(sum==temp){
        System.out.println("true");
    }
    else{
        System.out.println("false"); 
    }
}
}