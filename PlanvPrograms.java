package mysql;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JTextField;

public class PlanvPrograms extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private int Plan_ID;
	private String Tobacco_Wellness;
	private String Disease_Mgmt;
	
	public PlanvPrograms(int ID,String TobaccoWellness,String DiseaseMgmt){
		
		this.Plan_ID=ID;
		this.Tobacco_Wellness=TobaccoWellness;
		this.Disease_Mgmt=DiseaseMgmt;
		
		
	}
	public int getID(){
		return Plan_ID;
	}
	
	public String getTobaccoWellness(){
	return Tobacco_Wellness;
	}
	
	public String getDiseaseMgmt(){
		return Disease_Mgmt;
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
					PlanvPrograms frame = new PlanvPrograms();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PlanvPrograms() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlanvprograms = new JLabel("Plan_|v|_programs");
		lblPlanvprograms.setFont(new Font("Sylfaen", Font.PLAIN, 27));
		lblPlanvprograms.setBounds(358, 26, 231, 36);
		contentPane.add(lblPlanvprograms);
		
		JLabel lblPlanid = new JLabel("Plan_ID");
		lblPlanid.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblPlanid.setBounds(15, 91, 162, 20);
		contentPane.add(lblPlanid);
		
		textField = new JTextField();
		textField.setBounds(15, 127, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTobaccowellness = new JLabel("Tobacco_Wellness");
		lblTobaccowellness.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblTobaccowellness.setBounds(15, 192, 219, 20);
		contentPane.add(lblTobaccowellness);
		
		textField_1 = new JTextField();
		textField_1.setBounds(15, 228, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDiseasemgmt = new JLabel("Disease_Mgmt");
		lblDiseasemgmt.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblDiseasemgmt.setBounds(15, 286, 219, 20);
		contentPane.add(lblDiseasemgmt);
		
		textField_2 = new JTextField();
		textField_2.setBounds(15, 340, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}
