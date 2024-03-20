import javax.swing.*;

public class ZkouseniForm extends JFrame {
    private JButton button1;
    private JPanel panelMain;
    private JTextField textField1;
    private JTable table1;
    private JTextArea textArea1;
    private JTextField textField;
    private JTextArea textArea;
    private JTable table;

    public ZkouseniForm(){
        setContentPane(panelMain);
        setTitle("Zkouseni_6.3_2024");
        setSize(300,300);
        initMenu();
        table.setModel(new SpravceZakazniku());

        button1.addActionListener(e ->{textArea.append(textField.getText()+"\n");});
    }
    public void initMenu(){
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu soubor = new JMenu("Soubor");
        menuBar.add(soubor);

        JMenuItem kopiruj = new JMenuItem("Kopiruj");
        soubor.add(kopiruj);

        kopiruj.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,textField.getText()+"\n");
        });
    }

}
