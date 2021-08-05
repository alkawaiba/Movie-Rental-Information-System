
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * @author Bimsara Shrestha
 * @author Alka Lama
 * @author Imon Shrestha
 * @author Asmit Basnet
 */


public class CW_GUI1 extends javax.swing.JFrame {

    public CW_GUI1() {
        initComponents();
        vispanel.setVisible(false);
    }
    
    ArrayList<String[]> SearchArray = new ArrayList<>();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Studio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        Genre = new javax.swing.JComboBox<>();
        txt2 = new javax.swing.JTextField();
        TitleBox = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        vispanel = new javax.swing.JPanel();
        uncens = new javax.swing.JRadioButton();
        cens = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Deletebtn = new javax.swing.JButton();
        Savebtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Updatebtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Search1 = new javax.swing.JTextField();
        Searchbtn1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        Search2 = new javax.swing.JTextField();
        Searchbtn2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        Search3 = new javax.swing.JTextField();
        Searchbtn3 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        ImportRecords = new javax.swing.JMenuItem();
        ExpRecords = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        HelpFile = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Rental IS");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(160, 75));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(61, 79, 95));

        MainTable.setAutoCreateRowSorter(true);
        MainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie ID", "Movie Name", "Genre", "Studio", "Director", "Release Date", "Booked Date", "Return In", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MainTable);

