/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Oracle;

import java.sql.PreparedStatement;

/**
 *
 * @author Administrator
 */
public class Insert implements Dao
{

    @Override
    public void insert(Tb_order_form tb_order_form) throws Exception 
    {
        String sql="insert into tb_order_form (num,desk_num,datetime,money,user_id) values(?,?,?,?,?)";
        PreparedStatement pstmt=null;
	JDBC dbc=null;
           try
	   {
               
	   dbc=new JDBC();
	   pstmt=dbc.getConnection().prepareStatement(sql);
	   pstmt.setString(1,tb_order_form.getNum());
           
           
	   pstmt.setString(2,tb_order_form.getDesk_num());
           
           
	   pstmt.setString(3,tb_order_form.getDatetime());
           
           
	   pstmt.setInt(4,tb_order_form.getMoney());
           
           
	   pstmt.setInt(5,tb_order_form.getUser_id());
           
	   pstmt.executeUpdate();
           
	   pstmt.close();
           
	   }catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   finally
	   {
		   dbc.close();
	   }
   }
    }
    

