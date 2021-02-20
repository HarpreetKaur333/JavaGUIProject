package gui;

import controller.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

public class FormPanel extends JPanel {
    private JLabel cost;
    private JLabel costField;
    private JLabel maxTopping;
    private JLabel toppingField;
    private JLabel tPrice;
    private JTextField priceField;
    private JComboBox burgerType;
    private JLabel burger;

    private JLabel selectToppings;
   // private JLabel title;
    private  JList orderList;
    private JButton submit;

    private JCheckBox sToppings1;
    private JCheckBox sToppings2;
    private JCheckBox sToppings3;
    private JCheckBox sToppings4;
    private JCheckBox sToppings5;
    private JCheckBox sToppings6;
    private JCheckBox sToppings7;
    private JCheckBox sToppings8;
    private String subject;
    private String stringtopping;
    private String t1,t2,t3,t4,t5,t6,t7,t8;
    private double maxtopng=0;
    private double topp;
    private boolean selectedtopping,selectedtopping1,selectedtopping2,selectedtopping3,selectedtopping4,selectedtopping5
            , selectedtopping6,selectedtopping7;
    private double basicrate =0;

    private controller cont;

    public FormPanel(){
        cont = new controller();
        //created objects
        burger = new JLabel("Burger type:");
        burgerType = new JComboBox();

        cost = new JLabel("Cost:");
        costField = new JLabel();
        maxTopping = new JLabel("Maximum toppings:");
        toppingField = new JLabel();

        tPrice = new JLabel("Price of toppings:");
        priceField = new JTextField(15);


        DefaultComboBoxModel burgerTypeModel = new DefaultComboBoxModel();
        burgerTypeModel.addElement("==Select==");
        burgerTypeModel.addElement("Basic Burger");
        burgerTypeModel.addElement("Healthy Burger");
        burgerTypeModel.addElement("Deluxe Burger");
        burgerType.setModel(burgerTypeModel);

        selectToppings= new JLabel("Select Toppings:");
        sToppings1=new JCheckBox("Tomato");
        sToppings2=new JCheckBox("Cheese");
        sToppings3=new JCheckBox("Bacon");
        sToppings4=new JCheckBox("Olives");
        sToppings5=new JCheckBox("Lettuce");
        sToppings6=new JCheckBox("Carrot");
        sToppings7=new JCheckBox("Garlic aioli ");
        sToppings8=new JCheckBox("cucumber");
       // title = new JLabel("**********BRAMPTON BURGERS**********");
        submit = new JButton("Submit");

        sToppings1.setSize(10,20);
        sToppings1.setBounds(100,100, 50,50);
        sToppings2.setSize(10,20);
        sToppings2.setBounds(100,150, 50,50);
        sToppings3.setSize(10,20);
        sToppings4.setSize(10,20);
        sToppings5.setSize(10,20);
        sToppings6.setSize(10,20);
        sToppings7.setSize(10,20);
        sToppings8.setSize(10,20);

        tPrice.setEnabled(false);
        priceField.setEnabled(false);

        t1=  sToppings1.getText();

        burgerType.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox)e.getSource();
                subject = (String) burgerType.getSelectedItem();
                // System.out.println(subject);
                if (subject.equals("Basic Burger") )
                {
                    basicrate=4.45;
                    maxtopng=4;
                    costField.setText("4.5");
                    toppingField.setText("4");

                    sToppings5.setEnabled(false);
                    sToppings6.setEnabled(false);
                    sToppings7.setEnabled(false);
                    sToppings8.setEnabled(false);
                   /* sToppings7.setEnabled(false);
                    sToppings5.setEnabled(false);*/
                }
                else if (subject.equals("Healthy Burger"))
                {
                    basicrate=7.5;
                    costField.setText(" 7.5");
                    toppingField.setText("6");
                    maxtopng=6;
                    sToppings5.setEnabled(true);
                    sToppings6.setEnabled(true);
                }

