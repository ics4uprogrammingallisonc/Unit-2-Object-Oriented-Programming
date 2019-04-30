/*
 * Created by: Allison Cook
 * Created on: 15-April-2019
 * Created for: ICS4U
 * Day #17 (Stack - Pop)
 * This program allows the user to "pop" an integer off the top of the stack
 * then the stack is displayed in a list
*/
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;

public class StackPop {

	private JFrame frmStackpop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StackPop window = new StackPop();
					window.frmStackpop.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StackPop() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//global variable
	//get the stack class
	StackA stacks = new StackA();
			
	private void initialize() {
		frmStackpop = new JFrame();
		frmStackpop.setTitle("Stack - Pop");
		frmStackpop.setBounds(100, 100, 450, 300);
		frmStackpop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStackpop.getContentPane().setLayout(null);
		
		JLabel lblEnterint = new JLabel("Enter an integer:");
		lblEnterint.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterint.setBounds(49, 11, 121, 20);
		frmStackpop.getContentPane().add(lblEnterint);
		
		JTextField txtUserInt = new JTextField();
		txtUserInt.setBounds(168, 13, 178, 20);
		frmStackpop.getContentPane().add(txtUserInt);
		txtUserInt.setColumns(10);
		
		//set a default model
		JList lstStackValue = new JList();
		lstStackValue.setBackground(Color.WHITE);
		DefaultListModel model = new DefaultListModel();
		lstStackValue.setModel(model);
		lstStackValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lstStackValue.setBounds(65, 75, 281, 175);
		frmStackpop.getContentPane().add(lstStackValue);
		
		JButton btnAddValue = new JButton("Add Value");
		btnAddValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//variables
				int userNum = 0;
				
				//clear the list
				model.clear();
				
				//make a new stack 
				Stack<Integer> myStack = new Stack();
				
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
					myStack = stacks.Push(userNum);
					
					//display the stack to the user
					for(int i : myStack) {
						//add to the list
						model.addElement(Integer.toString(i));
					}
				}
			}
		});
		btnAddValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddValue.setBounds(59, 42, 111, 23);
		frmStackpop.getContentPane().add(btnAddValue);
		
		JButton btnPopTopValue = new JButton("Pop Top Value");
		btnPopTopValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clear the list
				model.clear();
				
				//make a new stack 
				Stack<Integer> myStack = new Stack<Integer>();
				
				//get the current stack
				myStack = stacks.myStack;
				
				//check if the stack is empty
				if(myStack.isEmpty()) {
					//display a message saying there is no numbers in the stack
					JOptionPane.showMessageDialog(null, "You can only pop the top value if the stack is not empty.");
				}
				else {
					//remove the number from the stack and get the stack
					myStack = stacks.Pop();
						
						//display the stack to the user
						for(int i : myStack) {
							//add to the list
							model.addElement(Integer.toString(i));
						
						}
					
				}
			}
		});
		btnPopTopValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPopTopValue.setForeground(new Color(0, 0, 0));
		btnPopTopValue.setBounds(212, 41, 134, 23);
		frmStackpop.getContentPane().add(btnPopTopValue);
		
		
	}
}
