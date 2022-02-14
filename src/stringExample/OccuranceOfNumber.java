package stringExample;
import java.util.Scanner;

public class OccuranceOfNumber {

	public static void main(String[] args) {
		
		int num , count , temp , x=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("enter any number");
		
		num = sc.nextInt();
		
		for(int i=0;i<=10;i++) {
			count=0;
			temp=num;
			while(temp>0) {
				x = temp%10;
				if(x==i) {
					count ++;
				}
				temp = temp/10;
			}
			if(count>0)
				System.out.println(i+"-->"+count);
		}
		

	}

}
