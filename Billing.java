import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.JTextComponent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.PrintStream;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.DropMode;


public class Billing extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtf;
	//private JTextField txtl;
	private JTextField txtadd;
    private JTextField txttoken;
	//private JTextField txtdob;
	private JTextField txtmobile;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_15;
	//private JTextField txtinst;
	private JTextField txtbeef;
	private JTextField txtbacon;
	private JTextField txtchicken;
	private JTextField txtpork;
	private JTextField txtkit;
	private JTextField txtoreo;
	private JTextField txtcoffee;
	private JTextField txtveg;
	private JTextField txtnut;
	private JTextField txttax;
	private JTextField txtsubtotal;
	private JTextField txttotal;
	private JFrame exit;
	private JTextField txtFinal;
	private JCheckBox chckbxpork;
	
	
	String total, subtotal, tax;
	double[] itemprice = new double[50];
	//int[] itemprice = new int[5];
	private JTextField txtFinal1;
	private JTextField txtFinal2;
	private JTextField txtFinal3;
	private JTextField txtFinal4;
	private JTextField txtFinal5;
	private JTextField txtFinal6;
	private JTextField txtFinal7;
	private JTextField txtFinal8;
	private JTextField txtFinal9;
	private JTextField txtFinal10;
	private JTextField txtFinal11;
	private JTextField txtFinal12;
	private JTextField txttotall;
	private JTextField txttaxx;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 // Create the frame.
	
	public Billing() {
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent arg0)
			{
				txtID.setText(null);
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
				   LocalDateTime now = LocalDateTime.now();
				   int id = 100 + (int)(Math.random()*1234);
				   String date = dtf.format(now);
				   String Cid = date + id ;
				   txtID.setText(Cid);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1525, 757);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 128, 128));
		panel.setBackground(new Color(0, 255, 255));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel.setBounds(10, 10, 1485, 700);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(51, 21, 403, 470);
		panel_1.setForeground(new Color(0, 128, 128));
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1.setBackground(Color.CYAN);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtID = new JTextField();
		txtID.setBounds(182, 29, 194, 29);
		panel_1.add(txtID);
		txtID.setColumns(10);
		
		txtf = new JTextField();
		txtf.setColumns(10);
		txtf.setBounds(182, 73, 194, 29);
		panel_1.add(txtf);
		
		txtadd = new JTextField();
		txtadd.setColumns(10);
		txtadd.setBounds(182, 156, 194, 29);
		panel_1.add(txtadd);
		
		txttoken = new JTextField();
		txttoken.setColumns(10);
		txttoken.setBounds(182, 322, 194, 29);
		panel_1.add(txttoken);
		
		txtmobile = new JTextField();
		txtmobile.setColumns(10);
		txtmobile.setBounds(182, 195, 194, 29);
		panel_1.add(txtmobile);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setForeground(new Color(0, 128, 128));
		panel_1_2.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_2.setBackground(Color.CYAN);
		panel_1_2.setBounds(0, 0, 403, 470);
		panel_1.add(panel_1_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(182, 29, 127, 29);
		panel_1_2.add(textField_8);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cust Name\r\n");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(23, 73, 149, 29);
		panel_1_2.add(lblNewLabel_1_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(182, 73, 127, 29);
		panel_1_2.add(textField_9);
		
		
		JLabel lblNewLabel_3_2 = new JLabel("Address\r\n\r\n");
		lblNewLabel_3_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(23, 156, 149, 29);
		panel_1_2.add(lblNewLabel_3_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(182, 156, 127, 29);
		panel_1_2.add(textField_11);
		
		JLabel lblNewLabel_4_1 = new JLabel("Mobile");
		lblNewLabel_4_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(23, 195, 149, 29);
		panel_1_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Order Type ");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(23, 239, 149, 29);
		panel_1_2.add(lblNewLabel_1_1_1);
		
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Token No.");
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(23, 322, 149, 29);
		panel_1_2.add(lblNewLabel_3_1_1);
		
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(182, 195, 127, 29);
		panel_1_2.add(textField_15);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Payment\r\n");
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(23, 361, 149, 29);
		panel_1_2.add(lblNewLabel_1_1_2);
		
		
		
		JLabel lblNewLabel = new JLabel("Cust. ID");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(23, 29, 149, 29);
		panel_1_2.add(lblNewLabel);
		
		JComboBox comboBoxorder = new JComboBox();
		comboBoxorder.setModel(new DefaultComboBoxModel(new String[] {"HOME DELV.", "DINE IN"}));
		comboBoxorder.setBackground(new Color(255, 255, 255));
		comboBoxorder.setFont(new Font("Arial Black", Font.BOLD, 18));
		comboBoxorder.setBounds(182, 239, 194, 29);
		panel_1_2.add(comboBoxorder);
		
		JComboBox comboBoxpayment = new JComboBox();
		comboBoxpayment.setModel(new DefaultComboBoxModel(new String[] {"CASH", "DEBIT", "CARD"}));
		comboBoxpayment.setFont(new Font("Arial Black", Font.BOLD, 18));
		comboBoxpayment.setBounds(182, 361, 194, 29);
		panel_1_2.add(comboBoxpayment);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(517, 21, 425, 470);
		panel_1_1.setForeground(new Color(0, 128, 128));
		panel_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_1.setBackground(Color.CYAN);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JCheckBox chckbxbeef = new JCheckBox("Beef Burger");
		chckbxbeef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxbeef.isSelected())
				{
					txtbeef.setEnabled(true);
					txtbeef.setText("");
					txtbeef.requestFocus();
				}
				else
				{
					txtbeef.setEnabled(false);
					txtbeef.setText("0");
				}
			}
		});
		chckbxbeef.setBackground(new Color(0, 255, 255));
		chckbxbeef.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxbeef.setBounds(23, 75, 170, 29);
		panel_1_1.add(chckbxbeef);
		
		JLabel lblNewLabel_1 = new JLabel("Menu Items");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(23, 29, 149, 29);
		panel_1_1.add(lblNewLabel_1);
		
		txtbeef = new JTextField();
		txtbeef.setFont(new Font("Arial", Font.ITALIC, 18));
		txtbeef.setHorizontalAlignment(SwingConstants.CENTER);
		txtbeef.setText("0");
		txtbeef.setBounds(213, 75, 170, 29);
		panel_1_1.add(txtbeef);
		txtbeef.setColumns(10);
		
		JCheckBox chckbxbacon = new JCheckBox("Bacon Burger");
		chckbxbacon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxbacon.isSelected())
				{
					txtbacon.setEnabled(true);
					txtbacon.setText("");
					txtbacon.requestFocus();
				}
				else
				{
					txtbacon.setEnabled(false);
					txtbacon.setText("0");
				}
			}
		});
		chckbxbacon.setBackground(new Color(0, 255, 255));
		chckbxbacon.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxbacon.setBounds(23, 118, 170, 29);
		panel_1_1.add(chckbxbacon);
		
		txtbacon = new JTextField();
		txtbacon.setFont(new Font("Arial", Font.ITALIC, 18));
		txtbacon.setHorizontalAlignment(SwingConstants.CENTER);
		txtbacon.setText("0");
		txtbacon.setColumns(10);
		txtbacon.setBounds(213, 118, 170, 29);
		panel_1_1.add(txtbacon);
		
		JCheckBox chckbxchicken = new JCheckBox("Chicken Burger");
		chckbxchicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxchicken.isSelected())
				{
					txtchicken.setEnabled(true);
					txtchicken.setText("");
					txtchicken.requestFocus();
				}
				else
				{
					txtchicken.setEnabled(false);
					txtchicken.setText("0");
				}
			}
		});
		chckbxchicken.setBackground(new Color(0, 255, 255));
		chckbxchicken.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxchicken.setBounds(23, 200, 170, 29);
		panel_1_1.add(chckbxchicken);
		
		txtchicken = new JTextField();
		txtchicken.setFont(new Font("Arial", Font.ITALIC, 18));
		txtchicken.setHorizontalAlignment(SwingConstants.CENTER);
		txtchicken.setText("0");
		txtchicken.setColumns(10);
		txtchicken.setBounds(213, 200, 170, 29);
		panel_1_1.add(txtchicken);
		
		chckbxpork = new JCheckBox("Pork Burger");
		chckbxpork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxpork.isSelected())
				{
					txtpork.setEnabled(true);
					txtpork.setText("");
					txtpork.requestFocus();
				}
				else
				{
					txtpork.setEnabled(false);
					txtpork.setText("0");
				}
			}
		});
		chckbxpork.setBackground(new Color(0, 255, 255));
		chckbxpork.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxpork.setBounds(23, 157, 170, 29);
		panel_1_1.add(chckbxpork);
		
		txtpork = new JTextField();
		txtpork.setFont(new Font("Arial", Font.ITALIC, 18));
		txtpork.setHorizontalAlignment(SwingConstants.CENTER);
		txtpork.setText("0");
		txtpork.setColumns(10);
		txtpork.setBounds(213, 157, 170, 29);
		panel_1_1.add(txtpork);
		
		JCheckBox chckbxkit = new JCheckBox("Kitkat Shake");
		chckbxkit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxkit.isSelected())
				{
					txtkit.setEnabled(true);
					txtkit.setText("");
					txtkit.requestFocus();
				}
				else
				{
					txtkit.setEnabled(false);
					txtkit.setText("0");
				}
			}
		});
		chckbxkit.setBackground(new Color(0, 255, 255));
		chckbxkit.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxkit.setBounds(23, 364, 170, 29);
		panel_1_1.add(chckbxkit);
		
		txtkit = new JTextField();
		txtkit.setFont(new Font("Arial", Font.ITALIC, 18));
		txtkit.setHorizontalAlignment(SwingConstants.CENTER);
		txtkit.setText("0");
		txtkit.setColumns(10);
		txtkit.setBounds(213, 364, 170, 29);
		panel_1_1.add(txtkit);
		
		JCheckBox chckbxoreo = new JCheckBox("Oreo Shake");
		chckbxoreo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxoreo.isSelected())
				{
					txtoreo.setEnabled(true);
					txtoreo.setText("");
					txtoreo.requestFocus();
				}
				else
				{
					txtoreo.setEnabled(false);
					txtoreo.setText("0");
				}
			}
		});
		chckbxoreo.setBackground(new Color(0, 255, 255));
		chckbxoreo.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxoreo.setBounds(23, 321, 170, 29);
		panel_1_1.add(chckbxoreo);
		
		txtoreo = new JTextField();
		txtoreo.setFont(new Font("Arial", Font.ITALIC, 18));
		txtoreo.setHorizontalAlignment(SwingConstants.CENTER);
		txtoreo.setText("0");
		txtoreo.setColumns(10);
		txtoreo.setBounds(213, 321, 170, 29);
		panel_1_1.add(txtoreo);
		
		JCheckBox chckbxcoffee = new JCheckBox("Cold Coffee");
		chckbxcoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxcoffee.isSelected())
				{
					txtcoffee.setEnabled(true);
					txtcoffee.setText("");
					txtcoffee.requestFocus();
				}
				else
				{
					txtcoffee.setEnabled(false);
					txtcoffee.setText("0");
				}
			}
		});
		chckbxcoffee.setBackground(new Color(0, 255, 255));
		chckbxcoffee.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxcoffee.setBounds(23, 282, 170, 29);
		panel_1_1.add(chckbxcoffee);
		
		txtcoffee = new JTextField();
		txtcoffee.setFont(new Font("Arial", Font.ITALIC, 18));
		txtcoffee.setHorizontalAlignment(SwingConstants.CENTER);
		txtcoffee.setText("0");
		txtcoffee.setColumns(10);
		txtcoffee.setBounds(213, 282, 170, 29);
		panel_1_1.add(txtcoffee);
		
		txtveg = new JTextField();
		txtveg.setFont(new Font("Arial", Font.ITALIC, 18));
		txtveg.setHorizontalAlignment(SwingConstants.CENTER);
		txtveg.setText("0");
		txtveg.setColumns(10);
		txtveg.setBounds(213, 239, 170, 29);
		panel_1_1.add(txtveg);
		
		JCheckBox chckbxveg = new JCheckBox("Veggie Burger");
		chckbxveg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxveg.isSelected())
				{
					txtveg.setEnabled(true);
					txtveg.setText("");
					txtveg.requestFocus();
				}
				else
				{
					txtveg.setEnabled(false);
					txtveg.setText("0");
				}
			}
		});
		chckbxveg.setBackground(new Color(0, 255, 255));
		chckbxveg.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxveg.setBounds(23, 239, 170, 29);
		panel_1_1.add(chckbxveg);
		
		txtnut = new JTextField();
		txtnut.setFont(new Font("Arial", Font.ITALIC, 18));
		txtnut.setHorizontalAlignment(SwingConstants.CENTER);
		txtnut.setText("0");
		txtnut.setColumns(10);
		txtnut.setBounds(213, 409, 170, 29);
		panel_1_1.add(txtnut);
		
		JCheckBox chckbxnut = new JCheckBox("Nutella Shake");
		chckbxnut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxnut.isSelected())
				{
					txtnut.setEnabled(true);
					txtnut.setText("");
					txtnut.requestFocus();
				}
				else
				{
					txtnut.setEnabled(false);
					txtnut.setText("0");
				}
			}
		});
		chckbxnut.setBackground(new Color(0, 255, 255));
		chckbxnut.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxnut.setBounds(23, 409, 170, 29);
		panel_1_1.add(chckbxnut);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(1010, 21, 403, 470);
		panel_1_1_1.setForeground(new Color(0, 128, 128));
		panel_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_1_1.setBackground(Color.WHITE);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		txtFinal = new JTextField();
		txtFinal.setFont(new Font("Sitka Text", Font.BOLD, 15));
		txtFinal.setHorizontalAlignment(SwingConstants.CENTER);
		txtFinal.setBackground(new Color(255, 255, 255));
		txtFinal.setEditable(false);
		txtFinal.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
			}
		});
		txtFinal.setBounds(10, 10, 383, 31);
		panel_1_1_1.add(txtFinal);
		txtFinal.setColumns(10);
		
		txtFinal1 = new JTextField();
		txtFinal1.setBounds(10, 37, 383, 31);
		panel_1_1_1.add(txtFinal1);
		txtFinal1.setColumns(10);
		
		txtFinal2 = new JTextField();
		txtFinal2.setColumns(10);
		txtFinal2.setBounds(10, 67, 383, 31);
		panel_1_1_1.add(txtFinal2);
		
		txtFinal3 = new JTextField();
		txtFinal3.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtFinal3.setColumns(10);
		txtFinal3.setBounds(10, 96, 383, 31);
		panel_1_1_1.add(txtFinal3);
		
		txtFinal4 = new JTextField();
		txtFinal4.setColumns(10);
		txtFinal4.setBounds(10, 124, 383, 31);
		panel_1_1_1.add(txtFinal4);
		
		txtFinal5 = new JTextField();
		txtFinal5.setHorizontalAlignment(SwingConstants.LEFT);
		txtFinal5.setEditable(false);
		txtFinal5.setColumns(10);
		txtFinal5.setBackground(Color.WHITE);
		txtFinal5.setBounds(10, 154, 382, 31);
		panel_1_1_1.add(txtFinal5);
		
		txtFinal6 = new JTextField();
		txtFinal6.setColumns(10);
		txtFinal6.setBounds(10, 181, 383, 31);
		panel_1_1_1.add(txtFinal6);
		
		txtFinal7 = new JTextField();
		txtFinal7.setColumns(10);
		txtFinal7.setBounds(10, 211, 383, 31);
		panel_1_1_1.add(txtFinal7);
		
		txtFinal8 = new JTextField();
		txtFinal8.setColumns(10);
		txtFinal8.setBounds(10, 240, 383, 31);
		panel_1_1_1.add(txtFinal8);
		
		txtFinal9 = new JTextField();
		txtFinal9.setColumns(10);
		txtFinal9.setBounds(10, 268, 383, 31);
		panel_1_1_1.add(txtFinal9);
		
		txtFinal10 = new JTextField();
		txtFinal10.setHorizontalAlignment(SwingConstants.LEFT);
		txtFinal10.setEditable(false);
		txtFinal10.setColumns(10);
		txtFinal10.setBackground(Color.WHITE);
		txtFinal10.setBounds(10, 299, 382, 31);
		panel_1_1_1.add(txtFinal10);
		
		txtFinal11 = new JTextField();
		txtFinal11.setColumns(10);
		txtFinal11.setBounds(10, 326, 383, 31);
		panel_1_1_1.add(txtFinal11);
		
		txtFinal12 = new JTextField();
		txtFinal12.setColumns(10);
		txtFinal12.setBounds(10, 356, 383, 31);
		panel_1_1_1.add(txtFinal12);
		
		txttotall = new JTextField();
		txttotall.setFont(new Font("Arial Black", Font.BOLD, 15));
		txttotall.setColumns(10);
		txttotall.setBounds(10, 413, 383, 47);
		panel_1_1_1.add(txttotall);
		
		txttaxx = new JTextField();
		txttaxx.setFont(new Font("Tahoma", Font.BOLD, 10));
		txttaxx.setColumns(10);
		txttaxx.setBounds(10, 383, 383, 31);
		panel_1_1_1.add(txttaxx);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBounds(1010, 512, 403, 155);
		panel.add(panel_1_1_1_1);
		panel_1_1_1_1.setForeground(new Color(0, 128, 128));
		panel_1_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_1_1_1.setBackground(Color.CYAN);
		panel_1_1_1_1.setLayout(null);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
				   LocalDateTime now = LocalDateTime.now();
				   int id = 100 + (int)(Math.random()*1234);
				   String date = dtf.format(now);
				   String Cid = date + id ;
				   txtID.setText(Cid);
				// Customer Information Panel
				
				txtf.setText("");
				//txtl.setText("");
				txtadd.setText("");
				txtmobile.setText("");
				//txtinst.setText("");
				//txtdob.setText("");
				txttoken.setText("");
				// customer dropboxes
				
				
				// menu panel
				    //jtxt boxes
					txtbeef.setText("0");
					txtbacon.setText("0");
					txtpork.setText("0");
					txtchicken.setText("0");
					txtveg.setText("0");
					txtnut.setText("0");
					txtkit.setText("0");
					txtoreo.setText("0");
					txtcoffee.setText("0");
				   //chckbx 
					chckbxbeef.setSelected(false);
					chckbxbacon.setSelected(false);
					chckbxpork.setSelected(false);
					chckbxchicken.setSelected(false);
					chckbxveg.setSelected(false);
					chckbxnut.setSelected(false);
					chckbxkit.setSelected(false);
					chckbxoreo.setSelected(false);
					chckbxcoffee.setSelected(false);
				// tax panel
					txttax.setText("");
					txtsubtotal.setText("");
					txttotal.setText("");
					
					//reciept
					txtFinal.setText("");
					txtFinal1.setText("");
					txtFinal2.setText("");		
					txtFinal3.setText("");
					txtFinal4.setText("");
					txtFinal5.setText("");
					txtFinal6.setText("");
					txtFinal7.setText("");
					txtFinal8.setText("");
					txtFinal9.setText("");
					txtFinal10.setText("");
					txtFinal11.setText("");
					txtFinal12.setText("");
					txttotall.setText("");
					txttaxx.setText("");
			}
		});
		btnReset.setFont(new Font("Stencil", Font.BOLD, 24));
		btnReset.setBounds(20, 35, 175, 82);
		panel_1_1_1_1.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exit = new JFrame();
				if(JOptionPane.showConfirmDialog(exit,"Do you want to exit ?", "Billing Interface", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Stencil", Font.BOLD, 24));
		btnExit.setBounds(206, 35, 175, 82);
		panel_1_1_1_1.add(btnExit);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setForeground(new Color(0, 128, 128));
		panel_1_1_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_1_1_1_1.setBackground(Color.CYAN);
		panel_1_1_1_1_1.setBounds(51, 512, 403, 155);
		panel.add(panel_1_1_1_1_1);
		panel_1_1_1_1_1.setLayout(null);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					txtFinal.print();
					txtFinal1.print();
					txtFinal2.print();		
					txtFinal3.print();
					txtFinal4.print();
					txtFinal5.print();
					txtFinal6.print();
					txtFinal7.print();
					txtFinal8.print();
					txtFinal9.print();
					txtFinal10.print();
					txtFinal11.print();
					txtFinal12.print();
					txttotall.print();
					txttaxx.print();
				
				}
				catch(Exception E)
				{
					System.out.println("Printing error");
				}
			}
		});
		btnPrint.setFont(new Font("Stencil", Font.BOLD, 24));
		btnPrint.setBounds(28, 33, 175, 82);
		panel_1_1_1_1_1.add(btnPrint);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				
				
					
			 	itemprice[0] = Double.parseDouble(txtbeef.getText())*30.00;
					itemprice[1] = Double.parseDouble(txtbacon.getText())*30.00;
					itemprice[2] = Double.parseDouble(txtchicken.getText())*90.00;
					itemprice[3] = Double.parseDouble(txtpork.getText())*60.00;
					itemprice[4] = Double.parseDouble(txtveg.getText())*30.00;
					itemprice[5] = Double.parseDouble(txtcoffee.getText())*20.00;
					itemprice[6] = Double.parseDouble(txtkit.getText())*80.00;
					itemprice[7] = Double.parseDouble(txtoreo.getText())*80.00;
					itemprice[8] = Double.parseDouble(txtnut.getText())*80.00;
