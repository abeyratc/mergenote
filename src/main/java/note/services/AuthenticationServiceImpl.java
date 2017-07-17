package note.services;

import java.util.Date;

import note.beans.Credentials;
import note.beans.Principal;
import note.beans.Role;

public class AuthenticationServiceImpl implements AuthenticationService {

	@Override
	public Principal authenticate(Credentials credentials) {
		Principal pp = new Principal();
		if(credentials.getUsername().equals("Ash") || 
			credentials.getUsername().equals("Chin")) {
			pp.setUserId(credentials.getUsername());
			pp.setDeviceToken(credentials.getDevicePrint());
			pp.setAuthToken("T76Ki456");
			pp.setRoles(getRoles(credentials));
			Date d = new Date();
			pp.setSessionId("SESSION-"+d.getTime());
			pp.setDomain("PD");
			pp.setTtl(5000);
		}
		return pp;
	}

	private Role[] getRoles(Credentials credentials) {
		Role[] roles;
		if(credentials.getUsername().equals("Ash")) {
			roles = new Role[1];
			roles[0] = new Role(2, "User");
		} else {
			roles = new Role[2];
			roles[0] = new Role(1, "Admin");
			roles[1] = new Role(2, "User");
		}
		return roles;
	}
}
