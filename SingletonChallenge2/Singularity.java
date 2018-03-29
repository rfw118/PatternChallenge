package SingletonChallenge2;

public class Singularity 
{
	
	private volatile static Singularity ImSingle;
	
	private Singularity() 
	{
		
	}
	
	public static Singularity getInstance()
	{
		if(ImSingle == null)
		{
			synchronized(Singularity.class)
			{
				if(ImSingle == null)
				{
					ImSingle = new Singularity();
				}
			}
		}	
		return ImSingle;
	}
	public static String getStatus()
	{
		String returnValue = "There can be only one...";
		if(ImSingle == null)
		{
			returnValue = "Singleton is null.";
		}
			return returnValue;
	}
}
