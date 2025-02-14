package Jobsheet11;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm21841720206Kaisar extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton button1;
    private JPanel panel;
    
    public MyInputForm21841720206Kaisar(){
        createTextFieldKaisar();
        createButtonKaisar();
        createButtonsKaisar();
        createPanelKaisar();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextFieldKaisar() {
        aLabel = new JLabel("Niali A : ");
        bLabel = new JLabel("Niali B : ");
        cLabel = new JLabel("Hasil   : ");
        dLabel = new JLabel("Hasil tambah  : ");
        
        final int FIELD_WIDTH = 10;
            aField = new JTextField(FIELD_WIDTH);
            aField.setText("0");
            bField = new JTextField(FIELD_WIDTH);
            bField.setText("0");
        
    }
    
    private void createButtonKaisar() {
        button = new JButton("Calculate");
        class AddInterestListener implements ActionListener{

            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil : "+c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    
    private void createButtonsKaisar(){
        button1 = new JButton("Tambah");
        class AddInterestListener implements ActionListener{

            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int d = a + b;
                dLabel.setText("Hasil tambah  : "+d);
            }
        }
        ActionListener listener = new AddInterestListener();
        button1.addActionListener(listener);
    }

    private void createPanelKaisar() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(button1);
        panel.add(cLabel);
        panel.add(dLabel);
        add(panel);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm21841720206Kaisar();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
