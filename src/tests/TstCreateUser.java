package tests;
import java.io.FileNotFoundException;
import java.io.IOException;

import auth.CreateUser;
import auth.EmployeeNotCreatedException; 
public class TstCreateUser {

	public static void main(String[] args) throws FileNotFoundException, IOException, EmployeeNotCreatedException {
		CreateUser v = new CreateUser("billy", "bob", "joe", "billy", "honk", "pos_top_admin_users"); 
		v.writeInfo();

	}

}
