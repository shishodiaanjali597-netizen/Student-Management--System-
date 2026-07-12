import java.sql.*;

public class FeesDAO {
    
    // Fees add karo
    public void addFees(int studentId, double amount, String paidDate, String status) {
        String query = "INSERT INTO fees (student_id, amount, paid_date, status) VALUES (?, ?, ?, ?)";
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, studentId);
            ps.setDouble(2, amount);
            ps.setString(3, paidDate);
            ps.setString(4, status);
            ps.executeUpdate();
            System.out.println("Fees added successfully!");
            con.close();
        } catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Student ki fees dekho
    public void getFeesByStudent(int studentId) {
        String query = "SELECT * FROM fees WHERE student_id=?";
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();
            System.out.println("\nAmount | Date | Status");
            System.out.println("----------------------");
            while(rs.next()) {
                System.out.println(
                    rs.getDouble("amount") + " | " +
                    rs.getString("paid_date") + " | " +
                    rs.getString("status")
                );
            }
            con.close();
        } catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}