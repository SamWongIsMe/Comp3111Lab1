package labs.comp3111.ust.hk;

public class Lab1Activity {
	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i=0; i<10;i++) {sum+=arr[i];}
		System.out.println(String.format("Sum of the number is %d", sum));
		int max = 0;
		int min = 10000;
		for (int j=0; j<10;j++) {
			if (arr[j]>max) {max=arr[j];}
			if (arr[j]<min) {min=arr[j];}
		}
		System.out.println(String.format("Min = %d; Max = %d", min, max));
	}
}
