import javax.swing.*;


public class ButtonExample {
	ButtonExample()
	{    
		JFrame f=new JFrame("Button Example");            
		JButton b=new JButton(new ImageIcon("E:\\images.jpg"));    
		b.setBounds(100,100,200, 70);    
		f.add(b);    
		f.setSize(500,500);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		    }         

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonExample();
	}

}