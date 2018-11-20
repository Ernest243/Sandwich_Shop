import javax.swing.*;
import java.awt.*;

/*
   This class creates a panel
   which all the user to choose
   among varieties of toppings.
*/

public class ToppingsPanel extends JPanel
{
  // Declaring variables for each topping
  private final double LETTUCE = 0.25;
  private final double TOMATO = 0.50;
  private final double MAYONNAISE = 0.50;
  private final double MUSTARD = 0.25;
  private final double CHEESE = 0.75;
  private final double PICKLE = 0.25;
  
  // Declaring CheckBoxes for each topping
  private JCheckBox lettuce;
  private JCheckBox tomato;
  private JCheckBox mayonnaise;
  private JCheckBox mustard;
  private JCheckBox cheese;
  private JCheckBox pickle; 
  
  // Constructor
  public ToppingsPanel()
  {
    // Instanciate toppings's CheckBoxes
    this.lettuce = new JCheckBox("Lettuce");
    this.tomato = new JCheckBox("Tomato");
    this.mayonnaise = new JCheckBox("Mayonnaise");
    this.mustard = new JCheckBox("Mustard");
    this.cheese = new JCheckBox("Cheese");
    this.pickle = new JCheckBox("Pickle");
    
    this.setLayout(new GridLayout(6, 1)); // Set layout
    this.setBorder(BorderFactory.createTitledBorder("Toppings")); // Set border and title
    
    // Add CheckBoxes component to the panel
    this.add(lettuce);
    this.add(tomato);
    this.add(mayonnaise);
    this.add(mustard);
    this.add(cheese);
    this.add(pickle);
    
  }
  
   /*
   Help to calculate the price 
   by knowing which topping the user
   wants, and returning the price. 
  */

  public double getToppingCost()
  {
    double charges3 = 0;
    
    if(this.lettuce.isSelected())
    {
      charges3 += LETTUCE;
    }
    
    if(this.tomato.isSelected())
    {
      charges3 += TOMATO;
    }
    
    if(this.mayonnaise.isSelected())
    {
      charges3 += MAYONNAISE;
    }
    
    if(this.mustard.isSelected())
    {
      charges3 += MUSTARD;
    }
    
    if(this.cheese.isSelected())
    {
      charges3 += CHEESE;
    }
    
    if(this.pickle.isSelected())
    {
      charges3 += PICKLE;
    }
    
    return charges3; // returns the price based on which item selected
  }
}
