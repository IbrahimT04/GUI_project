/* 
                        _________________________________
                              (Summative) Assignment
                        ---------------------------------
                                By: Ibrahim Tariq
*/
package grade11summative.tariq;

    // Import statement for MessageBox.
    import static javax.swing.JOptionPane.showMessageDialog;

public class MatchingFrame extends javax.swing.JInternalFrame {
    
    // Declaration of variables:
    int totalMatchingMarks = 0;
    int buttonClicked = 0;

    /**
     * Creates new form MatchingFrame
     */
    public MatchingFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MBackground = new javax.swing.JDesktopPane();
        lblMTitle = new javax.swing.JLabel();
        lblMQuestion1 = new javax.swing.JLabel();
        lblMQuestion2 = new javax.swing.JLabel();
        lblMQuestion3 = new javax.swing.JLabel();
        lblMQuestion4 = new javax.swing.JLabel();
        lblMQuestion5 = new javax.swing.JLabel();
        AnswerBox1 = new javax.swing.JComboBox<>();
        AnswerBox2 = new javax.swing.JComboBox<>();
        AnswerBox3 = new javax.swing.JComboBox<>();
        AnswerBox4 = new javax.swing.JComboBox<>();
        AnswerBox5 = new javax.swing.JComboBox<>();
        btnMatchingCalculate = new javax.swing.JButton();

        MBackground.setBackground(new java.awt.Color(102, 102, 102));

        lblMTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMTitle.setForeground(new java.awt.Color(51, 255, 255));
        lblMTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMTitle.setText("Match the following (3 marks per question)");

        lblMQuestion1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblMQuestion1.setForeground(new java.awt.Color(51, 255, 255));
        lblMQuestion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMQuestion1.setText("Question 1: Remote learning remains out of reach for _________.");

        lblMQuestion2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblMQuestion2.setForeground(new java.awt.Color(51, 255, 255));
        lblMQuestion2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMQuestion2.setText("Question 2: School closures keep ______ students out of school.");

        lblMQuestion3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblMQuestion3.setForeground(new java.awt.Color(51, 255, 255));
        lblMQuestion3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMQuestion3.setText("Question 3: Over _________ children will be out of school in 2030.");

        lblMQuestion4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblMQuestion4.setForeground(new java.awt.Color(51, 255, 255));
        lblMQuestion4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMQuestion4.setText("<html>Question 4: School completion rate in poor countries is _______. (Rich sector and Poor sector)<html/>");

        lblMQuestion5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblMQuestion5.setForeground(new java.awt.Color(51, 255, 255));
        lblMQuestion5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMQuestion5.setText("<html>Question 5: ___% of primary schools have basic handwatching facilities.<html/>");

        AnswerBox1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AnswerBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500 Million", "200 Million", "90%", "79% and 34%", "65%" }));

        AnswerBox2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AnswerBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500 Million", "200 Million", "90%", "79% and 34%", "65%" }));

        AnswerBox3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AnswerBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500 Million", "200 Million", "90%", "79% and 34%", "65%" }));

        AnswerBox4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AnswerBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500 Million", "200 Million", "90%", "79% and 34%", "65%" }));

        AnswerBox5.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AnswerBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500 Million", "200 Million", "90%", "79% and 34%", "65%" }));

