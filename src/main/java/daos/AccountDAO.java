package daos;

import models.Account;
import utils.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO implements DataAccessObject<Account> {

    private static AccountDAO e;

    public static AccountDAO getInstance() {
        if(e == null) {
            e = new AccountDAO();
        }
        return e;
    }


    @Override
    public int insert(Account variable) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "INSERT INTO Account(username,password,type) " +
                    "VALUES(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,variable.getUsername());
            ps.setString(2,variable.getPass());
            ps.setInt(3,variable.getType());
            int result = ps.executeUpdate();
            JDBCUtil.closeConnection(connection);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int update(Account variable) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "UPDATE Account " +
                    "SET " +
                    "username = ?, " +
                    "password = ?, " +
                    "type = ? " +
                    "WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,variable.getUsername());
            ps.setString(2,variable.getPass());
            ps.setInt(3, variable.getType());
            ps.setInt(4,variable.getId());
            int result = ps.executeUpdate();
            JDBCUtil.closeConnection(connection);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int delete(Account variable) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "DELETE FROM Account " +
                    "WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,variable.getId());
            int result = ps.executeUpdate();
            JDBCUtil.closeConnection(connection);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account getByID(Account variable) {
        int id = variable.getId();
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ACCOUNT " +
                    "WHERE id = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            return getAccount(connection, ps);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Account getByAccount(String username) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ACCOUNT " +
                    "WHERE username = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,username);
            return getAccount(connection, ps);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Account getAccount(Connection connection, PreparedStatement ps) throws SQLException {
        ResultSet rs = ps.executeQuery();
        Account account = new Account();
        while(rs.next()) {
            account.setId(rs.getInt("id"));
            account.setUsername(rs.getString("username"));
            account.setPass(rs.getString("password"));
            account.setType(rs.getShort("type"));
        }
        rs.close();
        JDBCUtil.closeConnection(connection);
        return account;
    }

    @Override
    public List<Account> getAll() {
        try {
            Connection connection = JDBCUtil.getConnection();
            List<Account> accountList = new ArrayList<>();
            String sql = "SELECT * FROM Account";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                Account account = new Account();
                account.setId(rs.getInt("id"));
                account.setUsername(rs.getString("account"));
                account.setPass(rs.getString("password"));
                account.setType(rs.getShort("type"));
                accountList.add(account);
            }
            rs.close();
            JDBCUtil.closeConnection(connection);
            return accountList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
