import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
public class GUI21 extends JPanel { 
    static String ParentsFIO ="";
    static int ParentsYar =0;
    static String ParentsSex ="Мужской";
    static String ParentsEmail ="";
    static String ParentsPhone ="";
    static String StudentFIO ="";
    static int StudentYar =0;
    static String StudentSex ="Мужской";
    static String [] Class ={"",""};
    static int StudentHeight =0;
    static String[] StudentHobby ={"","","","","",""};



    public GUI21() {
        initComponents();
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Анкета");
        frame.setContentPane(new GUI21());
        frame.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - 400 / 2, dim.height / 2 - 680 / 2, 400, 680);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private void textField1(ActionEvent e) {
        ParentsFIO=textField1.getText();
    }

    private void spinner1StateChanged(ChangeEvent e) {
        ParentsYar=(int) spinner1.getValue();
    }

    private void radioButton1(ActionEvent e) {
        ParentsSex="Мужской";
    }

    private void radioButton2(ActionEvent e) {
        ParentsSex="Женский";
    }

    private void radioButton3(ActionEvent e) {
        ParentsSex="Другое";
    }

    private void textField2(ActionEvent e) {
        ParentsEmail= textField2.getText();
    }

    private void textField3(ActionEvent e) {
        ParentsPhone=textField3.getText();
    }

    private void textField4(ActionEvent e) {
        StudentFIO=textField4.getText();
    }

    private void spinner2StateChanged(ChangeEvent e) {
        StudentYar=(int) spinner1.getValue();
    }
    private void radioButton7(ActionEvent e) {
        StudentSex="Мужской";
    }

    private void radioButton8(ActionEvent e) {
        StudentSex="Женский";
    }

    private void radioButton9(ActionEvent e) {
        StudentSex="Другое";
    }

    private void comboBox2(ActionEvent e) {
        Class[0]=(String)comboBox2.getSelectedItem();
    }

    private void comboBox1(ActionEvent e) {
        Class[1]=(String)comboBox1.getSelectedItem();
    }

    private void slider1StateChanged(ChangeEvent e) {
        StudentHeight=slider1.getValue();

    }

    private void checkBox1(ActionEvent e) {
        StudentHobby[0]="Плаванье";
    }

    private void checkBox2(ActionEvent e) {
        StudentHobby[1]="Борьба";
    }

    private void checkBox3(ActionEvent e) {
        StudentHobby[2]="Музыка";
    }

    private void checkBox4(ActionEvent e) {
        StudentHobby[3]="Гимнастика";
    }

    private void checkBox5(ActionEvent e) {
        StudentHobby[4]="Робототехника";
    }

    private void checkBox6(ActionEvent e) {
        StudentHobby[5]="Волейбол";
    }

