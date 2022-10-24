package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameOpenFile {

	private JFrame frameOpenFile;
	private JTextField openFileName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameOpenFile window = new frameOpenFile();
					window.frameOpenFile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frameOpenFile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameOpenFile = new JFrame();
		frameOpenFile.setTitle("OpenFile");
		frameOpenFile.setBounds(100, 100, 450, 300);
		frameOpenFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameOpenFile.getContentPane().setLayout(null);
		
		JLabel OpenLabel = new JLabel("OpenFile name");
		OpenLabel.setBounds(57, 72, 102, 20);
		frameOpenFile.getContentPane().add(OpenLabel);
		
		openFileName = new JTextField();
		openFileName.setBounds(169, 72, 133, 20);
		frameOpenFile.getContentPane().add(openFileName);
		openFileName.setColumns(10);
		
		JButton openBtn = new JButton("Open");
		openBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		openBtn.setBounds(169, 123, 89, 23);
		frameOpenFile.getContentPane().add(openBtn);
	}

}
