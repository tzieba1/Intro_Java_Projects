package Assignment3_000797152;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.lang.Math;

/**
 * Implementation of a Village class containing three associated House objects. The houses are spaced and sized
 * randomly and oriented depending on the location of each subsequent house. The number of occupants is randomly
 * determined and assigned, where small houses cannot exceed 8 occupants and large houses cannot exceed 12 occupants.
 * The houses are drawn in the village with text beneath them displaying the name, population, and village size.
 *
 * @author Tommy Zieba
 */
public class Village
  {
  /** x, y coordinates of village and village size = total width of village. **/
  private double x, y, size;
  /** Colour of the houses **/
  private Color color;
  /** Village name **/
  private String name;

  /**
   * Sole constructor. (For invocation by subclass constructors, typically implicit.)
   */
  public Village() {}

  /**
   * Class constructor specifying the village name, placement, and color.
   *
   * @param name Name of the village.
   * @param x Horizontal coordinate of village position in pixels.
   * @param y Vertical coordinate of village position in pixels.
   * @param color Colour of the houses in the village.
   */
  public Village(String name, double x, double y, Color color)
    {
    this.x = x; // Assigning the horizontal coordinate of the village passed into constructor.
    this.y = y; // Assigning the vertical coordinate of the village passed into constructor.
    this.color = color; // Assigning the house colour passed into constructor.
    this.name = name; // Assigning the village name passed into constructor.
    this.size = 250 + Math.random() * 200;  // Assigning a random village size in pixels.
    }

  /**
   * Draws the houses in the village with random size, spacing, and horizontal position.
   * Text displaying the name, population, and size of the village is drawn below the village.
   *
   * @param gc The instance of the GraphicsContext object that the GraphicsContext methods are applied to
   *    *           in order to draw the associated house for an instance of a Village object.
   */
  public void draw(GraphicsContext gc)
    {
    // *** Setting constants for spacing the houses randomly in the range [5px = 1m, 35px = 7m].
    final double FIRST_SPACE = 5 + 30 * Math.random();
    final double SECOND_SPACE = 5 + 30 * Math.random();

    
    
    // *** Creating the first House object for associated village, sized and oriented randomly.
    House house1 = new House(this.x, this.y, (this.size / 6) + (Math.random() * this.size / 3), this.color);
    house1.draw(gc);  // Drawing first house.
    
    // *** Setting the number of occupants for the 'house1' object.
    if(house1.getSize() > 350)
      house1.setOccupants( (int) (2 + Math.random() * 10) );  // Large houses have occupants in range [2, 12].
    else
      house1.setOccupants( (int) (1 + Math.random() * 7));    // Small houses have occupants in range [1, 8].
    
    
    
    // *** Creating the second House object for associated village, sized and oriented randomly.
    House house2 = new House(this.x + FIRST_SPACE + house1.getSize(),
        this.y, (this.size / 6) + (Math.random() * this.size / 3), this.color);
    house2.draw(gc);  // Drawing second house.

    // *** Setting the number of occupants for the 'house2' object.
    if(house2.getSize() > 350)
      house2.setOccupants( (int) (2 + Math.random() * 10) );  // Large houses have occupants in range [2, 12].
    else
      house2.setOccupants( (int) (1 + Math.random() * 7));    // Small houses have occupants in range [1, 8].

    
    
    // *** Creating the third House object for associated village, sized and oriented randomly.
    House house3 = new House(this.x + FIRST_SPACE + house1.getSize() + SECOND_SPACE + house2.getSize(),
        this.y, (this.size / 6) + (Math.random() * this.size / 3), this.color);
    house3.draw(gc);  // Drawing third house.

    // *** Setting the number of occupants for the 'house3' object.
    if(house3.getSize() > 350)
      house3.setOccupants( (int) (2 + Math.random() * 10) );  // Large houses have occupants in range [2, 12].
    else
      house3.setOccupants( (int) (1 + Math.random() * 7));    // Small houses have occupants in range [1, 8].

    
    
    // *** Initializing (as Strings) the population as the sum of occupants and the village size as the sum of
    // *** house sizes and spaces.
    String population = Integer.toString(house1.getOccupants() + house2.getOccupants() + house3.getOccupants());
    String village_size = Integer.toString( (int)(0.2 * (house1.getSize() + FIRST_SPACE + house2.getSize() +
        SECOND_SPACE + house3.getSize())) );
    
    
    
    gc.setFill(Color.WHITE);  // Setting the text colour.
    // *** Drawing the text beneath the village displaying the Strings 'name', 'population', and 'village_size'.
    gc.fillText(name + " (Population: " + population + " Size: " + village_size + "m)", this.x, this.y + 12);
    }
  }