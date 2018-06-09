import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		
		try{
			URL url = new URL("http://google.co.kr");
			in = url.openStream();
			out = new FileOutputStream("C:\\zzz\\ccc.txt");
			
			byte[] arr = new byte[5];
			
			while(true){
				int count = in.read(arr);
				System.out.println(count);
				if(count == -1){
					break;
				}
				out.write(arr, 0, count);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(in != null){
				try{
					in.close();
				}catch(Exception e){
					
				}
			}
			if(out != null){
				try{
					in.close();
				}catch(Exception e){
					
				}
			}
		}
	}
}