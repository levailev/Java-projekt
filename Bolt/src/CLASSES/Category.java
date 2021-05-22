package CLASSES;

import CLASSES.DB_INFO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Category {
    
    Connection connection;
    
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCategoryId(String name) {
        return this.id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public Category(){}
    
    public Category(Integer ID, String NAME)
    {
        this.id = ID;
        this.name = NAME;
    }
    
    public ArrayList<Category> categoriesList(){

            ArrayList<Category> category_list = new ArrayList<>();
            connection = DB_INFO.getConnection();
            ResultSet rs;
            PreparedStatement ps;

                   String query = "SELECT `id`, `name` FROM `category`";

            try {

                    ps = connection.prepareStatement(query);
                    rs = ps.executeQuery();

                    Category category;

                    while(rs.next()){
                        category = new Category(rs.getInt("id"), 
                                         rs.getString("name")
                                         );

                        category_list.add(category);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
            }
            return category_list;

        }
    
    public HashMap<String, Integer> populateCombo(){

      HashMap<String, Integer> map = new HashMap<>();

      connection = DB_INFO.getConnection();

      Statement st;

      ResultSet rs;

       try {

           st = connection.createStatement();

           rs = st.executeQuery("SELECT `id`, `name` FROM `category`");

           Category category;

           

           while(rs.next()){

               category = new Category(rs.getInt(1), rs.getString(2));

               map.put(category.getName(), category.getId());

           }

       } catch (SQLException ex) {

           Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);

       }
       
       return map;

   }
  
    public static void insertCategory(Category category)
    {
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO `category`(`name`) VALUES (?)");

            ps.setString(1, category.getName());


            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Új kategória hozzáadva");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Valami hiba történt!");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void updateCategory(Category category)
    {
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("UPDATE `category` SET `name`=? WHERE `id` = ?");

            ps.setString(1, category.getName());
            ps.setInt(2, category.getId());

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Kategória módosítva");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Valami hiba történt!");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void deleteCategory(Integer categoryId)
    {
        
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("DELETE FROM `category` WHERE `id` = ?");

            ps.setInt(1, categoryId);

            int YesOrNo = JOptionPane.showConfirmDialog(null,"Biztosan törölni szeretné a kiválasztott kategóriát?","Törlés", JOptionPane.YES_NO_OPTION);
            if(YesOrNo == 0){
                
               if(ps.executeUpdate() != 0){
                  JOptionPane.showMessageDialog(null, "Kategória törölve!");
                }
               
                else{
                    JOptionPane.showMessageDialog(null, "Valami hiba történt!");
                } 
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
}

