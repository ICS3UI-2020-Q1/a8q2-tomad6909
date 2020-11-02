import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JLabel firstLabel;
  JLabel secondLabel;
  JLabel resultLabel;

  JTextField firstInput;
  JTextField secondInput;
  JTextField resultInput;

  JButton addButton;
  JButton subButton;
  JButton mulButton;
  JButton divButton;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main panel
    mainPanel = new JPanel();

    // disable any layout helpers
    mainPanel.setLayout(null);

    // create side labels
    firstLabel = new JLabel("First Number");
    secondLabel = new JLabel("Second Number");
    resultLabel = new JLabel("Result");

    // layout the labels with their cordinates and size
    firstLabel.setBounds(10, 10, 200, 50);
    secondLabel.setBounds(10, 40, 200, 50);
    resultLabel.setBounds(10, 70, 200, 50);

    // add lables to the main panel
    mainPanel.add(firstLabel);
    mainPanel.add(secondLabel);
    mainPanel.add(resultLabel);

    // initialize text fields
    firstInput = new JTextField();
    secondInput = new JTextField();
    resultInput = new JTextField();

    // layout the text fields with cordinates and their size
    firstInput.setBounds(220, 10, 100, 20);
    secondInput.setBounds(220, 40, 100, 20);
    resultInput.setBounds(220, 70, 100, 20);

    // add the text fields to the main panel
    mainPanel.add(firstInput);
    mainPanel.add(secondInput);
    mainPanel.add(resultInput);

    // create buttons
    addButton = new JButton("Add");
    subButton = new JButton("Sub");
    mulButton = new JButton("Mul");
    divButton = new JButton("Div");

    // layout buttons with their size and cordinates
    addButton.setBounds(50, 100, 100, 20);
    subButton.setBounds(150, 100, 100, 20);
    mulButton.setBounds(250, 100, 100, 20);
    divButton.setBounds(350, 100, 100, 20);

    // add buttons to the main panel
    mainPanel.add(addButton);
    mainPanel.add(subButton);
    mainPanel.add(mulButton);
    mainPanel.add(divButton);

    // add action listener to buttons
    addButton.addActionListener(this);
    subButton.addActionListener(this);
    mulButton.addActionListener(this);
    divButton.addActionListener(this);

    // disable text area
    resultInput.setEnabled(false);

    // add main panel to window
    frame.add(mainPanel);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    // create if statement to add the numbers that the user inputs
    if(command.equals("Add")){
      String firstText = firstInput.getText();

      String secondText = firstInput.getText();

      int first = Integer.parseInt(firstText);
      int second = Integer.parseInt(secondText);

      int total = first + second;

      resultInput.setText(" " + total);
    }
    // create if statment to substract the nubers that the user inputs
    if(command.equals("Sub")){
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      int first = Integer.parseInt(firstText);
      int second = Integer.parseInt(secondText);

      int total1 = first - second;

      resultInput.setText(" " + total1);
    }
    // create if statement to multiply integers that the user inputs
    if(command.equals("Mul")){
      String firstText = firstInput.getText();

      String secondText = secondInput.getText();

      int first = Integer.parseInt(firstText);
      int second = Integer.parseInt(secondText);

      int total2 = first * second;
      resultInput.setText(" " + total2);
    }
    // create if statement to divide the integers that a user inputs
    if(command.equals("Div")){
      String firstText = firstInput.getText();
      
      String secondText = secondInput.getText();

      int first = Integer.parseInt(firstText);
      int second = Integer.parseInt(secondText);

      int total3 = first / second;
      resultInput.setText(" " + total3);
    }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
