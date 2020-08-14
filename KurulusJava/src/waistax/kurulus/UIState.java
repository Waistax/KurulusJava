package waistax.kurulus;

import java.awt.*;

/**
 * State of the games user interface
 * 
 * This interface looks like the Game interface.
 * Because it is just dividing different states of the game.
 * I thought this will be better than using a switch statement.
 *
 * Author: Waistax
 * Created: 0.1 / 14 Aðu 2020 / 21:18:38
 *
 */
public interface UIState
{
	/** Load the UI */
	public void load();
	
	/** Save the UI */
	public void save();
	
	/** Update and draw the UI */
	public void frame(Graphics2D g);
}
