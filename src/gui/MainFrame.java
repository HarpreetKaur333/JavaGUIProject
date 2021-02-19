import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private FormPanel formPanel;
    public MainFrame(){
        super("Burgers");
        formPanel = new FormPanel();
        setJMenuBar(createMenuBar());
        add(formPanel,BorderLayout.CENTER);
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true );
    }

    private JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Buy Burger");
        JMenu editMenu=  new JMenu("Customer Information");
        JMenu viewMenu = new JMenu("Feedback and Query");
        JMenu helpMenu=  new JMenu("Edit and View");

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
