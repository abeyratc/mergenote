package note.beans;

public class Principal {
	private String domain;
	private String sessionId;
	private String userId;
    private String authToken;
    private String deviceToken;
    private Role[] roles;
    private int ttl;
    
    public Principal() {}

	public Principal(String domain, String sessionId, String userId, String authToken, Role[] roles, int ttl) {
		this.domain = domain;
		this.sessionId = sessionId;
		this.userId = userId;
		this.authToken = authToken;
		this.roles = roles;
		this.ttl = ttl;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public Role[] getRoles() {
		return roles;
	}

	public void setRoles(Role[] roles) {
		this.roles = roles;
	}

	public int getTtl() {
		return ttl;
	}

	public void setTtl(int ttl) {
		this.ttl = ttl;
	}
}
