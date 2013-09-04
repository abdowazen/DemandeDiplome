/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_Model;

/**
 *
 * @author abdo
 */
import DAL.*;
import ObjectBusiness.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

public class Account {
    public void Submit_Acc(Obj_Account Acc_Obj) throws Exception{ 
       // connection instance 
      Connection connection = null; 
      // instance of SubjectName used to retain retrieved data 
      SubjectName subName = null; 
      // list to hold all instances of SubjectName 
      try { 
          // connect to database  
          Db_Connection cx      = new Db_Connection();
          DataSource dataSource         = cx.getJdbcConnectionPool();
          connection = dataSource.getConnection(); 
 // prepare the SQL query to get subject name and id 
      
      String sqlInsertAcc   = Queries.s_sqlInsert_Acc(Acc_Obj);
      PreparedStatement ps  = connection.prepareStatement(sqlInsertAcc); 
      // set up the result set to retain all queried data 
      //ResultSet rs = ps.executeQuery(); 
      ps.executeUpdate();
      }
      catch(Exception e){  
        System.out.println(e.getMessage());          
      }
      finally
      {
        connection.close();
      }
}
}