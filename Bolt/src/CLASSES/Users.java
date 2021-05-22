package CLASSES;

import CLASSES.DB_INFO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Users {
    Connection connection;
    
    private Integer id;
    private String username;
    private String password;
    private String user_type;
    private String fullname;
    

     public Users(){}
    
    
    public Users(Integer ID, String UNAME, String PASW,String UTYP, String FNAME)
    {
        this.id = ID;
        this.username = UNAME;
        this.password = PASW;
        this.fullname = FNAME;
        this.user_type = UTYP;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public ArrayList<Users> UsersList(){
        
        ArrayList<Users> user_list = new ArrayList<>();
        connection = DB_INFO.getConnection();

        ResultSet rs;
        PreparedStatement ps;

               String query = "SELECT `id`, `username`, `password`, `user_type`, `fullname` FROM `users` WHERE `user_type` = 'user'";
        
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
           
            Users user;
            while(rs.next()){
               user = new Users(rs.getInt("id"), 
                                 rs.getString("username"),
                                 rs.getString("password"),
                                 rs.getString("user_type"),
                                 rs.getString("fullname")
                );
                user_list.add(user);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user_list;
    }
    // user hozzaadasa
     public static void AddUser(Users user)
    {
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO `users`(`username`, `password`, `user_type`, `fullname`) VALUES (?,?,?,?)");

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, "user");
            ps.setString(4, user.getFullname());
            

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Új felhasználó hozzáadva!");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Hiba történt a művelet elvégzése közben");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     // user torlese
     public static void deleteUser(Integer userId)
    {
        
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("DELETE FROM `users` WHERE `id` = ?");

            ps.setInt(1, userId);

            // Biztosan töröni akarja? hibauzenet
            int YesOrNo = JOptionPane.showConfirmDialog(null,"Biztosan törölni akarja a felhasználót?","Felhasználó törlése", JOptionPane.YES_NO_OPTION);
            if(YesOrNo == 0){
               
                if(ps.executeUpdate() != 0){
                   
                    JOptionPane.showMessageDialog(null, "Felhasználó törölve");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Valami hiba történt!");
                }
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
     //user frissitese
     public static void ModifyUser(Users user)
    {
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("UPDATE `users` SET `username`=?,`password`=?,`fullname`=? WHERE `id`=?");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFullname());
            ps.setInt(4, user.getId());

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Felhasználó módosítva");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Hiba történt!");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
