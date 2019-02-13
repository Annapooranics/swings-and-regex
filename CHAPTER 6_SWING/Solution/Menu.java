package alchem;


import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Menu extends JFrame implements ActionListener
{
    JButton option1, option2, option3;
    JLabel name;
      
    public Menu()
    {
        option1 = new JButton("Enter Data");
        option2 = new JButton("Display Data");
        option3 = new JButton("Exit");
                
        name = new JLabel("EMPLOYEE BOOK");
        name.setFont(new Font("Serif", Font.PLAIN, 24));
        
        setTitle("Employee Book Application");
        setSize(300,300);
        setResizable(false);
        setVisible(true);
        
        option1.addActionListener(this);
        option2.addActionListener(this);
        option3.addActionListener(this);
        
    }
    
    public void addComponent()
    {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 0.1;
        c.anchor = c.CENTER;
        add(name,c);

        c.gridx = 0;
        c.gridy = 1;
        c.fill = c.HORIZONTAL;
        add(option1, c);

        c.gridx = 0;    
        c.gridy = 2;
        c.fill = c.HORIZONTAL;
        add(option2, c);

        c.gridx = 0;    
        c.gridy = 3;
        c.fill = c.HORIZONTAL;
        add(option3, c);
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == option1)
        {
           EnterData obj = new EnterData();
           obj.addComponent();
        }
        if(e.getSource() == option2)
        {
            DisplayData obj = new DisplayData();
            obj.addComponent();
                        
        }
        if(e.getSource() == option3)
        {
            this.dispose();
        }
    }
}
