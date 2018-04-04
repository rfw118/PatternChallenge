package JeremyChallenge2Singleton;

public class myLogListener {
	/*
	 * America needs your talents in using the Singleton pattern to create a simulated listener service which handles 
	 * the reception and sorting of log file data. 
	 */

	public static void main(String[] args) {
		run();
	}
	
	public static void run() 
	{
		UserOutput("Starting program.");
		
		UserOutput("Getting log instance...");
		LogListener.getInstance().LogEntry("Log this..");
		UserOutput("End of Line.");
		
	}

	public static void UserOutput(String Message)
	{
		System.out.println(Message);
	}

	
}
