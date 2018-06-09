import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max=0;
		int[] grades = new int[5];
		
		for(int i=0;i<grades.length;i++){
			System.out.println(i + " 성적 점수를 넣어주세요.");
			int userinput = scanner.nextInt();
			grades[i] = userinput;
		}
		
		for(int i=0;i<grades.length;i++){
			if(grades[i] > max){
				max = grades[i];
			}
		}
		
		
		System.out.println(Arrays.toString(grades));
		Arrays.sort(grades);
		System.out.println(Arrays.toString(grades));
		System.out.println("최고점수 :" + max);
	}
}
