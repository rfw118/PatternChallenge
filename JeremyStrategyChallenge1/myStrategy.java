package JeremyStrategyChallenge1;

public class myStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Come up with a strategy pattern that allowed for multiple types of file encryption.
		 * Though you can just stub out the encryption methods or output text saying it did it.
		 */
		Run();

	}
	public static void UserOutput(String Output)
	{
		System.out.println(">" + Output);
		
	}
	private static void Run()
	{
		SSHEncryption SSH = new SSHEncryption();
		FractalEncryption Fractal = new FractalEncryption();
		TLSEncryption TLS = new TLSEncryption();
		
		//SSH encryption class
		UserOutput(SSH.EncryptFile());
		UserOutput(SSH.DecryptFile());
		UserOutput(SSH.KeyPair("Chicken", "Nuggets"));
		
		//Fractal encryption class
		UserOutput(Fractal.EncryptFile());
		UserOutput(Fractal.DecryptFile());
		
		//TLS encryption class
		UserOutput(TLS.EncryptFile());
		UserOutput(TLS.DecryptFile());
		
		
	}
}
