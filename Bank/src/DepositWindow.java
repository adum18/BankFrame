import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class DepositWindow extends gamePanel implements ActionListener {
	JFrame frame = new JFrame();
	JLabel header = new JLabel();
	JPanel header_panel = new JPanel();
	JPanel body_panel = new JPanel();
	JLabel body = new JLabel();
	JButton submit = new JButton();
	JButton back = new JButton();
	JTextField textfield = new JTextField();
	JPanel backPanel = new JPanel();
	JPanel submitPanel = new JPanel();
	JPanel messagePanel = new JPanel();
	JLabel message = new JLabel();
	
	DepositWindow() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Deposit");
		frame.add(header_panel);
		frame.add(header);
		frame.add(body_panel);
		frame.add(submitPanel);
		
		header.setBackground(new Color(25,25,25));
		header.setForeground(new Color(25,255,0));
		header.setFont(new Font("Ink Free", Font.BOLD, 75));
		header.setHorizontalAlignment(JLabel.CENTER);
		header.setText("Deposit");
		header.setOpaque(true);
		
		header_panel.setLayout(new BorderLayout());
		header_panel.setBounds(0,0,800,100);
		header_panel.add(header);
		
		body_panel.setLayout(new BorderLayout());
		body_panel.setBounds(0,200,450,50);
		body_panel.add(body,BorderLayout.WEST);
		body_panel.add(textfield,BorderLayout.EAST);
		
		body.setText("Enter deposit amount: ");
		body.setFont(new Font("MV Boli",Font.PLAIN,25));
		body.setForeground(Color.WHITE);
		body.setBackground(new Color(25,25,25));
		body.setOpaque(true);
		
		textfield.setPreferredSize(new Dimension(175,50));
		
		submitPanel.setLayout(new BorderLayout());
		submitPanel.setBounds(460,210,75,25);
		submitPanel.add(submit);
		
		submit.setText("Submit");
		submit.addActionListener(this);
		
		messagePanel.setLayout(new BorderLayout());
		messagePanel.setBounds(150,400,450,50);
		messagePanel.setBackground(Color.WHITE);
		messagePanel.add(message,BorderLayout.CENTER);
		frame.add(messagePanel);
		
		message.setForeground(Color.BLACK);
		message.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		backPanel.setLayout(new BorderLayout());
		backPanel.setBounds(50,650,75,25);
		backPanel.add(back);
		frame.add(backPanel);
		
		back.setText("Back");
		back.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit) {
				int depositAmount = Integer.parseInt(textfield.getText());
				textfield.getText();
				message.setText("Your Deposit of " + textfield.getText() + " dollars was successful!");
				textfield.setEditable(false);
				balance += depositAmount;
				}
		if(e.getSource()==back) {
			gamePanel homescreen = new gamePanel();
			frame.dispose();
		}
			
		
	}
}
