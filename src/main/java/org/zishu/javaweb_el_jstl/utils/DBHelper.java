package org.zishu.javaweb_el_jstl.utils;
import java.sql.*;

/**
 * 数据库连接类，用于连接数据库
 */
public class DBHelper {
    //数据库链接信息
    private static final String URL = "jdbc:mysql://localhost:3306/book_system";
    private static final String USER = "root";
    private static final String PASSWORD = "111111";

    //加载数据库驱动（静态块）---在类加载时执行 --- 如果加载失败则抛出ExceptionInInitializerError异常
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    //获取数据库连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);//分别获取URL，USER，PASSWORD
    }

    //释放资源
    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //执行更新操作(增increase,删delete,改update)
    public static int update(String sql, Object... params) {
        Connection conn = null;//与特定数据库的连接 （会话）。在连接的上下文中执行 SQL 语句并返回结果。
        PreparedStatement pstmt = null;
        int result = 0;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);

            //设置参数(如果有)
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(null, pstmt, conn);
        }
        return result;
    }

    //执行查询操作(查query)
    public static ResultSet query(String sql, Object... params) throws SQLException {
        Connection conn = null;//与特定数据库的连接 （会话）。在连接的上下文中执行 SQL 语句并返回结果。
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            //设置参数(如果有)
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }

            // 注意：这里不关闭资源，因为ResultSet需要被外部使用
            return rs;
        } catch (SQLException e) {
            throw e;
        }
    }
    //有待添加，如处理事务等...
}
