/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import ObjectBusiness.*;
/**
 *
 * @author abdo
 */
public class Queries {
    
    public static String s_sqlInsert_Acc(Obj_Account acc)
    {
    String sInsert="";
    sInsert = "INSERT INTO `connpool`.`account`" +
"(`Acc_email`,`Acc_Firstname`,`Acc_Lastname`,`Acc_Password`,`Acc_username`,`Acc_Category`)" +
"VALUES " +
"('"
  + acc.getAcc_email() +"','"
  + acc.getAcc_Firstname() +"','"
  + acc.getAcc_Lastname() +"','"
  + acc.getAcc_Password() + "','"
  + acc.getAcc_username() + "','"
  + acc.getAcc_Category()    
  + "')";
    
    return sInsert;
    }
    
}
