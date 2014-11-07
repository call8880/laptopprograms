package Objects;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrapsGui {
	
	private Craps game = new Craps();
	boolean newgame;
	JTextArea textArea;
	private JFrame frame;
	int money;
	JLabel lblcash;
	JLabel lbldiesum;
	JButton btnRollDie;
	JScrollPane scrollPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrapsGui window = new CrapsGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CrapsGui() {
		newgame = true;
		money = 100;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel lbldie1 = new JLabel("");
		lbldie1.setBounds(10, 11, 125, 125);
		frame.getContentPane().add(lbldie1);
		
		final JLabel lbldie2 = new JLabel("");
		lbldie2.setBounds(145, 11, 125, 125);
		frame.getContentPane().add(lbldie2);
		
		lbldiesum = new JLabel("");
		lbldiesum.setBounds(314, 59, 69, 50);
		frame.getContentPane().add(lbldiesum);
		
		
		btnRollDie = new JButton("Roll Die");
		btnRollDie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				game.roll();//roll both of the dice
				lbldie1.setIcon(game.getDiePice(1));//set die lbl to show dice
				lbldie2.setIcon(game.getDiePice(2));
				//game code
				if (newgame){
					textArea.setText("New Game\n-------\nYou rolled a: " + game.getTotal());
					newgame = false;
					money -= 5;
					lblcash.setText("$" + money);
				}
				else textArea.append("\n-----\nYou Rolled a: " + game.getTotal());
				lbldiesum.setText("" + game.getTotal());
				
				if (game.hasWon()){
					textArea.append("\n------\nCongratulations You Have won");
					money += 15; 
					newgame = true;
					game = new Craps();
				}
				if (game.hasLost()){
					textArea.append("\n-----\nYou Lost\n-----\nPress roll to play again or Quit to exit");
					newgame = true;
					game = new Craps();
				}
				if(money < 5 && newgame == true){
					btnRollDie.setEnabled(false);
					textArea.setText("You Have Run out of money and lost please exit the program");
				}
			}
		});
		btnRollDie.setBounds(352, 252, 97, 23);
		frame.getContentPane().add(btnRollDie);
		
		JLabel lblCashRemaining = new JLabel("Cash Remaining ");
		lblCashRemaining.setBounds(10, 123, 97, 23);
		frame.getContentPane().add(lblCashRemaining);
		
		lblcash = new JLabel("");
		lblcash.setBounds(117, 127, 46, 14);
		frame.getContentPane().add(lblcash);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(352, 299, 97, 23);
		frame.getContentPane().add(btnQuit);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 171, 332, 179);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
	}
}
