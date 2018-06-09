import java.util.Arrays;

public class Test5 {
public static void main(String[] args) {
	int[] arr = {100,91,30,30,40,50};
	int[] carr= new int[arr.length];
	int[] tmp = new int[arr.length];
	int k=0,z=0,x=0;
	
	for(int i = 0; i<arr.length;i++){
		carr[i] = arr[i];
	}
	
	System.out.println(Arrays.toString(arr));
	
	Arrays.sort(carr);
	
	System.out.println(Arrays.toString(arr));
			
	System.out.println(Arrays.toString(carr));
	
	for(int i=arr.length-1;i>=0;i--){
		for(int j=0;j<arr.length;j++){
			if(arr[j]==carr[i]){
				tmp[k]=j;
				k++;
				break;
			}
		}
	}
	
	
	
	System.out.println(Arrays.toString(tmp));
	
	System.out.println("높은점수순번");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[tmp[i]]);		
	}
	
	
	}

}
