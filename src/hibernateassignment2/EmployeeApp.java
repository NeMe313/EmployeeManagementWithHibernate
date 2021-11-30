package hibernateassignment2;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class EmployeeApp extends javax.swing.JFrame {

    EmployeeManagement em = new EmployeeManagement();

    public void centerFrame() {

        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;
        setLocation(dx, dy);
    }

    public EmployeeApp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        mainList = new javax.swing.JList<>();
        titleLbl = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        closeWinBtn = new javax.swing.JButton();
        sortByCB = new javax.swing.JComboBox<>();
        sortByFld = new javax.swing.JTextField();
        sortBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(mainList);

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setText("Employee App");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        closeWinBtn.setText("Close");
        closeWinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeWinBtnActionPerformed(evt);
            }
        });

        sortByCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort by...", "All", "Name", "Age", "Address", "Salary" }));
        sortByCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByCBActionPerformed(evt);
            }
        });

        sortByFld.setEnabled(false);

        sortBtn.setText(">");
        sortBtn.setEnabled(false);
        sortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBtnActionPerformed(evt);
            }
        });

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(355, 355, 355))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(closeWinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sortByCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortByFld, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortBtn)
                                .addGap(191, 191, 191)
                                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(sortByFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn)
                    .addComponent(sortBtn)
                    .addComponent(sortByCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(closeWinBtn)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        Employee updateEmployee = em.getByID(this.getIdOfSelected());

        dialogWindow popUpdate = new dialogWindow();
        popUpdate.idField.setText(String.valueOf(updateEmployee.getID()));
        popUpdate.nameField.setText(updateEmployee.getName());
        popUpdate.ageField.setText(String.valueOf(updateEmployee.getAge()));
        popUpdate.addressField.setText(updateEmployee.getAddress());
        popUpdate.salaryField.setText(String.valueOf(updateEmployee.getSalary()));
        
        popUpdate.setVisible(true);
        popUpdate.centerFrame();

    }//GEN-LAST:event_updateBtnActionPerformed

    private void sortByCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByCBActionPerformed
        int sortByNum = sortByCB.getSelectedIndex();

        switch (sortByNum) {

            case 0:
                sortByFld.setEnabled(false);
                sortBtn.setEnabled(false);
                mainList.removeAll();
            case 1:
                DefaultListModel listModel = new DefaultListModel();
                for (int i = 0; i < em.listEmployee().size(); i++) {
                    listModel.addElement(em.listEmployee().get(i));
                }
                mainList.setModel(listModel);
                sortByFld.setEnabled(false);
                sortBtn.setEnabled(false);
            case 2:
                sortBtn.setEnabled(true);
                sortByFld.setEnabled(true);
                sortByFld.requestFocus();
            case 3:
                sortBtn.setEnabled(true);
                sortByFld.setEnabled(true);
                sortByFld.requestFocus();
            case 4:
                sortBtn.setEnabled(true);
                sortByFld.setEnabled(true);
                sortByFld.requestFocus();
            case 5:
                sortBtn.setEnabled(true);
                sortByFld.setEnabled(true);
                sortByFld.requestFocus();

        }

    }//GEN-LAST:event_sortByCBActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        dialogWindow pop = new dialogWindow();
        pop.setVisible(true);
        pop.centerFrame();

    }//GEN-LAST:event_createBtnActionPerformed

    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBtnActionPerformed

        int selectedIndex = sortByCB.getSelectedIndex();

        switch (selectedIndex) {
            case 2:
                String name = sortByFld.getText();
                DefaultListModel listModel = new DefaultListModel();
                ArrayList<Employee> employees = em.listByName(name);
                for (int i = 0; i < employees.size(); i++) {
                    listModel.addElement(employees.get(i));
                }
                mainList.setModel(listModel);
            case 3:
                String age = sortByFld.getText();
                DefaultListModel ageListModel = new DefaultListModel();
                ArrayList<Employee> ageEmployees = em.listByAge(age);
                for (int i = 0; i < ageEmployees.size(); i++) {
                    ageListModel.addElement(ageEmployees.get(i));
                }
                mainList.setModel(ageListModel);

            case 4:
                String address = sortByFld.getText();
                DefaultListModel addressListModel = new DefaultListModel();
                ArrayList<Employee> addressEmployees = em.listByAddress(address);
                for (int i = 0; i < addressEmployees.size(); i++) {
                    addressListModel.addElement(addressEmployees.get(i));
                }
                mainList.setModel(addressListModel);
            case 5:
                String salary = sortByFld.getText();
                DefaultListModel salaryListModel = new DefaultListModel();
                ArrayList<Employee> salaryEmployees = em.listBySalary(salary);
                for (int i = 0; i < salaryEmployees.size(); i++) {
                    salaryListModel.addElement(salaryEmployees.get(i));
                }
                mainList.setModel(salaryListModel);
        }
    }//GEN-LAST:event_sortBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed

        int emID = getIdOfSelected();

        em.deleteByID(emID);

        JOptionPane.showMessageDialog(null, "Employee successfully removed!");

        sortByCB.setSelectedIndex(1);


    }//GEN-LAST:event_removeBtnActionPerformed

    private void closeWinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeWinBtnActionPerformed
           this.dispose();
    }//GEN-LAST:event_closeWinBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeWinBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JList<String> mainList;
    private javax.swing.JButton removeBtn;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton sortBtn;
    private javax.swing.JComboBox<String> sortByCB;
    private javax.swing.JTextField sortByFld;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private int getIdOfSelected() {
        ListModel model = mainList.getModel();
        int index = mainList.getSelectedIndex();
        Object o = model.getElementAt(index);
        String[] oString = o.toString().split(";");
        String emID = oString[0];
        return Integer.parseInt(emID);
    }

    public class dialogWindow extends javax.swing.JFrame {

        public dialogWindow() {
            initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {
            super.setUndecorated(true);
            this.centerFrame();

            idLbl = new javax.swing.JLabel();
            nameLbl = new javax.swing.JLabel();
            ageLbl = new javax.swing.JLabel();
            addressLbl = new javax.swing.JLabel();
            salaryLbl = new javax.swing.JLabel();
            confirmBtn = new javax.swing.JButton();
            cancelBtn = new javax.swing.JButton();
            titleLbl = new javax.swing.JLabel();
            idField = new javax.swing.JTextField();
            nameField = new javax.swing.JTextField();
            ageField = new javax.swing.JTextField();
            addressField = new javax.swing.JTextField();
            salaryField = new javax.swing.JTextField();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            idLbl.setText("ID:");

            nameLbl.setText("Name:");

            ageLbl.setText("Age:");

            addressLbl.setText("Address:");

            salaryLbl.setText("Salary:");

            confirmBtn.setText("Confirm");
            confirmBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    confirmBtnActionPerformed(evt);
                }
            });

            cancelBtn.setText("Cancel");
            cancelBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cancelBtnActionPerformed(evt);
                }
            });

            titleLbl.setText("Create a new Employee");

            idField.setEnabled(false);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(86, 86, 86)
                                                    .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(87, 87, 87)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(salaryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(addressLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(ageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(nameField)
                                                            .addComponent(ageField)
                                                            .addComponent(addressField)
                                                            .addComponent(salaryField, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(idField))))
                                    .addGap(108, 108, 108))
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(131, 131, 131)
                                    .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(idLbl)
                                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nameLbl)
                                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ageLbl)
                                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(addressLbl)
                                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(salaryLbl)
                                            .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(confirmBtn)
                                            .addComponent(cancelBtn))
                                    .addGap(29, 29, 29))
            );
            ((AbstractDocument) ageField.getDocument()).setDocumentFilter(new CustomDocumentFilter());
            ((AbstractDocument) salaryField.getDocument()).setDocumentFilter(new CustomDocumentFilter());
            pack();
        }// </editor-fold>                        

        private class CustomDocumentFilter extends DocumentFilter {
            private Pattern regexCheck = Pattern.compile("[0-9]+");
            public void insertString(FilterBypass fb, int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }
                if (regexCheck.matcher(str).matches()) {
                    super.insertString(fb, offs, str, a);
                }
            }
            @Override
            public void replace(FilterBypass fb, int offset, int length, String str, AttributeSet attrs)
                    throws BadLocationException {
                if (str == null) {
                    return;
                }
                if (regexCheck.matcher(str).matches()) {
                    fb.replace(offset, length, str, attrs);
                }
            }
        }

        private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {

            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String address = addressField.getText();
            float salary = Float.parseFloat(salaryField.getText());
            String id = idField.getText();

            if (!id.equals("")) {
                Employee inputEmployee = new Employee(Integer.parseInt(id), name, age, address, salary);
                em.updateEmployee(inputEmployee);
                JOptionPane.showMessageDialog(null, "Employee successfully updated!");
            } else {
                Employee inputEmployee = new Employee(name, age, address, salary);
                em.createEmployee(inputEmployee);
                JOptionPane.showMessageDialog(null, "Employee successfully created!");
            }

            dispose();

        }

        private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {
            this.dispose();
        }

        // Variables declaration - do not modify                     
        private javax.swing.JTextField addressField;
        private javax.swing.JLabel addressLbl;
        private javax.swing.JTextField ageField;
        private javax.swing.JLabel ageLbl;
        private javax.swing.JButton cancelBtn;
        private javax.swing.JButton confirmBtn;
        private javax.swing.JTextField idField;
        private javax.swing.JLabel idLbl;
        private javax.swing.JTextField nameField;
        private javax.swing.JLabel nameLbl;
        private javax.swing.JTextField salaryField;
        private javax.swing.JLabel salaryLbl;
        private javax.swing.JLabel titleLbl;
        // End of variables declaration     

        private void centerFrame() {

            Dimension windowSize = getSize();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Point centerPoint = ge.getCenterPoint();

            int dx = centerPoint.x - windowSize.width / 2;
            int dy = centerPoint.y - windowSize.height / 2;
            setLocation(dx, dy);

        }

    }

}
