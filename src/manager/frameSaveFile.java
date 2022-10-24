package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameSaveFile {

	private JFrame frameSaveFile;
	private JTextField saveFileName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameSaveFile window = new frameSaveFile();
					window.frameSaveFile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frameSaveFile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameSaveFile = new JFrame();
		frameSaveFile.setTitle("SaveFile");
		frameSaveFile.setBounds(100, 100, 450, 300);
		frameSaveFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameSaveFile.getContentPane().setLayout(null);
		
		saveFileName = new JTextField();
		saveFileName.setBounds(145, 93, 132, 17);
		frameSaveFile.getContentPane().add(saveFileName);
		saveFileName.setColumns(10);
		
		JLabel SaveLabel = new JLabel("FileName");
		SaveLabel.setBounds(69, 96, 66, 17);
		frameSaveFile.getContentPane().add(SaveLabel);
		
		JButton saveBtn = new JButton("Save");
		saveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		saveBtn.setBounds(145, 135, 89, 23);
		frameSaveFile.getContentPane().add(saveBtn);
	}
}
