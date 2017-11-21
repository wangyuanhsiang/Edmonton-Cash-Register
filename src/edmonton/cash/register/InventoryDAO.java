/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edmonton.cash.register;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 *
 * @author Shawn
 */
public class InventoryDAO {
     @Resource(mappedName = "jdbc/EdmontonCashDB")
      private DataSource ds;
     
     public void addItem(Inventory inventory){
         String sql = "";
         executeModifyQuery(sql);
     }
     
     public void deleteItem(){}
     
     public void editItem(){}
     
     public void getItem(){}
     
    
     public ArrayList<Inventory> getAllItems(){
          ArrayList<Inventory> list = new ArrayList();
          try {
            Connection conn = ds.getConnection();
             ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM INVENTORY");
             while(rs.next()){
                Inventory inventory = new Inventory();
                inventory.setSerNO(rs.getString("SERNO"));
                inventory.setItemName(rs.getString("ITEMTITLE"));
                inventory.setCompany(rs.getString("COMPANY"));
                inventory.setLocation(rs.getString("LOCATION"));
                inventory.setPrice(rs.getDouble("PRICE"));
                inventory.setQuantity(rs.getInt("QUANTITY"));
                list.add(inventory);
             }
             conn.close();
         } catch (Exception e) {
             
         }
 
         return list;
     }
    
     public void executeModifyQuery(String sql){
         try {
             Connection conn = ds.getConnection();
             conn.createStatement().executeQuery(sql);
             conn.commit();
         } catch (Exception e) {
              System.err.println(e.getMessage());
         }
     }
     
//     public ResultSet executeFetchQuery(String sql){
//        ResultSet rs = null;
//        
//         try {
//            Connection conn = ds.getConnection();
//            conn.createStatement().executeQuery(sql);
//            conn.close();
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//        return rs;
//        
//     
//     }
    
}
