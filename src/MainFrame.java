import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Design extends JFrame {
    //private JTextArea textArea;
    // private JButton btn;
    //private TextPanel textArea;
    // private Toolbar toolbar;
    private FormPanel formPanel;
    public Design(){
        super("Burgers");

        formPanel = new FormPanel();
        // textArea = new TextPanel();
        // btn = new JButton("SUBMIT");
        // toolbar = new Toolbar();

        // btn.addActionListener(new ActionListener() {

        //public void actionPerformed(ActionEvent e) {
        //textArea.appendText("burgers\n");
        // }
        // });
        add(formPanel,BorderLayout.CENTER);
        //add(textArea,BorderLayout.CENTER);
        // add(btn,BorderLayout.SOUTH);
        //add(toolbar,BorderLayout.NORTH);

        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true );




    }



    private JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu=  new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu helpMenu=  new JMenu("Help");


        JMenuItem projectMenu = new JMenuItem("Project");
        JMenuItem moduleMenu=  new JMenuItem("Module");
        JMenu newMenu = new JMenu("New");

        newMenu.add(projectMenu);
        newMenu.add(moduleMenu);


        JMenu openMenu=  new JMenu("Open");
        JMenuItem settingsMenu = new JMenuItem("Settings");
        JMenuItem exitMenu=  new JMenuItem("Exit");

        exitMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });




        JCheckBoxMenuItem imageMenu = new JCheckBoxMenuItem("Image");
        imageMenu.setSelected(true);

        JCheckBoxMenuItem folderMenu=  new JCheckBoxMenuItem("Folder");
        folderMenu.setSelected(true);

        folderMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JCheckBoxMenuItem menuItem = (JCheckBoxMenuItem) e.getSource();
                formPanel.setVisible(menuItem.isSelected());
            }
        });

        openMenu.add(imageMenu);
        openMenu.add(folderMenu);

        fileMenu.add(newMenu);
        fileMenu.add(openMenu);
        fileMenu.add(settingsMenu);
        fileMenu.add(exitMenu);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);


        return menuBar;
    }
}
