package waistax.kurulus.world.nation.people;

/**
 * Language, living style and thoughts on life of somebody
 *
 * Author: Waistax
 * Created: 0.1 / 15 Aðu 2020 / 16:32:19
 *
 */
public class Culture
{
	/** The name of the culture */
	public final String name;

	/** Initialize from an int and a string */
	public Culture(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
