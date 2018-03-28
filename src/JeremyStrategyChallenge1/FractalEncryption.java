package JeremyStrategyChallenge1;

public class FractalEncryption implements IEncryptStuff{
	//This class uses Fractal Encryption
	@Override
	public String EncryptFile() {
		return "Fractal Encrypted";
	}

	@Override
	public String DecryptFile() {
		return "Fractal Decrypted";
	}

	@Override
	public String KeyPair(String sPrivate, String sPublic) {
		// TODO Auto-generated method stub
		return null;
	}


}
