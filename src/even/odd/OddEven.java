package even.odd;

import java.util.Random;
import javax.swing.JOptionPane;

public class OddEven extends javax.swing.JFrame {

static int score =0;
static int count =0;

Random r= new Random();
int randomNum;
    public OddEven() {
        initComponents();
        
        randomNum =r.nextInt(100);
        NumberValue.setText(String.valueOf(randomNum));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OddButton = new javax.swing.JButton();
        EvenButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ScoreValue = new javax.swing.JLabel();
        NumberValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OddButton.setText("Odd");
        OddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OddButtonActionPerformed(evt);
            }
        });

        EvenButton.setText("Even");
        EvenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvenButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel2.setText("GAME");

        Score.setText("Score:");

        ScoreValue.setText("lblsScore");

        NumberValue.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(OddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EvenButton)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Score)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ScoreValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(NumberValue)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)))
                .addGap(32, 32, 32)
                .addComponent(NumberValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OddButton)
                    .addComponent(EvenButton))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Score)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(ScoreValue))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//yhugbyugbygb
    private void OddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OddButtonActionPerformed
            count =count+1;
            int num =Integer.parseInt(NumberValue.getText());
            if(count ==10) {
                if(num%2!=0) {
                    score = score+1;
                    ScoreValue.setText(String.valueOf(score));
                    randomNum= r.nextInt(100);
                }      
                else{
                    randomNum =r.nextInt(100);
                    NumberValue.setText(String.valueOf(randomNum));
                }
            
                    JOptionPane.showMessageDialog(this, "Your score is:" +score+"/10");
                    count=0;
                    score=0;
                    ScoreValue.setText("");
                    randomNum = r.nextInt(100);
                    NumberValue.setText(String.valueOf(randomNum));
            }
            else{
                    if(num%2!=0) {
                        score = score+1;
                        ScoreValue.setText(String.valueOf(score));
                        randomNum =r.nextInt(100);
                        NumberValue.setText(String.valueOf(randomNum));
                        }
                        else{
                        randomNum =r.nextInt(100);
                        NumberValue.setText(String.valueOf(randomNum));
                        }
                        
                        }
            
    }//GEN-LAST:event_OddButtonActionPerformed

    private void EvenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvenButtonActionPerformed
        count =count+1;
            int num =Integer.parseInt(NumberValue.getText());
            if(count ==10) {
                if(num%2==0) {
                    score = score+1;
                    ScoreValue.setText(String.valueOf(score));
                    randomNum= r.nextInt(100);
                }      
                else{
                    randomNum =r.nextInt(100);
                    NumberValue.setText(String.valueOf(randomNum));
                }
            
                    JOptionPane.showMessageDialog(this, "Your score is:" +score+"/10");
                    count=0;
                    score=0;
                    ScoreValue.setText("");
                    randomNum = r.nextInt(100);
                    NumberValue.setText(String.valueOf(randomNum));
            }
            else{
                    if(num%2==0) {
                        score = score+1;
                        ScoreValue.setText(String.valueOf(score));
                        randomNum =r.nextInt(100);
                        NumberValue.setText(String.valueOf(randomNum));
                        }
                        else{
                        randomNum =r.nextInt(100);
                        NumberValue.setText(String.valueOf(randomNum));
                        }
                        
                        }
            
                                             
    }//GEN-LAST:event_EvenButtonActionPerformed


    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OddEven().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EvenButton;
    private javax.swing.JLabel NumberValue;
    private javax.swing.JButton OddButton;
    private javax.swing.JLabel Score;
    private javax.swing.JLabel ScoreValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
