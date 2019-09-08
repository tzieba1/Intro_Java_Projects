package Assignment3_000797152;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Implementation of a Door class that is a rectangle with a width equal to half its height. Door objects are created
 * in the House class.
 */
public class Door
  {
  /** x,y coordinates of the door position in pixels and door height in pixels.**/
  private double x, y, height;
  
  /**
   * Sole constructor. (For invocation by subclass constructors, typically implicit.)
   */
  public Door() {}
  
  /**
   * Class constructor for a Door object to be used inside the .draw() method of the House class.
   *
   * @param x Horizontal coordinate of door position in pixels.
   * @param y Vertical coordinate of door position in pixels.
   * @param height The door height in pixels.
   */
  public Door(double x, double y, double height)
    {
    this.x = x; // Assigning the horizontal coordinate of the door passed into the constructor.
    this.y = y; // Assigning the vertical coordinate of the door passed into the constructor.
    this.height = height; // Assigning the height of the door passed into the constructor.
    }
    
  /**
   * Method used to draw the door.
   *
   * @param gc The instance of the GraphicsContext object that the GraphicsContext methods are applied to
   *           in order to draw the door.
   */
  public void draw(GraphicsContext gc)
    {
    gc.setFill(Color.WHITE); // Setting the colour for filling shapes to white.
    gc.fillRect(this.x, this.y, this.height / 2, this.height);  // A rectangle with the set fill color being drawn.
    }
  }
