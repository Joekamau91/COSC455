package mysql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Service_Cost extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private String BenefitService;
	private String Copay;
	private String CoInsurance;
	
	

	public Service_Cost(String BenefitService,String Copay,String CoInsurance){
		
		this.BenefitService=BenefitService;
		this.Copay =Copay;
		this.CoInsurance =CoInsurance;
		
		
		
	}
	
	
	public String getBenefitService(){
		return BenefitService;
	}
	
		public String getCopay(){
			return Copay;
		}
	
	public String getCoInsurance(){
		return CoInsurance;
	}
	
	public Connection getConnection()
	   {
	       Connection con;

	       try {
	           con = DriverManager.getConnection("jdbc:mysql://localhost/test_db", "root","");
	           return con;
	       } 
	      catch (Exception e) {
	           e.printStackTrace();
	           return null;
	       }
	   }
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Service_Cost window = new Service_Cost();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Service_Cost() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 807, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSevicecost = new JLabel("Service_Cost");
		lblSevicecost.setForeground(Color.YELLOW);
		lblSevicecost.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		lblSevicecost.setBounds(325, 16, 250, 32);
		frame.getContentPane().add(lblSevicecost);
		
		JLabel lblBenefitservice = new JLabel("Benefit_Service");
		lblBenefitservice.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblBenefitservice.setBounds(15, 90, 192, 32);
		frame.getContentPane().add(lblBenefitservice);
		
		JLabel lblCopay = new JLabel("Copay");
		lblCopay.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblCopay.setBounds(15, 222, 192, 27);
		frame.getContentPane().add(lblCopay);
		
		JLabel lblCoinsurance = new JLabel("CoInsurance");
		lblCoinsurance.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblCoinsurance.setBounds(15, 327, 164, 32);
		frame.getContentPane().add(lblCoinsurance);
		
		textField = new JTextField();
		textField.setBounds(348, 93, 176, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(348, 223, 176, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(348, 330, 192, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton Insert = new JButton("Insert");
		Insert.setForeground(Color.YELLOW);
		Insert.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		Insert.setBounds(40, 534, 167, 35);
		frame.getContentPane().add(Insert);
		
		JButton Update = new JButton("Update");
		Update.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		Update.setForeground(Color.GREEN);
		Update.setBounds(311, 534, 147, 35);
		frame.getContentPane().add(Update);
		
		JButton Display = new JButton("Display");
		Display.setForeground(Color.BLUE);
		Display.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		Display.setBounds(528, 534, 156, 35);
		frame.getContentPane().add(Display);
	}

}
