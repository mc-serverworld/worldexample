package com.serverworld.worldexample;

import java.sql.SQLException;
import java.sql.Statement;

public class main {

    public static void main(String[] args)  {
        Sqlcon X = new Sqlcon();
        X.MYSQLlogin("127.0.0.1","database","testuser","v4GtTyH1ws9RFZ1r",3306);
        try {
            //Statement statement = Sqlcon.getConnection().createStatement();
       }catch (Exception e){
            e.printStackTrace();
        }


    }


}
