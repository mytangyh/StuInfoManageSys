/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HandleClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import stuinfomanagesys.ReadStuInfo;

/**
 *
 * @author asus
 */
public class AdminQuery {
    
    public static void query(String sql,DefaultTableModel ta){
        
        String num = null;
        String name = null;
        String sex = null;
        String birth = null;
        String dept = null;
        String sclass = null;
        
        Connection con = MysqlConn.getCon();
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                num=rs.getString("snum");
                name=rs.getString("sname");
                sex=rs.getString("ssex");
                birth=rs.getString("sbirth");
                dept=rs.getString("sdept");
                sclass=rs.getString("sclass");
                
                Vector v = new Vector();
                v.add(num);
                v.add(name);
                v.add(sex);
                v.add(birth);
                v.add(dept);
                v.add(sclass);
                
                ta.addRow(v);
                        
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadStuInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
}
