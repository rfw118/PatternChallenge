package JeremyStrategyChallenge1;

public class SSHEncryption implements IEncryptStuff{
	//This class simulates SSH encryption.
	@Override
	public String EncryptFile() {
		return "SSH Encryption";
	}

	@Override
	public String DecryptFile() {
		return "SSH Decryption";
	}

	@Override
	public String KeyPair(String sPrivate, String sPublic) {
		return "Public: " + sPublic.toString() + " Private: " + sPrivate.toString();
	}	
}
