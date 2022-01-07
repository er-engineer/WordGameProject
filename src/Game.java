
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;


public class Game extends javax.swing.JFrame {
   
    public Game() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerText = new javax.swing.JLabel();
        wordDescription = new javax.swing.JLabel();
        guessBox = new javax.swing.JTextField();
        guessing = new javax.swing.JLabel();
        passButton = new javax.swing.JButton();
        hintButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        guessButton = new javax.swing.JButton();
        amountPass = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(89, 89, 89));

        headerPanel.setBackground(new java.awt.Color(38, 38, 38));

        headerText.setBackground(new java.awt.Color(0, 0, 0));
        headerText.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        headerText.setForeground(new java.awt.Color(255, 255, 255));
        headerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerText.setText("Kelime Oyunu");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        wordDescription.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wordDescription.setForeground(new java.awt.Color(255, 255, 255));
        wordDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordDescription.setText("wordDescriptionHere");

        guessBox.setText("Tahmin");
        guessBox.setEnabled(false);
        guessBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessBoxActionPerformed(evt);
            }
        });

        guessing.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        guessing.setForeground(new java.awt.Color(255, 255, 255));
        guessing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guessing.setText("Pas Hakkı: ");

        passButton.setBackground(new java.awt.Color(38, 38, 38));
        passButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        passButton.setForeground(new java.awt.Color(255, 255, 255));
        passButton.setText("Soruyu Geç");
        passButton.setBorderPainted(false);
        passButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passButtonActionPerformed(evt);
            }
        });

        hintButton.setBackground(new java.awt.Color(38, 38, 38));
        hintButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        hintButton.setForeground(new java.awt.Color(255, 255, 255));
        hintButton.setText("İpucu Al");
        hintButton.setBorderPainted(false);
        hintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintButtonActionPerformed(evt);
            }
        });

        stopButton.setBackground(new java.awt.Color(38, 38, 38));
        stopButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        stopButton.setForeground(new java.awt.Color(255, 255, 255));
        stopButton.setText("Süreyi Durdur");
        stopButton.setBorderPainted(false);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        guessButton.setBackground(new java.awt.Color(38, 38, 38));
        guessButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        guessButton.setForeground(new java.awt.Color(255, 255, 255));
        guessButton.setText("Tahmin Et");
        guessButton.setBorderPainted(false);
        guessButton.setEnabled(false);
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        amountPass.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        amountPass.setForeground(new java.awt.Color(255, 255, 255));
        amountPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountPass.setText("Tahmin:");

        time.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("Süre: ");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(wordDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(amountPass, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(guessBox, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hintButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passButton, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(guessButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stopButton, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guessing, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guessing, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wordDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guessBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountPass, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void guessBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessBoxActionPerformed
         
    }//GEN-LAST:event_guessBoxActionPerformed

    private void passButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passButtonActionPerformed

    private void hintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hintButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        hintButton.setEnabled(false);
        passButton.setEnabled(false);
        guessButton.setEnabled(true);
        guessBox.setEnabled(true); 
    }//GEN-LAST:event_stopButtonActionPerformed

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed

        /*if() Checking guess of user.
        {
            //Time starts
            //Deactivated butttons come up            
        }
        else
        {
            //Wrong answer!
        }*/   
    }//GEN-LAST:event_guessButtonActionPerformed
    static int duration = 180;
    public static void main(String args[]) {
      /* 
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                duration--;
                time.setText("Süre: " + duration);
                throw new UnsupportedOperationException("Not supported yet.");
            }
        }){
            
        }*/
                
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountPass;
    private javax.swing.JTextField guessBox;
    private javax.swing.JButton guessButton;
    private javax.swing.JLabel guessing;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerText;
    private javax.swing.JButton hintButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton passButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel time;
    private javax.swing.JLabel wordDescription;
    // End of variables declaration//GEN-END:variables
}
