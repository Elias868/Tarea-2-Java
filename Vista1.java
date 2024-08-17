/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formulario;

import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Usuario
 */
public class Vista1 extends javax.swing.JFrame {

    /**
     * Creates new form Vista1
     */
    public Vista1() {
        initComponents();
        this.setTitle("PROGRAMACION ll");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 480, 90));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Procesar");
        jButton1.setAutoscrolls(true);
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 134, 41));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 340, 60));

        jLabel2.setText("Longitud del texto ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 122, -1));

        jLabel4.setText("Total de Palabras");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel6.setText("Primer letra del texto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel8.setText("Última letra del texto");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel10.setText("Letra central del texto");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel12.setText("Primera palabra");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel13.setText("Palabra central");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel14.setText("Última palabra");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jLabel3.setText("Repeticiones de \"A\", \"a\" ó \"á\"");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        jLabel5.setText("Repeticiones de \"E\", \"e\" ó \"é\"");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 180, -1));

        jLabel7.setText("Repeticiones de \"I\", \"i\" ó \"í\"");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 180, -1));

        jLabel9.setText("Repeticiones de \"O\", \"o\" ó \"ó\"");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 180, -1));

        jLabel11.setText("Repeticiones de \"U\", \"u\" ó \"ú\"");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 180, -1));

        jLabel15.setText("Palabra con cantidad de caracteres par");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 220, -1));

        jLabel16.setText("Palabra con cantidad de caracteres impar");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jTextField2.setBackground(new java.awt.Color(242, 242, 242));
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 62, -1));

        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 62, -1));

        jTextField4.setEnabled(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 62, -1));

        jTextField5.setEnabled(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 62, -1));

        jTextField6.setEnabled(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 62, -1));

        jTextField7.setEnabled(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 62, -1));

        jTextField8.setEnabled(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 62, -1));

        jTextField9.setEnabled(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 62, -1));

        jTextField10.setEnabled(false);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 109, -1));

        jTextField11.setEnabled(false);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 109, -1));

        jTextField12.setEnabled(false);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 109, -1));

        jTextField13.setEnabled(false);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 109, -1));

        jTextField14.setEnabled(false);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 109, -1));

        jTextField15.setEnabled(false);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 150, -1));

        jTextField16.setEnabled(false);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 150, -1));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel18.setText("Manejo de cadenas ");
        jLabel18.setToolTipText("");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("Traducción a Clave Murcielago");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setText("Archivo");

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Abrir");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Guardar");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Guardar como");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jCheckBoxMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Copiar");
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("Cortar");
        jCheckBoxMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem5);

        jCheckBoxMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("Pegar");
        jCheckBoxMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem6);

        jCheckBoxMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("Buscar");
        jCheckBoxMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem7);

        jCheckBoxMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem8.setSelected(true);
        jCheckBoxMenuItem8.setText("Reemplazar");
        jCheckBoxMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private String murcielagoEncode(String text) {
        String encodedText = "";
        for (char c : text.toCharArray()) {
            switch (Character.toLowerCase(c)) {
                case 'm':
                    encodedText += "0";
                    break;
                case 'u':
                    encodedText += "1";
                    break;
                case 'r':
                    encodedText += "2";
                    break;
                case 'c':
                    encodedText += "3";
                    break;
                case 'i':
                    encodedText += "4";
                    break;
                case 'e':
                    encodedText += "5";
                    break;
                case 'l':
                    encodedText += "6";
                    break;
                case 'a':
                    encodedText += "7";
                    break;
                case 'g':
                    encodedText += "8";
                    break;
                case 'o':
                    encodedText += "9";
                    break;
                default:
                    encodedText += c;
            }
        }
        return encodedText;
    }
    
    
    public void LogitudTexto(){ 
    int longitud = jTextArea1.getText().length();
        jTextField2.setText(Integer.toString(longitud));
    }
    
    public void TotalPalabras(){
        
            String palabras = jTextArea1.getText().trim(); // Obtener el texto del JTextArea y eliminar espacios en blanco al principio y al final
                String[] words = palabras.split("\\s+"); // Dividir el texto en palabras utilizando expresión regular

                int wordCount = words.length;

                // Si el texto está vacío, el split generará un arreglo con una cadena vacía, por lo que restamos uno en ese caso
                if (wordCount > 0 && words[0].isEmpty()) {
                    wordCount--;
                }
                
        jTextField3.setText(Integer.toString(wordCount));
        
    }
    
    public void PrimerLetra(){
        
        String text = jTextArea1.getText().trim();
        char firstLetter = text.charAt(0);
        jTextField4.setText(Character.toString(firstLetter));
    }
    
    public void UltimaLetra(){
        
        String text = jTextArea1.getText().trim(); 
        char lastLetter = text.charAt(text.length() - 1);
        jTextField5.setText(Character.toString(lastLetter));
        
        
    }
    
    public void LetraCentral(){
        
        String text = jTextArea1.getText().trim();

        int length = text.length();
        int midIndex = length / 2;

        char centralLetter;
        if (length % 2 == 0) {
            // Longitud par, elegir la primera letra del centro
            centralLetter = text.charAt(midIndex - 1);
        } else {
            // Longitud impar, hay una única letra en el centro
            centralLetter = text.charAt(midIndex);
        }
        
        jTextField6.setText(Character.toString(centralLetter));
        
    }
    
    public void PrimeraPalabra(){
        
        String text = jTextArea1.getText().trim(); 

        String[] words = text.split("\\s+"); // Dividir el texto en palabras utilizando espacios en blanco como delimitadores

        if (words.length > 0) {
            String firstWord = words[0];
            jTextField7.setText(firstWord); 
        }
              
    }
    
    
    public void PalabraCentral (){
        
        String text = jTextArea1.getText().trim(); 

                    String[] words = text.split("\\s+"); // Dividir el texto en palabras utilizando espacios en blanco como delimitadores
                    int wordCount = words.length;

                    if (wordCount > 0) {
                        int midIndex = wordCount / 2;

                        String centralWord;
                        if (wordCount % 2 == 0) {
                            // Cantidad par de palabras, elegir la primera palabra del centro
                            centralWord = words[midIndex - 1];
                        } else {
                            // Cantidad impar de palabras, hay una única palabra en el centro
                            centralWord = words[midIndex];
                        }
                        jTextField8.setText(centralWord);
                    }
                    
    }
    
    
    public void UltimaPalabra (){
        
        String text = jTextArea1.getText().trim(); 

                    String[] words = text.split("\\s+"); // Dividir el texto en palabras utilizando espacios en blanco como delimitadores
                    int wordCount = words.length;

                    if (wordCount > 0) {
                        String lastWord = words[wordCount - 1]; // La última palabra es el último elemento del arreglo
                        jTextField9.setText(lastWord);
                    }               
    }
    
    public void RepetirA (){
        
        String text = jTextArea1.getText();

                int letraA = 0;
                int letra_a = 0;
                int letraAcento = 0;

                for (int i = 0; i < text.length(); i++) {
                    char currentChar = text.charAt(i);

                    if (currentChar == 'A') {
                        letraA++;
                    } else if (currentChar == 'a') {
                        letra_a++;
                    } else if (currentChar == 'á') {
                        letraAcento++;
                    }
                }
                 jTextField10.setText("A: " + Integer.toString(letraA) + ", " + "a: " + Integer.toString(letra_a) + ", "  + "á: " + Integer.toString(letraAcento));
            }
        
    
    public void RepetirE (){
        
        String text = jTextArea1.getText();

                int letraE = 0;
                int letra_e = 0;
                int letraAcento = 0;

                for (int i = 0; i < text.length(); i++) {
                    char currentChar = text.charAt(i);

                    if (currentChar == 'E') {
                        letraE++;
                    } else if (currentChar == 'e') {
                        letra_e++;
                    } else if (currentChar == 'é') {
                        letraAcento++;
                    }
                }
                 jTextField11.setText("E: " + Integer.toString(letraE) + ", " + "e: " + Integer.toString(letra_e) + ", "  + "é: " + Integer.toString(letraAcento));
            }
    
            
        public void RepetirI (){
        
        String text = jTextArea1.getText();

                int letraI = 0;
                int letra_i = 0;
                int letraAcento = 0;

                for (int i = 0; i < text.length(); i++) {
                    char currentChar = text.charAt(i);

                    if (currentChar == 'I') {
                        letraI++;
                    } else if (currentChar == 'i') {
                        letra_i++;
                    } else if (currentChar == 'í') {
                        letraAcento++;
                    }
                }
                 jTextField12.setText("I: " + Integer.toString(letraI) + ", " + "i: " + Integer.toString(letra_i) + ", "  + "í: " + Integer.toString(letraAcento));
            }
    
                
        public void RepetirO (){
        
        String text = jTextArea1.getText();

                int letraO = 0;
                int letra_o = 0;
                int letraAcento = 0;

                for (int i = 0; i < text.length(); i++) {
                    char currentChar = text.charAt(i);

                    if (currentChar == 'O') {
                        letraO++;
                    } else if (currentChar == 'o') {
                        letra_o++;
                    } else if (currentChar == 'ó') {
                        letraAcento++;
                    }
                }
                 jTextField13.setText("O: " + Integer.toString(letraO) + ", " + "o: " + Integer.toString(letra_o) + ", "  + "ó: " + Integer.toString(letraAcento));
            }
        
        
       public void RepetirU (){
        
        String text = jTextArea1.getText();

                int letraU = 0;
                int letra_u = 0;
                int letraAcento = 0;

                for (int i = 0; i < text.length(); i++) {
                    char currentChar = text.charAt(i);

                    if (currentChar == 'U') {
                        letraU++;
                    } else if (currentChar == 'u') {
                        letra_u++;
                    } else if (currentChar == 'ú') {
                        letraAcento++;
                    }
                }
                 jTextField14.setText("U: " + Integer.toString(letraU) + ", " + "u: " + Integer.toString(letra_u) + ", "  + "ú: " + Integer.toString(letraAcento));
            }
       
       
       public void PalabrasPar (){
           
            String text = jTextArea1.getText().trim(); 

            
                    String[] words = text.split("\\s+");

                    List<String> evenLengthWords = new ArrayList<>();
                    for (String word : words) {
                        if (word.length() % 2 == 0) {
                            evenLengthWords.add(word);
                        }
                    }
           
                    jTextField15.setText(evenLengthWords.toString());

       } 
       
         public void PalabrasInpar(){
             
             
             String text = jTextArea1.getText().trim(); 

                    String[] words = text.split("\\s+"); // Dividir el texto en palabras utilizando espacios en blanco como delimitadores

                    List<String> oddLengthWords = new ArrayList<>();
                    for (String word : words) {
                        if (word.length() % 2 != 0) { // Verificar si la longitud de la palabra es impar
                            oddLengthWords.add(word);
                        }
                    }
                    
                    jTextField16.setText(oddLengthWords.toString());
             
         }
    
    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
