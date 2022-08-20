package Sliding_window;

public class max_sum_k_size {

	public static void main(String[] args) {
		int[]arr= {6,4,5,8,7,9};
		int k=2;
		System.out.println(maxsum(arr,k));
		

	}

	private static int maxsum(int[] arr, int k) {
		//1st step-> window bnaege first k size ke elements ki
		int sum=0;
		for(int i=0;i<k;i++) {//0 to k tk loop chlaya
			sum+=arr[i];
		}
		int ans=sum;//sum ko answer mei update krege
		
		//2nd step->window ko grow krege 
		for (int j = k; j < arr.length; j++) {//k se looop chlaege 
			sum+=arr[j];// window mei add kia agla element i. window grow kra
			// ab aage ek add kia hai to k size ka bnane k liye peeche se bhi to ke hataege i.e shrink
			sum-=arr[j-k]; //j-k index  isliye kyuki agr k element chiye hai to 0th hatana pdege ie i=3 k=3,i-k==0;
			//sample case se smjh lio if mushkil lge to
			ans=Math.max(ans,sum);
		
		}
		return ans;
	}

}
