package waistax.kurulus;

import waistax.engine.*;
import waistax.engine.renderer.*;

import java.awt.*;

/**
 * Description
 *
 * Author: Waistax
 * Created: 0.1 / 14 Aðu 2020 / 20:56:16
 *
 */
public class Kurulus implements Game
{
	/** Kurulus instance */
	public static final Kurulus KURULUS = new Kurulus();
	
	/** Color of the FPS text */
	public static final Color FPS_TEXT_COLOR = new Color(1.0F, 1.0F, 0.6F, 1.0F);

	/** Background color of the FPS text */
	public static final Color FPS_TEXT_BACKGROUND_COLOR = new Color(0.0F, 0.0F, 0.0F, 0.5F);
	
	/** Font of the FPS text */
	public static final Font FPS_TEXT_FONT = new Font("Verdena", Font.ITALIC, 12);
	
	/** Launch the game */
	public static void main(String[] args)
	{
		// Set the renderer and the game
		Engine.renderer = new AWTRenderer();
		Engine.game = KURULUS;
		// Then start the engine
		Engine.start();
	}

	public UIState uiState;
	public Graphics2D g;
	
	@Override
	public void load()
	{
		g = ((AWTRenderer) Engine.renderer).graphics;
	}

	@Override
	public void save()
	{
		
	}

	@Override
	public void frame()
	{
		if (uiState != null) uiState.frame(g);
		
		// Draw FPS text
		String fpsText = "FPS: " + Engine.frameRate;

		g.setFont(FPS_TEXT_FONT);
		g.setColor(FPS_TEXT_BACKGROUND_COLOR);

		FontMetrics fontMetrics = g.getFontMetrics();
		
		g.fillRect(8, 10, fontMetrics.stringWidth(fpsText) + 4, 14);
		
		g.setColor(FPS_TEXT_COLOR);
		g.drawString("FPS: " + Engine.frameRate, 10, 22);
	}
}
