public class QuestionOne{

	public static void main(String[] args){

	int [] ar={1,4,7,3,8,4,3,6,9,1,2};
	System.out.println("Duplicate elements in given array");
	
	for (int i=0;i<ar.length;i++){

		for(int j=i+1;j<ar.length;j++){
	 		if(ar[i]==ar[j]) 

		System.out.println(ar[j]);

		}


		}


}



}