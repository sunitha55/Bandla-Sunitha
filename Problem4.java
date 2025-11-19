import java.util.Scanner;

public class Problem4 {
	public static int countOfFactors(int arr[],int a) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			int ele=arr[i];
			if(ele%a==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sie of the array : ");
		int size=sc.nextInt();
		//1,2,8,9,12,46,76,82,15,20,30
		int arr[]=new int[size];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print("Enter the values for indexes: "+i+" ");
			arr[i]=sc.nextInt();
		}
		System.out.print("{");
		for(int i=1;i<=9;i++) {
			int count=countOfFactors(arr,i);
			if(i<9){
              System.out.print(i+" : "+count+" , ");
			} 
			else{
              System.out.print(i+" : "+count);
			}
		}
		System.out.print("}");
		sc.close();
	}

}

