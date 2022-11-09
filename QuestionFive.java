import java.util.*;
public class QuestionFive {
	public static void disp(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		int arr[]={7,4,8,3,9,1,5,2,3};
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if (arr[min]>arr[j]) {
				  min=j;
				
				}
			}


				int temp = arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
		}
		disp(arr);
	}
}
