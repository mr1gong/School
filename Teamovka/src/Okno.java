import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
	/**
	 * 
	 * @author makovec
	 *
	 */
public class Okno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Okno frame = new Okno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Okno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 50, 290, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSelectPath = new JButton("Zvol Cestu");
		btnSelectPath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc = new JFileChooser();
				int retVal = fc.showOpenDialog(null);
                if (retVal == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fc.getSelectedFile();
				
                    try {
						BufferedReader br = new BufferedReader(new FileReader(selectedFile));
						ArrayList<String> textZeSouboru = new ArrayList<String>();
						String temp;
						while(temp = br.readLine() != null)
						
						
						
					} catch (FileNotFoundException e) {
						
						e.printStackTrace();
					}
                    
				
			}}
		});
		btnSelectPath.setBounds(310, 49, 114, 23);
		contentPane.add(btnSelectPath);
		
		JLabel lblCestaSouboru = new JLabel("Cesta Souboru");
		lblCestaSouboru.setBounds(10, 25, 114, 14);
		contentPane.add(lblCestaSouboru);
		
		JButton btnZaifruj = new JButton("Za\u0161ifruj");
		btnZaifruj.setBounds(310, 83, 114, 43);
		contentPane.add(btnZaifruj);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 106, 290, 20);
		contentPane.add(passwordField);
		
		JLabel lblKodovaciKlic = new JLabel("Kodovac\u00ED Kl\u00ED\u010D");
		lblKodovaciKlic.setBounds(10, 81, 290, 14);
		contentPane.add(lblKodovaciKlic);
	}
}
