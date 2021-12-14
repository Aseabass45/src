package graphics;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
class MigLayoutExample {
	public static void main(String[] args) {
		new MigLayoutExample();

	}
	JFrame window = new JFrame ("Mig Layout Example");

	JLabel title = new JLabel("Current Favourites");
	JLabel name = new JLabel("Name: ");
	JLabel address = new JLabel("Address: ");
	JLabel movies = new JLabel("Favourite Movie/Show: ");
	JLabel social = new JLabel("Social Security Number: ");
	
	JLabel people = new JLabel("How Many People live at your house? ");
	JRadioButton rButton1 = new JRadioButton("1");
	JRadioButton rButton2 = new JRadioButton("2");
	JRadioButton rButton3 = new JRadioButton("3");
	JRadioButton rButton4 = new JRadioButton("4");
	JRadioButton rButton5 = new JRadioButton("5");
	JRadioButton rButton6 = new JRadioButton("6");
	
	JLabel safe = new JLabel("Do you feel safe? ");
	JCheckBox cButton1 = new JCheckBox("yes");
	JCheckBox cButton2 = new JCheckBox("no");
	
	JLabel credit = new JLabel("credit card number: ");
	JLabel genre = new JLabel("Genre: ");
	JTextField nameField = new JTextField(20);
	JTextField addressField = new JTextField(20);
	JTextField moviesField = new JTextField(20);
	JTextField socialField = new JTextField(20);
	JTextField creditField = new JTextField(20);
	JButton okButton = new JButton("Ok");
	JButton cancelButton = new JButton("Cancel");
	
	MigLayoutExample(){
		window.add(buildMigDashboard());	
		window.setSize(600, 500);
		window.setLocationRelativeTo(null);
		window.pack();
		window.setResizable(false);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JPanel buildMigDashboard() {
		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout("wrap 3"));
		buildMiGForm(panel);
		return panel;
	}
	
	private void buildMiGForm(JPanel panel) {
		Font myFont = new Font("serif", Font.BOLD, 30);
		title.setFont(myFont);
		panel.add(title, "span 3, center, gapbottom 20, wrap");
		
		panel.add(name, "align right");
		panel.add(nameField, "span, align left, wrap");
		
		panel.add(movies, "align right");
		panel.add(moviesField, "wrap");
		
		panel.add(address, "align right");
		panel.add(addressField, "wrap");
		
		panel.add(social, "align right");
		panel.add(socialField, "wrap");
		
		panel.add(credit, "align right");
		panel.add(creditField, "wrap");
		
		ButtonGroup radioButton = new ButtonGroup();
		radioButton.add(rButton1);
		radioButton.add(rButton2);
		radioButton.add(rButton3);
		radioButton.add(rButton4);
		radioButton.add(rButton5);
		radioButton.add(rButton6);
		
		ButtonGroup checkButton = new ButtonGroup();
		checkButton.add(cButton1);
		checkButton.add(cButton2);
		
		panel.add(people);
		panel.add(safe, "span 2, center, wrap");
		panel.add(rButton1,"split 2");
		panel.add(rButton2);
		panel.add(cButton1, "center, wrap");
		panel.add(rButton3, "split 2");
		panel.add(rButton4);
		panel.add(cButton2, "center, wrap");
		panel.add(rButton5, "split 2");
		panel.add(rButton6, "wrap");
		
		panel.add(okButton, "span 3, split 2, align right, sizegroup bttn");
		panel.add(cancelButton, "sizegroup bttn");
		
		

	}
}