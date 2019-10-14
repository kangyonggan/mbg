package com.kangyonggan.plugins;

import javax.swing.*;

/**
 * @author kangyonggan
 * @since 2019/10/14
 */
public class Input {

    private static final int HEIGHT = 30;
    private static final int LABEL_WIDTH = 200;
    private static final int LABEL_X = 50;
    private static final int TEXT_FIELD_X = 260;
    private static final int TEXT_FIELD_WIDTH = 400;
    private static final int STEP_Y = 38;

    private static JPanel contentPane;
    private static int y;

    public static void reset(JPanel jPanel) {
        contentPane = jPanel;
        y = 10;
    }

    public static int getY() {
        return y;
    }

    public Input(String label, String text, String tip) {
        JLabel jLabel = new JLabel(label + "：");
        jLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel.setBounds(LABEL_X, y, LABEL_WIDTH, HEIGHT);
        contentPane.add(jLabel);

        JTextField jTextField = new JTextField();
        jTextField.setToolTipText(tip);
        jTextField.setText(text);
        jTextField.setBounds(TEXT_FIELD_X, y, TEXT_FIELD_WIDTH, HEIGHT);
        contentPane.add(jTextField);

        y += STEP_Y;
    }

}
