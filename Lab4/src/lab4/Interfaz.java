package lab4;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Interfaz extends javax.swing.JFrame {
    
public static DefaultTableModel modelo1;
public static DefaultTableModel modelo2;
public static ArrayList<String> estudiantes = new ArrayList<>();
public static ArrayList<Float> notas = new ArrayList<>();
public static ArrayList<String> resultado = new ArrayList<>();
public static String []espacio= new String[1];

    public Interfaz() {
        initComponents();
        modelo1 = new DefaultTableModel();
        this.jTable1.setModel(modelo1);
        modelo2 = new DefaultTableModel();
        this.jTable2.setModel(modelo2);
        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estudiantestxt = new javax.swing.JTextField();
        notastxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        crearbt = new javax.swing.JButton();
        notafinalbt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Mortalidad = new javax.swing.JLabel();
        graficobt = new javax.swing.JButton();
        nombretxt = new javax.swing.JTextField();
        mortalidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cantidad de estudiantes: ");

        jLabel2.setText("Cantidad de notas: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        crearbt.setText("Crear Tabla");
        crearbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearbtActionPerformed(evt);
            }
        });

        notafinalbt.setText("Calcular notas Finales");
        notafinalbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notafinalbtActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        graficobt.setText("crear grafico ");
        graficobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficobtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(Mortalidad))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(notastxt, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(estudiantestxt))
                            .addGap(47, 47, 47)
                            .addComponent(crearbt))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(notafinalbt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(mortalidad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(graficobt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estudiantestxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(notastxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(crearbt)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notafinalbt)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mortalidad)
                .addGap(18, 18, 18)
                .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graficobt)
                .addGap(198, 198, 198)
                .addComponent(Mortalidad)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearbtActionPerformed
        if("".equals(notastxt.getText())||"".equals(estudiantestxt.getText())){
            JOptionPane.showMessageDialog(null,"No ha ingresado ningun dato");
           
        }else{
            modelo1.addColumn("Nombre");
            for(int i=0;i<Integer.parseInt(notastxt.getText());i++){
            modelo1.addColumn("Nota "+(i+1));            
            }
            for(int i=0;i<Integer.parseInt(estudiantestxt.getText());i++){
                modelo1.addRow(espacio);
            }
        }
    }//GEN-LAST:event_crearbtActionPerformed

    private void notafinalbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notafinalbtActionPerformed
        float aux=0,aux2=0,a=0,porcen1,porcen2;
        
        
            for(int i=0;i<Integer.parseInt(estudiantestxt.getText());i++){
            estudiantes.add(modelo1.getValueAt(i, 0).toString());
            for(int j=0;j<Integer.parseInt(notastxt.getText());j++){
               
                aux+=Float.parseFloat((String)modelo1.getValueAt(i,j+1));              
                aux2=aux/Integer.parseInt(notastxt.getText());
                    if(aux2>=3.0){
                        resultado.add(i, "APROBADO");
                    
                    }else{
                        resultado.add(i, "REPROBADO");
                  
                    }
                notas.add(i, aux2);              
           }
             aux=0;aux2=0;
        }
        
       modelo2.addColumn("Nombre"); modelo2.addColumn("Definitiva"); modelo2.addColumn("Resultado");
       for(int i=0;i<Integer.parseInt(estudiantestxt.getText());i++){
            modelo2.addRow(espacio); 
            modelo2.setValueAt(estudiantes.get(i), i, 0);
            modelo2.setValueAt(notas.get(i),i,1);
            modelo2.setValueAt(resultado.get(i), i, 2);
            if(resultado.get(i).equals("APROBADO")){
                a++;
            }
        }
        
         
         porcen1=(a*100)/Integer.parseInt(estudiantestxt.getText());
         porcen2=100-porcen1;         
         mortalidad.setText("Aprobo: "+porcen1+"%   Reprobo: "+porcen2+"%");
           
       
    }//GEN-LAST:event_notafinalbtActionPerformed

    private void graficobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficobtActionPerformed
        XYSeries series = new XYSeries("XYGraph");
        
        if(estudiantes.contains(nombretxt.getText())){
            
                for(int j=0;j<Integer.parseInt(notastxt.getText());j++){
                
                series.add(Float.parseFloat(modelo1.getValueAt(estudiantes.indexOf(nombretxt.getText()), j+1).toString()), j+1);
                }
                      
        XYSeriesCollection dataset = new XYSeriesCollection(); 
        dataset.addSeries(series);
        int i=estudiantes.indexOf(nombretxt.getText());
        JFreeChart chart = ChartFactory.createXYLineChart( modelo1.getValueAt(i, 0).toString(), "notas", "", dataset,PlotOrientation.VERTICAL,  true, true, false );
        
        ChartFrame frame = new ChartFrame("Grafica", chart);
        

        frame.pack();
        frame.setVisible(true);    
           
        }else{
        JOptionPane.showMessageDialog(null,"NO SE ENCONTRO ESTE NOMBRE EN LA LISTA");
        }
        
        
    }//GEN-LAST:event_graficobtActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mortalidad;
    private javax.swing.JButton crearbt;
    public static javax.swing.JTextField estudiantestxt;
    private javax.swing.JButton graficobt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable2;
    private javax.swing.JLabel mortalidad;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JButton notafinalbt;
    public static javax.swing.JTextField notastxt;
    // End of variables declaration//GEN-END:variables
}
