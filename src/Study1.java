import java.util.Random;
import java.util.Scanner;

public class Study1 {
	private int total;
	public void deposit(int amount)
	{
		System.out.println("������ �Ա�");
		total = total + amount;
	}
	
	public void withdraw(){
		System.out.println("������ �� ����");
		
	}
	
	public int getTotal(){
		return total;
	}

}


