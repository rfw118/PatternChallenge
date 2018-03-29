package SingletonChallenge2;

public class mySingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run();
	}
	
	public static void UserOutput(String Output)
	{
		System.out.println(">" + Output);
		
	}
	
	private static void Run()
	{
		UserOutput("I'm just running...");
		UserOutput("Checking Singleton status...");
		UserOutput(Singularity.getStatus());
		UserOutput("Calling for instance...");
		Singularity.getInstance();
		UserOutput("Checking Singleton status...");
		UserOutput(Singularity.getStatus());
		UserOutput("All done...End of Line.");
	}

}
