package daos;

import models.Student;
import utils.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements DataAccessObject<Student>{

    private static StudentDAO e;

    public static StudentDAO getInstance() {
        if(e == null) {
            e = new StudentDAO();
        }
        return e;
    }

    @Override
    public int insert(Student variable) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "INSERT INTO Student(ID,NAME,EMAIL,PHONE,GENDER,ADDRESS) " +
                         "VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,variable.getId());
            ps.setString(2,variable.getName());
            ps.setString(3,variable.getEmail());
            ps.setString(4,variable.getPhone());
            ps.setString(5,variable.getGender());
            ps.setString(6, variable.getAddress());
            int result = ps.executeUpdate();
            JDBCUtil.closeConnection(connection);
            variable.setMarkPhysicalEdu(0);
            variable.setMarkIT(0);
            variable.setMarkEnglish(0);
            GradeDAO.getInstance().insert(variable);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public int update(Student variable) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "UPDATE Student " +
                    "SET " +
                    "NAME = ?, " +
                    "GENDER = ?, " +
                    "PHONE = ?, " +
                    "ADDRESS = ?, " +
                    "EMAIL = ? " +
                    "WHERE ID = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,variable.getName());
            ps.setString(2,variable.getGender());
            ps.setString(3,variable.getPhone());
            ps.setString(4,variable.getAddress());
            ps.setString(5,variable.getEmail());
            ps.setString(6,variable.getId());
            int result = ps.executeUpdate();
            JDBCUtil.closeConnection(connection);
            return result;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public int delete(Student variable) {
        GradeDAO.getInstance().delete(variable);
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "DELETE FROM Student " +
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
            String sql = "SELECT * FROM Student " +
                         "WHERE ID = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,variable.getId());
            Student student = null;
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                student = new Student();
                getStudent(rs, student);
            }
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
            String sql = "SELECT * FROM Student";
            return getStudents(studentList, connection, sql);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    private List<Student> getStudents(List<Student> studentList, Connection connection, String sql) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()) {
            Student student = new Student();
            getStudent(rs, student);
            studentList.add(student);
        }
        JDBCUtil.closeConnection(connection);
        return studentList;
    }

    private void getStudent(ResultSet rs, Student student) throws SQLException {
        student.setId(rs.getString("ID"));
        student.setName(rs.getString("Name"));
        student.setEmail(rs.getString("Email"));
        student.setPhone(rs.getString("Phone"));
        student.setGender(rs.getString("Gender"));
        student.setAddress(rs.getString("Address"));
    }
}
