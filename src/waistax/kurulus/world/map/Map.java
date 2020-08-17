package waistax.kurulus.world.map;

import waistax.math.*;

/**
 * Geography of the game world
 *
 * Author: Waistax
 * Created: 0.1 / 15 Aðu 2020 / 16:30:11
 *
 */
public class Map
{
	/** The dimension of the map */
	public final Vec2i dimension;
	
	/** The data of tiles */
	public final Tile[] tiles;

	/** Initialize from a dimension */
	public Map(Vec2i dimension)
	{
		this.dimension = dimension;
		tiles = new Tile[dimension.x * dimension.y];
	}
	
	/** Get the index of the position */
	public int index(int x, int y)
	{
		return x + y * dimension.x;
	}
	
	/** Get the index of the position */
	public int index(Vec2i position)
	{
		return index(position.x, position.y);
	}
	
	/** Get the position of the index */
	public Vec2i position(int index)
	{
		return new Vec2i(index % dimension.x, index / dimension.y);
	}
}
