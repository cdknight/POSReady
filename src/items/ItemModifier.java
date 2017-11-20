package items;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import utils.ImportantMethods;
public class ItemModifier {
		//modifies an item to to have a rebate 
private Connection mariadb_default; 
private POSItem tb_mod; 
private double price_less; 

	public ItemModifier(String item_name, double price_less) throws ClassNotFoundException, SQLException {
		//name constructor
		this.mariadb_default = ImportantMethods.getRegularPOSDBConnection(); 
		this.tb_mod = new POSItem (item_name);
		this.price_less = price_less; 
	}
	
	public ItemModifier (int item_id, double price_less) throws ClassNotFoundException, SQLException {
		//id constructor
		this.mariadb_default = ImportantMethods.getRegularPOSDBConnection(); 
		this.tb_mod = new POSItem(item_id);
		this.price_less = price_less; 
	}
	
	public void modify_item() throws SQLException {
		String query = "INSERT INTO pos_rebates VALUES(\"" + tb_mod.getItemName() + "\", \"" + tb_mod.getItemId() + "\", " + this.price_less + ")";
		Statement exec_mod = mariadb_default.createStatement(); 
		exec_mod.executeQuery(query);
	}
}