itemprice[9] = itemprice[0]+itemprice[1]+itemprice[3]+itemprice[4]+itemprice[5]+itemprice[6]+itemprice[7]+itemprice[8];
					
                   subtotal=String.format("rs.%f", itemprice[9]);
					txtsubtotal.setText(subtotal);
			
					 tax=String.format("rs.%f", itemprice[9]*0.05);
			        txttax.setText(tax);
			
			        total= String.format("rs.%f", itemprice[9]+(itemprice[9]*0.05));
			        txttotal.setText(total);
			        
			        //making the reciept
			        	txtFinal.setEnabled(true);
			        	String s ="CSV's Cafe"; 
			        	txtFinal.setText(s);
			        	String s1 = "Customer ID:" +"      " + txtID.getText();
			        	txtFinal1.setText(s1);
			        	String s2= "Token number" + "       " + txttoken.getText();
			        	txtFinal2.setText(s2);
			        	String x="Item        " + "        Quantity"; 
			        	txtFinal3.setText(x);
			        	String s3="Beef Burger" +"          " +txtbeef.getText();
			        	txtFinal4.setText(s3);
			        	String s4="Bacon Burger" +"       " +txtbacon.getText();
			        	txtFinal5.setText(s4);
			        	String sub = "\n Subtotal:" + txtsubtotal.getText(); 
			        	String s5="Pork Burger" + "          "+ txtpork.getText();
			        	txtFinal6.setText(s5);
			        	String s6="Chicken Burger" +"    "+ txtchicken.getText();
			        	txtFinal7.setText(s6);
			        	String s7="Veggie Burger" +"      " +txtveg.getText();
			        	txtFinal8.setText(s7);
			        	String s8="Cold Coffee" +"          " +txtcoffee.getText();
			        	txtFinal9.setText(s8);
			        	String s9="Oreo Shake" +"          " +txtoreo.getText();
			        	txtFinal10.setText(s9);
			        	String s10="Kitkat Shake" +"         " +txtkit.getText();
			        	txtFinal11.setText(s10);
			        	String s11="Nutella Shake" +"       " +txtnut.getText();
			        	txtFinal12.setText(s11);
			        	String tax= "Tax:     " +"                 " + txttax.getText();
			        	txttaxx.setText(tax);
			        	String total= "Total:" +"          " + txttotal.getText();
			        	txttotall.setText(total);
			        	
			        	
			        	
			        	
			        
			        
			}
		});
		btnTotal.setFont(new Font("Stencil", Font.BOLD, 24));
		btnTotal.setBounds(213, 33, 175, 82);
		panel_1_1_1_1_1.add(btnTotal);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setForeground(new Color(0, 128, 128));
		panel_1_1_1_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_1_1_1_1_1.setBackground(Color.CYAN);
		panel_1_1_1_1_1_1.setBounds(517, 512, 425, 155);
		panel.add(panel_1_1_1_1_1_1);
		panel_1_1_1_1_1_1.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTax.setBounds(29, 20, 149, 29);
		panel_1_1_1_1_1_1.add(lblTax);
		
		txttax = new JTextField();
		txttax.setColumns(10);
		txttax.setBounds(188, 20, 194, 29);
		panel_1_1_1_1_1_1.add(txttax);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblSubtotal.setBounds(29, 62, 149, 29);
		panel_1_1_1_1_1_1.add(lblSubtotal);
		
		txtsubtotal = new JTextField();
		txtsubtotal.setColumns(10);
		txtsubtotal.setBounds(188, 62, 194, 29);
		panel_1_1_1_1_1_1.add(txtsubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTotal.setBounds(29, 101, 149, 29);
		panel_1_1_1_1_1_1.add(lblTotal);
		
		txttotal = new JTextField();
		txttotal.setColumns(10);
		txttotal.setBounds(188, 101, 194, 29);
		panel_1_1_1_1_1_1.add(txttotal);
	}
}
