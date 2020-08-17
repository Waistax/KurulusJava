package waistax.kurulus.world.map;

import java.awt.*;

/**
 * Geography of a tile
 *
 * Author: Waistax
 * Created: 0.1 / 15 Aðu 2020 / 16:33:00
 *
 */
public class Terrain
{
	/** Color the terrain will be drawn on the map */
	public final Color color;
	
	/** Name of the terrain */
	public final String name;

	/** Initialize from a color and a name */
	public Terrain(Color color, String name)
	{
		this.color = color;
		this.name = name;
	}
}
