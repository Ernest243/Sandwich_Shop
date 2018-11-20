import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
   This class is the controller
   of the program. It creates
   new objects of every classes, 
   add them to the main pannel, and register
   some components with listeners classes
   to display everything. 
*/

public class OrderCalculatorGUI extends JFrame
{
  // Declaring variables for differents classes
  private BreadPanel bread;
  private MeatPanel meat;
  private ToppingsPanel topping;
  private DrinkPanel drink;
  private GreetingPanel greeting;
  
  // Declaring Panels variables
  private JPanel buttonPanel;
  private JPanel centerPanel;
  
  // Declaring Button variables
  private JButton calculate;
  private JButton exit;
 
 // Declaring the TAX_RATE variable 
  private double TAX_RATE = 6.00;
  
  //Constructor
  public OrderCalculatorGUI()
  {
    
    this.setTitle("Order Calculator");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Instanciate all the variables above
    this.bread = new BreadPanel();
    this.meat = new MeatPanel();
    this.topping = new ToppingsPanel();
    this.drink = new DrinkPanel();
    this.greeting = new GreetingPanel();
    
    // Calling the two methods that we'll built later on
    this.buildCenterPanel();
    this.buildButtonPanel();
    
    setLayout(new BorderLayout()); // Setting which layout we're gonna use to display
    
    // Adding panels to the main Panel
    this.add(greeting, BorderLayout.NORTH);
    this.add(bread, BorderLayout.WEST);
    this.add(centerPanel, BorderLayout.CENTER);
    this.add(drink, BorderLayout.EAST);
    this.add(buttonPanel, BorderLayout.SOUTH);
    
    // Call the Pack method 
    this.pack();
    this.setVisible(true);
    this.setResizable(false);// The windows cannot be resized 
  }
  
  // buildCenterPanel method
  //@no parameter
  //@no return
  private void buildCenterPanel()
  {
    this.centerPanel = new JPanel();
    this.centerPanel.setLayout(new GridLayout(1, 2));
    this.centerPanel.add(meat);
    this.centerPanel.add(topping);
  }
  
  // buildButtonPanel method
  //@no parameter
  //@no return
  private void buildButtonPanel()
  { 
    this.calculate = new JButton ("Calculate");
    this.exit = new JButton("Exit");
    
    this.calculate.addActionListener(new CalculateListener());
    this.exit.addActionListener(new ExitListener());
    
    this.buttonPanel = new JPanel();
    this.buttonPanel.add(calculate);
    this.buttonPanel.add(exit);
    
  }
  
  // CalculateListener class to handle event of the "Calculate" button
  //Implements ActionListener Interface
  private class CalculateListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      double subTotal;
      double tax = TAX_RATE;
      double total;
      subTotal = bread.getBreadCost() + meat.getMeatCost() + topping.getToppingCost() + drink.getDrinkCost();
      tax = (subTotal * tax) / 100; 
      total = subTotal + tax;
      
      JOptionPane.showMessageDialog(null, String.format("Subtotal: $%,.2f\n" + "Tax: $%,.2f\n" + "Total: $%,.2f", subTotal, tax, total)); 
    }
  }
  
  // ExitListener class to handle event of the "Exit" button.
  //Implements ActionListener Interface
  private class ExitListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      System.exit(0);
    }
  }
  
}
