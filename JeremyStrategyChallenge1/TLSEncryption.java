package JeremyStrategyChallenge1;

public class TLSEncryption implements IEncryptStuff{
	//This class simulates the Transport Layer Security encryption
	@Override
	public String EncryptFile() {
		return "TLS Encrypted";
	}

	@Override
	public String DecryptFile() {
		return "TLS Decrypted";
	}

	@Override
	public String KeyPair(String sPrivate, String sPublic) {
		// TODO Auto-generated method stub
		return null;
	}


}
