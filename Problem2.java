import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int total=num*2;
		for(int i=1;i<=total;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
