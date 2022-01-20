package application;

public class User {
	
	//data
	private String username;
	private String password;
	private String name;
	
	//Parameterizzed constructor
	public User(String newUsername, String newPassword, String newName)
	{
		setUsername(newUsername);
		setPassword(newPassword);
		setName(newName);
		
	}
	
	//Getters
	public String getUsername() { return this.username; }
	public String getPassword() { return this.password; }
	public String getName() { return this.name; }
	
	//Setters
	public void setUsername(String newUsername) { this.username = newUsername; }
	public void setPassword(String newPassword) { this.password = newPassword; }
	public void setName( String newName) { this.name = newName; }
}
