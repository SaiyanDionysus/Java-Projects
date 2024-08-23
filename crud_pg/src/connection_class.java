import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class connection_class {
    public static void main(String[] args) {
        Connection con = connect_to_db("newDB", "postgres", "postgres");

        updateRow(con, "student", "Dionysus", 20);
        deleteRow(con, "student", "Denis", "name");
        readTable(con, "student");

    }

    public static Connection connect_to_db(String dbname, String user, String pass) {
        Connection con_obj = null;
        String url = "jdbc:postgresql://localhost:5432/";

        try
        {
            con_obj = DriverManager.getConnection(url+dbname, user, pass);
            if(con_obj != null) {
                System.out.println("Connection established successfully!");
            }
            else {
                System.out.println("Connection failed");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return con_obj;
    }

    public static void createTable(Connection con, String tableName) {
        Statement stmt;

        try {
            String query="create table "+tableName+" (name varchar(20),rollno int,dept varchar(20));";
            stmt=con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table has been created successfully !!");
        }
        catch (Exception e) {
            System.out.println("Exception caught");
        }
    }

    public static void insertRow(Connection con, String tName, String name, int rno, String dept) {
        Statement stmt;

        try {
            String query = String.format("insert into %s(name, rollno, dept) values ('%s', '%s', '%s');", tName, name, rno, dept);
            stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Inserted successfully");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readTable(Connection con, String tName) {
        Statement stmt;
        ResultSet rs;
        try {
            stmt = con.createStatement();
            String query = "select * from "+tName+";";
            rs = stmt.executeQuery(query);

            System.out.println("Name\t\tRollno\t\tDept");
            System.out.println("----------------");
            while(rs.next()) {
                System.out.println(rs.getString("name")+"\t\t");
                System.out.println(rs.getString("rollno")+"\t\t\t");
                System.out.println(rs.getString("dept"));
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateRow(Connection con, String tName, String newname, int rno) {
        Statement stmt;

        try {
            stmt = con.createStatement();
            String query = String.format("update %s set name = '%s' where rollno = %d;", tName, newname, rno);
            stmt.executeUpdate(query);
            System.out.println("Row updated successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void deleteRow(Connection con, String tName, String nameStud, String col) {
        Statement stmt;

        try {
            String query = "delete from " + tName + "where name = '"+nameStud+"';";
            stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Row deleted successfully!");
        }
        catch (Exception e) {
            System.out.println("Exception caught in deleteTable");
        }
    }

}