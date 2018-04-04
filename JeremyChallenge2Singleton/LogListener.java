package JeremyChallenge2Singleton;

public class LogListener {

	/*
	 * if you require a thread class safe you would instantiate the listener using volatile access to balance
	 * the singularity requirements and the synchronous overhead delay when instantiating the class and the memory required.
	 * 
	 * In this case I will need the instance every time the program runs therefore I will use Eager instantiation:
	 */
	private static LogListener LogLis = new LogListener();
	
	
	private LogListener()
	{
		
	}
	
	public static LogListener getInstance()
	{
		
		return LogLis;
				//"There can be only one...";
	}
	
	public void LogEntry(String LogEnt)
	{
		myLogListener.UserOutput(LogSort(LogEnt));
		myLogListener.UserOutput(LogWrite(LogEnt));
	}
	
	private String LogSort(String LogEnt)
	{
		return LogEnt + " Sorted.";
	}
	
	private String LogWrite(String LogWrite)
	{
		return LogWrite + " Logged.";
	}
	
}