        btnMatchingCalculate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMatchingCalculate.setText("Calculate Mark");
        btnMatchingCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatchingCalculateActionPerformed(evt);
            }
        });

        MBackground.setLayer(lblMTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MBackground.setLayer(lblMQuestion1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MBackground.setLayer(lblMQuestion2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MBackground.setLayer(lblMQuestion3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MBackground.setLayer(lblMQuestion4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MBackground.setLayer(lblMQuestion5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MBackground.setLayer(AnswerBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MBackground.setLayer(AnswerBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MBackground.setLayer(AnswerBox3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MBackground.setLayer(AnswerBox4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MBackground.setLayer(AnswerBox5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MBackground.setLayer(btnMatchingCalculate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MBackgroundLayout = new javax.swing.GroupLayout(MBackground);
        MBackground.setLayout(MBackgroundLayout);
        MBackgroundLayout.setHorizontalGroup(
            MBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MBackgroundLayout.createSequentialGroup()
                        .addGroup(MBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MBackgroundLayout.createSequentialGroup()
                                .addComponent(lblMQuestion1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AnswerBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MBackgroundLayout.createSequentialGroup()
                        .addGroup(MBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMQuestion4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblMQuestion3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMQuestion2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMQuestion5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMatchingCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(MBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AnswerBox5, 0, 126, Short.MAX_VALUE)
                            .addComponent(AnswerBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AnswerBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AnswerBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(9, Short.MAX_VALUE))))
        );
        MBackgroundLayout.setVerticalGroup(
            MBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMTitle)
                .addGap(18, 18, 18)
                .addGroup(MBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMQuestion1)
                    .addComponent(AnswerBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMQuestion2)
                    .addComponent(AnswerBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMQuestion3)
                    .addComponent(AnswerBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnswerBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMQuestion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMQuestion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnswerBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMatchingCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MBackground)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MBackground)
        );

        setBounds(0, 0, 580, 334);
    }// </editor-fold>//GEN-END:initComponents

    public String AnswersMatching(int score,int total) {
        
        // Declaration of variables and array: (Inside the method only)
        int matchingMark = score;
        double mark = ((score * 100)/total);
        String matchAnswer;
        String [] comments = {"You got a perfect score!!","Great job almost a perfect score!!",
        "Not bad.","Good job but there is still space for inprovement.", "You barely passed the self test.",
        "Sorry you failed better luck next time."};
        
        
        // This "If,Than,Else" is for the types of comment that is given based on the user's mark percent:
        if ( mark == 100){
            matchAnswer = (comments[0] + " \n Your 'Match the following' mark is: " + matchingMark + "/" + total);        
        }
        else if (mark >= 90){
            matchAnswer = (comments[1] + " \n Your 'Match the following' mark is: " + matchingMark + "/" + total);        
        }
        else if (mark >= 75){
            matchAnswer = (comments[2] + " \n Your 'Match the following' mark is: " + matchingMark + "/" + total);        
        }
        else if (mark >= 60){
            matchAnswer = (comments[3] + " \n Your 'Match the following' mark is: " + matchingMark + "/" + total);        
        }
        else if (mark >= 50){
            matchAnswer = (comments[4] + " \n Your 'Match the following' mark is: " + matchingMark + "/" + total);        
        }
        else{
            matchAnswer = (comments[5] + " Your 'Match the following' mark is: " + matchingMark + "/" + total);        
        }
        // Return the reply that contains the comment and mark:
        return matchAnswer;
    }
    
    // When the "Calculate Mark" button is pressed:
    private void btnMatchingCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatchingCalculateActionPerformed

       // Declaration of strings: (Inside the method only)
       // Made to store user input:
       String matchAnswer1 = (String) AnswerBox1.getSelectedItem();
       String matchAnswer2 = (String) AnswerBox2.getSelectedItem();
       String matchAnswer3 = (String) AnswerBox3.getSelectedItem();
       String matchAnswer4 = (String) AnswerBox4.getSelectedItem();
       String matchAnswer5 = (String) AnswerBox5.getSelectedItem();
       
       
       // Loop so the user can only enter the marks only once:
       while (buttonClicked < 1) {
           
            // Counter for the number of times the button is clicked:
            buttonClicked =  buttonClicked + 1;
            
            // If the right answer for question 1 is selected:
            if (matchAnswer1.equals("500 Million")){
                
                // Counter for user's mark:
                totalMatchingMarks += 3;
            }
            // If the right answer for question 2 is selected:
            if (matchAnswer2.equals("90%")){

                // Counter for user's mark:
                totalMatchingMarks += 3;
            }
            // If the right answer for question 3 is selected:
            if (matchAnswer3.equals("200 Million")){
                
                // Counter for user's mark:
                totalMatchingMarks += 3;
            }
            // If the right answer for question 4 is selected:
            if (matchAnswer4.equals("79% and 34%")){
                
                // Counter for user's mark:
                totalMatchingMarks += 3;
            }
            // If the right answer for question 5 is selected:
            if (matchAnswer5.equals("65%")){
                
                // Counter for user's mark:
                totalMatchingMarks += 3;
            }
        }
        // Show reply in a message box:
        showMessageDialog(this,AnswersMatching(totalMatchingMarks,15));
       
    }//GEN-LAST:event_btnMatchingCalculateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AnswerBox1;
    private javax.swing.JComboBox<String> AnswerBox2;
    private javax.swing.JComboBox<String> AnswerBox3;
    private javax.swing.JComboBox<String> AnswerBox4;
    private javax.swing.JComboBox<String> AnswerBox5;
    private javax.swing.JDesktopPane MBackground;
    private javax.swing.JButton btnMatchingCalculate;
    private javax.swing.JLabel lblMQuestion1;
    private javax.swing.JLabel lblMQuestion2;
    private javax.swing.JLabel lblMQuestion3;
    private javax.swing.JLabel lblMQuestion4;
    private javax.swing.JLabel lblMQuestion5;
    private javax.swing.JLabel lblMTitle;
    // End of variables declaration//GEN-END:variables
}
