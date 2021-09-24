import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class DetailsWindow extends gamePanel implements ActionListener{
	JFrame frame = new JFrame();
	JLabel header = new JLabel();
	JPanel header_panel = new JPanel();
	JPanel messagePanel = new JPanel();
	JLabel message = new JLabel();
	JPanel backPanel = new JPanel();
	JButton back = new JButton();
	
		DetailsWindow() {
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(800,800);
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setLayout(null);
			frame.setVisible(true);
			frame.setTitle("Account Details");
			frame.add(header_panel);
			
			
			header.setBackground(new Color(25,25,25));
			header.setForeground(new Color(25,255,0));
			header.setFont(new Font("Ink Free", Font.BOLD, 75));
			header.setHorizontalAlignment(JLabel.CENTER);
			header.setText("Account Details");
			header.setOpaque(true);
			
			header_panel.setLayout(new BorderLayout());
			header_panel.setBounds(0,0,800,100);
			header_panel.add(header);
			
			messagePanel.setLayout(new BorderLayout());
			messagePanel.setBounds(150,400,450,50);
			messagePanel.setBackground(Color.WHITE);
			messagePanel.add(message,BorderLayout.CENTER);
			frame.add(messagePanel);
			
			message.setForeground(Color.BLACK);
			message.setFont(new Font("MV Boli", Font.PLAIN, 15));
			message.setText("Your current balance is " + balance + " dollars!");
			
			backPanel.setLayout(new BorderLayout());
			backPanel.setBounds(50,650,75,25);
			backPanel.add(back);
			frame.add(backPanel);
			
			back.setText("Back");
			back.addActionListener(this);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==back) {
				gamePanel homescreen = new gamePanel();
				frame.dispose();
			}	
		}

}