                else if (subject.equals("Deluxe Burger"))
                {
                    basicrate=10;
                    costField.setText(" 10");
                    toppingField.setText("8");
                    sToppings7.setEnabled(true);
                    sToppings8.setEnabled(true);
                    maxtopng=8;
                }

            }

        });
        sToppings1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedtopping= sToppings1.isSelected();
                selectedtopping1= sToppings2.isSelected();
                selectedtopping2= sToppings3.isSelected();
                selectedtopping3= sToppings4.isSelected();

                if(selectedtopping)
                {
                    topp=1;
                    t1="Tomato";
                    stringtopping=t1;


                }
                selectedtopping1= sToppings2.isSelected();
                if(selectedtopping1 && selectedtopping){
                    t2="Cheese";
                    stringtopping=null;
                    stringtopping=t1+" "+t2;
                    topp=2;


                }
                selectedtopping2= sToppings3.isSelected();
                if(selectedtopping && selectedtopping1 && selectedtopping2){
                    t3="Bacon";
                    stringtopping=null;
                    stringtopping=t1+" "+t2+" "+t3;

                    topp=3;

                }

                selectedtopping3= sToppings4.isSelected();
                // for the case of basic burger
                if(selectedtopping3 && selectedtopping && selectedtopping1 && selectedtopping2){
                    t4="Olives";
                    stringtopping=null;
                    stringtopping=t1+" "+t2+"  "+t3+" "+t4;
                    topp=4;



                }


                selectedtopping4= sToppings5.isSelected();
                if(selectedtopping4 && selectedtopping3 && selectedtopping && selectedtopping1 && selectedtopping2)
                {
                    t5="Lettuce";
                    stringtopping=null;
                    stringtopping=t1+" "+t2+" "+t3+" "+t4+" "+t5;


                    topp=5;
                }

                selectedtopping5= sToppings6.isSelected();
                if(selectedtopping5 && selectedtopping3 && selectedtopping && selectedtopping1 && selectedtopping2){
                    t6="Carrot";
                    stringtopping=null;
                    stringtopping=t1+" "+t2+" "+t3+" "+t4+" "+t5;
                    topp=6;

                }


                selectedtopping6= sToppings7.isSelected();
                if(selectedtopping6 && selectedtopping5 && selectedtopping3 && selectedtopping && selectedtopping1 && selectedtopping2){
                    t6="Garlic aioli";
                    stringtopping=null;
                    stringtopping=t1+""+t2+""+t3+""+t4+" "+t5+" "+t6;
                    topp=7;

                }
                selectedtopping7= sToppings6.isSelected();
                if(selectedtopping7 &&selectedtopping6 && selectedtopping5 && selectedtopping3 && selectedtopping && selectedtopping1 && selectedtopping2){
                    t7="cucumber";
                    stringtopping=null;
                    stringtopping=t1+""+t2+""+t3+""+t4+" "+t5+" "+t6+" "+t7;

                    topp=8;

                }


                System.out.println("selected toppings  "+stringtopping+" rate  "+ basicrate+" selcted burger "+subject+"max toping " +
                        "   "+maxtopng+" topp"+topp);

            }
        });

        submit.setMnemonic(KeyEvent.VK_S);

       /* sToppings1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedtopping= sToppings1.isSelected();
                tPrice.setEnabled(false);
                priceField.setEnabled(false);
            }
        });*/

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String value = (String) burgerType.getSelectedItem();

                double cost= Double.parseDouble(costField.getText());
                double value1=  Double.parseDouble(String.valueOf(cost));

                int topping= (int) Double.parseDouble(toppingField.getText());
                int value2= (int) Double.parseDouble(String.valueOf(topping));
                double value3=12.5; //total price of topping
                double value4=3.5; //tax amount
                double value5=25.5;//tax+basic amount of burger+topping price

              /* System.out.println(value);
                System.out.println(value1);
                System.out.println(value2);
                System.out.println(value3);
                System.out.println(value4);
                System.out.println(value5);*/

                connect();
                try {
                    cont.save(value, value1,value2,value3,value4,value5);
                } catch (SQLException throwable) {
                    JOptionPane.showMessageDialog(FormPanel.this,"Unable to save data","Database Connection",JOptionPane.ERROR_MESSAGE);
                }finally {
                    cont.disconnect();
                }
                //costField.setText("");
                JOptionPane.showMessageDialog(FormPanel.this,"Data saved to DB","Sucess",JOptionPane.PLAIN_MESSAGE);

            }

        });

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        //FIRST ROW
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0,0,0,0);
        add(burger,gc);
        gc.gridx = 1;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(burgerType,gc);

        //SECOND ROW
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy ++;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        burger.setSize(200,300);
        add(cost,gc);

        gc.gridx = 1;
        gc.insets =  new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(costField,gc);


        //THIRD ROW
        gc.gridx = 0;
        gc.gridy++;
        gc.insets =  new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(maxTopping,gc);

        gc.weightx = 1;
        gc.weighty = 0.2;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(toppingField,gc);


        //FOURTH ROW
        gc.gridx = 0;
        gc.gridy++;
        gc.insets =  new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;

        add(selectToppings,gc);

        gc.weightx = 1;
        gc.weighty = 0.05;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sToppings1,gc);

        gc.weightx = 1;
        gc.weighty = 0.2;
        gc.gridy++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sToppings2,gc);

        gc.weightx = 1;
        gc.weighty = 0.3;
        gc.gridy++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sToppings3,gc);

        gc.weightx = 1;
        gc.weighty = 0.4;
        gc.gridy++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sToppings4,gc);

        gc.weightx = 1;
        gc.weighty = 0.5;
        gc.gridy++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sToppings5,gc);

        gc.weightx = 1;
        gc.weighty = 0.6;
        gc.gridy++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sToppings6,gc);

        gc.weightx = 1;
        gc.weighty = 0.7;
        gc.gridy++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sToppings7,gc);

        gc.weightx = 1;
        gc.weighty = 0.8;
        gc.gridy++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sToppings8,gc);


        //SENENTH ROW
        gc.gridx = 0;
        gc.gridy++;
        gc.insets =  new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(tPrice,gc);

        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(priceField,gc);



        //SEVENTH ROW
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 1;
        gc.gridy++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(submit,gc);


    }
    private void connect(){
        try {
            cont.connect();
        } catch (Exception throwable) {
            JOptionPane.showMessageDialog(FormPanel.this,"Cannot connect to Database","Database Connection",JOptionPane.ERROR_MESSAGE);
        }
    }
}
