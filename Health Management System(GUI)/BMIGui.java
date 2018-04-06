//U10314010 ³¯¬M¦Ð 2018/01/08 17:30
//Design a class about Health Managment System's innerface
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class BMIGui extends JFrame {
	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;

public BMIGui() {
		//Set title
		setTitle("Health Management System");
		//When click the x button, all the programming will close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//Set a welcome sign
		JTextPane txtpnWelcome = new JTextPane();
		txtpnWelcome.setBackground(Color.PINK);
		txtpnWelcome.setBounds(5, 5, 479, 20);
		//To let the word in the middle
		txtpnWelcome.setText("\t                     Welcome to the Health Managment System");
		contentPane.add(txtpnWelcome);

		//Create the label of name
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(15, 35, 50, 15);
		contentPane.add(lblName);
		//Create the field that user can input the name
		textField1 = new JTextField();
		textField1.setBounds(100, 35, 96, 15);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		//Create the label of telephone
		JLabel lblNewLabel = new JLabel("Telephone");
		lblNewLabel.setBounds(250, 35, 60, 15);
		contentPane.add(lblNewLabel);
		//Create the field that user can input the telephone
		textField2 = new JTextField();
		textField2.setBounds(320, 35, 96, 15);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		//Create the label of height
		JLabel lblHeightinch = new JLabel("Height(inch)");
		lblHeightinch.setBounds(15, 65, 69, 15);
		contentPane.add(lblHeightinch);
		//Create the field that user can input the height
		textField3 = new JTextField();
		textField3.setBounds(100, 65, 96, 15);
		contentPane.add(textField3);
		textField3.setColumns(10);
		
		//Create the label of weight
		JLabel lblWeightpound = new JLabel("Weight(pound)");
		lblWeightpound.setBounds(15, 95, 87, 15);
		contentPane.add(lblWeightpound);
		//Create the field that user can input the weight
		textField4 = new JTextField();
		textField4.setBounds(100, 95, 96, 15);
		contentPane.add(textField4);
		textField4.setColumns(10);
		
		//Create the label of address
		JLabel label = new JLabel("Address");
		label.setBounds(15, 125, 50, 15);
		contentPane.add(label);
		//Create the field that user can input the address
		textField5 = new JTextField();
		textField5.setBounds(100, 125, 206, 15);
		contentPane.add(textField5);
		textField5.setColumns(10);
		
		//Create the label of birthday	
		JLabel lblBirthdayyyyymmdd = new JLabel("Birthday(YYYY-MM-DD)");
		lblBirthdayyyyymmdd.setBounds(15, 155, 135, 15);
		contentPane.add(lblBirthdayyyyymmdd);
		//Create the field that user can input the birthday
		textField6 = new JTextField();
		textField6.setBounds(163, 155, 115, 15);
		contentPane.add(textField6);
		textField6.setColumns(10);
		
		//Create the label of test time
		JLabel lblBmi = new JLabel("Test Time (YYYY-MM-DD)");
		lblBmi.setBounds(15, 185, 145, 15);
		contentPane.add(lblBmi);
		//Create the field that user can input the test time
		textField7 = new JTextField();
		textField7.setBounds(163, 185, 115, 15);
		contentPane.add(textField7);
		textField7.setColumns(10);
		
		//Create the label of gender
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(250, 65, 46, 15);
		contentPane.add(lblGender);
		//User can choose to click male or female
		JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setBounds(315, 65, 58, 15);
		contentPane.add(rdbtnMale);
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(375, 65, 69, 15);
		contentPane.add(rdbtnFemale);
		
		//Create the label of BMI
		JLabel lblBmic = new JLabel("BMI");
		lblBmic.setBounds(15, 215, 46, 15);
		contentPane.add(lblBmic);
		//Create the label to show the bmi
		JLabel laBMI = new JLabel("");
		laBMI.setBounds(100, 215, 115, 15);
		contentPane.add(laBMI);
		
		//Create the label of body status 
		JLabel lblBodyStatus = new JLabel("Body Status");
		lblBodyStatus.setBounds(250, 215, 69, 15);
		contentPane.add(lblBodyStatus);	
		//Create the label to shoe body status
		JLabel laBodystatus = new JLabel("");
		laBodystatus.setBounds(335, 215, 109, 15);
		contentPane.add(laBodystatus);
		
		//Create the button of OK
		JButton btnInput = new JButton("OK");
		//Add the OK button's actionlistener
		btnInput.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				double height = Double.parseDouble(textField3.getText());
				double weight = Double.parseDouble(textField4.getText());
				double bmi = weight * KILOGRAMS_PER_POUND / 
						((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
				String BodyStatus = "";
				if(bmi<18.5) {
					BodyStatus = "Underweight";
				}
				else if(bmi<=27) {
					BodyStatus = "Normal";
				}
				else if(bmi<=30) {
					BodyStatus = "Overweight";
				}
				else {
					BodyStatus = "Obese";
				}
				laBMI.setText(Double.toString(bmi));
				laBodystatus.setText(BodyStatus);	
			}
		});	
		btnInput.setBounds(350, 175, 87, 23);
		contentPane.add(btnInput);
	}
}
