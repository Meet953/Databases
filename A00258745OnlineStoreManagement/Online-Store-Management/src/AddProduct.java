 

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
public class AddProduct extends javax.swing.JPanel {
Connection con;
	
    public AddProduct() {
        initComponents();
        
        
        try {
            // Load the JConnector Driver
         	Class.forName("com.mysql.cj.jdbc.Driver");
         	// Specify the DB Name
         	String url="jdbc:mysql://localhost:3306/onlinestore";
         	// Connect to DB using DB URL, Username and password
         	con = DriverManager.getConnection(url, "root", "admin");
         	
    } catch (SQLException ex) {
      /*  Logger.getLogger(PrintBill.class.getName()).log(Level.SEVERE, null, ex);*/
    } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        
       fillTable();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(SystemColor.menu);
        txtProdName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBorder(new LineBorder(new Color(0, 0, 0), 0));

       
      

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultpackage/manudate.png"))); // NOI18N
        jLabel5.setText(" Date:");

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultpackage/currency-icon.png"))); // NOI18N
        jLabel7.setText("Selling Price:");

     

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultpackage/quantity.png"))); // NOI18N
        jLabel8.setText("Quantity:");

   

        jButton1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultpackage/reset.png"))); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        btnAdd.setIcon(null); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        
      
        

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultpackage/medicine.png"))); // NOI18N
        jLabel1.setText("Product Name:");
        
        lblProductId = new JLabel();
        lblProductId.setIcon(new ImageIcon(AddProduct.class.getResource("/defaultpackage/billnumber.png")));
        lblProductId.setText("Product ID:");
        lblProductId.setHorizontalAlignment(SwingConstants.CENTER);
        lblProductId.setFont(new Font("Lucida Bright", Font.BOLD, 14));
        
        txtID = new JTextField();
        txtID.setColumns(10);
        
        btnDelete = new JButton();
        btnDelete.setText("Delete");
        btnDelete.setFont(new Font("Lucida Bright", Font.BOLD, 14));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        
        
        btnUpdate = new JButton();
        btnUpdate.setText("Update");
        btnUpdate.setFont(new Font("Lucida Bright", Font.BOLD, 14));

        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnUpdateActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1))
        				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
        			.addGap(43)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(txtPrice, Alignment.LEADING)
        					.addComponent(txtProdName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        				.addComponent(txtDate, Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(txtQuantity, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(lblProductId, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(txtID, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))))
        			.addGap(26))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(5)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtProdName, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblProductId, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(45)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(txtQuantity, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        					.addGap(10))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel5)
        						.addComponent(txtDate, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        					.addGap(29)))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtPrice, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton1, 0, 0, Short.MAX_VALUE)
        				.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID"," Name", "Mfg. Date", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

     

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 664, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(5)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel1, 0, 0, Short.MAX_VALUE))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(6)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 677, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(9)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

   
 

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Add Button
         
        
        PreparedStatement st;
        ResultSet rs;
        
        try
        {
        	String id = txtID.getText();
            String name=txtProdName.getText();
            //String tf2=jTextField2.getText();
            String date=txtDate.getText();
         
            String price=txtPrice.getText();
            String qty=txtQuantity.getText();
          
            //con=DriverManager.getConnection("jdbc:derby://localhost:1527/Medicine","Enam","enam");
            String sql="INSERT INTO `product`(`productID`, `pname`, `pdate`, `pprice`, `pquantity`) VALUES (?,?,?,?,?);";
            
            st=con.prepareStatement(sql);
            st.setString(1,id);
            st.setString(2,name);
            st.setString(3,date);
            st.setString(4,price);
            st.setString(5,qty);
           
            st.executeUpdate();
            st.close();
            
            JOptionPane.showMessageDialog(this, "Medicine Details Added");
            
            
          fillTable();

          
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            JOptionPane.showMessageDialog(this, "Failed To Add Medicine Details");
            e.getStackTrace();
        }
                      
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    	  //Delete Button
        

        try
        {
        	 
        	Connection con;
           Statement st = null;
            ResultSet rs;
        	String id = txtID.getText();
            

            //con=DriverManager.getConnection("jdbc:derby://localhost:1527/Member","Enam","enam");
            // Load the JConnector Driver
         	Class.forName("com.mysql.jdbc.Driver");
         	// Specify the DB Name
         	String url="jdbc:mysql://localhost:3306/onlinestore";
         	// Connect to DB using DB URL, Username and password
         	con = DriverManager.getConnection(url, "root", "admin");
         	
         	 
            String sql="Delete from onlinestore.product where productID = "+id;

            st=con.prepareCall(sql);
            st.executeUpdate(sql);
            st.close();

           // System.out.println(sql);
            JOptionPane.showMessageDialog(this, "Product Deleted ");

          
            //Fill Table
            fillTable();
        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(this, "Failed To Delete Product");
            e.getStackTrace();
        }
                      
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Update Button
     

        try
        {
         
           PreparedStatement st = null;
            ResultSet rs;
             
        	String id = txtID.getText();
            String name=txtProdName.getText();
            String date=txtDate.getText();
            String price=txtPrice.getText();
            String qty=txtQuantity.getText();

           
         	
         	 
         	 String sql="call update_product(?,?,?,?,?)";

         	 st=con.prepareCall(sql);
            
         	 st.setString(1,id);
         	 st.setString(2,name);
             st.setString(3,date);
             st.setString(4,price);
             st.setString(5,qty);
             
             

             st.executeUpdate();
             
             st.close();

           // System.out.println(sql);
            JOptionPane.showMessageDialog(this, "Product Updated ");

          
            //Fill Table
            fillTable();
        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(this, "Failed To Update Product");
            e.getStackTrace();
        }

    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void fillTable() {
    
    	 String[] col={"Product ID"," Name","Date", "Price", "Quantity"};
         DefaultTableModel model = new DefaultTableModel();
         model.setColumnIdentifiers(col);
         jTable1.setModel(model);
         jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_ALL_COLUMNS);
         jTable1.setFillsViewportHeight(true);
         
         
       
         PreparedStatement st;
         ResultSet rs;
         
    	  String sql1= "select * from product";
          PreparedStatement ps;
		try {
				
			Class.forName("com.mysql.jdbc.Driver");
		 
	     	
			ps = con.prepareStatement(sql1);
		
          ResultSet rs1=ps.executeQuery();
          
          int i=1;
          while(i==1)
          {
              if(rs1.next())
              {
            	  String id="";
                  String Name=""; 
                  String Date="";
                 
                  String Price="";
                  String Quantity="";

                  id= rs1.getString("productID");
                  Name= rs1.getString("pname"); 
                  Date=rs1.getString("pdate");
                  Price= rs1.getString("pprice");
                  Quantity=rs1.getString("pquantity");
              
              
                  model.addRow(new Object[]{id,Name,Date,Price,Quantity});
              }
              else
              {
                  i=0;
              }
          }
          
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Reset Button
        txtID.setText("");
        txtProdName.setText(""); 
        txtDate.setText("");
       
        txtPrice.setText("");
        txtQuantity.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private JLabel lblProductId;
    private JTextField txtID;
    private JButton btnDelete;
    private JButton btnUpdate;
    // End of variables declaration//GEN-END:variables
}
