package note.beans;

public class Credentials {

	private String username;
	private String password;
	private String apiKey;
	private String devicePrint;
	
	public Credentials(){}
	
	public Credentials(String username, String password, String apiKey, String devicePrint) {
		this.username = username;
		this.password = password;
		this.apiKey = apiKey;
		this.devicePrint = devicePrint;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getDevicePrint() {
		return devicePrint;
	}

	public void setDevicePrint(String devicePrint) {
		this.devicePrint = devicePrint;
	}
}
