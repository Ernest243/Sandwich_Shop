import javax.swing.*;
import java.awt.*;

/*
  This class creates the Bread Panel
  by proposing different type of bread.
*/

public class BreadPanel extends JPanel
{
  // Declaring variables for each type of bread
  private final double WHITE_BREAD = 1.25;
  private final double WHEAT_BREAD = 1.50;
  private final double GLUTEN_FREE_BREAD = 2.00;
  
  // Creates RadioButtons for each type of Bread
  private JRadioButton white_bread; 
  private JRadioButton wheat_bread;  
  private JRadioButton gluten_free_bread; 
  
  // Constructor
  public BreadPanel()
  {   
    // Instanciating buttons 
    this.white_bread = new JRadioButton("White", true); 
    this.wheat_bread = new JRadioButton("Wheat");
    this.gluten_free_bread = new JRadioButton("Gluten Free");
    
    this.setLayout(new GridLayout(3, 1)); // Set the layout
    this.setBorder(BorderFactory.createTitledBorder("Sandwich")); // Set the border and title
    
    ButtonGroup group = new ButtonGroup(); //Creates the ButtonGroup for RadioButton
    
    group.add(white_bread); // add the button to the group
    group.add(wheat_bread); // add the button to the group
    group.add(gluten_free_bread); // add the button to the group
    
    this.add(white_bread); // add the white_bread's button to the panel
    this.add(wheat_bread); // add the wheat_bread's button to the panel
    this.add(gluten_free_bread);  // add the gluten_free_bread's button to the panel
  }
  
  /*
   Help to calculate the price 
   by knowing which bread the user
   wants, and returning the price. 
  */
  public double getBreadCost()
  {
    double charges1 = 0;
      
    if(this.white_bread.isSelected())
    {
      charges1 += WHITE_BREAD;
    }
      
    if(this.wheat_bread.isSelected())
    {
      charges1 += WHEAT_BREAD;
    }
      
    if(this.gluten_free_bread.isSelected())
    {
      charges1 += GLUTEN_FREE_BREAD;
    }
      
    return charges1; // returns the price based on which item selected
  }
}
