package arrayExample;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int arr[]=new int[] {12,45,65,33};
		System.out.println("Printing Elements");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
			arr[i]=arr[i]*2;
		}
		System.out.println("Printing Sum of Numbers");
		for(int j=0; j<arr.length;j++) {
			System.out.println(arr[j]);
			arr[j]=arr[j]+5;
		}
		System.out.println("Printing Difference ");
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
			arr[k]=arr[k]-10;
		}
		
		System.out.println("Updated data Elements");
		for(int a=0;a<arr.length;a++) {
			System.out.println(arr[a]);
		}
	}

}
