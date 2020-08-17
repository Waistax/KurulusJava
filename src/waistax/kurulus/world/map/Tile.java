package waistax.kurulus.world.map;

import waistax.math.*;

/**
 * A tile on the map
 *
 * Author: Waistax
 * Created: 0.1 / 15 Aðu 2020 / 16:33:04
 *
 */
public class Tile
{
	/** Position of the tile on the map */
	public final Vec2i position;
	
	/** Index of the tile in the map array */
	public final int index;
	
	/** Geography of the tile */
	public final Terrain terrain;

	/** Initialize from a position, index and terrain */
	public Tile(Vec2i position, int index, Terrain terrain)
	{
		this.position = position;
		this.index = index;
		this.terrain = terrain;
	}
}
