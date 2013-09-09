/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author abdo
 */
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

       
public class AccessDB {
   
    private DataSource getJdbcConnectionPool() throws NamingException
    {

        InitialContext initialContext = new InitialContext();
            Context context = (Context) initialContext.lookup("java:comp/env");
        //Context c = new InitialContext(); 
        //return (DataSource) c.lookup("java:comp/env");
            return (DataSource) context.lookup("connpool");
    } 
  private String sqlSubjectName = "SELECT subject_id, name FROM Subject";
  
  
  // get subject names from database 
  public List getSubjectName() throws Exception{ 
       // connection instance 
      Connection connection = null; 
      // instance of SubjectName used to retain retrieved data 
      ObjectBusiness.SubjectName subName = null; 
      // list to hold all instances of SubjectName 
      List list = new ArrayList();  
      try { // connect to database  
          DataSource dataSource = getJdbcConnectionPool();
          connection = dataSource.getConnection(); 
 // prepare the SQL query to get subject name and id 
      
      
      PreparedStatement ps = connection.prepareStatement(sqlSubjectName); 
      // set up the result set to retain all queried data 
      ResultSet rs = ps.executeQuery(); 
      // now loop through the rows from the generated result set 28. 
      while(rs.next()){  // declare an instance of SubjectName to match 
              // returned data with class' instance variables 
              subName = new ObjectBusiness.SubjectName(); 
              String subject_id = rs.getString("subject_id");
              String name = rs.getString("name"); 
              // set the data to the variables 
              subName.setId(subject_id);
              subName.setName(name); 
              // finally, add the subName instance to the list 
              list.add(subName); 
      } 
  }
catch(Exception e){  
    System.out.println(e.getMessage());
} 
// close the connection so it can be returned to 45. 
// the connection pool then return the list 
 
finally{
connection.close();
return list;
   
}
}
  private String sqlSubject = "SELECT * FROM Subject WHERE subject_id = ?"; 
  private String sqlCounselor = "SELECT * FROM Counselor WHERE id = ?";
  // get subject data and counselor data for corresponding subject 
 
  public ObjectBusiness.SubjectCounselor getSubCounselor(String subjectID) throws Exception{ 
     // instance of SubjectCounselor used to retain data 
     ObjectBusiness.SubjectCounselor subCoun = new ObjectBusiness.SubjectCounselor();
// connection instance 
     Connection connection = null; 
     try { 
         // connect to database 
         DataSource dataSource = getJdbcConnectionPool(); 
         connection = dataSource.getConnection(); 
         // prepare the SQL query to get subject data 
         PreparedStatement ps = connection.prepareStatement(sqlSubject);
         ps.setString(1, subjectID);
         ResultSet rs = ps.executeQuery(); 
         // this assumes there is only one row in the result set
         rs.next(); 
         // match all returned fields with the below variables
         String subjectName = rs.getString("name"); 
         String description = rs.getString("description"); 
         String counselorID = rs.getString("subject_id"); 
         // prepare the SQL query to get counselor data 
         ps = connection.prepareStatement(sqlCounselor);
         ps.setString(1, counselorID);         
         rs = ps.executeQuery(); 
         // this assumes there is only one row in the result set 
         rs.next();
 // match all returned fields with the below variables 
         String firstName = rs.getString("first_name"); 
         String nickName = rs.getString("nick_name"); 
         String lastName = rs.getString("last_name"); 
         String telephone = rs.getString("telephone"); 
         String email = rs.getString("email"); 
         String memberSince = rs.getString("member_since"); 
         
         // finally set all variables to their 
         // equivalents in the SubjectCounselor instance
         subCoun.setSubjectName(subjectName);
         subCoun.setDescription(description);
         subCoun.setCounselorID(counselorID); 
         subCoun.setFirstName(firstName); 
         subCoun.setNickName(nickName); 
         subCoun.setLastName(lastName); 
         subCoun.setTelephone(telephone); 
         subCoun.setEmail(email); 
         subCoun.setMemberSince(memberSince); 
     } catch(Exception e){ 
         System.out.println(e.getMessage()); 
     } finally{  
         // close the connection so it can be returned to the 
         // connection pool then return the SubjectCounselor instance 
         connection.close(); 
         return subCoun;
}  
 }
  
  
  
  
}