        jPanel1.setBackground(new java.awt.Color(238, 169, 144));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Booked Date:*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Movie ID:*");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Return in (days):*");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Movie Name:*");

        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Director:*");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Studio:*");

        Studio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Production Studio--", "20th Century", "Disney", "Dreamworks", "Legendary", "Marvel", "Metro Gold", "New Line Cinema", "Paramount", "Pixar", "Sony Picture", "Universal", "Warner Bros", "-Others-" }));
        Studio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Release Date:*");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Movie Genre:*");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Cost:");

        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt1KeyPressed(evt);
            }
        });

        txt7.setEditable(false);

        Addbtn.setText("Add to Table");
        Addbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        Clearbtn.setText("Clear");
        Clearbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });

        Genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select genre--", "Action", "Adventure", "Animation", "Biography", "Comedy", "Crime", "Drama", "Fantasy", "Fiction", "Horror", "Melodrama", "Musical", "Mystery", "Romance", "R-rated", "Sci-fi", "Superhero", "Supernatural", "Thriller", "-Others-" }));
        Genre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreActionPerformed(evt);
            }
        });

        TitleBox.setBackground(new java.awt.Color(59, 126, 242));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reel_1_60x52.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setText("Movie Rental IS");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout TitleBoxLayout = new javax.swing.GroupLayout(TitleBox);
        TitleBox.setLayout(TitleBoxLayout);
        TitleBoxLayout.setHorizontalGroup(
            TitleBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleBoxLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        TitleBoxLayout.setVerticalGroup(
            TitleBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TitleBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        vispanel.setBackground(new java.awt.Color(239, 169, 144));
        vispanel.setPreferredSize(new java.awt.Dimension(197, 32));

        btngroup1.add(uncens);
        uncens.setText("Uncensored");

        btngroup1.add(cens);
        cens.setText("Censored");

        javax.swing.GroupLayout vispanelLayout = new javax.swing.GroupLayout(vispanel);
        vispanel.setLayout(vispanelLayout);
        vispanelLayout.setHorizontalGroup(
            vispanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vispanelLayout.createSequentialGroup()
                .addGroup(vispanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cens, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uncens, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        vispanelLayout.setVerticalGroup(
            vispanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vispanelLayout.createSequentialGroup()
                .addComponent(cens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uncens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel12.setText("Please import the pre-exiting records first to avoid dupilcate entry.(Ctrl+I)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(29, 29, 29)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Studio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt3)
                                                .addGap(10, 10, 10)))
                                        .addComponent(vispanel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8))
                                            .addComponent(txt5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(txt4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(Addbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Clearbtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TitleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Studio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vispanel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addbtn)
                    .addComponent(Clearbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(246, 224, 181));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setText("Modify Records");

        Deletebtn.setText("Delete");
        Deletebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        Savebtn.setText("Save");
        Savebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
            }
        });

        jLabel16.setText("From the above records, select the record you want to");

        jLabel17.setText("From the above records, select the record you want to");

        Updatebtn.setText("Update");
        Updatebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });

        jLabel18.setText("If you are done modifying the records, don't forget to");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deletebtn)
                    .addComponent(jLabel16))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Updatebtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(Savebtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(174, 154, 158));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setText("Search Records");

        jLabel14.setText("Search using Movie ID:");

        Search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search1KeyReleased(evt);
            }
        });

        Searchbtn1.setText("Search");
        Searchbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searchbtn1ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel19.setText("Search using Movie Name:");

        Search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search2KeyReleased(evt);
            }
        });

        Searchbtn2.setText("Search");
        Searchbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searchbtn2ActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel20.setText("Search using Director:");

        Search3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search3KeyReleased(evt);
            }
        });

        Searchbtn3.setText("Search");
        Searchbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searchbtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Search3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Searchbtn3))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(Searchbtn1))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Searchbtn2))))))
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchbtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchbtn2)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(Search3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchbtn3))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu2.setText("File");

        ImportRecords.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ImportRecords.setText("Import Records");
        ImportRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportRecordsActionPerformed(evt);
            }
        });
        jMenu2.add(ImportRecords);

        ExpRecords.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ExpRecords.setText("Export Records");
        ExpRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpRecordsActionPerformed(evt);
            }
        });
        jMenu2.add(ExpRecords);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu2.add(Exit);

        jMenuBar2.add(jMenu2);

        jMenu4.setText("Help");

        HelpFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        HelpFile.setText("Load User Manual");
        HelpFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpFileActionPerformed(evt);
            }
        });
        jMenu4.add(HelpFile);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void GenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreActionPerformed
        String cen = (String)Genre.getSelectedItem();
        if (cen.equals("Horror") || cen.equals("R-rated"))
        {
            vispanel.setVisible(true);
            cens.setSelected(true);
        }
        else
        {
            vispanel.setVisible(false);
        }
    }//GEN-LAST:event_GenreActionPerformed

    
    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        clear();
    }//GEN-LAST:event_ClearbtnActionPerformed

    
    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        checkdata();
    }//GEN-LAST:event_AddbtnActionPerformed

    
    private void txt6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyReleased
        try
        {
            String day = txt6.getText();
            int days = Integer.parseInt(day);
            int cost = 20 + (days*20);
            String Tcost = "" + cost;
            txt7.setText(Tcost);
        }
        catch(NumberFormatException e)
        {}
    }//GEN-LAST:event_txt6KeyReleased

    
    private void ImportRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportRecordsActionPerformed
        if (!isCSVImported)
        {
            String line;
            String fileLocation = getFileLocation();
            System.out.println(fileLocation);
            try 
            {

                BufferedReader br = new BufferedReader(new FileReader(fileLocation));
                while ((line = br.readLine())!= null)
                {
                    System.out.println(line);
                    String [] data = line.split(",");
                    SearchArray.add(data);
                    isCSVImported = true;
                       
                    populatetable(data);
                }
            } 
            catch (FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(null,e + "","Alert",JOptionPane.WARNING_MESSAGE);
            }
            catch (IOException e)
            {
                 JOptionPane.showMessageDialog(null,e + "","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"The CSV File has already been imported.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ImportRecordsActionPerformed

    
    private void ExpRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpRecordsActionPerformed
        try
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Exporting these rows will overwrite the existing records. Do you want to proceed?",
            "Confirm?",dialogButton);
            
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                FileWriter tableWriter = new FileWriter("src/Records.csv", false);
                int rows = MainTable.getRowCount();
                for (int i = 0; i < rows; i++)
                {
                    tableWriter.append(MainTable.getValueAt(i, 0).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 1).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 2).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 3).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 4).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 5).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 6).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 7).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 8).toString());
                    tableWriter.append("\n");
                    tableWriter.flush();
                }
                JOptionPane.showMessageDialog(this, "The records have been saved", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        catch (IOException e)
        {}
    }//GEN-LAST:event_ExpRecordsActionPerformed

    
    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        if(MainTable.getSelectedRow() != -1) 
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to remove this row?","Confirm?",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                int del = MainTable.getSelectedRow();
                ((DefaultTableModel)MainTable.getModel()).removeRow(del);
                JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a row to be deleted.");
        }
    }//GEN-LAST:event_DeletebtnActionPerformed

    
    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        SaveRow();
    }//GEN-LAST:event_SavebtnActionPerformed

    
    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) MainTable.getModel();
        
        String MovieID = model.getValueAt(MainTable.getSelectedRow(),0).toString();
        String MovieName = model.getValueAt(MainTable.getSelectedRow(),1).toString();
        String Director = model.getValueAt(MainTable.getSelectedRow(),4).toString();
        String ReleaseDate = model.getValueAt(MainTable.getSelectedRow(),5).toString();
        String BookedDate = model.getValueAt(MainTable.getSelectedRow(),6).toString();
            
        txt1.setText(MovieID);
        txt2.setText(MovieName);
        txt3.setText(Director);
        txt4.setText(ReleaseDate);
        txt5.setText(BookedDate);
        
        int del = MainTable.getSelectedRow();
        ((DefaultTableModel)MainTable.getModel()).removeRow(del);
              
    }//GEN-LAST:event_UpdatebtnActionPerformed

    
    private void Search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search1KeyReleased
        String sear1 = Search1.getText();
        
        if (sear1 != null)
        {
            Search2.setVisible(false);
            Searchbtn2.setVisible(false);
            Search3.setVisible(false);
            Searchbtn3.setVisible(false);
        }
            
        if (sear1.equals(""))
        {
            Search2.setVisible(true);
            Searchbtn2.setVisible(true);
            Search3.setVisible(true);
            Searchbtn3.setVisible(true);
        }
    }//GEN-LAST:event_Search1KeyReleased

    
    private void Search2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search2KeyReleased
        String sear2 = Search2.getText();
        
        if (sear2 != null)
        {
            Search1.setVisible(false);
            Searchbtn1.setVisible(false);
            Search3.setVisible(false);
            Searchbtn3.setVisible(false);
        }
            
        if (sear2.equals(""))
        {
            Search1.setVisible(true);
            Searchbtn1.setVisible(true);
            Search3.setVisible(true);
            Searchbtn3.setVisible(true);
        }
    }//GEN-LAST:event_Search2KeyReleased

    
    private void Search3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search3KeyReleased
        String sear3 = Search3.getText();
        
        if (sear3 != null)
        {
            Search1.setVisible(false);
            Searchbtn1.setVisible(false);
            Search2.setVisible(false);
            Searchbtn2.setVisible(false);
        }
            
        if (sear3.equals(""))
        {
            Search1.setVisible(true);
            Searchbtn1.setVisible(true);
            Search2.setVisible(true);
            Searchbtn2.setVisible(true);
        }
    }//GEN-LAST:event_Search3KeyReleased

    
    private void Searchbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searchbtn1ActionPerformed
        if(Search1.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(null, "Please enter the search text first.");
        }
        else
        {
            for(int i = 0; i < SearchArray.size(); i++)
            {
                int info = Integer.parseInt(SearchArray.get(i)[0]);
                int infoIndex = i;
                for(int j = i+1; j < SearchArray.size(); j++)
                {
                    int check = Integer.parseInt(SearchArray.get(j)[0]);
                    if(check < info) 
                    {
                        info = check;
                        infoIndex = j;
                    }
                }
                String[] temp = SearchArray.get(i);
                SearchArray.set(i,SearchArray.get(infoIndex)); 
                SearchArray.set(infoIndex,temp);        
            }
            
            int key = Integer.parseInt(Search1.getText());
            int low = 0;
            int high = SearchArray.size()-1;
            int mid = 0;
            boolean found = false;
            while (low <= high) 
            {
                mid = (high+low)/2;
                int val = Integer.parseInt(SearchArray.get(mid)[0]);
                if (key == val)
                {
                    found = true;
                    break;
                }
                else if(key < val)
                    high = mid-1;
                else
                    low = mid+1;
            }

            if (found)
            {
                JOptionPane.showMessageDialog(null,
                "Movie ID: " + SearchArray.get(mid)[0] + 
                "\nMovie Name: " + SearchArray.get(mid)[1] +
                "\nStudio: " + SearchArray.get(mid)[2] + 
                "\nMovie Genre: " + SearchArray.get(mid)[3] + 
                "\nDirector: "+SearchArray.get(mid)[4] +
                "\nRelease Date: " + SearchArray.get(mid)[5] + 
                "\nBooked Date: " + SearchArray.get(mid)[6] + 
                "\nReturn In: " + SearchArray.get(mid)[7] + 
                "\nCost: " + SearchArray.get(mid)[8],
                "Search Result", JOptionPane.INFORMATION_MESSAGE
                );
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry! Record with Movie ID " + key +" doesn't exist.");
            }
        }
        Search1.setText("");
    }//GEN-LAST:event_Searchbtn1ActionPerformed

    
    private void Searchbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searchbtn2ActionPerformed
        String searchtxt2 = Search2.getText();
        
        if(searchtxt2.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter the search text first.");
        }
        else
        {
            for (int i=0; i < SearchArray.size(); i++)
            {
                String s = MainTable.getValueAt(i,1).toString();
                if (searchtxt2.equals(s))
                {            
                    String a = MainTable.getValueAt(i,0).toString();
                    String b = MainTable.getValueAt(i,2).toString();
                    String c = MainTable.getValueAt(i,3).toString();
                    String d = MainTable.getValueAt(i,4).toString();
                    String e = MainTable.getValueAt(i,5).toString();
                    String f = MainTable.getValueAt(i,7).toString();
                    String g = MainTable.getValueAt(i,8).toString();

                    JOptionPane.showMessageDialog(null, "The information of the movie " + searchtxt2 + " is shown below:" +
                    "\nMovie ID: " + a +
                    "\nMovie Studio: " + b +
                    "\nMovie Genre: " + c +
                    "\nDirector: " + d +
                    "\nRelease Date: " + e +
                    "\nReturn In: " + f +
                    "\nCost: " + g,
                    "Search Result", JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
                }
            }
        }
        Search2.setText("");
    }//GEN-LAST:event_Searchbtn2ActionPerformed

    
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    
    private void Searchbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searchbtn3ActionPerformed
        String searchtxt3 = Search3.getText();
        
        if(searchtxt3.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter the search text first.");
        }
        else
        {
            for (int i=0; i < SearchArray.size(); i++)
            {
                String s = MainTable.getValueAt(i,4).toString();
                if (searchtxt3.equals(s))
                {            
                    String a = MainTable.getValueAt(i,0).toString();
                    String aa = MainTable.getValueAt(i,1).toString();
                    String b = MainTable.getValueAt(i,2).toString();
                    String c = MainTable.getValueAt(i,3).toString();
                    String e = MainTable.getValueAt(i,5).toString();
                    String f = MainTable.getValueAt(i,7).toString();
                    String g = MainTable.getValueAt(i,8).toString();

                    JOptionPane.showMessageDialog(null, "The information of the movie directed by " + searchtxt3 + " is shown below:" +
                    "\nMovie ID: " + a +
                    "\nMovie Name: " + aa +
                    "\nMovie Studio: " + b +
                    "\nMovie Genre: " + c +
                    "\nRelease Date: " + e +
                    "\nReturn In: " + f +
                    "\nCost: " + g,
                    "Search Result", JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
                }
            }
        }
        Search3.setText("");
    }//GEN-LAST:event_Searchbtn3ActionPerformed

    
    private void HelpFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpFileActionPerformed
        File manual = new File("src/UserManual.pdf");
        try
        {
            Desktop.getDesktop().open(manual);
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Sorry. The user manual could not be located.");
        }
        
    }//GEN-LAST:event_HelpFileActionPerformed

    
    private void txt6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyPressed
        char key = evt.getKeyChar();
        if(Character.isDigit(key) || evt.getKeyCode() == 8)
        {
           txt6.setEditable(true);
        }
        else
        {
           txt6.setEditable(false);
        }
    }//GEN-LAST:event_txt6KeyPressed

    
    private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
        char key = evt.getKeyChar();
        if(Character.isDigit(key) || evt.getKeyCode() == 8)
        {
           txt1.setEditable(true);
        }
        else
        {
           txt1.setEditable(false);
        }
    }//GEN-LAST:event_txt1KeyPressed
 
    
    public static void main(String args[])
    {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CW_GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CW_GUI1().setVisible(true);
        });        
    }
    
    
    public void SaveRow()
    {
        try
        {
            {
                FileWriter tableWriter = new FileWriter("src/Records.csv", false);
                int rows = MainTable.getRowCount();
                for (int i = 0; i < rows; i++)
                {
                    tableWriter.append(MainTable.getValueAt(i, 0).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 1).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 2).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 3).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 4).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 5).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 6).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 7).toString() + ",");
                    tableWriter.append(MainTable.getValueAt(i, 8).toString());
                    tableWriter.append("\n");
                    tableWriter.flush();
                }
                JOptionPane.showMessageDialog(null, "The records have been saved", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        catch (IOException | NullPointerException e)
        {}
    }
    
    
    public void Importfile()
    {
        
    }
    
    public void checkdata()
    {
        try
        {
            String data1 = txt1.getText();
            String data2 = txt2.getText();
            String data3 = (String)Genre.getSelectedItem();
                if (data3.equals("--Select genre--"))
                    data3 = "";

                try
                {
                    if (data3.equals("Horror") || data3.equals("R-rated"))
                    {
                        cens.setActionCommand("(Censored)");
                        uncens.setActionCommand("(Uncensored)");

                        String sts = btngroup1.getSelection().getActionCommand();
                        data3 = data3 + sts;
                    }
                }
                catch (Exception e)
                {}

            String data4 = (String)Studio.getSelectedItem();
                if (data4.equals("--Select Production Studio--"))
                    data4 = "";

            String data5 = txt3.getText();
            String data6 = txt4.getText();
            String data7 = txt5.getText();
            String data8 = txt6.getText() + " days";
            String data9 = "Rs. " + txt7.getText();

            Object[] row = {data1, data2, data3, data4, data5, data6, data7, data8, data9};
            if (data1.equals("") || data2.equals("") || data3.equals("") || data4.equals("") || data5.equals("") || 
                data6.equals("") || data7.equals("") || data8.equals(""))
            {
                JOptionPane.showMessageDialog (null, "Please fill all the required input fields.(marked by *)");
            }
            else
            {
                populatetable(row);
            }
        }
        catch (HeadlessException e)
        {}
    }
    
    
    public void populatetable(Object[] row)
    {
        String check;
        boolean exists = false;
        for (int i = 0; i < MainTable.getRowCount(); i++)
        {
            check = MainTable.getValueAt(i, 0).toString().trim();
            if (txt1.getText().equals(check))
            {
                exists = true;
                break;
            }
        }
        
        if (!exists)
        {
            DefaultTableModel model = (DefaultTableModel) MainTable.getModel();
            model.addRow(row);
            clear();
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "A row with same ID already exists. Please recheck the information.");
        }        
    }
    
    
    public void clear ()
    {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
        Studio.setSelectedIndex(0);
        Genre.setSelectedIndex(0);
        btngroup1.clearSelection();
    }
    
    
    private static String getFileLocation()
    {
        String fileLocation=System.getProperty("user.dir") + ("\\src\\Records.csv");
        return fileLocation;
    }

    
    private static boolean isCSVImported = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem ExpRecords;
    private javax.swing.JComboBox<String> Genre;
    private javax.swing.JMenuItem HelpFile;
    private javax.swing.JMenuItem ImportRecords;
    private javax.swing.JTable MainTable;
    private javax.swing.JButton Savebtn;
    private javax.swing.JTextField Search1;
    private javax.swing.JTextField Search2;
    private javax.swing.JTextField Search3;
    private javax.swing.JButton Searchbtn1;
    private javax.swing.JButton Searchbtn2;
    private javax.swing.JButton Searchbtn3;
    private javax.swing.JComboBox<String> Studio;
    private javax.swing.JPanel TitleBox;
    private javax.swing.JButton Updatebtn;
    private javax.swing.ButtonGroup btngroup1;
    private javax.swing.JRadioButton cens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JRadioButton uncens;
    private javax.swing.JPanel vispanel;
    // End of variables declaration//GEN-END:variables
}