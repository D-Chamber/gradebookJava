import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel panel = new JPanel();
	private JLabel userLabel = new JLabel("USERNAME");
	private JLabel passwordLabel = new JLabel("PASSWORD");
	private JTextField userTextField = new JTextField(15);
	private JPasswordField passwordField = new JPasswordField(15);
	private JButton loginButton = new JButton("LOGIN");
	private JButton resetButton = new JButton("RESET");
	private JCheckBox showPassword = new JCheckBox("Show Password");

	public LoginFrame() {
		super("Gradebook Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(269,211);

	    panelSetup();
	    getContentPane().setLayout(null);
	    panel.setBounds(0, 0, 253, 172);
	    getContentPane().add(panel);
	    setVisible(true);
	}

	private void panelSetup() {
		panel.setLayout(null);
		
		userLabel.setBounds(21, 32, 91, 14);
		panel.add(userLabel);
		
		passwordLabel.setBounds(21, 57, 79, 14);
		panel.add(passwordLabel);
		
		userTextField.setBounds(110, 29, 101, 20);
		panel.add(userTextField);
		
		passwordField.setBounds(110, 54, 101, 20);
		panel.add(passwordField);
		
		showPassword.setBounds(110, 81, 101, 23);
		panel.add(showPassword);
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String puname = userTextField.getText();
				String ppaswd = passwordField.getText();
				
				if ((puname.equals("teacher")) && (ppaswd.equals("123"))) {
					
				}
				
				else {
					JOptionPane.showMessageDialog(null,"Wrong Password / Username");
					userTextField.setText("");
					passwordField.setText("");
					userTextField.requestFocus();
				}
			}
		});
		loginButton.setBounds(30, 111, 79, 35);
		panel.add(loginButton);
		
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userTextField.setText("");
				passwordField.setText("");
				userTextField.requestFocus();
			}
		});
		resetButton.setBounds(139, 111, 84, 35);
		panel.add(resetButton);
	}
	
	public static void main (String[] args) {
		new LoginFrame();
	}
}