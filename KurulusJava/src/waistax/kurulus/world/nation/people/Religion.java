package waistax.kurulus.world.nation.people;

/**
 * Belief system of somebody
 *
 * Author: Waistax
 * Created: 0.1 / 15 Aðu 2020 / 16:32:24
 *
 */
public class Religion
{
	/** The name of the religion */
	public final String name;

	/** Initialize from an int and a string */
	public Religion(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
