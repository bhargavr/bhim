/**
 * 
 */
package com.srushti.bhim.exception;

/**
 * @author bhargav
 *
 */
public class UsernameAlreadyInUseException extends Exception {
	public UsernameAlreadyInUseException(String username) {
		super("The username '" + username + "' is already in use.");
	}
}
