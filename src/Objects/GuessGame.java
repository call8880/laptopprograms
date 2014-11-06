package Objects;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessGame extends JFrame {
	
	int guess;
	//guessMachine machine;
	JLabel lbltxt, lblaccuracy, lblResult, numguess;
	
	guessMachine machine = new guessMachine();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuessGame frame = new GuessGame();
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
	public GuessGame() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltxt = new JLabel("Enter a number from 1 to 100");
		lbltxt.setBounds(12, 12, 175, 16);
		contentPane.add(lbltxt);
		
		txtnum = new JTextField();
		txtnum.setBounds(232, 10, 114, 20);
		contentPane.add(txtnum);
		txtnum.setColumns(10);
		
		
		
		final JLabel lblaccuracy = new JLabel("To high or to low");
		lblaccuracy.setBounds(12, 168, 127, 16);
		contentPane.add(lblaccuracy);
		
		final JLabel lblResult = new JLabel("Guesses so far");
		lblResult.setBounds(86, 209, 101, 16);
		contentPane.add(lblResult);
		
		final JLabel numguess = new JLabel(" ");
		numguess.setBounds(232, 209, 55, 16);
		contentPane.add(numguess);
		
		final JButton btnSubmit = new JButton("Submit Guess");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guess = Integer.parseInt(txtnum.getText());
				if (machine.setGuess(guess) == true){
					lblaccuracy.setText(machine.giveHint(guess));
					numguess.setText("" + machine.getNumGuesses());
				}
				else {
					lblResult.setText("Invalid Guess");
				}
				if (machine.giveHint(guess).equals("You got it")) btnSubmit.setEnabled(false);
			}
		});
		btnSubmit.setBounds(130, 90, 157, 52);
		contentPane.add(btnSubmit);
	}
	

	private JTextField txtnum;
	
	
}

