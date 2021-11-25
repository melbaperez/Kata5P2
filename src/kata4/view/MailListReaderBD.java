package kata4.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderBD {
    
    private static Connection connect() {
        // Cadena de conexión SQLite
        String url = "jdbc:sqlite:BD/KATA5.db"; 
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url); 
        } catch (SQLException e) {
            System.out.println(e.getMessage()); 
        }
        return conn;
    }
    
    public static List<String> read(){
        String sql = "SELECT * FROM EMAIL"; 
        List<String> mailList = new ArrayList<>();
        try (Connection conn = MailListReaderBD.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet resultSet = pstmt.executeQuery()) {
            while (resultSet.next()) {
                mailList.add(resultSet.getString("Mail"));
            }
        } catch (SQLException e) { 
            System.out.println(e.getMessage());
        } 
        return mailList;
    }

}
