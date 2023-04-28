/**?
 *  johoys 
 *  		OOP
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class BMI extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JSeparator separator;
	private JLabel units;
	private JComboBox comboBox;
	private JSeparator separator_1;
	private JLabel Weight;
	private JTextField txtLbs;
	private JLabel height;
	private JSeparator separator_2;
	private JTextField txtFt;
	private JSeparator separator_3;
	private JButton btnWeightMin;
	private JButton btnWeightPlus;
	private JButton btnHeightMin;
	private JButton btnHeightPlus;
	private JButton btnInchMin;
	private JButton btnInchPlus;
	private JTextField txtIn;
	private JLabel lblResults;
	private JTextField txtBmi;
	private JTextField txtResult;
	private JButton btnReset;
	private JTextField txtLbs_1;
	private JTextField txtFt_1;
	private JTextField txtIn_1;

	public BMI() {
		setBackground(Color.WHITE);
		setTitle("BMI Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 496);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBackground(new Color(50, 205, 50));
		txtResult.setText(" ");
		txtResult.setBounds(185, 306, 122, 20);
		txtResult.setBorder(null);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("BMI");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(134, 0, 61, 46);
		contentPane.add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setForeground(new Color(160, 160, 160));
		separator.setBounds(25, 108, 287, 2);
		contentPane.add(separator);
		
		units = new JLabel("Units");
		units.setFont(new Font("Helvetica", Font.BOLD, 18));
		units.setBounds(29, 77, 46, 20);
		contentPane.add(units);
		
	
		comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Helvetica", Font.PLAIN, 18));
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"US customary", "UK customary"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBorder(null);
		comboBox.setBounds(168, 68, 139, 29);
		contentPane.add(comboBox);
		comboBox.addActionListener(this);
		for(int i=0;i<comboBox.getComponentCount();i++) {
			if(comboBox.getComponent(i) instanceof JComponent) {
				((JComponent) comboBox.getComponent(i)).setBorder(new EmptyBorder(0,0,0,0));
				((JComponent) comboBox.getComponent(i)).setBackground(Color.white);
			}
			if(comboBox.getComponent(i) instanceof AbstractButton) {
				((AbstractButton) comboBox.getComponent(i)).setBorderPainted(false);
			}
		} 
		
		separator_1 = new JSeparator();
		separator_1.setBounds(25, 143, 287, 2);
		contentPane.add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(25, 179, 287, 2);
		contentPane.add(separator_2);
		
		height = new JLabel("Height");
		height.setFont(new Font("Helvetica", Font.BOLD, 18));
		height.setBounds(25, 143, 77, 37);
		contentPane.add(height);
		
		Weight = new JLabel("Weight");
		Weight.setFont(new Font("Helvetica", Font.BOLD, 18));
		Weight.setBounds(25, 108, 77, 37);
		contentPane.add(Weight);
		
		txtLbs = new JTextField("0");
		txtLbs.setHorizontalAlignment(SwingConstants.RIGHT);
		txtLbs.setBorder(null);
		txtLbs.setBounds(147, 117, 39, 19);
		contentPane.add(txtLbs);
		txtLbs.setColumns(10);
		txtLbs.addActionListener(this);
		
		txtFt = new JTextField("0");
		txtFt.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFt.setColumns(10);
		txtFt.setBorder(null);
		txtFt.setBounds(146, 153, 38, 19);
		contentPane.add(txtFt);
		txtFt.addActionListener(this);
		
		btnWeightMin = new JButton("-");
		btnWeightMin.setBackground(Color.WHITE);
		btnWeightMin.setForeground(Color.BLACK);
		btnWeightMin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnWeightMin.setBorder(BorderFactory.createLineBorder(Color.decode("#00bfff")));
		btnWeightMin.setFocusable(false);
		btnWeightMin.setBounds(205, 117, 46, 20);
		contentPane.add(btnWeightMin);
		btnWeightMin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = txtLbs.getText();
				int decrement = Integer.parseInt(s1);
				txtLbs.setText(String.valueOf(Integer.valueOf(decrement-1)));
			}
		});
		
		btnWeightPlus = new JButton("+");
		btnWeightPlus.setForeground(Color.BLACK);
		btnWeightPlus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnWeightPlus.setBackground(Color.WHITE);
		btnWeightPlus.setBorder(BorderFactory.createLineBorder(Color.decode("#00bfff")));
		btnWeightPlus.setFocusable(false);
		btnWeightPlus.setBounds(250, 117, 46, 20);
		contentPane.add(btnWeightPlus);
		btnWeightPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = txtLbs.getText();
				int decrement = Integer.parseInt(s1);
				txtLbs.setText(String.valueOf(Integer.valueOf(decrement+1)));
			}
		});
		
		separator_3 = new JSeparator();
		separator_3.setBounds(25, 214, 287, 2);
		contentPane.add(separator_3);
		
		btnHeightMin = new JButton("-");
		btnHeightMin.setForeground(Color.BLACK);
		btnHeightMin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnHeightMin.setFocusable(false);
		btnHeightMin.setBorder(BorderFactory.createLineBorder(Color.decode("#00bfff")));
		btnHeightMin.setBackground(Color.WHITE);
		btnHeightMin.setBounds(204, 152, 46, 20);
		contentPane.add(btnHeightMin);
		btnHeightMin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = txtFt.getText();
				int decrement = Integer.parseInt(s1);
				txtFt.setText(String.valueOf(Integer.valueOf(decrement-1)));
			}
		});
		
		btnHeightPlus = new JButton("+");
		btnHeightPlus.setForeground(Color.BLACK);
		btnHeightPlus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnHeightPlus.setFocusable(false);
		btnHeightPlus.setBorder(BorderFactory.createLineBorder(Color.decode("#00bfff")));
		btnHeightPlus.setBackground(Color.WHITE);
		btnHeightPlus.setBounds(250, 152, 46, 20);
		contentPane.add(btnHeightPlus);
		btnHeightPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = txtFt.getText();
				int decrement = Integer.parseInt(s1);
				txtFt.setText(String.valueOf(Integer.valueOf(decrement+1)));
			}
		});
		
		btnInchMin = new JButton("-");
		btnInchMin.setForeground(Color.BLACK);
		btnInchMin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnInchMin.setFocusable(false);
		btnInchMin.setBorder(BorderFactory.createLineBorder(Color.decode("#00bfff")));
		btnInchMin.setBackground(Color.WHITE);
		btnInchMin.setBounds(204, 187, 46, 20);
		contentPane.add(btnInchMin);
		btnInchMin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = txtIn.getText();
				int decrement = Integer.parseInt(s1);
				txtIn.setText(String.valueOf(Integer.valueOf(decrement-1)));
			}
		});
		
		btnInchPlus = new JButton("+");
		btnInchPlus.setForeground(Color.BLACK);
		btnInchPlus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInchPlus.setFocusable(false);
		btnInchPlus.setBorder(BorderFactory.createLineBorder(Color.decode("#00bfff")));
		btnInchPlus.setBackground(Color.WHITE);
		btnInchPlus.setBounds(250, 187, 46, 20);
		contentPane.add(btnInchPlus);
		btnInchPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = txtIn.getText();
				int decrement = Integer.parseInt(s1);
				txtIn.setText(String.valueOf(Integer.valueOf(decrement+1)));
			}
		});
		
		txtIn = new JTextField("0");
		txtIn.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIn.setColumns(10);
		txtIn.setBorder(null);
		txtIn.setBounds(147, 190, 36, 17);
		contentPane.add(txtIn);
		txtIn.addActionListener(this);
		
		lblResults = new JLabel("Results");
		lblResults.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblResults.setBounds(121, 232, 107, 46);
		contentPane.add(lblResults);
		
		txtBmi = new JTextField();
		txtBmi.setFont(new Font("Helvetica", Font.BOLD, 15));
		txtBmi.setBackground(new Color(50, 205, 50));
		txtBmi.setEditable(false);
		txtBmi.setText("BMI");
		txtBmi.setBounds(25, 293, 282, 46);
		contentPane.add(txtBmi);
		txtBmi.setColumns(10);
		

		btnReset = new JButton("Reset");
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(new Color(0, 191, 255));
		btnReset.setFont(new Font("Helvetica", Font.BOLD, 15));
		btnReset.setFocusable(false);
		btnReset.setBounds(25, 363, 282, 46);
		contentPane.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLbs.setText("0");
				txtFt.setText("0");
				txtIn.setText("0");
				txtResult.setText("");
			}
		});
		
		txtLbs_1 = new JTextField();
		txtLbs_1.setBackground(Color.WHITE);
		txtLbs_1.setEditable(false);
		txtLbs_1.setText("lbs");
		txtLbs_1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtLbs_1.setColumns(10);
		txtLbs_1.setBorder(null);
		txtLbs_1.setBounds(182, 118, 23, 19);
		contentPane.add(txtLbs_1);
		
		txtFt_1 = new JTextField();
		txtFt_1.setBackground(Color.WHITE);
		txtFt_1.setText("ft");
		txtFt_1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFt_1.setEditable(false);
		txtFt_1.setColumns(10);
		txtFt_1.setBorder(null);
		txtFt_1.setBounds(181, 153, 23, 19);
		contentPane.add(txtFt_1);
		
		txtIn_1 = new JTextField();
		txtIn_1.setBackground(Color.WHITE);
		txtIn_1.setText("in");
		txtIn_1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIn_1.setEditable(false);
		txtIn_1.setColumns(10);
		txtIn_1.setBorder(null);
		txtIn_1.setBounds(181, 187, 23, 19);
		contentPane.add(txtIn_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = txtLbs.getText();
		int pounds = Integer.parseInt(s1);
		String s2 = txtFt.getText();
		int feet = Integer.parseInt(s2);
		String s3 = txtIn.getText();
		int inch = Integer.parseInt(s3);
		
		//US Customary
		if(comboBox.getSelectedItem().equals("US customary")) {
			int poundsContainer = 703 * pounds;
			int heightContainer = (feet * 12 + inch) * (feet * 12 + inch);
			
			double bmi = (double) poundsContainer / (double) heightContainer;
			
			String bmiStr = String.format("%.2f",bmi);
			
			if(bmi >= 18.5 && bmi < 25) {
				txtResult.setText(bmiStr+" (normal)");
			}
			else if(bmi >= 17 && bmi < 18.5) {
				txtResult.setText(bmiStr+" (mild)");
			}
			else if(bmi <= 16 && bmi > 17) {
				txtResult.setText(bmiStr+" (moderate)");
			}
			else if(bmi < 16) {
				txtResult.setText(bmiStr+" (severe)");
			}
			else if(bmi >= 25 && bmi < 30){
				txtResult.setText(bmiStr+" (overweight)");
			}
			else if(bmi >= 30 && bmi < 35){
				txtResult.setText(bmiStr+" (obese I)");
			}	
			else if(bmi >= 35 && bmi < 40){
				txtResult.setText(bmiStr+" (obese II)");
			}	
			else {
				txtResult.setText(bmiStr+" (obese III)");
			}
		}
		//UK Customary 
		if(comboBox.getSelectedItem().equals("UK customary")) {
			double poundsContainer_1 = pounds * 0.453;
			double heightContainer_1 = (feet * 12 + inch) * 0.0254;
			
			double ukBmi = poundsContainer_1 / heightContainer_1;
			double ukBmi_1 = ukBmi / heightContainer_1;
			
			String ukBmiStr = String.format("%.2f",ukBmi_1);
			
			if(ukBmi_1 < 18.5) {
				txtResult.setText(ukBmiStr+" (underweight)");
			}
			else if(ukBmi_1 >= 18.5 && ukBmi_1 < 24.9) {
				txtResult.setText(ukBmiStr+" (normal)");
			}
			else if(ukBmi_1 >= 25 && ukBmi_1 <= 29.9) {
				txtResult.setText(ukBmiStr+" (overweight)");
			}
			else {
				txtResult.setText(ukBmiStr+" (obese)");
			}
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI frame = new BMI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
