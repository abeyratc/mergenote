package note.utils;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;


public class CredentialsValidator {

	private static final Pattern DISALLOWED_CHARACTERS = Pattern.compile("[$&+,:;=?@#|*'-()]");
	private static final Pattern HEXA_DECIMAL = Pattern.compile("0[xX][0-9a-fA-F]+");
	
	private static final String[] RESERVED_WORDS = {"SELECT", "DROP", "CONCAT", "CHAR", "ASCII"};
	
	public static boolean valid(String str) {
		if(!StringUtils.isBlank(str)) {
			if(str.length() < 16 && 
			   !DISALLOWED_CHARACTERS.matcher(str).find() &&
			   noReservedWords(str)) {
				return true;
			}
		} 
		return false;
	}
	
	private static boolean noReservedWords(String str) {
		for(String res : RESERVED_WORDS) {
			if(str.contains(res) && HEXA_DECIMAL.matcher(str).find()) {
				return false;
			}
		}
		return true;
	}
}
