package Jobsheet11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm1841720206Kaisar extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JTextField mAField;
    private JTextField mBField;
    private JButton mButton;
    private JPanel mPanel;

    public MyInputForm1841720206Kaisar() {
        createTextFieldKaisar();
        createButtonKaisar();
        createPanelKaisar();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextFieldKaisar() {
        mALabel = new JLabel("Nilai A : ");
        mBLabel = new JLabel("Nilai B : ");
        mCLabel = new JLabel("Hasil : ");

        final int FIELD_WIDTH = 10;
        mAField = new JTextField(FIELD_WIDTH);
        mAField.setText("0");
        mBField = new JTextField(FIELD_WIDTH);
        mBField.setText("0");
    }

    private void createButtonKaisar() {
        mButton = new JButton("Calculate");
        class AddInterestListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(mAField.getText());
                int b = Integer.valueOf(mBField.getText());
                int c = a * b;
                mCLabel.setText("Hasil : " + c);
            }
        }
        ActionListener listener = new AddInterestListener();
        mButton.addActionListener(listener);
    }

    private void createPanelKaisar() {
        mPanel = new JPanel();
        mPanel.add(mALabel);
        mPanel.add(mAField);
        mPanel.add(mBLabel);
        mPanel.add(mBField);
        mPanel.add(mButton);
        mPanel.add(mCLabel);
        add(mPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm1841720206Kaisar();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
