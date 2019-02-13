
package alchem;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EnterData extends JFrame
{
     JLabel lblEID, lblEName, lblDept, lblDesg, lblDOJ, lblDOB, lblMS, lblDOM;
     JButton btnSubmit, btnCancel;
     JTextField txtEID, txtEName, txtDesg, txtDOJ, txtDOB, txtDOM;
     JComboBox cmbDepart;
     JRadioButton rbtnMarr, rbtnSing;
     
     
     public EnterData()
     {
         lblEID = new JLabel("Employee ID:");
         lblEName = new JLabel("Employee Name:");
         lblDept = new JLabel("Department:");
         lblDesg = new JLabel("Designation:");
         lblDOJ = new JLabel("Date of Joining:");
         lblDOB = new JLabel("Date of Birth");
         lblMS = new JLabel("Marital Status:");
         lblDOM = new JLabel("Date of Marriage:");
                 
         btnSubmit = new JButton("Submit");
         btnCancel = new JButton("Cancel");
         
         txtEID = new JTextField();
         txtEName = new JTextField();
         txtDesg = new JTextField();
         txtDOJ = new JTextField();
         txtDOB = new JTextField();
         txtDOM = new JTextField();
         
         cmbDepart = new JComboBox();
	 	 cmbDepart.addItem(("Select"));
         cmbDepart.addItem(("Admin"));
         cmbDepart.addItem(("IT"));
         cmbDepart.addItem(("HR"));
         cmbDepart.addItem(("Finance"));
         cmbDepart.addItem(("Accounts"));
         
         rbtnMarr = new JRadioButton("Married");
         rbtnSing = new JRadioButton("Single");
         
         setTitle("The Employee Form");
         setSize(320,410);
         setVisible(true);
       }
     
     public void addComponent()
     {
         setLayout(null);
         
         lblEID.setBounds(10, 20, 100, 20);
         add(lblEID);
         
         lblEName.setBounds(10,60,100,20);
         add(lblEName);
         
         lblDept.setBounds(10,100,100,20);
         add(lblDept);
         
         lblDesg.setBounds(10,140,100,20);
         add(lblDesg);
         
         lblDOJ.setBounds(10,180,100,20);
         add(lblDOJ);
         
         lblDOB.setBounds(10,220,100,20);
         add(lblDOB);
         
         lblMS.setBounds(10,260,100,20);
         add(lblMS);
         
         lblDOM.setBounds(10,300,100,20);
         add(lblDOM);
                 
         btnSubmit.setBounds(70,340,100,25);
         add(btnSubmit);
         
         btnCancel.setBounds(180,340,100,25);
         add(btnCancel);
         
         txtEID.setBounds(130,20,150,20);
         add(txtEID);
         
         txtEName.setBounds(130,60,150,20);
         add(txtEName);
         
         txtDesg.setBounds(130,140,150,20);
         add(txtDesg);
         
         txtDOJ.setBounds(130,180,150,20);
         add(txtDOJ);
         
         txtDOB.setBounds(130,220,150,20);
         add(txtDOB);
         
         txtDOM.setBounds(130,300,150,20);
         add(txtDOM);
         
         cmbDepart.setBounds(130,100,150,20);
         add(cmbDepart);
         
         rbtnMarr.setBounds(130,260,80,20);
         add(rbtnMarr);
         
         rbtnSing.setBounds(220,260,100,20);
         add(rbtnSing);
         
         setResizable(false);
      }
}
