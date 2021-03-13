package com.makonike.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * JDBC工具类 使用Druid连接池
 *
 * @author Makonike
 **/
public class JdbcUtils {

    /** 数据源 **/
    private static DruidDataSource dataSource = null;


    public static void main(String[] args) {

    }
    static {


        try{
            //加载配置文件
            Properties properties = new Properties();
            //使用ClassLoader加载配置文件，获取字节输入流in
            InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(in);

            //创建数据库连接池，初始化连接池对象
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * 获取连接Connection对象
     * @param
     * @return java.sql.Connection
     * @author Makonike
     * @date 2021/2/23 10:49
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * 关闭连接，释放内存
     * @param conn
     * @return void
     * @author Makonike
     * @date 2021/2/23 10:50
     */

    public static void close(Connection conn){
        if(conn!=null){
            try{
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

