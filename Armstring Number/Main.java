import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// Write your code here
		int num=sc.nextInt();
		int original= num;
		int len=(int) Math.log10(Math.abs(num)) + 1;
		int sum=0;
		while(num>0){
			int n=num %10;
			sum=sum+(int) Math.pow(n, len);
			num=num/10;
		}
		if(original==sum){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
