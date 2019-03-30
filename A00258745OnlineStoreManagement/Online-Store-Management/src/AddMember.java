
import java.sql.*;
import java.util.Random;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMember extends javax.swing.JPanel {
DefaultTableModel model;
Connection con;

    public AddMember() {
        
        initComponents();
        
        //con=DriverManager.getConnection("jdbc:derby://localhost:1527/Member","Enam","enam");
        // Load the JConnector Driver
     	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/onlinestore";
	     	// Connect to DB using DB URL, Username and password
	     	 con = DriverManager.getConnection(url, "root", "admin");
	     	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	// Specify the DB Name
     	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	

        //Fill Table
        fillTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBackground(SystemColor.menu);
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(SystemColor.menu);
        jPanel1.setBorder(new LineBorder(new Color(0, 0, 0), 0));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultpackage/manuname.png"))); // NOI18N
        jLabel3.setText("Member Name:");

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
        
        
     

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultpackage/email'.png"))); // NOI18N
        jLabel4.setText("Email ID:");

      

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mobile No:");
 

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultpackage/info.png"))); // NOI18N
        jLabel6.setText("Address:");
        txtAddr = new javax.swing.JTextArea();
        txtAddr.setColumns(2);
        txtAddr.setTabSize(5);
        txtAddr.setRows(4);
        txtAddr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
        lblMemberId = new JLabel();
        lblMemberId.setIcon(new ImageIcon(AddMember.class.getResource("/defaultpackage/billnumber.png")));
        lblMemberId.setText("Member ID:");
        lblMemberId.setHorizontalAlignment(SwingConstants.CENTER);
        lblMemberId.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
        
        txtID = new JTextField();
        txtID.setColumns(10);
        
        btnDelete = new JButton();
        
        btnDelete.setIcon(null);
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
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel6)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtAddr, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
        					.addGap(16)
        					.addComponent(jButton1))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(txtEmail)
        						.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
        					.addGap(32)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(txtMobile, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(lblMemberId, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(txtID, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblMemberId, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtMobile, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(33)
        					.addComponent(txtAddr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(15)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        							.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(40)
        					.addComponent(jLabel6)))
        			.addGap(10))
        );
        jPanel1.setLayout(jPanel1Layout);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                 "ID", "Name", "Address", "Mobile", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
 

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 678, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(5)
        			.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        			.addGap(55))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(6)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 683, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 679, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(5)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        			.addContainerGap())
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Add Button
      
   
        PreparedStatement st;
        ResultSet rs;

        try
        {
        	String id = txtID.getText();
            String name=txtName.getText();
            String email=txtEmail.getText();
            String mobile=txtMobile.getText();
            String addr=txtAddr.getText();

            String sql="Insert into onlinestore.member(memberID,name,address,email,mobile)VALUES(?,?,?,?,?)";

            st=con.prepareCall(sql);
            st.setString(1,id);
            st.setString(2,name);
            st.setString(3,addr);
            st.setString(4,email);
            st.setString(5,mobile);
            
            st.executeUpdate();
            st.close();

           // System.out.println(sql);
            JOptionPane.showMessageDialog(this, "Member Details Added");

          
            //Fill Table
            fillTable();
        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(this, "Failed To Add Member Details");
            e.getStackTrace();
        }

    }//GEN-LAST:event_jButton4ActionPerformed


    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Delete Button
     

        try
        {
           Statement st = null;
            ResultSet rs;
        	String id = txtID.getText();
         	 
            String sql="Delete from onlinestore.member "
            		+ "where memberID = "+id;

            st=con.prepareCall(sql);
            st.executeUpdate(sql);
            st.close();

           // System.out.println(sql);
            JOptionPane.showMessageDialog(this, "Member Deleted ");

          
            //Fill Table
            fillTable();
        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(this, "Failed To Delete Member");
            e.getStackTrace();
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Update Button
     

        try
        {
        	 
        	 
           PreparedStatement st = null;
            ResultSet rs;
             
        	String id = txtID.getText();
            String name=txtName.getText();
            String email=txtEmail.getText();
            String mobile=txtMobile.getText();
            String addr=txtAddr.getText();

          	//calling stored procedure
         	 String sql="Call update_member(?,?,?,?,?)";

         	 st=con.prepareCall(sql);
            
             st.setString(1,id);
             st.setString(2,name);
             st.setString(3,addr);
             st.setString(4,email);
             st.setString(5,mobile);
           
             st.executeUpdate();
             st.close();

           // System.out.println(sql);
            JOptionPane.showMessageDialog(this, "Member Updated ");

          
            //Fill Table
            fillTable();
        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(this, "Failed To Update Member");
            e.getStackTrace();
        }

    }//GEN-LAST:event_jButton4ActionPerformed
    
    
    private void fillTable() {
    	
    	 String[] col={"Member ID","Name","Address","Mobile","Email"};
         model = new DefaultTableModel();
         model.setColumnIdentifiers(col);
         jTable1.setModel(model);
         jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_ALL_COLUMNS);
         jTable1.setFillsViewportHeight(true);
         
    	 
        
         
        //con=DriverManager.getConnection("jdbc:derby://localhost:1527/Member","Enam","enam");
        // Load the JConnector Driver
     	try {
		
	    	  String sql1= "select * from  onlinestore.member";
	          PreparedStatement ps = con.prepareStatement(sql1);
	          ResultSet rs1=ps.executeQuery();
	          
	          int i=1;
	          while(i==1)
	          {
	              if(rs1.next())
	              {
	                  //MemberId,Member_Name,Address,Email,Mobile_No,
	                 
	              	String MemberId="";
	                  String Name="";
	                  String Email="";
	                  String Mobile="";
	                  String Address="";

	                  MemberId= rs1.getString("memberID");
	                  Name=rs1.getString("name");
	                  Email= rs1.getString("email");
	                  Mobile= rs1.getString("mobile");
	                  Address=rs1.getString("address");
	              
	              
	                  model.addRow(new Object[]{MemberId,Name,Address,Mobile,Email});
	              }
	              else
	              {
	                  i=0;
	              }
	              
	          }
	          
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	 
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Reset Button

    	txtID.setText("");
        txtName.setText("");
        txtEmail.setText("");
        txtMobile.setText("");
        txtAddr.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtAddr;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private JLabel lblMemberId;
    private JTextField txtID;
    private JButton btnDelete;
    private JButton btnUpdate;
    // End of variables declaration//GEN-END:variables
}
