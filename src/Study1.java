import java.util.Random;
import java.util.Scanner;

public class Study1 {
	private int total;
	public void deposit(int amount)
	{
		System.out.println("저금통 입금");
		total = total + amount;
	}
	
	public void withdraw(){
		System.out.println("저금통 배 따기");
		
	}
	
	public int getTotal(){
		return total;
	}

}


