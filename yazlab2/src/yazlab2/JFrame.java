
package yazlab2;

import java.util.Random;



/**
 *
 * @author furkn
 */
public class JFrame extends javax.swing.JFrame {

    public static int satir=0,sutun=0,toplama=0,carpma=0;
    public static int[][] matris = new int[5][5];
    
    
    public JFrame() {
        
        initComponents();
        random_screen.setVisible(false);
        manuel_screen.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainscreen = new javax.swing.JPanel();
        randombutton = new javax.swing.JButton();
        manuelbutton = new javax.swing.JButton();
        row_int = new javax.swing.JTextField();
        column_int = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        manuel_screen = new javax.swing.JPanel();
        m11 = new javax.swing.JTextField();
        m12 = new javax.swing.JTextField();
        m13 = new javax.swing.JTextField();
        m14 = new javax.swing.JTextField();
        m15 = new javax.swing.JTextField();
        m21 = new javax.swing.JTextField();
        m22 = new javax.swing.JTextField();
        m23 = new javax.swing.JTextField();
        m24 = new javax.swing.JTextField();
        m25 = new javax.swing.JTextField();
        m31 = new javax.swing.JTextField();
        m32 = new javax.swing.JTextField();
        m33 = new javax.swing.JTextField();
        m34 = new javax.swing.JTextField();
        m35 = new javax.swing.JTextField();
        m41 = new javax.swing.JTextField();
        m42 = new javax.swing.JTextField();
        m43 = new javax.swing.JTextField();
        m44 = new javax.swing.JTextField();
        m45 = new javax.swing.JTextField();
        m51 = new javax.swing.JTextField();
        m52 = new javax.swing.JTextField();
        m53 = new javax.swing.JTextField();
        m54 = new javax.swing.JTextField();
        m55 = new javax.swing.JTextField();
        manuel_tersini_al = new javax.swing.JButton();
        text_matrix = new javax.swing.JLabel();
        random_screen = new javax.swing.JPanel();
        random_tersini_al1 = new javax.swing.JButton();
        text_matrix6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_matris7 = new javax.swing.JTextArea();
        random_sayi_ver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_matris8 = new javax.swing.JTextArea();
        text_matrix7 = new javax.swing.JLabel();
        text_matrix8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        matrisxtranspoz = new javax.swing.JTextArea();
        transxmatristersi = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        karematristersi = new javax.swing.JTextArea();
        text_matrix9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        matrisxtranspoz_1 = new javax.swing.JTextArea();
        text_matrix10 = new javax.swing.JLabel();
        toplamsayisi = new javax.swing.JLabel();
        carpmasayisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 800));

        mainscreen.setBackground(new java.awt.Color(2, 83, 91));
        mainscreen.setForeground(new java.awt.Color(255, 255, 255));
        mainscreen.setMaximumSize(new java.awt.Dimension(32000, 32767));
        mainscreen.setPreferredSize(new java.awt.Dimension(1100, 800));

        randombutton.setBackground(new java.awt.Color(3, 130, 140));
        randombutton.setFont(new java.awt.Font("sansserif", 2, 16)); // NOI18N
        randombutton.setText("Rastgele");
        randombutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                randombuttonMouseClicked(evt);
            }
        });
        randombutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randombuttonActionPerformed(evt);
            }
        });

        manuelbutton.setBackground(new java.awt.Color(3, 130, 140));
        manuelbutton.setFont(new java.awt.Font("sansserif", 2, 16)); // NOI18N
        manuelbutton.setText("Manuel");
        manuelbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manuelbuttonMouseClicked(evt);
            }
        });
        manuelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuelbuttonActionPerformed(evt);
            }
        });

        row_int.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        row_int.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        column_int.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        column_int.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        column_int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column_intActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 0, 0));
        label1.setText("X");

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(200, 200, 200));
        label2.setText("Satır Sayısı");

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(230, 230, 230));
        label3.setText("Sütun Sayısı");

        javax.swing.GroupLayout mainscreenLayout = new javax.swing.GroupLayout(mainscreen);
        mainscreen.setLayout(mainscreenLayout);
        mainscreenLayout.setHorizontalGroup(
            mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainscreenLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(randombutton, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainscreenLayout.createSequentialGroup()
                        .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row_int)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(column_int, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addComponent(manuelbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        mainscreenLayout.setVerticalGroup(
            mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainscreenLayout.createSequentialGroup()
                .addContainerGap(558, Short.MAX_VALUE)
                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(row_int, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(column_int, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(randombutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manuelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );

        manuel_screen.setBackground(new java.awt.Color(2, 83, 91));
        manuel_screen.setPreferredSize(new java.awt.Dimension(1000, 800));
        manuel_screen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manuel_screenMouseClicked(evt);
            }
        });

        manuel_tersini_al.setBackground(new java.awt.Color(3, 130, 140));
        manuel_tersini_al.setText("Tersini Al");
        manuel_tersini_al.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manuel_tersini_alMouseClicked(evt);
            }
        });
        manuel_tersini_al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuel_tersini_alActionPerformed(evt);
            }
        });

        text_matrix.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        text_matrix.setName(""); // NOI18N
        text_matrix.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                text_matrixComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout manuel_screenLayout = new javax.swing.GroupLayout(manuel_screen);
        manuel_screen.setLayout(manuel_screenLayout);
        manuel_screenLayout.setHorizontalGroup(
            manuel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manuel_screenLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(manuel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_matrix, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manuel_tersini_al, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(manuel_screenLayout.createSequentialGroup()
                        .addComponent(m51, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(m52, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(m53, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(m54, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(m55, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manuel_screenLayout.createSequentialGroup()
                        .addGroup(manuel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(m41, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m31, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(manuel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manuel_screenLayout.createSequentialGroup()
                                .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(manuel_screenLayout.createSequentialGroup()
                                .addComponent(m22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m25, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(manuel_screenLayout.createSequentialGroup()
                                .addComponent(m32, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m33, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m34, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m35, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(manuel_screenLayout.createSequentialGroup()
                                .addComponent(m42, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m43, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m44, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m45, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(629, Short.MAX_VALUE))
        );
        manuel_screenLayout.setVerticalGroup(
            manuel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manuel_screenLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(text_matrix, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(manuel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manuel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manuel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(manuel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manuel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(manuel_tersini_al)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        random_screen.setBackground(new java.awt.Color(2, 83, 91));
        random_screen.setMaximumSize(new java.awt.Dimension(1000, 800));
        random_screen.setPreferredSize(new java.awt.Dimension(1000, 800));

        random_tersini_al1.setBackground(new java.awt.Color(3, 130, 140));
        random_tersini_al1.setText("Tersini Al");
        random_tersini_al1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                random_tersini_al1MouseClicked(evt);
            }
        });
        random_tersini_al1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                random_tersini_al1ActionPerformed(evt);
            }
        });

        text_matrix6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(2, 83, 91));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        text_matris7.setBackground(new java.awt.Color(2, 83, 91));
        text_matris7.setColumns(20);
        text_matris7.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        text_matris7.setRows(5);
        text_matris7.setBorder(null);
        text_matris7.setCaretColor(new java.awt.Color(2, 83, 91));
        jScrollPane1.setViewportView(text_matris7);

        random_sayi_ver.setBackground(new java.awt.Color(3, 130, 140));
        random_sayi_ver.setText("Rastgele sayi ver");
        random_sayi_ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                random_sayi_verMouseClicked(evt);
            }
        });
        random_sayi_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                random_sayi_verActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(2, 83, 91));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        text_matris8.setBackground(new java.awt.Color(2, 83, 91));
        text_matris8.setColumns(20);
        text_matris8.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        text_matris8.setRows(5);
        text_matris8.setBorder(null);
        text_matris8.setCaretColor(new java.awt.Color(2, 83, 91));
        jScrollPane2.setViewportView(text_matris8);

        text_matrix7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        text_matrix8.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        text_matrix8.setForeground(new java.awt.Color(255, 102, 51));

        jScrollPane3.setBackground(new java.awt.Color(2, 83, 91));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        matrisxtranspoz.setBackground(new java.awt.Color(2, 83, 91));
        matrisxtranspoz.setColumns(20);
        matrisxtranspoz.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        matrisxtranspoz.setRows(5);
        matrisxtranspoz.setBorder(null);
        matrisxtranspoz.setCaretColor(new java.awt.Color(2, 83, 91));
        jScrollPane3.setViewportView(matrisxtranspoz);

        transxmatristersi.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        transxmatristersi.setForeground(new java.awt.Color(255, 102, 51));

        jScrollPane4.setBackground(new java.awt.Color(2, 83, 91));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        karematristersi.setBackground(new java.awt.Color(2, 83, 91));
        karematristersi.setColumns(20);
        karematristersi.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        karematristersi.setRows(5);
        karematristersi.setBorder(null);
        karematristersi.setCaretColor(new java.awt.Color(2, 83, 91));
        jScrollPane4.setViewportView(karematristersi);

        text_matrix9.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        text_matrix9.setForeground(new java.awt.Color(255, 0, 51));

        jScrollPane5.setBackground(new java.awt.Color(2, 83, 91));
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        matrisxtranspoz_1.setBackground(new java.awt.Color(2, 83, 91));
        matrisxtranspoz_1.setColumns(20);
        matrisxtranspoz_1.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        matrisxtranspoz_1.setRows(5);
        matrisxtranspoz_1.setBorder(null);
        matrisxtranspoz_1.setCaretColor(new java.awt.Color(2, 83, 91));
        jScrollPane5.setViewportView(matrisxtranspoz_1);

        text_matrix10.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        text_matrix10.setForeground(new java.awt.Color(255, 102, 51));

        toplamsayisi.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        toplamsayisi.setForeground(new java.awt.Color(255, 102, 51));

        carpmasayisi.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        carpmasayisi.setForeground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout random_screenLayout = new javax.swing.GroupLayout(random_screen);
        random_screen.setLayout(random_screenLayout);
        random_screenLayout.setHorizontalGroup(
            random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(random_screenLayout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(text_matrix7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(random_screenLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(random_screenLayout.createSequentialGroup()
                        .addComponent(text_matrix8, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(random_screenLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(text_matrix9, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transxmatristersi, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(text_matrix6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(random_screenLayout.createSequentialGroup()
                        .addComponent(random_sayi_ver)
                        .addGap(59, 59, 59)
                        .addComponent(random_tersini_al1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(random_screenLayout.createSequentialGroup()
                        .addGroup(random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(text_matrix10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toplamsayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carpmasayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        random_screenLayout.setVerticalGroup(
            random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(random_screenLayout.createSequentialGroup()
                .addGroup(random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(random_screenLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(text_matrix6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, random_screenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(text_matrix7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(random_sayi_ver)
                    .addComponent(random_tersini_al1))
                .addGap(18, 18, 18)
                .addGroup(random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_matrix8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transxmatristersi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_matrix9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(text_matrix10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(random_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(random_screenLayout.createSequentialGroup()
                        .addComponent(toplamsayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carpmasayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainscreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(random_screen, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(manuel_screen, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 100, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainscreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(random_screen, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(manuel_screen, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        mainscreen.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randombuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randombuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_randombuttonActionPerformed

    private void manuelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuelbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manuelbuttonActionPerformed

    private void randombuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randombuttonMouseClicked
       
       
        Random rnd = new Random();
        satir = rnd.nextInt(5)+1;
        sutun = rnd.nextInt(5)+1;
        if(satir==sutun){
            if(sutun==1){
                satir=2;
            }else{
                satir=1;
            }
            
        }
        random_screen.setVisible(true);
        mainscreen.setVisible(false);
        
        
        
        text_matrix6.setText("Lütfen " + satir + " X " +"\n" +sutun + " matris girin.");
  
    }//GEN-LAST:event_randombuttonMouseClicked

    private void manuel_tersini_alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuel_tersini_alActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manuel_tersini_alActionPerformed

    private void manuelbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manuelbuttonMouseClicked
        int t=0,a = 0,b = 0;
        
        try { 
         a = Integer.parseInt(row_int.getText());
        } catch(NumberFormatException e) { 
            System.out.println("Lütfen yalnızca sayı giriniz(satır).");
            t=-1;
        }
       
        try { 
         b = Integer.parseInt(column_int.getText());
        } catch(NumberFormatException e) { 
            System.out.println("Lütfen yalnızca sayı giriniz(sütun).");
            t=-1;
        }
        
        if(a<=5 && b<=5 && t!=-1 && a>0 && b>0){
        manuel_screen.setVisible(true);
        mainscreen.setVisible(false);
        text_matrix.setText("Lütfen " + a + " X " + b + " matris girin.");
        satir=a;
        sutun=b;
        }else{
            System.out.println("Değerleri tekrar kontrol edin.5'ten yüksek 0'dan düşük değer girmeyiniz. ");
        }
        
        
        
    }//GEN-LAST:event_manuelbuttonMouseClicked

    private void text_matrixComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_text_matrixComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_text_matrixComponentAdded

    private void manuel_screenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manuel_screenMouseClicked
        //System.out.println(satir + "  " +sutun);
       
    }//GEN-LAST:event_manuel_screenMouseClicked

    private void random_tersini_al1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_random_tersini_al1MouseClicked
       // System.out.println(matris[0][0]);

        tersini_al(matris);
        
        
    }//GEN-LAST:event_random_tersini_al1MouseClicked

    private void random_tersini_al1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_random_tersini_al1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_random_tersini_al1ActionPerformed

    private void random_sayi_verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_random_sayi_verMouseClicked
        
        Random rnd = new Random();
        String sayilarim = "";
        int rand_sayi=0;
        
        for(int i=0; i < satir ; i++){                       
            for(int j=0; j < sutun ; j++){           
                rand_sayi = rnd.nextInt(8)+1;
                sayilarim = sayilarim + rand_sayi + "            ";
                matris[i][j] = rand_sayi;
            }
            sayilarim = sayilarim + "\n";
        }
        System.out.println(sayilarim);
        text_matris7.setText(sayilarim);
        
        
    }//GEN-LAST:event_random_sayi_verMouseClicked

    private void random_sayi_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_random_sayi_verActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_random_sayi_verActionPerformed

    private void column_intActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column_intActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_column_intActionPerformed

    private void manuel_tersini_alMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manuel_tersini_alMouseClicked
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j]=1;
            }
        }
        
        if(!m11.getText().isEmpty()){matris[0][0]=Integer.parseInt(m11.getText());}if(!m12.getText().isEmpty()){matris[0][1]=Integer.parseInt(m12.getText());}if(!m13.getText().isEmpty()){matris[0][2]=Integer.parseInt(m13.getText());}
        if(!m15.getText().isEmpty()){matris[0][4]=Integer.parseInt(m15.getText());}if(!m21.getText().isEmpty()){matris[1][0]=Integer.parseInt(m21.getText());}if(!m22.getText().isEmpty()){matris[1][1]=Integer.parseInt(m22.getText());}
        if(!m23.getText().isEmpty()){matris[1][2]=Integer.parseInt(m23.getText());}if(!m24.getText().isEmpty()){matris[1][3]=Integer.parseInt(m24.getText());}if(!m25.getText().isEmpty()){matris[1][4]=Integer.parseInt(m25.getText());}
        if(!m31.getText().isEmpty()){matris[2][0]=Integer.parseInt(m31.getText());}if(!m32.getText().isEmpty()){matris[2][1]=Integer.parseInt(m32.getText());}if(!m33.getText().isEmpty()){matris[2][2]=Integer.parseInt(m33.getText());}
        if(!m34.getText().isEmpty()){matris[2][3]=Integer.parseInt(m34.getText());}if(!m35.getText().isEmpty()){matris[2][4]=Integer.parseInt(m35.getText());}if(!m41.getText().isEmpty()){matris[3][0]=Integer.parseInt(m41.getText());}
        if(!m42.getText().isEmpty()){matris[3][1]=Integer.parseInt(m42.getText());}if(!m43.getText().isEmpty()){matris[3][2]=Integer.parseInt(m43.getText());}if(!m44.getText().isEmpty()){matris[3][3]=Integer.parseInt(m44.getText());}
        if(!m45.getText().isEmpty()){matris[3][4]=Integer.parseInt(m45.getText());}if(!m51.getText().isEmpty()){matris[4][0]=Integer.parseInt(m51.getText());}if(!m52.getText().isEmpty()){matris[4][1]=Integer.parseInt(m52.getText());}
        if(!m53.getText().isEmpty()){matris[4][2]=Integer.parseInt(m53.getText());}if(!m54.getText().isEmpty()){matris[4][3]=Integer.parseInt(m54.getText());}if(!m55.getText().isEmpty()){matris[4][4]=Integer.parseInt(m55.getText());}
        if(!m14.getText().isEmpty()){matris[0][3]=Integer.parseInt(m14.getText());}
        
     
        
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if(matris[i][j]==0){
                    matris[i][j]=1;
                }else if(matris[i][j] != (int)matris[i][j]){
                    matris[i][j]=1;
                }
            }
        }
        String sayilarim = "";
        for(int i=0; i < satir ; i++){                       
            for(int j=0; j < sutun ; j++){             
                sayilarim = sayilarim + matris[i][j] + "            ";   
            }
            sayilarim = sayilarim + "\n";
        }
        System.out.println("");
        System.out.println(sayilarim);
        text_matris7.setText(sayilarim);
        
        text_matrix6.setText("Girmiş olduğunuz matris.( A )");
        
        random_screen.setVisible(true);
        mainscreen.setVisible(false);
        manuel_screen.setVisible(false);
        
    }//GEN-LAST:event_manuel_tersini_alMouseClicked

    
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel carpmasayisi;
    private javax.swing.JTextField column_int;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTextArea karematristersi;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JTextField m11;
    private javax.swing.JTextField m12;
    private javax.swing.JTextField m13;
    private javax.swing.JTextField m14;
    private javax.swing.JTextField m15;
    private javax.swing.JTextField m21;
    private javax.swing.JTextField m22;
    private javax.swing.JTextField m23;
    private javax.swing.JTextField m24;
    private javax.swing.JTextField m25;
    private javax.swing.JTextField m31;
    private javax.swing.JTextField m32;
    private javax.swing.JTextField m33;
    private javax.swing.JTextField m34;
    private javax.swing.JTextField m35;
    private javax.swing.JTextField m41;
    private javax.swing.JTextField m42;
    private javax.swing.JTextField m43;
    private javax.swing.JTextField m44;
    private javax.swing.JTextField m45;
    private javax.swing.JTextField m51;
    private javax.swing.JTextField m52;
    private javax.swing.JTextField m53;
    private javax.swing.JTextField m54;
    private javax.swing.JTextField m55;
    private javax.swing.JPanel mainscreen;
    private javax.swing.JPanel manuel_screen;
    private javax.swing.JButton manuel_tersini_al;
    private javax.swing.JButton manuelbutton;
    public static javax.swing.JTextArea matrisxtranspoz;
    public static javax.swing.JTextArea matrisxtranspoz_1;
    public static javax.swing.JButton random_sayi_ver;
    public static javax.swing.JPanel random_screen;
    public static javax.swing.JButton random_tersini_al1;
    private javax.swing.JButton randombutton;
    private javax.swing.JTextField row_int;
    public static javax.swing.JTextArea text_matris7;
    public static javax.swing.JTextArea text_matris8;
    private javax.swing.JLabel text_matrix;
    public static javax.swing.JLabel text_matrix10;
    public static javax.swing.JLabel text_matrix6;
    public static javax.swing.JLabel text_matrix7;
    public static javax.swing.JLabel text_matrix8;
    public static javax.swing.JLabel text_matrix9;
    public static javax.swing.JLabel toplamsayisi;
    public static javax.swing.JLabel transxmatristersi;
    // End of variables declaration//GEN-END:variables

    //-------------------------------------------------------------------------------

    private void tersini_al(int[][] matris) {
        int[][] transpoz_matris = new int[5][5];
        int[][] carpim_matris = new int[5][5];
        double[][] ters_matris = new double[5][5];
        
        if(satir<=sutun){
            
        transpoz_matris = transpoz_al(matris);

        text_matrix8.setText("Matris ile transpozunun çarpımı ( A * A' )");
        carpim_matris = matris_carp(matris,transpoz_matris);
        
        text_matrix9.setText("Yandaki kare matrisin tersi. ( A * A')^-1 ");
        ters_matris = tersini_al_kare(carpim_matris,satir,sutun);
        
        text_matrix10.setText("Matrisimizin transpozu ile bulduğumuz ters matrisi çarpıyoruz.( A' * ( A * A' )^-1 )");
        matris_carpd(ters_matris, transpoz_matris,satir,sutun);
        
        }else if(satir>sutun){
        
            transpoz_matris = transpoz_al(matris);
            
            text_matrix8.setText("Transpoz ile matrisin çarpımı ( A' * A )");
            carpim_matris = matris_carp(transpoz_matris,matris);
            
            text_matrix9.setText("Yandaki kare matrisin tersi. ( A' * A)^-1 ");
            ters_matris = tersini_al_kare(carpim_matris,sutun,satir);
            
            int tmp;
            tmp = satir;
            satir=sutun;
            sutun=tmp;
            
            text_matrix10.setText("Bulduğumuz ters matris ile matrisin transpozunu çarpıyoruz.( ( A * A' )^-1 * A' )");
            matris_carpd(ters_matris, transpoz_matris,sutun,satir);

        }
        
        carpmasayisi.setText("Yapılan çarpma işlemi sayısı: " + carpma);    
        toplamsayisi.setText("Yapılan toplama işlemi sayısı: " + toplama);
    }
    
        private double[][] tersini_al_kare(int[][] kare_matris,int a,int b){
            satir = a;
            sutun = b;
            
            double[][] karematris = new double[satir][satir];
            double[][] birim_matris = new double[satir][satir];
            for (int i = 0; i < satir ; i++) {
                for (int j = 0; j < satir; j++) {
                    karematris[i][j]=kare_matris[i][j];   
                    toplama++;
                }              
            }
            
            
        //birim matris oluşturuyoruz.
        for (int i = 0; i < satir ; i++) {
                for (int j = 0; j < satir; j++) {
                       if(i==j){
                           toplama++;    
                           birim_matris[i][j]=1;
                       } else {
                           toplama++;
                           birim_matris[i][j]=0;
                       }                
                }              
            }
        
        double d,k;
            for (int i = 0; i < satir; i++) {
                d=karematris[i][i];
                for (int j = 0; j < satir; j++) {
                karematris[i][j]=karematris[i][j]/d;    
                birim_matris[i][j]=birim_matris[i][j]/d;
                toplama++;
                carpma=carpma+2;
                }
                for (int f = 0; f < satir; f++) {
                    if(f!=i){
                        k=karematris[f][i];
                        for (int j = 0; j < satir ; j++) {
                            karematris[f][j]=karematris[f][j]-(karematris[i][j]*k);
                            birim_matris[f][j]=birim_matris[f][j]-(birim_matris[i][j]*k);
                            toplama=toplama+3;
                            carpma = carpma+2;
                        }
                    }
                }
            }
            System.out.println("");
            System.out.println("matrisin tersi");
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < satir; j++) {
                    System.out.print(birim_matris[i][j]+"   ");
                    toplama++;
                }
                System.out.println("");
            }
            
            
            
            String sayilarim = "";
            for(int i=0; i < satir ; i++){                       
            for(int j=0; j < satir ; j++){                 
                sayilarim = sayilarim + Math.round(birim_matris[i][j]*10000.0)/10000.0 + "            ";
                toplama++;
            }
            sayilarim = sayilarim + "\n";
        }
            if(Double.isNaN(birim_matris[0][0]) || Double.isInfinite(birim_matris[0][0]) )
            {
            karematristersi.setText("Matrisin tersi alınamaz.");
            System.out.println("matris hatalı");
            }else {
            karematristersi.setText(sayilarim);
            
            }   
            
            return birim_matris;
        }
        
        private int[][] matris_carp(int[][] matris,int[][] transpoz_matris){
           
        int[][] carpim_matris = new int [5][5];
        
        if(satir<=sutun){
            System.out.println("\n sutun>satir");
        for (int i = 0; i < satir; i++) {
   
            for(int j = 0; j < satir; j++) {
          
                for(int k = 0; k < sutun; k++) {
                     carpim_matris[i][j] += matris[i][k] * transpoz_matris[k][j];
                     toplama = toplama+2;
                     carpma++;
                }
            }
          }
       } else if(satir>sutun){
            System.out.println("\n satir>sutun");
            for (int i = 0; i < sutun; i++) {
   
                for(int j = 0; j < sutun; j++) {
          
                    for(int k = 0; k < satir; k++) {
                        carpim_matris[i][j] += matris[i][k] * transpoz_matris[k][j];
                        toplama=toplama+2;
                        carpma = carpma+1;
                        
                    }
                }
            }
            
        }
        
        String sayilarim = "";
        if(satir<=sutun){
        
        for(int i=0; i < satir ; i++){                       
            for(int j=0; j < satir ; j++){           
                sayilarim = sayilarim + carpim_matris[i][j] + "            ";
                toplama++;
            }
            sayilarim = sayilarim + "\n";
        }
        }
        else{
            
        for(int i=0; i < sutun ; i++){                       
            for(int j=0; j < sutun ; j++){           
                sayilarim = sayilarim + carpim_matris[i][j] + "            ";
                toplama = toplama+2;
                }
            sayilarim = sayilarim + "\n";
            }
        }
        matrisxtranspoz.setText(sayilarim);
         
        return carpim_matris;
         
        }
    
        private void matris_carpd(double[][] matris,int[][] matris2,int a,int b){
            
            double[][] sonuc = new double[5][5];
            String sayilarim = "";
            
            System.out.println(satir + "   " + sutun);
             if(satir<sutun){
            for (int i = 0; i < sutun ; i++) {
                for (int k = 0; k < satir; k++) {
                    for (int j = 0; j < satir; j++) {
                        sonuc[i][k]+=matris2[i][j]*matris[j][k];
                        toplama = toplama +2;
                        carpma = carpma+1 ;
                    }
                }
            }
            
            for(int i=0; i < sutun ; i++){                       
                for(int j=0; j < satir ; j++){           
                    sayilarim = sayilarim + Math.round(sonuc[i][j]*10000.0)/10000.0 + "            ";
                    toplama = toplama +3 ; 
                    carpma = carpma + 2 ;
                }
                    sayilarim = sayilarim + "\n";
                 }
            }else {
                 
                 
                 
              for (int i = 0; i < sutun ; i++) {
                for (int k = 0; k < satir; k++) {
                    for (int j = 0; j < sutun; j++) {
                        sonuc[i][k]+=matris[i][j]*matris2[j][k];
                        toplama = toplama +2 ;  
                        carpma = carpma + 1 ;
                        }
                    }
                }
              for(int i=0; i < sutun ; i++){                       
                for(int j=0; j < satir ; j++){           
                
                    sayilarim = sayilarim + Math.round(sonuc[i][j]*10000.0)/10000.0 + "            ";
                    toplama = toplama +2 ;
                    carpma = carpma + 2 ;
                }
                    sayilarim = sayilarim + "\n";
                 }
            }
            
        
            
            matrisxtranspoz_1.setText(sayilarim);
        }
   
    private int[][] transpoz_al(int[][] matris){
        int[][] transpoz_matris = new int[5][5];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun ; j++) {
               transpoz_matris[j][i]=matris[i][j];   
               toplama = toplama + 1;
            }   
        }
        
        text_matrix7.setText("Matrisin transpozu( A' );"); 
        
        String sayilarim = "";
        for(int i=0; i < sutun ; i++){                       
            for(int j=0; j < satir ; j++){           
                
                sayilarim = sayilarim + transpoz_matris[i][j] + "            ";
                toplama = toplama + 3 ;
            }
            sayilarim = sayilarim + "\n";
        }
        
        
        text_matris8.setText(sayilarim);
        
        return transpoz_matris;
    }
}
