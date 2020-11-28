package Day4;

import utility.ConfigurationReader;
import utility.DB_Utility;

public class SpartanDB_Practice {

    // create a main method
    public static void main(String[] args) {


        // call your create connection method with 3 params
       String connectionStr = ConfigurationReader.getProperty("spartan.database.url");
       String username = ConfigurationReader.getProperty("spartan.database.username");
        String password = ConfigurationReader.getProperty("spartan.database.password");
        DB_Utility.createConnection(connectionStr,username,password);


        // provide same connection string as HR
        // provide username and password as SP SP
        // run query SELECT * FROM SPARTANS

        DB_Utility.runQuery("select * from SPARTANS");


        // call few methods from DB_Utility

        System.out.println("DB_Utility.getRowCount() = " + DB_Utility.getRowCount());
        System.out.println("DB_Utility.getColumnNames() = \n\t" + DB_Utility.getColumnNames());


        // after you are done with this :
        // now add below to your properties file
        // spartan.database.url=jdbc:oracle:thin:@YOUR_IP_HERE:1521:XE
        // spartan.database.username=SP
        // spartan.database.password=SP

        // REPLACE YOUR HARDCODED CONNECTION INFO IN THIS CLASS WITH PROPERTIES FILE


    }
}
