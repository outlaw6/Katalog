import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author 1bestcsharp.blogspot.com
 */
public class Images_From_Folder_Navigation extends javax.swing.JFrame {

    /**
     * Creates new form Images_From_Folder_Navigation
     */
    public Images_From_Folder_Navigation() {
        initComponents();
       // display first image
        showImage(pos);
    }
    
// the index of the images
    int pos = 0;
    
// get images list
    public String[] getImages()
    {
        File file = new File(getClass().getResource("/JAVA_VIDEOS_TUTORIALS/Images").getFile());
        String[] imagesList = file.list();
        return imagesList;
    }

// display the image by index
    public void showImage(int index)
    {
        String[] imagesList = getImages();
        String imageName = imagesList[index];
        ImageIcon icon = new ImageIcon(getClass().getResource("/JAVA_VIDEOS_TUTORIALS/Images/"+imageName));
        Image image = icon.getImage().getScaledInstance(jLabel_Image.getWidth(), jLabel_Image.getHeight(), Image.SCALE_SMOOTH);
        jLabel_Image.setIcon(new ImageIcon(image));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel_Image = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton_Next = new javax.swing.JButton();
        jButton_Previous = new javax.swing.JButton();
        jButton_Last = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JAVA_VIDEOS_TUTORIALS/icons/first.png"))); // NOI18N
        jButton1.setText("First");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setIconTextGap(0);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_Next.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JAVA_VIDEOS_TUTORIALS/icons/next.png"))); // NOI18N
        jButton_Next.setText("Next");
        jButton_Next.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_Next.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_Next.setIconTextGap(0);
        jButton_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextActionPerformed(evt);
            }
        });

        jButton_Previous.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JAVA_VIDEOS_TUTORIALS/icons/previous.png"))); // NOI18N
        jButton_Previous.setText("Previous");
        jButton_Previous.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_Previous.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_Previous.setIconTextGap(0);
        jButton_Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PreviousActionPerformed(evt);
            }
        });

        jButton_Last.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Last.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JAVA_VIDEOS_TUTORIALS/icons/last.png"))); // NOI18N
        jButton_Last.setText("Last");
        jButton_Last.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_Last.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_Last.setIconTextGap(0);
        jButton_Last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton_Previous)
                .addGap(49, 49, 49)
                .addComponent(jButton_Last, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Next, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jButton_Previous, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jButton_Last, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>                        

     // The First , Next , Previous ,Last Navigation Buttons

    // First
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        pos = 0;
        showImage(pos);
        
    }                                        

     // Next
    private void jButton_NextActionPerformed(java.awt.event.ActionEvent evt) {                                             
       pos = pos + 1;
       if(pos >= getImages().length)
       {
           pos  = getImages().length - 1;
       }
       showImage(pos);
    }                                            

     // Previous
    private void jButton_PreviousActionPerformed(java.awt.event.ActionEvent evt) {                                                 
       pos = pos - 1;
       if(pos < 0)
       {
           pos = 0;
       }
       showImage(pos);
    }                                                

     // Last
    private void jButton_LastActionPerformed(java.awt.event.ActionEvent evt) {                                             
       pos = getImages().length - 1;
       showImage(pos);
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
            java.util.logging.Logger.getLogger(Images_From_Folder_Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Images_From_Folder_Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Images_From_Folder_Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Images_From_Folder_Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Images_From_Folder_Navigation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Last;
    private javax.swing.JButton jButton_Next;
    private javax.swing.JButton jButton_Previous;
    private javax.swing.JLabel jLabel_Image;
    // End of variables declaration                   
}