    private void button1(ActionEvent e) {
        JDialog dialog =createJdialog();
        dialog.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        dialog.setVisible(true);

    }
    private JDialog createJdialog (){
        dialog1 = new JDialog();
        label14 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        label27 = new JLabel();
        label28 = new JLabel();
        label29 = new JLabel();
        label30 = new JLabel();
        label31 = new JLabel();
        label32 = new JLabel();
        label33 = new JLabel();
        label34 = new JLabel();
        label35 = new JLabel();
        label36 = new JLabel();
        label37 = new JLabel();

        dialog1.setTitle("\u041e\u0442\u0432\u0435\u0442");
        var dialog1ContentPane = dialog1.getContentPane();
        dialog1ContentPane.setLayout(null);

        //---- label14 ----
        label14.setText("\u0424\u0418\u041e \u0440\u043e\u0434.");
        dialog1ContentPane.add(label14);
        label14.setBounds(15, 10, 145, 25);

        //---- label16 ----
        label16.setText("\u043b\u0435\u0442");
        dialog1ContentPane.add(label16);
        label16.setBounds(15, 40, 145, 25);

        //---- label17 ----
        label17.setText("\u043f\u043e\u043b");
        dialog1ContentPane.add(label17);
        label17.setBounds(15, 70, 145, 25);

        //---- label18 ----
        label18.setText("Email");
        dialog1ContentPane.add(label18);
        label18.setBounds(15, 100, 145, 25);

        //---- label19 ----
        label19.setText("\u0422\u0435\u043b\u0435\u0444\u043e\u043d");
        dialog1ContentPane.add(label19);
        label19.setBounds(15, 130, 145, 25);

        //---- label20 ----
        label20.setText("\u0424\u0418\u041e \u0440\u0435\u0431\u0451\u043d\u043a\u0430");
        dialog1ContentPane.add(label20);
        label20.setBounds(15, 160, 145, 25);

        //---- label21 ----
        label21.setText("\u043b\u0435\u0442");
        dialog1ContentPane.add(label21);
        label21.setBounds(15, 190, 145, 25);

        //---- label22 ----
        label22.setText("\u043f\u043e\u043b");
        dialog1ContentPane.add(label22);
        label22.setBounds(15, 220, 145, 25);

        //---- label23 ----
        label23.setText("\u043a\u043b\u0430\u0441\u0441");
        dialog1ContentPane.add(label23);
        label23.setBounds(15, 250, 145, 25);

        //---- label24 ----
        label24.setText("\u0440\u043e\u0441\u0442");
        dialog1ContentPane.add(label24);
        label24.setBounds(15, 280, 145, 25);

        //---- label25 ----
        label25.setText("\u043a\u0440\u0443\u0436\u043a\u0438");
        dialog1ContentPane.add(label25);
        label25.setBounds(15, 310, 145, 25);

        dialog1ContentPane.add(label27);
        label27.setBounds(155, 10, 145, 25);
        label27.setText(ParentsFIO);
        dialog1ContentPane.add(label28);
        label28.setBounds(155, 40, 145, 25);
        label28.setText(String.valueOf(ParentsYar));
        dialog1ContentPane.add(label29);
        label29.setBounds(155, 70, 145, 25);
        label29.setText(ParentsSex);
        dialog1ContentPane.add(label30);
        label30.setBounds(155, 100, 145, 25);
        label30.setText(ParentsEmail);
        dialog1ContentPane.add(label31);
        label31.setBounds(155, 130, 145, 25);
        label31.setText(ParentsPhone);
        dialog1ContentPane.add(label32);
        label32.setBounds(155, 160, 145, 25);
        label32.setText(StudentFIO);
        dialog1ContentPane.add(label33);
        label33.setBounds(155, 190, 145, 25);
        label33.setText(String.valueOf(StudentYar));
        dialog1ContentPane.add(label34);
        label34.setBounds(155, 220, 145, 25);
        label34.setText(StudentSex);
        dialog1ContentPane.add(label35);
        label35.setBounds(155, 250, 145, 25);
        label35.setText(Class[0]+" "+Class[1]);
        dialog1ContentPane.add(label36);
        label36.setBounds(155, 280, 145, 25);
        label36.setText(String.valueOf(StudentHeight));
        dialog1ContentPane.add(label37);
        label37.setBounds(155, 310, 145, 105);
        label37.setText(StudentHobby[0]+" "+StudentHobby[1]+" "+StudentHobby[2]+" "+StudentHobby[3]+" "+StudentHobby[4]+" "+StudentHobby[5]);
        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < dialog1ContentPane.getComponentCount(); i++) {
                Rectangle bounds = dialog1ContentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = dialog1ContentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            dialog1ContentPane.setMinimumSize(preferredSize);
            dialog1ContentPane.setPreferredSize(preferredSize);
        }
        dialog1.pack();
        dialog1.setLocationRelativeTo(dialog1.getOwner());
        return dialog1;
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - toni panov
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        panel2 = new JPanel();
        label2 = new JLabel();
        spinner1 = new JSpinner();
        panel3 = new JPanel();
        label3 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        label4 = new JLabel();
        panel4 = new JPanel();
        label5 = new JLabel();
        textField2 = new JTextField();
        panel5 = new JPanel();
        label6 = new JLabel();
        textField3 = new JTextField();
        label7 = new JLabel();
        panel6 = new JPanel();
        label8 = new JLabel();
        textField4 = new JTextField();
        panel7 = new JPanel();
        label9 = new JLabel();
        spinner2 = new JSpinner();
        panel8 = new JPanel();
        label10 = new JLabel();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        label11 = new JLabel();
        panel9 = new JPanel();
        label12 = new JLabel();
        panel10 = new JPanel();
        slider1 = new JSlider();
        panel11 = new JPanel();
        label13 = new JLabel();
        panel12 = new JPanel();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();
        checkBox5 = new JCheckBox();
        checkBox6 = new JCheckBox();
        button1 = new JButton();
        panel14 = new JPanel();
        label15 = new JLabel();
        radioButton7 = new JRadioButton();
        radioButton8 = new JRadioButton();
        radioButton9 = new JRadioButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
        .EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border.TitledBorder.CENTER,javax
        .swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dialo\u0067",java.awt.Font.BOLD,
        12),java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans
        .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("borde\u0072".equals(e.
        getPropertyName()))throw new RuntimeException();}});
        setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u0424\u0418\u041e");
            panel1.add(label1);
            label1.setBounds(10, 10, 50, 25);

            //---- textField1 ----
            textField1.addActionListener(e -> textField1(e));
            panel1.add(textField1);
            textField1.setBounds(60, 10, 190, 25);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        add(panel1);
        panel1.setBounds(0, 40, 400, 35);

        //======== panel2 ========
        {
            panel2.setLayout(null);

            //---- label2 ----
            label2.setText("\u041b\u0435\u0442");
            panel2.add(label2);
            label2.setBounds(10, 10, 50, 25);

            //---- spinner1 ----
            spinner1.setModel(new SpinnerNumberModel(0, 0, 200, 1));
            spinner1.addChangeListener(e -> spinner1StateChanged(e));
            panel2.add(spinner1);
            spinner1.setBounds(60, 10, spinner1.getPreferredSize().width, 25);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel2.getComponentCount(); i++) {
                    Rectangle bounds = panel2.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel2.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel2.setMinimumSize(preferredSize);
                panel2.setPreferredSize(preferredSize);
            }
        }
        add(panel2);
        panel2.setBounds(0, 75, 400, 35);

        //======== panel3 ========
        {
            panel3.setLayout(null);

            //---- label3 ----
            label3.setText("\u041f\u043e\u043b");
            panel3.add(label3);
            label3.setBounds(10, 10, 50, 25);

            //---- radioButton1 ----
            radioButton1.setText("\u041c\u0443\u0436");
            radioButton1.setSelected(true);
            radioButton1.addActionListener(e -> radioButton1(e));
            panel3.add(radioButton1);
            radioButton1.setBounds(new Rectangle(new Point(65, 10), radioButton1.getPreferredSize()));

            //---- radioButton2 ----
            radioButton2.setText("\u0416\u0435\u043d");
            radioButton2.addActionListener(e -> radioButton2(e));
            panel3.add(radioButton2);
            radioButton2.setBounds(new Rectangle(new Point(115, 10), radioButton2.getPreferredSize()));

            //---- radioButton3 ----
            radioButton3.setText("\u0414\u0440\u0443\u0433\u043e\u0435");
            radioButton3.addActionListener(e -> radioButton3(e));
            panel3.add(radioButton3);
            radioButton3.setBounds(new Rectangle(new Point(165, 10), radioButton3.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel3.getComponentCount(); i++) {
                    Rectangle bounds = panel3.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel3.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel3.setMinimumSize(preferredSize);
                panel3.setPreferredSize(preferredSize);
            }
        }
        add(panel3);
        panel3.setBounds(0, 110, 400, 35);

        //---- label4 ----
        label4.setText("\u0420\u043e\u0434\u0438\u0442\u0435\u043b\u044c");
        add(label4);
        label4.setBounds(170, 10, 65, 25);

        //======== panel4 ========
        {
            panel4.setLayout(null);

            //---- label5 ----
            label5.setText("Email");
            panel4.add(label5);
            label5.setBounds(10, 10, 50, 25);

            //---- textField2 ----
            textField2.addActionListener(e -> textField2(e));
            panel4.add(textField2);
            textField2.setBounds(60, 10, 190, 25);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel4.getComponentCount(); i++) {
                    Rectangle bounds = panel4.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel4.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel4.setMinimumSize(preferredSize);
                panel4.setPreferredSize(preferredSize);
            }
        }
        add(panel4);
        panel4.setBounds(0, 145, 400, 35);

        //======== panel5 ========
        {
            panel5.setLayout(null);

            //---- label6 ----
            label6.setText("\u0422\u0435\u043b\u0435\u0444\u043e\u043d");
            panel5.add(label6);
            label6.setBounds(10, 10, 50, 25);

            //---- textField3 ----
            textField3.addActionListener(e -> textField3(e));
            panel5.add(textField3);
            textField3.setBounds(60, 10, 190, 25);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel5.getComponentCount(); i++) {
                    Rectangle bounds = panel5.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel5.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel5.setMinimumSize(preferredSize);
                panel5.setPreferredSize(preferredSize);
            }
        }
        add(panel5);
        panel5.setBounds(0, 180, 400, 35);

        //---- label7 ----
        label7.setText("\u0420\u0435\u0431\u0451\u043d\u043e\u043a");
        add(label7);
        label7.setBounds(170, 220, 65, 25);

        //======== panel6 ========
        {
            panel6.setLayout(null);

            //---- label8 ----
            label8.setText("\u0424\u0418\u041e");
            panel6.add(label8);
            label8.setBounds(10, 10, 50, 25);

            //---- textField4 ----
            textField4.addActionListener(e -> textField4(e));
            panel6.add(textField4);
            textField4.setBounds(60, 10, 190, 25);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel6.getComponentCount(); i++) {
                    Rectangle bounds = panel6.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel6.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel6.setMinimumSize(preferredSize);
                panel6.setPreferredSize(preferredSize);
            }
        }
        add(panel6);
        panel6.setBounds(0, 245, 400, 35);

        //======== panel7 ========
        {
            panel7.setLayout(null);

            //---- label9 ----
            label9.setText("\u041b\u0435\u0442");
            panel7.add(label9);
            label9.setBounds(10, 10, 50, 25);

            //---- spinner2 ----
            spinner2.setModel(new SpinnerNumberModel(0, 0, 200, 1));
            spinner2.addChangeListener(e -> spinner2StateChanged(e));
            panel7.add(spinner2);
            spinner2.setBounds(60, 10, spinner2.getPreferredSize().width, 25);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel7.getComponentCount(); i++) {
                    Rectangle bounds = panel7.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel7.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel7.setMinimumSize(preferredSize);
                panel7.setPreferredSize(preferredSize);
            }
        }
        add(panel7);
        panel7.setBounds(0, 285, 400, 35);

        //======== panel8 ========
        {
            panel8.setLayout(null);

            //---- label10 ----
            label10.setText("\u041a\u043b\u0430\u0441\u0441");
            panel8.add(label10);
            label10.setBounds(10, 5, 50, 25);

            //---- comboBox1 ----
            comboBox1.setToolTipText("\u0430\n\u0431\n\u0432\n\u0433\n\u0434\n\u0435\n\u0436\n\u0437");
            comboBox1.setMaximumRowCount(6);
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u0410",
                "\u0411",
                "\u0412",
                "\u0413",
                "\u0414",
                "\u0415",
                "\u0416",
                "\u0417"
            }));
            comboBox1.addActionListener(e -> comboBox1(e));
            panel8.add(comboBox1);
            comboBox1.setBounds(240, 5, 115, comboBox1.getPreferredSize().height);

            //---- comboBox2 ----
            comboBox2.setMaximumRowCount(11);
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11"
            }));
            comboBox2.addActionListener(e -> comboBox2(e));
            panel8.add(comboBox2);
            comboBox2.setBounds(60, 5, 115, 30);

            //---- label11 ----
            label11.setText("\u0411\u0443\u043a\u0432\u0430");
            panel8.add(label11);
            label11.setBounds(190, 5, 50, 25);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel8.getComponentCount(); i++) {
                    Rectangle bounds = panel8.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel8.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel8.setMinimumSize(preferredSize);
                panel8.setPreferredSize(preferredSize);
            }
        }
        add(panel8);
        panel8.setBounds(0, 355, 400, 35);

        //======== panel9 ========
        {
            panel9.setLayout(null);

            //---- label12 ----
            label12.setText("\u0420\u043e\u0441\u0442");
            panel9.add(label12);
            label12.setBounds(10, 15, 50, 25);

            //======== panel10 ========
            {
                panel10.setLayout(null);

                //---- slider1 ----
                slider1.setMaximum(200);
                slider1.setMinorTickSpacing(5);
                slider1.setMinimum(80);
                slider1.setToolTipText("\u041c\u041c");
                slider1.setValue(0);
                slider1.setMajorTickSpacing(15);
                slider1.setPaintTicks(true);
                slider1.setPaintLabels(true);
                slider1.setSnapToTicks(true);
                slider1.addChangeListener(e -> slider1StateChanged(e));
                panel10.add(slider1);
                slider1.setBounds(0, 0, 305, 40);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel10.getComponentCount(); i++) {
                        Rectangle bounds = panel10.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel10.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel10.setMinimumSize(preferredSize);
                    panel10.setPreferredSize(preferredSize);
                }
            }
            panel9.add(panel10);
            panel10.setBounds(new Rectangle(new Point(60, 10), panel10.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel9.getComponentCount(); i++) {
                    Rectangle bounds = panel9.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel9.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel9.setMinimumSize(preferredSize);
                panel9.setPreferredSize(preferredSize);
            }
        }
        add(panel9);
        panel9.setBounds(0, 390, 400, 50);

        //======== panel11 ========
        {
            panel11.setLayout(null);

            //---- label13 ----
            label13.setText("\u041a\u0440\u0443\u0436\u043a\u0438");
            panel11.add(label13);
            label13.setBounds(10, 15, 50, 25);

            //======== panel12 ========
            {
                panel12.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel12.getComponentCount(); i++) {
                        Rectangle bounds = panel12.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel12.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel12.setMinimumSize(preferredSize);
                    panel12.setPreferredSize(preferredSize);
                }
            }
            panel11.add(panel12);
            panel12.setBounds(new Rectangle(new Point(60, 10), panel12.getPreferredSize()));

            //---- checkBox1 ----
            checkBox1.setText("\u041f\u043b\u0430\u0432\u0430\u043d\u044c\u0435");
            checkBox1.addActionListener(e -> checkBox1(e));
            panel11.add(checkBox1);
            checkBox1.setBounds(65, 20, 180, checkBox1.getPreferredSize().height);

            //---- checkBox2 ----
            checkBox2.setText("\u0411\u043e\u0440\u044c\u0431\u0430");
            checkBox2.addActionListener(e -> checkBox2(e));
            panel11.add(checkBox2);
            checkBox2.setBounds(65, 40, 180, 21);

            //---- checkBox3 ----
            checkBox3.setText("\u041c\u0443\u0437\u044b\u043a\u0430");
            checkBox3.addActionListener(e -> checkBox3(e));
            panel11.add(checkBox3);
            checkBox3.setBounds(65, 60, 180, 21);

            //---- checkBox4 ----
            checkBox4.setText("\u0413\u0438\u043c\u043d\u0430\u0441\u0442\u0438\u043a\u0430");
            checkBox4.addActionListener(e -> checkBox4(e));
            panel11.add(checkBox4);
            checkBox4.setBounds(65, 80, 180, 21);

            //---- checkBox5 ----
            checkBox5.setText("\u0420\u043e\u0431\u043e\u0442\u043e\u0442\u0435\u0445\u043d\u0438\u043a\u0430");
            checkBox5.addActionListener(e -> checkBox5(e));
            panel11.add(checkBox5);
            checkBox5.setBounds(65, 100, 180, 21);

            //---- checkBox6 ----
            checkBox6.setText("\u0412\u043e\u043b\u0435\u0439\u0431\u043e\u043b");
            checkBox6.addActionListener(e -> checkBox6(e));
            panel11.add(checkBox6);
            checkBox6.setBounds(65, 120, 180, 21);

            //---- button1 ----
            button1.setText("\u041e\u0442\u0432\u0435\u0442");
            button1.addActionListener(e -> button1(e));
            panel11.add(button1);
            button1.setBounds(65, 160, 135, button1.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel11.getComponentCount(); i++) {
                    Rectangle bounds = panel11.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel11.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel11.setMinimumSize(preferredSize);
                panel11.setPreferredSize(preferredSize);
            }
        }
        add(panel11);
        panel11.setBounds(0, 440, 400, 240);

        //======== panel14 ========
        {
            panel14.setLayout(null);

            //---- label15 ----
            label15.setText("\u041f\u043e\u043b");
            panel14.add(label15);
            label15.setBounds(10, 10, 50, 25);

            //---- radioButton7 ----
            radioButton7.setText("\u041c\u0443\u0436");
            radioButton7.setSelected(true);
            radioButton7.addActionListener(e -> {
			radioButton1(e);
			radioButton7(e);
		});
            panel14.add(radioButton7);
            radioButton7.setBounds(new Rectangle(new Point(65, 10), radioButton7.getPreferredSize()));

            //---- radioButton8 ----
            radioButton8.setText("\u0416\u0435\u043d");
            radioButton8.addActionListener(e -> {
			radioButton2(e);
			radioButton8(e);
		});
            panel14.add(radioButton8);
            radioButton8.setBounds(new Rectangle(new Point(115, 10), radioButton8.getPreferredSize()));

            //---- radioButton9 ----
            radioButton9.setText("\u0414\u0440\u0443\u0433\u043e\u0435");
            radioButton9.addActionListener(e -> {
			radioButton3(e);
			radioButton9(e);
		});
            panel14.add(radioButton9);
            radioButton9.setBounds(new Rectangle(new Point(165, 10), radioButton9.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel14.getComponentCount(); i++) {
                    Rectangle bounds = panel14.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel14.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel14.setMinimumSize(preferredSize);
                panel14.setPreferredSize(preferredSize);
            }
        }
        add(panel14);
        panel14.setBounds(0, 320, 400, panel14.getPreferredSize().height);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }

        //---- buttonGroup1 ----
        var buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        buttonGroup1.add(radioButton3);

        //---- buttonGroup2 ----
        var buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(radioButton7);
        buttonGroup2.add(radioButton8);
        buttonGroup2.add(radioButton9);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - toni panov
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JPanel panel2;
    private JLabel label2;
    private JSpinner spinner1;
    private JPanel panel3;
    private JLabel label3;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JLabel label4;
    private JPanel panel4;
    private JLabel label5;
    private JTextField textField2;
    private JPanel panel5;
    private JLabel label6;
    private JTextField textField3;
    private JLabel label7;
    private JPanel panel6;
    private JLabel label8;
    private JTextField textField4;
    private JPanel panel7;
    private JLabel label9;
    private JSpinner spinner2;
    private JPanel panel8;
    private JLabel label10;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JLabel label11;
    private JPanel panel9;
    private JLabel label12;
    private JPanel panel10;
    private JSlider slider1;
    private JPanel panel11;
    private JLabel label13;
    private JPanel panel12;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JButton button1;
    private JPanel panel14;
    private JLabel label15;
    private JRadioButton radioButton7;
    private JRadioButton radioButton8;
    private JRadioButton radioButton9;
    private JDialog dialog1;
    private JLabel label14;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label25;
    private JLabel label27;
    private JLabel label28;
    private JLabel label29;
    private JLabel label30;
    private JLabel label31;
    private JLabel label32;
    private JLabel label33;
    private JLabel label34;
    private JLabel label35;
    private JLabel label36;
    private JLabel label37;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
