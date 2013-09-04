/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author abdo
 */
public class Db_Connection {
    public DataSource getJdbcConnectionPool() throws NamingException
    {

        InitialContext initialContext = new InitialContext();
            Context context = (Context) initialContext.lookup("java:comp/env");
        //Context c = new InitialContext(); 
        //return (DataSource) c.lookup("java:comp/env");
            return (DataSource) context.lookup("connpool");
    } 
}
