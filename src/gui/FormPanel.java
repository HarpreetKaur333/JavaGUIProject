import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {
    private JLabel cost;
    private JLabel costField;
    private JLabel maxTopping;
    private JLabel toppingField;
    private JLabel tPrice;
    private JTextField priceField;
    private JComboBox burgerType;
    private JLabel burger;
    private JComboBox options;
    private JLabel chooseOrder;
    private JComboBox sToppings;
    private JLabel selectToppings;
    private JLabel title;
    private  JList orderList;
    private JMenuBar buyBurger;




    FormPanel(){
        //created objects
        cost = new JLabel("Print cost:");
        costField = new JLabel();
        maxTopping = new JLabel("Maximum toppings:");
        toppingField = new JLabel();
        tPrice = new JLabel("Price of toppings:");
        priceField = new JTextField(15);
        burger = new JLabel("Burger type:");
        burgerType = new JComboBox();
        chooseOrder = new JLabel("Choose Order:");
        options = new JComboBox();
        selectToppings= new JLabel("Select Toppings:");
        sToppings = new JComboBox();
        title = new JLabel("```````````BRAMPTON BURGERS````````````");
        title.setForeground(Color.black);// title font color
        orderList = new JList();
        buyBurger = new JMenuBar();



        //Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\IdeaProjects\\JavaGUIProject");

        // title.setSize(600, 100);
        //to bold and increase font size
        title.setFont(new Font("Calibri", Font.BOLD, 30));
        burger.setFont(new Font("Calibri",Font.BOLD,30));
        cost.setFont(new Font("Calibri",Font.BOLD,30));
        maxTopping.setFont(new Font("Calibri",Font.BOLD,30));
        chooseOrder.setFont(new Font("Calibri",Font.BOLD,30));
        selectToppings.setFont(new Font("Calibri",Font.BOLD,30));
        tPrice.setFont(new Font("Calibri",Font.BOLD,30));
        buyBurger.setFont(new Font("Calibri",Font.BOLD,30));
        burgerType.setFont(new Font("Calibri",Font.BOLD,20));
        sToppings.setFont(new Font("Calibri",Font.BOLD,20));
        // chooseOrder.setFont(new Font("Calibri",Font.BOLD,20));
        // orderList.setFont(new Font("Calibri",Font.BOLD,20));
        orderList.setFont(new Font("Calibri",Font.BOLD,20));

        //to set size of textfields,lists and combo box
        priceField.setPreferredSize(new Dimension(150,50));
        priceField.setBackground(Color.PINK);
        costField.setPreferredSize(new Dimension(150,50));
        costField.setBackground(Color.PINK);
        toppingField.setPreferredSize(new Dimension(150,50));
        toppingField.setBackground(Color.PINK);
        burgerType.setPreferredSize(new Dimension(170,50));
        //burgerType.getEditor().getEditorComponent().setBackground(Color.gray);
        options.setPreferredSize(new Dimension(50,50));
        sToppings.setPreferredSize(new Dimension(170,50));
        orderList.setPreferredSize(new Dimension(170,80));
       // orderList.setBackground(Color.PINK);

        //setBackground(Color.cyan);//for background color


        //setup burger type combo
        DefaultComboBoxModel burgerTypeModel = new DefaultComboBoxModel();
        burgerTypeModel.addElement("Healthy Burger");
        burgerTypeModel.addElement("Basic Burger");
        burgerTypeModel.addElement("Deluxe Burger");
        burgerType.setModel(burgerTypeModel);

        // DefaultComboBoxModel optionsModel = new DefaultComboBoxModel();
        //optionsModel.addElement("1");
        //optionsModel.addElement("2");
        //optionsModel.addElement("3");
        //options.setModel(optionsModel);

        DefaultComboBoxModel sToppingsModel = new DefaultComboBoxModel();
        sToppingsModel.addElement("Tomato");
        sToppingsModel.addElement("Cheese");
        sToppingsModel.addElement("Bacon");
        sToppingsModel.addElement("Olives");
        sToppingsModel.addElement("Lettuce");
        sToppingsModel.addElement("Carrot");
        sToppings.setModel(sToppingsModel);

        DefaultListModel orderListModel = new DefaultListModel();
        orderListModel.addElement("1");
        orderListModel.addElement("2");
        orderListModel.addElement("3");
        orderList.setModel(orderListModel );
        orderList.setBorder(BorderFactory.createEtchedBorder());

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();


        //FIRST ROW
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0,0,0,10);


        add(title,gc);




        //SECOND ROW
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0,0,0,10);

        burger.setSize(200,300);
        add(burger,gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0,0,0,0);
        add(burgerType,gc);


        //THIRD ROW
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 2;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0,0,0,10);


        add(cost,gc);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0,0,0,0);
        add(costField,gc);


        //FOURTH ROW
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0,0,0,10);

        add(maxTopping,gc);

        gc.gridx = 1;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0,0,0,0);

        add(toppingField,gc);


        //FIFTH ROW
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 4;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0,0,0,10);

        add(chooseOrder,gc);

        gc.gridx = 1;
        gc.gridy = 4;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0,0,0,0);

        add(orderList,gc);

        //SIXTH ROW
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 5;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0,0,0,10);

        add(selectToppings,gc);

        gc.gridx = 1;
        gc.gridy = 5;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0,0,0,0);

        add(sToppings,gc);


        //SEVENTH ROW
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 6;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0,0,0,10);

        add(tPrice,gc);

        gc.gridx = 1;
        gc.gridy = 6;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0,0,0,0);

        add(priceField,gc);


    }
}
