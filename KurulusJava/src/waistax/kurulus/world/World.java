package waistax.kurulus.world;

import waistax.kurulus.world.map.Map;
import waistax.kurulus.world.nation.*;

import java.util.*;

/**
 * The game world
 *
 * Author: Waistax
 * Created: 0.1 / 15 Aðu 2020 / 16:26:56
 *
 */
public class World
{
	public Map map;
	public ArrayList<Nation> nations;
	
	public World(Map map)
	{
		this.map = map;
		nations = new ArrayList<>();
	}
}
