package BM408Y_B09P01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VeritabaniBaglanti {

	public static Connection dbBaglanti() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection dbBaglanti = DriverManager.getConnection("jdbc:sqlserver://LOCALHOST;" + "databaseName=BM408Y_VT03", "sa","147858");
		return dbBaglanti;
	}

}
