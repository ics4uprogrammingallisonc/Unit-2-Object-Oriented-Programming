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
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class StackPush {

	private JFrame frmStackPush;
	private JTextField txtUserInt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StackPush window = new StackPush();
					window.frmStackPush.setVisible(true);
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
		frmStackPush = new JFrame();
		frmStackPush.setTitle("Stack - Push");
		frmStackPush.setBounds(100, 100, 430, 300);
		frmStackPush.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStackPush.getContentPane().setLayout(null);
		
		JLabel lblEnterint = new JLabel("Enter an integer:");
		lblEnterint.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterint.setBounds(49, 11, 121, 20);
		frmStackPush.getContentPane().add(lblEnterint);
		
		txtUserInt = new JTextField();
		txtUserInt.setBounds(168, 13, 178, 20);
		frmStackPush.getContentPane().add(txtUserInt);
		txtUserInt.setColumns(10);
		
		//set a default model
		JList lstStackValue = new JList();
		DefaultListModel model = new DefaultListModel();
		lstStackValue.setModel(model);
		lstStackValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lstStackValue.setBounds(49, 85, 297, 146);
		frmStackPush.getContentPane().add(lstStackValue);
		
		//add a scroll bar
		//JScrollPane scrollPane = new JScrollPane(lstStackValue);
		//scrollPane.setViewportView(lstStackValue);
	
		
		JButton btnAddValue = new JButton("Add Value");
		btnAddValue.addActionListener(new ActionListener() {
			//when add value is pushed
			public void actionPerformed(ActionEvent arg0) {
				//variables
				int userNum = 0;
				
				//get the stack class
				StackA stacksTry = new StackA();
				
				//make a new stack 
				Stack<Integer> myStack = new Stack();
				
				//set to the stack 
				
				//get the number from the text box
				try {
					userNum = Integer.parseInt(txtUserInt.getText());
				}
				catch(Exception e) {
					//display to the user an error
					JOptionPane.showMessageDialog(null, "Please only enter numbers that are integers." );
				}
				
				//check if a number was taken
				if (userNum != 0) {
					//add the number to the stack
					myStack = stacksTry.Push(userNum);
					
					//display the stack to the user
					for(int i : myStack) {
						//add to the list
						model.addElement(Integer.toString(i));
					}
				}
			}
		});
		btnAddValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddValue.setBounds(141, 51, 102, 23);
		frmStackPush.getContentPane().add(btnAddValue);
	}
}
