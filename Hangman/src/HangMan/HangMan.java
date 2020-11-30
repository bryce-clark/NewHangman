package HangMan;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HangMan extends JFrame {
	static File dictionary = new File("C:\\Users\\clarbryc\\eclipse-workspace\\Hangman\\src\\HangMan\\dictionary");
	static int lives = 6;
	static String getWord;
	

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HangMan frame = new HangMan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	
	
	
	
	public static void NewWord() throws Exception
	{
		Scanner textScanner = new Scanner(dictionary);
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> words = new ArrayList<>();
		
		while(textScanner.hasNextLine())
		{
			words.add(textScanner.nextLine());
		}
		
		
		getWord = words.get((int) (Math.random() * words.size()));
		System.out.println(getWord);
	}
	
	public static void WordText() throws Exception
	{
		

	}
	
	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public HangMan() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		getContentPane().setLayout(null);
		
		JPanel wordpanel = new JPanel();
		wordpanel.setBounds(0, 319, 486, 144);
		wordpanel.setLayout(new GridLayout());
		NewWord();
		JLabel[] WordInput = new JLabel[getWord.length()];
		for (int i = 0; i < getWord.length(); ++i) 
        {
            WordInput[i] = new JLabel("__");
            wordpanel.add(WordInput[i]);
            

        }
		getContentPane().add(wordpanel);
	}
}
