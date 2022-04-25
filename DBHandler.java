package ebill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

 
public class DBHandler {

	public Connection establishConnection() {
		try {
			String dataBasePropertyFile = "C:\\Users\\Jay K Patel\\Desktop\\Project\\ebill\\src\\ebill\\db.properties";
			FileInputStream fileInputStream = new FileInputStream(dataBasePropertyFile);
			Properties properties = new Properties();
			properties.load(fileInputStream);
			Class.forName(properties.getProperty("db.classname"));

			return DriverManager.getConnection(properties.getProperty("db.url"), properties.getProperty("db.user"),
					properties.getProperty("db.password"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
