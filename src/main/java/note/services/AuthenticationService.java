package note.services;

import note.beans.Credentials;
import note.beans.Principal;

public interface AuthenticationService {

	public Principal authenticate(Credentials credentials);
}
