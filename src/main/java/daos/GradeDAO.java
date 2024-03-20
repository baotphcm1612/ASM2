package daos;

import models.Student;
import utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GradeDAO implements DataAccessObject<Student> {

    private static GradeDAO e;

    public static GradeDAO getInstance() {
        if(e == null) {
            e = new GradeDAO();
        }
        return e;
    }

    @Override
    public int insert(Student variable) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "INSERT INTO Grade(ID, IT, English, PhysicalEdu) " +
                    "VALUES(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,variable.getId());
            ps.setDouble(2,variable.getMarkIT());
            ps.setDouble(3,variable.getMarkEnglish());
            ps.setDouble(4,variable.getMarkPhysicalEdu());
            int result = ps.executeUpdate();
            JDBCUtil.closeConnection(connection);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int update(Student variable) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "UPDATE Grade " +
                    "SET " +
                    "IT = ?, " +
                    "ENGLISH = ?, " +
                    "PHYSICALEDU = ? " +
                    "WHERE ID = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDouble(1,variable.getMarkIT());
            ps.setDouble(2,variable.getMarkEnglish());
            ps.setDouble(3,variable.getMarkPhysicalEdu());
            ps.setString(4,variable.getId());
            int result = ps.executeUpdate();
            JDBCUtil.closeConnection(connection);
            return result;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public int delete(Student variable) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "DELETE FROM Grade " +
                    "WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,variable.getId());
            int result = ps.executeUpdate();
            JDBCUtil.closeConnection(connection);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student getByID(Student variable) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "SELECT * FROM GRADE WHERE ID = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,variable.getId());
            ResultSet rs = ps.executeQuery();
            Student student = null;
            while(rs.next()) {
                student = StudentDAO.getInstance().getByID(variable);
                student.setMarkEnglish(rs.getDouble("English"));
                student.setMarkIT(rs.getDouble("IT"));
                student.setMarkPhysicalEdu(rs.getDouble("PhysicalEdu"));
            }
            rs.close();
            JDBCUtil.closeConnection(connection);
            return student;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<Student> getAll() {
        List<Student> studentList = new ArrayList<>();
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "SELECT * FROM GRADE";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Student student = StudentDAO.getInstance().getByID(new Student(rs.getString("ID")));
                student.setMarkEnglish(rs.getDouble("English"));
                student.setMarkIT(rs.getDouble("IT"));
                student.setMarkPhysicalEdu(rs.getDouble("PhysicalEdu"));
                studentList.add(student);
            }
            rs.close();
            JDBCUtil.closeConnection(connection);
            return studentList;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
