package arrayExample;

public class ArraySumDemo {

	public static void main(String[] args) {
		int arr[] = new int[] {2, 4, 6, 8};
		int sum=0;
		System.out.println("Sum of all numbers:");
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
			//System.out.println(sum);
		}
		System.out.println(sum);
}
}
