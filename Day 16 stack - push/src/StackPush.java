/*
 * Created by: Allison Cook
 * Created on: 15-April-2019
 * Created for: ICS4U
 * Day #16 (Stack - Push)
 * This program allows the user to "push" an integer on to a stack
 * then the stack is displayed in a list
*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StackPush {

	private JFrame frame;
	private JTextField txtUserInt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StackPush window = new StackPush();
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
	public StackPush() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterint = new JLabel("Enter an integer:");
		lblEnterint.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterint.setBounds(49, 11, 121, 20);
		frame.getContentPane().add(lblEnterint);
		
		txtUserInt = new JTextField();
		txtUserInt.setBounds(168, 13, 178, 20);
		frame.getContentPane().add(txtUserInt);
		txtUserInt.setColumns(10);
		
		JList lstStackValue = new JList();
		lstStackValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lstStackValue.setBounds(49, 85, 297, 146);
		frame.getContentPane().add(lstStackValue);
		
		JButton btnAddValue = new JButton("Add Value");
		btnAddValue.addActionListener(new ActionListener() {
			//when add value is pushed
			public void actionPerformed(ActionEvent arg0) {
				//variables
				int userNum = 0;
				
				//get the stack class
				StackA stacksTry = new StackA();
				
				//get the number from the text box
				try {
					userNum = Integer.parseInt(txtUserInt.getText());
				}
				catch(Exception e) {
					//display to the user an error
					JOptionPane.showMessageDialog(null, "Please only enter numbers that are integers." );
				}
				
				//add the number to the stack
				stacksTry.Push(userNum);
				
				//display the stack to the 
				
			}
		});
		btnAddValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddValue.setBounds(149, 51, 93, 23);
		frame.getContentPane().add(btnAddValue);
	}
}
