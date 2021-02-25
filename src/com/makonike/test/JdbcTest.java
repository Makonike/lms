package com.makonike.test;

import com.makonike.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 测试
 *
 * @author Makonike
 * @date 2021-02-23 11:23
 **/
public class JdbcTest {
    public static void main(String[] args) throws SQLException {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
        }
}
