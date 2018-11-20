import javax.swing.*;
import java.awt.*;

/*
   This class creates a panel 
   of different size of drink
   to choose.
*/

public class DrinkPanel extends JPanel
{
  // Declaring variables for each size of Drink or no drink
  private final double NONE = 0.00;
  private final double REGULAR_DRINK = 1.50;
  private final double LARGE_DRINK = 1.75;
  private final double SUPER_SIZE_DRINK = 2.00;
  
  // Creates button for each size of drink or no drink
  private JRadioButton none; 
  private JRadioButton regular_drink;
  private JRadioButton large_drink;
  private JRadioButton super_size_drink; 
  
  //Constructor
  public DrinkPanel()
  {
    // Instanciating buttons
    this.none = new JRadioButton("None", true);
    this.regular_drink = new JRadioButton("Regular Drink");
    this.large_drink = new JRadioButton("Large Drink");
    this.super_size_drink = new JRadioButton("Super Size Drink");
    
    this.setLayout(new GridLayout(4, 1)); // Set layout
    this.setBorder(BorderFactory.createTitledBorder("Drink")); // Set border and title
    
    ButtonGroup group = new ButtonGroup(); // Create group of buttons
    
    // Add each button to the ButtonGroup
    group.add(none);
    group.add(regular_drink);
    group.add(large_drink);
    group.add(super_size_drink);
    
    // Add each button to the panel
    this.add(none);
    this.add(regular_drink);
    this.add(large_drink);
    this.add(super_size_drink);
  }
  
   /*
   Help to calculate the price 
   by knowing which size of drink the user
   wants, and returning the price. 
  */

  public double getDrinkCost()
  {
    double charges4 = 0;
    
    if(this.none.isSelected())
    {
      charges4 += NONE;
    }
    
    if(this.regular_drink.isSelected())
    {
      charges4 += REGULAR_DRINK;
    }
    
    if(this.large_drink.isSelected())
    {
      charges4 += LARGE_DRINK;
    }
    
    if(this.super_size_drink.isSelected())
    {
      charges4 += SUPER_SIZE_DRINK;
    }
    
    return charges4;  // returns the price based on which item selected
  }
}
