import java.util.Scanner;

public class Problem3 {
	public static int isEven(int num) {
		if(num%2==0) {
			return num-1;
		}
		else {
			return num;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		num =isEven(num);
		int total=num*2;
	    for(int i=1;i<=total;i++){
	    		if(i% 2!=0){
	    			System.out.print(i+" ");
	        }
	    }
	    sc.close();
	}

}