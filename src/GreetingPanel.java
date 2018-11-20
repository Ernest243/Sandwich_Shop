import javax.swing.*;
import java.awt.*;

/*
   This class creates a panel 
   that welcome the user by
   greeting him/her. 
*/


public class GreetingPanel extends JPanel
{ 
  // Constructor
  public GreetingPanel()
  {
    // Declare and Instantiate the greetingLabel variable from the JLabel class.  
    JLabel greetingLabel = new JLabel("Welcome to Ernest's Sandwich Shop"); 
    // Add the greetingLabel component to a panel.
    this.add(greetingLabel);
  }
}
