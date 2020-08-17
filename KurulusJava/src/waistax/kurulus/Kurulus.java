package waistax.kurulus;

import waistax.engine.*;
import waistax.engine.renderer.*;
import waistax.kurulus.world.nation.people.*;
import waistax.registry.*;

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
	
	/** Registry for the game */
	public static final Registry REGISTRY = new Registry();
	
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
		
		REGISTRY.add("kuruluþ:red_culture", new Culture("Red"));
		REGISTRY.add("kuruluþ:green_culture", new Culture("Green"));
		REGISTRY.add("kuruluþ:blue_culture", new Culture("Blue"));

		REGISTRY.add("kuruluþ:sun_religion", new Religion("Blazing Sun"));
		REGISTRY.add("kuruluþ:moon_religion", new Religion("Soothing Moon"));
		
		SubRegistry<Culture> cultureRegistry = REGISTRY.getSubRegistry(Culture.class);
		SubRegistry<Religion> religionRegistry = REGISTRY.getSubRegistry(Religion.class);
		
		for (int i = 0; i < cultureRegistry.size; i++)
			
			for (int j = 0; j < religionRegistry.size; j++)
				
				REGISTRY.add(
						"kuruluþ:" + cultureRegistry.identifiers[i].name + "_" + religionRegistry.identifiers[j].name + "_identity",
						new Identity(cultureRegistry.values[i], religionRegistry.values[j]));
		
		SubRegistry<Identity> identityRegistry = REGISTRY.getSubRegistry(Identity.class);
		
		for (int i = 0; i < identityRegistry.size; i++)
			
			System.out.println(identityRegistry.identifiers[i] + " = " + identityRegistry.values[i]);
		
		People redSunPeople = new People();
		redSunPeople.add(REGISTRY.get("kuruluþ:red_culture_sun_religion_identity", Identity.class), 123);
		
		System.out.println("Red Sun People");
		System.out.println(redSunPeople);

		People blueMoonPeople = new People();
		blueMoonPeople.add(REGISTRY.get("kuruluþ:blue_culture_moon_religion_identity", Identity.class), 666);
		
		System.out.println("Blue Moon People");
		System.out.println(blueMoonPeople);
		
		People jointPeople = new People(redSunPeople, blueMoonPeople);
		System.out.println("Joint People");
		System.out.println(jointPeople);
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
