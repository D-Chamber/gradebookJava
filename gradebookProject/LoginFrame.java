/**
 * GUI FORM LOGIN
 */


import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.util.*;

public class LoginFrame extends JFrame { // Classes extends JFrame Superclass for GUI

	// initializes all the variables
	private JPanel panel = new JPanel();
	private JLabel userLabel = new JLabel("USERNAME");
	private JLabel passwordLabel = new JLabel("PASSWORD");
	private JTextField userTextField = new JTextField(15);
	private JPasswordField passwordField = new JPasswordField(15);
	private JButton loginButton = new JButton("LOGIN");
	private JButton resetButton = new JButton("RESET");
	private JCheckBox showPassword = new JCheckBox("Show Password");

	public LoginFrame() { // constructor that will hold all the necessary objects
		super("Gradebook Login"); // sets the frame name
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default close action to exit
	    setSize(269,211); // sets the frame size

	    panelSetup(); // runs the panel setup method
	    getContentPane().setLayout(null); // sets the content pane to absolute layout
	    panel.setBounds(0, 0, 253, 172); // sets the panel location withing the Frame
	    getContentPane().add(panel); // add the panel to the frame
	    setVisible(true); // sets the frame to be visible so that the GUI will open when the program is ran
	}

	private void panelSetup() { // method that will set up and add all the variables to the GUI panel
		panel.setLayout(null); // sets the GUI panel to be absolute
		
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
		
		loginButton.addActionListener(new ActionListener() { // action ran when the login button is pressed
			public void actionPerformed(ActionEvent arg0) {
				String puname = userTextField.getText();
				String ppaswd = passwordField.getText();
				
				if ((puname.equals("teacher")) && (ppaswd.equals("123"))) {
					Teacher teach = new Teacher();
				}

				else if ((puname.equals("student")) && (ppaswd.equals("123"))) {
						try {
							StudentGradebook student = new StudentGradebook();
						} catch (IOException e) {
							e.printStackTrace();
						}
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
		
		resetButton.addActionListener(new ActionListener() { // action ran when the reset button is clicked
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