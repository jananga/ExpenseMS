/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.expensems.view;

import com.im.expensems.controler.CategoryDAO;
import com.im.expensems.controler.CategoryDAOImp;
import com.im.expensems.model.Category;
import java.util.List;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author rpa29
 */
public class CategoryManager extends javax.swing.JPanel {

     CategoryDAOImp catImp = new CategoryDAOImp();
     
    /**
     * Creates new form CategoryManager
     */
    public CategoryManager() {
        initComponents();
        //Load data table of Categories
        loadGrid();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        AddCatogeryPane = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAddCategory = new javax.swing.JButton();
        CatogerCrudPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new java.awt.BorderLayout());

        AddCatogeryPane.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Id :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name :");

        txtId.setEditable(false);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Category Manager");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAddCategory.setText("Add");
        btnAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoryActionPerformed(evt);
            }
        });

        AddCatogeryPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddCatogeryPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddCatogeryPane.setLayer(txtId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddCatogeryPane.setLayer(txtName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddCatogeryPane.setLayer(btnClear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddCatogeryPane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddCatogeryPane.setLayer(btnUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddCatogeryPane.setLayer(btnDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddCatogeryPane.setLayer(btnAddCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AddCatogeryPaneLayout = new javax.swing.GroupLayout(AddCatogeryPane);
        AddCatogeryPane.setLayout(AddCatogeryPaneLayout);
        AddCatogeryPaneLayout.setHorizontalGroup(
            AddCatogeryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCatogeryPaneLayout.createSequentialGroup()
                .addGroup(AddCatogeryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCatogeryPaneLayout.createSequentialGroup()
                        .addGroup(AddCatogeryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddCatogeryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCatogeryPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1))
                                .addGroup(AddCatogeryPaneLayout.createSequentialGroup()
                                    .addGap(151, 151, 151)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(AddCatogeryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddCatogeryPaneLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnUpdate)
                        .addGap(34, 34, 34)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 125, Short.MAX_VALUE))
        );
        AddCatogeryPaneLayout.setVerticalGroup(
            AddCatogeryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCatogeryPaneLayout.createSequentialGroup()
                .addGroup(AddCatogeryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCatogeryPaneLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1))
                    .addGroup(AddCatogeryPaneLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(AddCatogeryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(AddCatogeryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnClear)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        add(AddCatogeryPane, java.awt.BorderLayout.PAGE_START);

        CatogerCrudPanel.setBackground(new java.awt.Color(255, 204, 204));
        CatogerCrudPanel.setMinimumSize(new java.awt.Dimension(440, 150));
        CatogerCrudPanel.setName(""); // NOI18N
        CatogerCrudPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));
        CatogerCrudPanel.setLayout(new java.awt.GridBagLayout());

        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        categoryTable.setColumnSelectionAllowed(true);
        categoryTable.setMaximumSize(new java.awt.Dimension(2147483647, 12800));
        categoryTable.setMinimumSize(new java.awt.Dimension(3000, 12800));
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryTable);
        categoryTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (categoryTable.getColumnModel().getColumnCount() > 0) {
            categoryTable.getColumnModel().getColumn(0).setResizable(false);
            categoryTable.getColumnModel().getColumn(1).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 429;
        gridBagConstraints.ipady = 59;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 37, 18, 51);
        CatogerCrudPanel.add(jScrollPane1, gridBagConstraints);

        add(CatogerCrudPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       
        //Set values to text Boxes
        clearTxtFields();
        
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
        
        // Get selected Row Value
        int index = categoryTable.getSelectedRow();
        TableModel tbModel = categoryTable.getModel();
        
        int idValue = Integer.parseInt(tbModel.getValueAt(index, 0).toString());
        String CatName = tbModel.getValueAt(index, 1).toString();
        
        //Set values to text Boxes
        txtId.setText(String.valueOf(idValue));
        txtName.setText(CatName);
        //JOptionPane.showMessageDialog(null, "Category Value : "+idValue);
    }//GEN-LAST:event_categoryTableMouseClicked

    private void btnAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoryActionPerformed
       
        if(!txtId.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Clear textboxes before adding a new record..");
        }
        else if(!txtName.getText().equals("")){//If Catagory text box not empty
         String catagoryName = txtName.getText().toString();
         
         Category category = new Category();
         
         category.setName(catagoryName);
         boolean ok = catImp.insertCatagory(category);
         
         if(ok == true)
         {
         //Message for successfully inserted Catagory
         JOptionPane.showMessageDialog(null, "Record successfully inserted.");
         loadGrid();
         
         //Clear text boxes
         clearTxtFields();
         
         }else{
         //Message for Catagory inserted fail
         JOptionPane.showMessageDialog(null, "Record inserted fail.");
         }
         
         
         }else{
         
             //Message for empty Catagory
             JOptionPane.showMessageDialog(null, "Empty Catrgory cannot be inserted.");
         }
    }//GEN-LAST:event_btnAddCategoryActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
          //If Catagory text box not empty
         if(txtId.getText().toString().equals("")){
         //Message for empty Catagory
         JOptionPane.showMessageDialog(null, "Select Category to update.");
         
         }else if (txtName.getText().equals("")) {
             
         //Message for empty Catagory
         JOptionPane.showMessageDialog(null, "Empty Catrgory cannot be updated.");

         }else
         {
         
            //get values to update
            String catagoryName = txtName.getText().toString();
            int catagoryId = Integer.parseInt(txtId.getText());

             Category category = new Category();

             category.setId(catagoryId);
             category.setName(catagoryName);

             boolean ok = catImp.updateCategory(category);

             if(ok == true)
             {
             //Message for successfully inserted Catagory
             JOptionPane.showMessageDialog(null, "Record successfully updated.");
             loadGrid();

             //Clear text boxes
             clearTxtFields();
             }
         }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         
         //If Catagory text box not empty
         if(txtId.getText().toString().equals("")){
         //Message for empty Catagory
         JOptionPane.showMessageDialog(null, "Select Category to delete.");
         
         }else
         {
             // Delete box message
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete ? ","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
          //get values to Delete
            int catagoryId = Integer.parseInt(txtId.getText());

             boolean ok = catImp.deleteCategory(catagoryId);

             if(ok == true)
             {
             //Message for successfully deleted Catagory
             JOptionPane.showMessageDialog(null, "Record successfully deleted.");
             loadGrid();

             //Clear text boxes
             clearTxtFields();
             }
        }
         }
    }//GEN-LAST:event_btnDeleteActionPerformed

    
    
     private void loadGrid()
    {
        CategoryDAOImp catImp = new CategoryDAOImp();
        
        List<Category> list = catImp.listAll();
        
        DefaultTableModel dtm = (DefaultTableModel)categoryTable.getModel();
       
        dtm.setRowCount(0);
        
        for(Category category : list){
            Object[] obj = {category.getId(), category.getName()};
            dtm.addRow(obj);
        }
        

    }
    
     private void clearTxtFields()
    {
        //Set values to text Boxes
        txtId.setText("");
        txtName.setText("");
        

    }
     
     public class ForcedListSelectionModel extends DefaultListSelectionModel {

    public ForcedListSelectionModel () {
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @Override
    public void clearSelection() {
    }

    @Override
    public void removeSelectionInterval(int index0, int index1) {
    }

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane AddCatogeryPane;
    private javax.swing.JPanel CatogerCrudPanel;
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable categoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
