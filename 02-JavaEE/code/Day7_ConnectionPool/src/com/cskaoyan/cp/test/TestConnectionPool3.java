package com.cskaoyan.cp.test;

import com.cskaoyan.cp.v2.MyConnectionPool2;
import com.cskaoyan.cp.v3.MyConnectionPool3;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConnectionPool3 {

    public static void main(String[] args) {
        //获取连接：特别需要注意的是，学习了今天的内容之后就得改变习惯
        //不要自己再去创建连接了；应该向连接池去申请
        //接口指向子类实现
        DataSource dataSource = new MyConnectionPool3();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //ConnectionWrapper内部持有connection，是干活的
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement("select * from salary");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                System.out.println(name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            //之前写的工具类关闭，还能不能直接去调用？？？？？？connection不行了，因为需要放回连接池，而不是关闭
            try {
                if(preparedStatement != null){
                    preparedStatement.close();
                }
                if(connection != null){
                    //放回连接池
                    //ConnectionWrapper.close
                    //把自身放回连接池中
                    connection.close();
                }
            }catch (Exception e){

            }

        }

    }
}
