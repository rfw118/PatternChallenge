package JeremyStrategyChallenge1;

public interface IEncryptStuff {
	
	public abstract String EncryptFile();
	public abstract String DecryptFile();
	public abstract String KeyPair(String sPrivate, String sPublic);
}
