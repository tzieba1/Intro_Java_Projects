package Assignment3_000797152;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.lang.Math;

/**
 * Implementation of a House class containing associated Window and Door objects. The window has a random diameter
 * depending on the house size and a position depending on house size and house position. The door has a height and
 * position depending on the house size and house position. The door has a width that is half its height.
 *
 * @author Tommy Zieba
 */
public class House
  {
  /** x, y coordinates of house and house size = width of house.**/
  private double x, y, size;
  /** Number of occupants in the house. **/
  private int occupants;
  /** The color of the house. **/
  private Color color;

  /**
   * Sole constructor. (For invocation by subclass constructors, typically implicit.)
   */
  public House() {}

  /**
   * Class constructor for a House object to be used inside in the .draw() method of the Village class.
   * The parameters passed into this constructor specifies the house size, color, and placement on canvas.
   *
   * @param x Horizontal coordinate of house position in pixels as a Double.
   * @param y Vertical coordinate of house position in pixels as Double.
   * @param size  Size (width and height) of the house in pixels as a Double.
   * @param color Colour of the house of type Color.
   */
  public House(double x, double y, double size, Color color)
    {
    this.x = x; // Assigning the horizontal coordinate of the house passed into the constructor.
    this.y = y; // Assigning the vertical coordinate of the house passed into constructor.
    this.color = color; // Assigning the color of the house passed into constructor.
    this.size = size; // Assigning the size (width and height) of the house passed into constructor.
    }

  /**
   * Class constructor for the king's house to be used inside the WorldOfTwoVillages.java controller class.
   * @param x Horizontal coordinate of house in pixels as a Double.
   * @param y Vertical coordinate of house in pixels as a Double.
   */
  public House(double x,double y)
    {
    this.x = x; // Assigning the horizontal coordinate of the house passed into the constructor.
    this.y = y; // Assigning the vertical coordinate of the house passed into the constructor.
    this.occupants = 1; // King's house has 1 occupant.
    this.color = Color.PURPLE;  // The king's house is purple.
    this.size = 300 + Math.random() * 120;  // Assigning random house size in pixels within range [300, 420].
    }

  /**
   * Method used to retrieve the number of occupants from an instance of a House object.
   *
   * @return Returns the number of occupants as an Integer.
   */
  public int getOccupants(){ return this.occupants; }

  /**
   * Method used to retrieve the pixel size from an instance of a House object.
   *
   * @return Returns the number of pixels as a Double.
   */
  public double getSize(){ return this.size; }

  /**
   * Method used to set the number of occupants for an instance of a House object.
   *
   * @param n The number of occupants as an Integer.
   */
  public void setOccupants(int n){ this.occupants = n; }

  /**
   * Method used to draw the windows and doors for an instance of a House object.
   *
   * @param gc The instance of the GraphicsContext object that the GraphicsContext methods are applied to
   *           in order to draw the associated window and door for an instance of a House object.
   */
  public void draw(GraphicsContext gc)
    {
    gc.setFill(this.color); // Setting the fill colour for the house.
    gc.fillRect(this.x, this.y - this.size, this.size, this.size); // Drawing the square representing a house.
   
    // *** Creating an object instance of the Door class and applying the class' .draw() method to draw it.
    Door door = new Door(this.x +  this.size / 2 , this.y - this.size / 3,  this.size / 3);
    door.draw(gc);
    
    // *** Creating an object instance of the Window class and applying the class' .draw() method to draw it.
    Window window = new Window(this.x + this.size / 8, this.y - (3 * this.size / 4),
        this.size / 3 + Math.random() * this.size / 3);
    window.draw(gc);
    }
  }

