import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Test1 {
public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);
	System.out.println("�Է�:");
	String str = sc.nextLine();
	OutputStream out = new FileOutputStream("ccc.txt");
	byte[] arr = str.getBytes();
	out.write(arr);
	out.close();
	System.out.println("완료");
	System.out.println("깃허브등록완료");
}
}
