import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
public class DateTimeExample {
    public static void main(String args[]){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
            
            java.util.Date date=new java.util.Date();
            
            java.sql.Date sqlDate=new java.sql.Date(date.getTime());
            java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
            
            PreparedStatement ps=con.prepareStatement("insert into record (date,time) values(?,?)");
            ps.setDate(1,sqlDate);
            ps.setTimestamp(2,sqlTime);
            ps.executeUpdate();            
            
            ps.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}