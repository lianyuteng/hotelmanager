/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Oracle;

import java.sql.Connection;

/**
 *
 * @author Administrator
 */
public class Ceshi
{
   public static void main(String[] args)
   {
       Connection asd;
       JDBC conn=new JDBC();
       asd=conn.getConnection();
       if(asd!=null)
       {
           System.out.println("连接成功");
       }
   }
}
