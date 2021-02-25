package com.makonike.dao.impl;

import com.makonike.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Dao持久层的超类
 *
 * @author Makonike
 * @date 2021-02-23 11:35
 **/
public abstract class BaseDao {

    private QueryRunner queryRunner = new QueryRunner();

    /**
     * 增、删、改
     * @param sql 数据库操作语句
     * @param args ?占位符 参数
     * @return int
     * @author Makonike
     * @date 2021/2/23 11:41
     */

    public int update(String sql, Object... args){
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return -1;
    }

    /**
     * 查询返回一个javaBean的sql语句
     * @param type  返回的对象类型
     * @param sql   数据库操作语句
     * @param args  ?占位符 参数
     * @return <T>  返回的类型的泛型
     * @author Makonike
     * @date 2021/2/23 15:51
     */

    public <T> T queryForOne(Class<T> type, String sql, Object...args){
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            return queryRunner.query(con,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(con);
        }
        return  null;
    }

    /**
     * 查询返回多个javaBean的sql语句
     * @param type  返回的对象类型
     * @param sql   数据库操作语句
     * @param args  ?占位符 参数
     * @return <T>  返回的类型的泛型
     * @author Makonike
     * @date 2021/2/23 15:51
     */
    public <T>List<T> queryForList(Class<T> type, String sql, Object... args){
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            return queryRunner.query(con,sql, new BeanListHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(con);
        }
        return  null;
    }

    /**
     * 执行返回一行一列的sql语句
     * @param sql 数据库操作语句
     * @param args ？占位符 参数
     * @return java.lang.Object
     * @author Makonike
     * @date 2021/2/23 16:01
     */

    public Object queryForSingleValue(String sql,Object... args){
        Connection con = null;
        try {
            //获取连接
            con = JdbcUtils.getConnection();

            return queryRunner.query(con, sql, new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(con);
        }
        return null;
    }







}