String ruta_archivo = "";

            //Boton abrir
        
       JFileChooser chooser = new JFileChooser();
    chooser.setMultiSelectionEnabled(true);
    FileNameExtensionFilter fi = new FileNameExtensionFilter("txt", "txt");
    chooser.setFileFilter(fi);
    int se = chooser.showOpenDialog(this);
    if (se == JFileChooser.APPROVE_OPTION) {
        File archivo = chooser.getSelectedFile();
        try {
            String content = new String(Files.readAllBytes(archivo.toPath()));
            jTextArea1.setText(content);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al abrir el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "No seleccionó ningún archivo.");
    
        }    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    
    
    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed


        
   

           
           
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem6ActionPerformed
 // Acción del botón "Pegar"
    jTextArea1.paste();
    }//GEN-LAST:event_jCheckBoxMenuItem6ActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
 // Acción del botón "Guardar como"
    JFileChooser chooser = new JFileChooser();
    int option = chooser.showSaveDialog(this);
    if (option == JFileChooser.APPROVE_OPTION) {
        File fileToSave = chooser.getSelectedFile();
        String filePath = fileToSave.getAbsolutePath();
        
        if (!filePath.toLowerCase().endsWith(".txt")) {
            filePath += ".txt";
        }
        
        System.out.println("esto trae la ruta: " + filePath);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
            writer.write(jTextArea1.getText());
            JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
       } 
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
    // Acción del botón "Copiar"
    jTextArea1.copy();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

    private void jCheckBoxMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5ActionPerformed
        // TODO add your handling code here:
         // Acción del botón "Cortar"
    jTextArea1.cut();
    }//GEN-LAST:event_jCheckBoxMenuItem5ActionPerformed

    private void jCheckBoxMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem8ActionPerformed
 // Acción del botón "Reemplazar"
    String searchStr = JOptionPane.showInputDialog(this, "Buscar:");
    if (searchStr != null) {
        String replaceStr = JOptionPane.showInputDialog(this, "Reemplazar con:");
        if (replaceStr != null) {
            String text = jTextArea1.getText();
            String newText = text.replace(searchStr, replaceStr);
            jTextArea1.setText(newText);
        }  
                }       
    }//GEN-LAST:event_jCheckBoxMenuItem8ActionPerformed

    private void jCheckBoxMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem7ActionPerformed
        // TODO add your handling code here:
        
    // Acción del botón "Buscar"
    String searchStr = JOptionPane.showInputDialog(this, "Buscar:");
    if (searchStr != null) {
        String text = jTextArea1.getText();
        int startIndex = text.indexOf(searchStr);
        if (startIndex != -1) {
            int endIndex = startIndex + searchStr.length();
            jTextArea1.setSelectionStart(startIndex);
            jTextArea1.setSelectionEnd(endIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Texto no encontrado.");
        }
    }
    }//GEN-LAST:event_jCheckBoxMenuItem7ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Boton procesar parte de Ramiro:

        String inputText = jTextArea1.getText();
        String encodedText = murcielagoEncode(inputText);
        jTextField1.setText(encodedText);

        LogitudTexto();

        TotalPalabras();

        PrimerLetra();

        UltimaLetra();

        LetraCentral();

        PrimeraPalabra();

        PalabraCentral();

        UltimaPalabra();

        RepetirA();

        RepetirE();

        RepetirI();

        RepetirO();

        RepetirU();

        PalabrasPar();

        PalabrasInpar();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Vista1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void guardarArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
