
package vista;

import javax.swing.JLabel;

/**
 *
 * @author Duchman
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
    */
    public void ConfiguracioFrame(){
        this.setSize(810, 610);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }
    
    public void animacion(JLabel label,int num){
        if(num == 0){
            label.setBackground(new java.awt.Color(0, 102, 102));
        }else{
            label.setBackground(new java.awt.Color(0, 51, 51));
        }
    }
    
    
    public PaginaPrincipal() {
        initComponents();
        ConfiguracioFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_fCircular = new javax.swing.JLabel();
        btn_fTrapezoidal = new javax.swing.JLabel();
        btn_fRectangular = new javax.swing.JLabel();
        btn_fTriangular = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FLUIDO UNIFORME");

        btn_fCircular.setBackground(new java.awt.Color(0, 51, 51));
        btn_fCircular.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_fCircular.setForeground(new java.awt.Color(255, 255, 255));
        btn_fCircular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_fCircular.setText("CALCULAR FLUIDO TRAPEZOIDAL");
        btn_fCircular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_fCircular.setFocusable(false);
        btn_fCircular.setOpaque(true);
        btn_fCircular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fCircularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_fCircularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_fCircularMouseExited(evt);
            }
        });

        btn_fTrapezoidal.setBackground(new java.awt.Color(0, 51, 51));
        btn_fTrapezoidal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_fTrapezoidal.setForeground(new java.awt.Color(255, 255, 255));
        btn_fTrapezoidal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_fTrapezoidal.setText("CALCULAR FLUIDO CIRCULAR");
        btn_fTrapezoidal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_fTrapezoidal.setFocusable(false);
        btn_fTrapezoidal.setOpaque(true);
        btn_fTrapezoidal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fTrapezoidalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_fTrapezoidalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_fTrapezoidalMouseExited(evt);
            }
        });

        btn_fRectangular.setBackground(new java.awt.Color(0, 51, 51));
        btn_fRectangular.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_fRectangular.setForeground(new java.awt.Color(255, 255, 255));
        btn_fRectangular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_fRectangular.setText("CALCULAR FLUIDO RECTANGULAR");
        btn_fRectangular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_fRectangular.setFocusable(false);
        btn_fRectangular.setOpaque(true);
        btn_fRectangular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fRectangularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_fRectangularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_fRectangularMouseExited(evt);
            }
        });

        btn_fTriangular.setBackground(new java.awt.Color(0, 51, 51));
        btn_fTriangular.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_fTriangular.setForeground(new java.awt.Color(255, 255, 255));
        btn_fTriangular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_fTriangular.setText("CALCULAR FLUIDO TRIANGULAR");
        btn_fTriangular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_fTriangular.setFocusable(false);
        btn_fTriangular.setOpaque(true);
        btn_fTriangular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fTriangularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_fTriangularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_fTriangularMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_fTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_fRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_fTrapezoidal, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_fCircular, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_fCircular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_fTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_fRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_fTrapezoidal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 220, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_fCircularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fCircularMouseEntered
        animacion(btn_fCircular, 0);
    }//GEN-LAST:event_btn_fCircularMouseEntered

    private void btn_fCircularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fCircularMouseExited
        animacion(btn_fCircular, 1);
    }//GEN-LAST:event_btn_fCircularMouseExited

    private void btn_fTrapezoidalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fTrapezoidalMouseEntered
        animacion(btn_fTrapezoidal, 0);
    }//GEN-LAST:event_btn_fTrapezoidalMouseEntered

    private void btn_fTrapezoidalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fTrapezoidalMouseExited
        animacion(btn_fTrapezoidal, 1);
    }//GEN-LAST:event_btn_fTrapezoidalMouseExited

    private void btn_fRectangularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fRectangularMouseEntered
        animacion(btn_fRectangular, 0);
    }//GEN-LAST:event_btn_fRectangularMouseEntered

    private void btn_fRectangularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fRectangularMouseExited
        animacion(btn_fRectangular, 1);
    }//GEN-LAST:event_btn_fRectangularMouseExited

    private void btn_fTriangularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fTriangularMouseEntered
        animacion(btn_fTriangular, 0);
    }//GEN-LAST:event_btn_fTriangularMouseEntered

    private void btn_fTriangularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fTriangularMouseExited
        animacion(btn_fTriangular, 1);
    }//GEN-LAST:event_btn_fTriangularMouseExited

    private void btn_fCircularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fCircularMouseClicked
        SeccionTrapezoide secTrapezoide = new SeccionTrapezoide();
        secTrapezoide.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_fCircularMouseClicked

    private void btn_fRectangularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fRectangularMouseClicked
        SeccionRectangulo secRectangulo = new SeccionRectangulo();
        secRectangulo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_fRectangularMouseClicked

    private void btn_fTriangularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fTriangularMouseClicked
       SeccionTriangular secTriangular = new SeccionTriangular();
        secTriangular.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_fTriangularMouseClicked

    private void btn_fTrapezoidalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fTrapezoidalMouseClicked
        SeccionCircular secCirculo = new SeccionCircular();
        secCirculo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_fTrapezoidalMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_fCircular;
    private javax.swing.JLabel btn_fRectangular;
    private javax.swing.JLabel btn_fTrapezoidal;
    private javax.swing.JLabel btn_fTriangular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}