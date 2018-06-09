import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.*;

public class Test3 extends JApplet implements ActionListener{
	JLabel myJLabel;
	JTextField myJTextField;
	
	public void init(){
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		myJTextField = new JTextField(20);
		myJTextField.addActionListener(this);
		c.add(myJTextField);
		
		myJLabel = new JLabel();
		myJLabel.setText("텍스트필드에 글을 입력해주세요!");
		myJLabel.setHorizontalAlignment(JLabel.CENTER);
		c.add(myJLabel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str;
		
		str = myJTextField.getText();
		System.out.println(str);
		
		
		
	}

}
