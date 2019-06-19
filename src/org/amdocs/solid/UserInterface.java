package org.amdocs.solid;

public interface UserInterface {
	public boolean login(String username, String password);
	public boolean register(String username, String password, String email);
	
	//according to Single Responsibility Principle, these methods should be on their own interface, 
	// even though feel relevant, because their responsibility is different.
	public void logError(String error);
	public boolean sendEmail(String emailContent);
}
