package org.zishu.javaweb_el_jstl.dao.impl;

import org.zishu.javaweb_el_jstl.dao.BookDao;
import org.zishu.javaweb_el_jstl.model.Book;
import org.zishu.javaweb_el_jstl.utils.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDaoImpl implements BookDao {
    @Override
    public Book getBooks() {
        //try with resources try可以自动关闭资源
        //无需connection.close();//数据库使用之后需要关闭
        try(Connection connection = DBHelper.getConnection()) {//可能抛出异常的代码
            String sql = "select * from book";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setAuthor(resultSet.getString("author"));
                book.setTitle(resultSet.getString("title"));
                book.setPages(resultSet.getString("pages"));
                book.setDescription(resultSet.getString("description"));
                book.setPicture(resultSet.getString("picture"));
                book.setDay(resultSet.getString("day"));
                return book;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
