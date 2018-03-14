package com.mintlolly.coonpool;

/**
 * Create by jag on 2018/3/8
 */
public class ConnectionPoolUtils {
    private ConnectionPoolUtils(){}//私有静态方法
    private static ConnectionPool poolInstance = null;
    public static ConnectionPool GetPoolInstance(){
        if(poolInstance == null) {
            poolInstance = new ConnectionPool(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost:3306/sell?useUnicode=true&characterEncoding=utf-8",
                    "root", "123456");
            try {
                poolInstance.createPool();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return poolInstance;
    }
}