package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class createserver {

	private JFrame frmWhiteboard;
	private JTextField textSend;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createserver window = new createserver();
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
	public createserver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWhiteboard = new JFrame();
		frmWhiteboard.setTitle("Whiteboard");
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
		
		JButton kickBtn = new JButton("Kick");
		kickBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		kickBtn.setBounds(10, 633, 89, 23);
		frmWhiteboard.getContentPane().add(kickBtn);
		
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
		
		JList list = new JList();
		list.setBounds(10, 505, 89, 117);
		frmWhiteboard.getContentPane().add(list);
		
		JComboBox fileBox = new JComboBox();
		fileBox.setToolTipText("filebox");
		fileBox.setBounds(10, 147, 89, 22);
		frmWhiteboard.getContentPane().add(fileBox);
		

		
		
	}
}
