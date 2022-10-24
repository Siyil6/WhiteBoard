package guest;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class joinserver {

	private JFrame frmWhiteboard;
	private JTextField textSend;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					joinserver window = new joinserver();
					window.frmWhiteboard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public joinserver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWhiteboard = new JFrame();
		frmWhiteboard.setTitle("Whiteboard-Client");
		frmWhiteboard.setBounds(100, 100, 1048, 720);
		frmWhiteboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWhiteboard.getContentPane().setLayout(null);
		
		JButton lineBtn = new JButton("Line");
		lineBtn.setBounds(10, 11, 89, 23);
		frmWhiteboard.getContentPane().add(lineBtn);
		
		JButton circleBtn = new JButton("Circle");
		circleBtn.setBounds(10, 45, 89, 23);
		frmWhiteboard.getContentPane().add(circleBtn);
		
		JButton triangleBtn = new JButton("Triangle");
		triangleBtn.setBounds(10, 79, 89, 23);
		frmWhiteboard.getContentPane().add(triangleBtn);
		
		JButton rectangleBtn = new JButton("Rectangle");
		rectangleBtn.setBounds(10, 113, 89, 23);
		frmWhiteboard.getContentPane().add(rectangleBtn);
		
		JButton sendBtn = new JButton("Send");
		textSend = new JTextField();
		textSend.setBounds(10, 440, 89, 20);
		frmWhiteboard.getContentPane().add(textSend);
		textSend.setColumns(10);
		
		JTextArea textReceive = new JTextArea();
		textReceive.setEditable(false);
		textReceive.setBounds(10, 291, 89, 138);
		frmWhiteboard.getContentPane().add(textReceive);
		sendBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = textSend.getText();
				
				textReceive.setText(textReceive.getText()+'\n'+msg);
			}
		});
		
		sendBtn.setBounds(10, 471, 89, 23);
		frmWhiteboard.getContentPane().add(sendBtn);
		
		JButton colorBtn = new JButton("Color");
		colorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		colorBtn.setBounds(10, 147, 89, 23);
		frmWhiteboard.getContentPane().add(colorBtn);
		
		JButton textBtn = new JButton("Text");
		textBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textBtn.setBounds(10, 181, 89, 23);
		frmWhiteboard.getContentPane().add(textBtn);
		

		
		
	}

}
