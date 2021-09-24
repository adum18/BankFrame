import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class gamePanel implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textfield = new JLabel();
	JLabel textfieldBalance = new JLabel();
	JButton[] buttons = new JButton[3];
	JButton btnWithdrawal;
	JButton btnDeposit;
	JButton btnAccountDetails;
	public static int balance = 2000;
	
	gamePanel() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setTitle("Bank Account");
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(25,255,8));
		textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Bank Account");
		textfield.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		
		button_panel.setLayout(new GridLayout(3,3));
		button_panel.setBackground(new Color(150,150,150));

		btnDeposit = new JButton();
		button_panel.add(btnDeposit);
		btnDeposit.setFont(new Font("MV Boli", Font.BOLD,80));
		btnDeposit.setFocusable(false);
		btnDeposit.addActionListener(this);
		btnDeposit.setText("Deposit");
		
		btnWithdrawal = new JButton();
		button_panel.add(btnWithdrawal);
		btnWithdrawal.setFont(new Font("MV Boli",Font.BOLD, 80));
		btnWithdrawal.setFocusable(false);
		btnWithdrawal.addActionListener(this);
		btnWithdrawal.setText("Withdraw");
			
		btnAccountDetails = new JButton();
		button_panel.add(btnAccountDetails);
		btnAccountDetails.setFont(new Font("MV Boli",Font.BOLD,80));
		btnAccountDetails.setFocusable(false);
		btnAccountDetails.addActionListener(this);
		btnAccountDetails.setText("Account Details");
		
	
		title_panel.add(textfield);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnWithdrawal); {
			WithdrawWindow withdrawWindow = new WithdrawWindow();
			frame.dispose();
			}
			if(e.getSource()==btnDeposit) {
				DepositWindow depositWindow = new DepositWindow();
				frame.dispose();
			}
			if(e.getSource()==btnAccountDetails) {
				DetailsWindow detailswindow = new DetailsWindow();
				frame.dispose();
			}
			
			
			
		}
	
}


