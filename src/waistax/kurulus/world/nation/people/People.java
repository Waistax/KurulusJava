package waistax.kurulus.world.nation.people;

import java.util.*;

/**
 * A group of people with different identities
 *
 * Author: Waistax
 * Created: 0.1 / 15 Aðu 2020 / 16:31:00
 *
 */
public class People
{
	public final HashMap<Identity, Integer> identityMap;
	
	public int quantity;
	
	public People(People... peoples)
	{
		if (peoples.length == 0)
			
			identityMap = new HashMap<>();
		
		else
		{
			identityMap = new HashMap<>(peoples[0].identityMap);
			quantity = peoples[0].quantity;
			
			for (int i = 1; i < peoples.length; i++)
			{
				for (Identity identity : peoples[i].identityMap.keySet())
				{
					Integer identityQuantity = identityMap.get(identity);
					if (identityQuantity == null) identityMap.put(identity, peoples[i].identityMap.get(identity));
					else identityMap.put(identity, identityQuantity + peoples[i].identityMap.get(identity));
				}

				quantity += peoples[i].quantity;
			}
		}
	}
	
	public void add(Identity identity, int quantity)
	{
		Integer oldQuantity = identityMap.get(identity);
		if (oldQuantity == null) identityMap.put(identity, quantity);
		else identityMap.put(identity, oldQuantity + quantity);
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		for (Identity identity : identityMap.keySet())
			
			builder.append(identity).append(" = ").append(identityMap.get(identity)).append(System.lineSeparator());
		
		builder.delete(builder.length() - System.lineSeparator().length(), builder.length());
		
		return builder.toString();
	}
}
