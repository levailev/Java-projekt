package CLASSES;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Product {

    Connection connection;

    private Integer id;
    private String name;
    private Integer category_id;
    private String price;
    private Integer quantity;
    private String place ;
    private String category;

    public Product() {
    }

   public Product(Integer ID, String NAME, Integer CATEGORY_ID, String PRICE, Integer QUANTITY, String PLACE,String categoryName)
    {
        this.id = ID;
        this.name = NAME;
        this.category_id = CATEGORY_ID;
        this.price = PRICE;
        this.quantity = QUANTITY;
        this.place = PLACE;
        this.category = categoryName;
    }
   
   public static void insertProduct(Product product)
    {
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement("INSERT INTO product(name, quantity, price, category_id, place) VALUES (?,?,?,?,?)");

            ps.setString(1, product.getName());
            ps.setInt(2, product.getQuantity());
            ps.setString(3, product.getPrice());
            ps.setInt(4, product.getCategory_id());
            ps.setString(5, product.getPlace());

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Új termék hozzáadva");

                }
                else{
                    JOptionPane.showMessageDialog(null, "Valami hiba történt!");

                }

        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateProduct(Product product){
            Connection con = DB_INFO.getConnection();
            PreparedStatement ps;

           
                try {
                ps = con.prepareStatement("UPDATE `product` SET `name`=?,`quantity`=?,`price`=?,`category_id`=?,`place`=? WHERE `id` = ?");

                ps.setString(1, product.getName());
                ps.setInt(2, product.getQuantity());
                ps.setString(3, product.getPrice());
                ps.setInt(4, product.getCategory_id());
                ps.setString(5, product.getPlace());
                ps.setInt(6, product.getId());

                if(ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "Termék frissítve");

                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Valami hiba történt!");

                    }

            } catch (SQLException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    
    public static void deleteProduct(Integer id)
    {
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("DELETE FROM `product` WHERE `id` = ?");

            ps.setInt(1, id);

            // show a confirmation message before deleting the product
            int YesOrNo = JOptionPane.showConfirmDialog(null,"Valóban szeretnéd törölni ezt a terméket?","Termék törlése", JOptionPane.YES_NO_OPTION);
            if(YesOrNo == 0){
                
                if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Termék törölve");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Hiba!");
                    
                }
                
            }
                      
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
        
        

    public ArrayList<Product> productsList(String val){
        
        ArrayList<Product> product_list = new ArrayList<>();
        connection = DB_INFO.getConnection();
        ResultSet rs;
        PreparedStatement ps;
        
        String query = "SELECT product.id, product.name,category_id, quantity, price, place,category.name as 'category'\n" +
        "  FROM product\n" +
        "INNER JOIN category ON category.id = product.category_id\n" +
        "WHERE\n" +
        "CONCAT(\n" +
        "Convert(product.id , char(11)), product.name,\n" +
        "Convert(quantity , char(11)), price,\n" +
        "place, category.name\n" +
        ")\n" +
        "LIKE ?;";
               
        
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + val + "%");
            rs = ps.executeQuery();
           
            Product prd;
            
            while(rs.next()){
                prd = new Product(rs.getInt("id"), 
                                 rs.getString("name"), 
                                 rs.getInt("category_id"),
                                 rs.getString("price"),
                                 rs.getInt("quantity"),
                                 rs.getString("place"),
                                 rs.getString("category")
                                 );
                
                product_list.add(prd);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product_list;
        
    }
    
    public ArrayList<Product> productsInCategoryList(Integer categoryId){
        
        ArrayList<Product> product_list = new ArrayList<>();
        connection = DB_INFO.getConnection();
        ResultSet rs;
        PreparedStatement ps;
        
               String query = "SELECT product.id, product.name,category_id, quantity, price, place FROM product WHERE category_id = ?";
        
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, categoryId);
            rs = ps.executeQuery();
           
            Product prd;
            
            while(rs.next()){
                prd = new Product(rs.getInt("id"), 
                                 rs.getString("name"), 
                                 rs.getInt("category_id"),
                                 rs.getString("price"),
                                 rs.getInt("quantity"),
                                 rs.getString("place"),
                                 null
                                 );
                
                product_list.add(prd);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product_list;
        
    }
    
     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategoryName(Integer category_id) {
        return category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
