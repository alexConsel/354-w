package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

import core.Driver;
import core.Project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Derek
 */
public class BrowseProjectsWindow extends javax.swing.JFrame {

    /**
     * Creates new form browseProjectsWindow
     */
    public BrowseProjectsWindow() {
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        buttonGANTT = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        bg = new javax.swing.ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        jRadioButton1.setSelected(true);
        allProjects = Driver.getAllProjects();

        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        
        

        updateListDisplay(allProjects);
       
       
        jScrollPane1.setViewportView(jList1);

        
        
        

        jToolBar1.setRollover(true);

        jButton1.setText("Create New Project");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        
        //JButton1 Action Create project
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		Container frame = jButton1.getParent();
      		  	//close this window
        		do 
        			frame = frame.getParent(); 
        		while (!(frame instanceof JFrame));                                      
        		((JFrame) frame).dispose();
        		Driver.createProject(); 
      	  }
        });
        jToolBar1.add(jButton1);
        

        jButton2.setText("Open Project");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        
        
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		Container frame = jButton2.getParent();
      		  	//close this window
        		do 
        			frame = frame.getParent(); 
        		while (!(frame instanceof JFrame));                                      
        		((JFrame) frame).dispose();
        		//TODO get project object from selected list item
        		Project temp = (Project)jList1.getSelectedValue();
        		Driver.setCurrentProject(temp);
        		Driver.openProject(temp); 
      	  }
        });
        
        jToolBar1.add(jButton2);

        jButton3.setText("Delete Project");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);
        
        buttonGANTT.setText("Display GANTT Chart");
        buttonGANTT.setFocusable(false);
        buttonGANTT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonGANTT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonGANTT.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent evt){
        		Project temp = (Project)jList1.getSelectedValue();
        		//temp.GANNTTAnalysis();
        	}
        });
        
        jToolBar1.add(buttonGANTT);

        jRadioButton1.setText("All Projects");

        jRadioButton2.setText("My Projects");

        jRadioButton3.setText("ID");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(2, 2, 2))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
        );
        

        pack();
    }// </editor-fold>                        

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BrowseProjectsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrowseProjectsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrowseProjectsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrowseProjectsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrowseProjectsWindow().setVisible(true);
            }
        });
    	BrowseProjectsWindow bP = new BrowseProjectsWindow();
    	bP.setVisible(true);
    	
    }
    public void updateListDisplay(ArrayList<Project> aP){
    	
    	 final DefaultListModel model = new DefaultListModel();
    	 if (aP.size() != 0){
	    	 for(int i = 0; i < aP.size(); i++){
	    		 model.addElement(aP.get(i));
	    	 }
	    	 jList1.setModel(model);
    	 }
    	 
    	
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton buttonGANTT;
    private javax.swing.JList jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.ButtonGroup bg;
    private ArrayList<Project> allProjects;
    // End of variables declaration                   
}
