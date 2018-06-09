import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("aaa.txt");
		Scanner scanner = new Scanner(in);
		String str = scanner.next();
		System.out.println(str);
		str = scanner.next();
		System.out.println(str);
		str = scanner.next();
		System.out.println(str);
		
		/*
		while(true){
			try{
				String str = scanner.next();
				System.out.println(str);
			}catch(Exception e){
				break;
			}
		}*/
		in.close();
		
	}
}
