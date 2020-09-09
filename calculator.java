import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField displayScreen;
	double firstInput;
	double secondInput;
	double output;
	String operations;
	String answer;

	//launches the app
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//creates the application
	public Calculator() {
		initialize();
	}

	//initializes the contents of the calculator
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 369, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Row 1 --- Display Screen ---
		displayScreen = new JTextField();
		displayScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		displayScreen.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		displayScreen.setBounds(10, 11, 330, 67);
		frame.getContentPane().add(displayScreen);
		displayScreen.setColumns(10);

		//Row 2 --- 
		JButton buttonClear = new JButton("C");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayScreen.setText(null);
			}
		});
		buttonClear.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonClear.setBounds(10, 89, 75, 60);
		frame.getContentPane().add(buttonClear);
		
		JButton buttonCE = new JButton("CE");
		buttonCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ce = null;
				if (displayScreen.getText().length() > 0) {
					//use a StringBuilder as a way to change the states and fields after the object is created
					//using StringBuilder to execute backspace properly by being able to take the length of the double
					//then changing the state of it into a string, so then we are able to determine the length of it 
					//as a string and then backspace one character at a time
					//if we just kept it as a String and not StringBuilder, then getting the text would not be possible
					StringBuilder currentDisplay = new StringBuilder(displayScreen.getText());
					currentDisplay.deleteCharAt(displayScreen.getText().length()-1);
					ce = currentDisplay.toString();
					displayScreen.setText(ce);
				}
			}
		});
		buttonCE.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonCE.setBounds(95, 89, 75, 60);
		frame.getContentPane().add(buttonCE);
		
		JButton buttonModulus = new JButton("%");
		buttonModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//parseDouble returns a new double that is initialized to the string
				firstInput = Double.parseDouble(displayScreen.getText());
					displayScreen.setText("");
					operations = "%";
			}
		});
		buttonModulus.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonModulus.setBounds(180, 89, 75, 60);
		frame.getContentPane().add(buttonModulus);
		
		JButton buttonDivision = new JButton("/");
		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//parseDouble returns a new double that is initialized to the string
				firstInput = Double.parseDouble(displayScreen.getText());
					displayScreen.setText("");
					operations = "+";
			}
			
		});
		buttonDivision.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonDivision.setBounds(265, 89, 75, 60);
		frame.getContentPane().add(buttonDivision);
		
		//Row 3 ---
		JButton buttonSeven = new JButton("7");
		buttonSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNumber = displayScreen.getText() + buttonSeven.getText();
				displayScreen.setText(inputNumber);
			}
		});
		buttonSeven.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonSeven.setBounds(10, 160, 75, 60);
		frame.getContentPane().add(buttonSeven);
		
		JButton buttonEight = new JButton("8");
		buttonEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNumber = displayScreen.getText() + buttonEight.getText();
				displayScreen.setText(inputNumber);
			}
		});
		buttonEight.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonEight.setBounds(95, 160, 75, 60);
		frame.getContentPane().add(buttonEight);
		
		JButton buttonNine = new JButton("9");
		buttonNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNumber = displayScreen.getText() + buttonNine.getText();
				displayScreen.setText(inputNumber);
			}
		});
		buttonNine.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonNine.setBounds(180, 160, 75, 60);
		frame.getContentPane().add(buttonNine);
		
		JButton buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//parseDouble returns a new double that is initialized to the string
				firstInput = Double.parseDouble(displayScreen.getText());
					displayScreen.setText("");
					operations = "*";
			}
		});
		buttonMultiply.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonMultiply.setBounds(265, 160, 75, 60);
		frame.getContentPane().add(buttonMultiply);
		
		//Row 4 ---
		JButton buttonFour = new JButton("4");
		buttonFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNumber = displayScreen.getText() + buttonFour.getText();
				displayScreen.setText(inputNumber);
			}
		});
		buttonFour.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonFour.setBounds(10, 231, 75, 60);
		frame.getContentPane().add(buttonFour);
		
		JButton buttonFive = new JButton("5");
		buttonFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNumber = displayScreen.getText() + buttonFive.getText();
				displayScreen.setText(inputNumber);
			}
		});
		buttonFive.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonFive.setBounds(95, 231, 75, 60);
		frame.getContentPane().add(buttonFive);
		
		JButton buttonSix = new JButton("6");
		buttonSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNumber = displayScreen.getText() + buttonSix.getText();
				displayScreen.setText(inputNumber);
			}
		});
		buttonSix.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonSix.setBounds(180, 231, 75, 60);
		frame.getContentPane().add(buttonSix);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//parseDouble returns a new double that is initialized to the string
				firstInput = Double.parseDouble(displayScreen.getText());
					displayScreen.setText("");
					operations = "+";
			}
		});
		buttonPlus.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonPlus.setBounds(265, 231, 75, 60);
		frame.getContentPane().add(buttonPlus);
		
		//Row 5 ---
		JButton buttonOne = new JButton("1");
		buttonOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNumber = displayScreen.getText() + buttonOne.getText();
				displayScreen.setText(inputNumber);
			}
		});
		buttonOne.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonOne.setBounds(10, 302, 75, 60);
		frame.getContentPane().add(buttonOne);
		
		JButton buttonTwo = new JButton("2");
		buttonTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNumber = displayScreen.getText() + buttonTwo.getText();
				displayScreen.setText(inputNumber);
			}
		});
		buttonTwo.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonTwo.setBounds(95, 302, 75, 60);
		frame.getContentPane().add(buttonTwo);
		
		JButton buttonThree = new JButton("3");
		buttonThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNumber = displayScreen.getText() + buttonThree.getText();
				displayScreen.setText(inputNumber);
			}
		});
		buttonThree.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonThree.setBounds(180, 302, 75, 60);
		frame.getContentPane().add(buttonThree);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//parseDouble returns a new double that is initialized to the string
				firstInput = Double.parseDouble(displayScreen.getText());
					displayScreen.setText("");
					operations = "-";
			}
		});
		buttonMinus.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonMinus.setBounds(265, 302, 75, 60);
		frame.getContentPane().add(buttonMinus);
		
		//Row 6 ---
		JButton buttonPlusMinus = new JButton("+/-");
		buttonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this allows for the input to be negated and turn in the input to a negative
				double plusMinus = Double.parseDouble(String.valueOf(displayScreen.getText()));
				plusMinus = plusMinus * (-1);
				displayScreen.setText(String.valueOf(plusMinus));
			}
		});
		buttonPlusMinus.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonPlusMinus.setBounds(10, 373, 75, 59);
		frame.getContentPane().add(buttonPlusMinus);
		
		JButton buttonZero = new JButton("0");
		buttonZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNumber = displayScreen.getText() + buttonZero.getText();
				displayScreen.setText(inputNumber);
			}
		});
		buttonZero.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonZero.setBounds(95, 373, 75, 60);
		frame.getContentPane().add(buttonZero);
		
		JButton buttonDecimal = new JButton(".");
		buttonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//parseDouble returns a new double that is initialized to the string
				firstInput = Double.parseDouble(displayScreen.getText());
					displayScreen.setText("");
					operations = ".";
			}
		});
		buttonDecimal.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonDecimal.setBounds(180, 373, 75, 60);
		frame.getContentPane().add(buttonDecimal);
		
		JButton buttonAnswer = new JButton("=");
		buttonAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondInput = Double.parseDouble(displayScreen.getText());
				if (operations == "+") {
					output = firstInput + secondInput;
					answer = String.format("%.0f", output);
					displayScreen.setText(answer);
				}
				else if (operations == "-") {
					output = firstInput - secondInput;
					answer = String.format("%.0f", output);
					displayScreen.setText(answer);
				}
				else if (operations == "/") {
					output = firstInput / secondInput;
					answer = String.format("%.0f", output);
					displayScreen.setText(answer);
				}
				else if (operations == "*") {
					output = firstInput * secondInput;
					answer = String.format("%.0f", output);
					displayScreen.setText(answer);
				}
				else if (operations == "%") {
					output = firstInput % secondInput;
					answer = String.format("%.0f", output);
					displayScreen.setText(answer);
				}
				
			}
		});
		buttonAnswer.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		buttonAnswer.setBounds(265, 373, 75, 60);
		frame.getContentPane().add(buttonAnswer);
		
		
	}
}
