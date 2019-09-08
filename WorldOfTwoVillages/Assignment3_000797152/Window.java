package Assignment3_000797152;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Implementation of the Window class that is a white circle. Window objects are created in the House class.
 */
public class Window
  {
  /** x,y coordinates of the window position in pixels and window diameter in pixels**/
  private double x, y, diameter;

  /**
   * Sole constructor. (For invocation by subclass constructors, typically implicit.)
   */
  public Window() {}

  /**
   * Class constructor for a Window object to be used inside the .draw() method of the House class.
   *
   * @param x Horizontal coordinate of window position in pixels.
   * @param y Vertical coordinate of window position in pixels.
   * @param diameter The window diameter in pixels.
   */
  public Window(double x, double y, double diameter)
    {
    this.x = x; // Assigning the horizontal coordinate of the window passed into the constructor.
    this.y = y; // Assigning the vertical coordinate of the window passed into the constructor.
    this.diameter = diameter; // Assigning the diameter of the window passed into the constructor.
    }

  /**
   * Method used to draw the window.
   *
   * @param gc The instance of the GraphicsContext object that the GraphicsContext methods are applied to
   *           in order to draw the door.
   */
  public void draw(GraphicsContext gc)
    {
    gc.setFill(Color.WHITE); // Setting the fill colour for shapes to white.
    gc.fillOval(this.x, this.y, this.diameter / 2, this.diameter / 2);  // Drawing a circle representing
                                                                                // the window.
    }
  }
