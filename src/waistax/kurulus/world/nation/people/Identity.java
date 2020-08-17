package waistax.kurulus.world.nation.people;

/**
 * Culture and religion pair of somebody
 *
 * Author: Waistax
 * Created: 0.1 / 15 Aðu 2020 / 16:30:54
 *
 */
public class Identity
{
	/** Gives the name of the pair of culture and religion */
	public static String nameOf(Culture culture, Religion religion)
	{
		// Format:	Culture Name Religion Name
		// Example:
		// 	Culture Name:	Red
		// 	Religion Name:	Soothing Moon
		// 	Identity Name:	Red Soothing Moon
		return new StringBuilder().append(culture).append(" ").append(religion).toString();
	}
	
	/** The culture of this identity */
	public final Culture culture;
	
	/** The religion of this identity */
	public final Religion religion;
	
	/** The name of the identity */
	public final String name;
	
	/** Initialize form a culture and religion pair */
	public Identity(Culture culture, Religion religion)
	{
		this.culture = culture;
		this.religion = religion;
		name = nameOf(culture, religion);
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
