package com.kangyonggan.plugins;

import javax.swing.*;

/**
 * @author kangyonggan
 * @since 2019-10-14
 */
public class MybatisGeneratorDialog extends JDialog {

    /**
     * 测试入口
     *
     * @param args
     */
    public static void main(String[] args) {
        new MybatisGeneratorDialog();
        System.exit(0);
    }

    private JPanel contentPane;

    /**
     * 对话框入口
     */
    public MybatisGeneratorDialog() {
        init();
    }

    /**
     * 初始化
     */
    private void init() {
        // 初始化对话框
        initDialog();

        // 初始化表单
        initForm();

        // 显示
        setModal(true);
        setVisible(true);
    }

    /**
     * 初始化对话框
     */
    private void initDialog() {
        setContentPane(contentPane);
        // 布局
        contentPane.setLayout(null);
        // 背景
        contentPane.setBackground(null);
        // 标题
        setTitle("Mybatis Generator");
        // 大小
        setSize(800, 640);
        // 位置
        setLocationRelativeTo(null);
    }

    /**
     * 初始化表单
     */
    private void initForm() {
        // Host TextField
        JTextField hostTextField = new JTextField();
        hostTextField.setToolTipText("数据库IP地址");
        hostTextField.setText("127.0.0.1");
        hostTextField.setBounds(260, 20, 400, 35);
        contentPane.add(hostTextField);
        // Host Label
        JLabel hostLabel = new JLabel("Host：");
        hostLabel.setBounds(50, 20, 200, 35);
        hostLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(hostLabel);

        // Port TextField
        JTextField portTextField = new JTextField();
        portTextField.setToolTipText("数据库端口");
        portTextField.setText("3306");
        portTextField.setBounds(260, 60, 400, 35);
        contentPane.add(portTextField);
        // Port Label
        JLabel portLabel = new JLabel("Port：");
        portLabel.setBounds(50, 60, 200, 35);
        portLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(portLabel);

        // Database TextField
        JTextField dbTextField = new JTextField();
        dbTextField.setToolTipText("数据库名称");
        dbTextField.setText("demodb");
        dbTextField.setBounds(260, 100, 400, 35);
        contentPane.add(dbTextField);
        // Database Label
        JLabel dbLabel = new JLabel("Database：");
        dbLabel.setBounds(50, 100, 200, 35);
        dbLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(dbLabel);

        // User TextField
        JTextField userTextField = new JTextField();
        userTextField.setToolTipText("用户名");
        userTextField.setText("root");
        userTextField.setBounds(260, 140, 400, 35);
        contentPane.add(userTextField);
        // User Label
        JLabel userLabel = new JLabel("User：");
        userLabel.setBounds(50, 140, 200, 35);
        userLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(userLabel);

        // Password TextField
        JTextField pwdTextField = new JTextField();
        pwdTextField.setToolTipText("密码");
        pwdTextField.setText("123456");
        pwdTextField.setBounds(260, 180, 400, 35);
        contentPane.add(pwdTextField);
        // Password Label
        JLabel pwdLabel = new JLabel("Password：");
        pwdLabel.setBounds(50, 180, 200, 35);
        pwdLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(pwdLabel);

        // Table TextField
        JTextField tableTextField = new JTextField();
        tableTextField.setToolTipText("表名");
        tableTextField.setText("tb_user");
        tableTextField.setBounds(260, 220, 400, 35);
        contentPane.add(tableTextField);
        // Table Label
        JLabel tableLabel = new JLabel("Table Name：");
        tableLabel.setBounds(50, 220, 200, 35);
        tableLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(tableLabel);

        // Domain TextField
        JTextField domainTextField = new JTextField();
        domainTextField.setToolTipText("实体名");
        domainTextField.setText("User");
        domainTextField.setBounds(260, 260, 400, 35);
        contentPane.add(domainTextField);
        // Domain Label
        JLabel domainLabel = new JLabel("Domain Name：");
        domainLabel.setBounds(50, 260, 200, 35);
        domainLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(domainLabel);

        // Domain Project TextField
        JTextField domainProjTextField = new JTextField();
        domainProjTextField.setToolTipText("实体所在的项目");
        domainProjTextField.setText("src/main/java");
        domainProjTextField.setBounds(260, 300, 400, 35);
        contentPane.add(domainProjTextField);
        // Domain Project Label
        JLabel domainProjLabel = new JLabel("Domain Project：");
        domainProjLabel.setBounds(50, 300, 200, 35);
        domainProjLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(domainProjLabel);

        // Domain Package TextField
        JTextField domainPkgTextField = new JTextField();
        domainPkgTextField.setToolTipText("实体所在的包名");
        domainPkgTextField.setText("com.kangyonggan.demo.model");
        domainPkgTextField.setBounds(260, 340, 400, 35);
        contentPane.add(domainPkgTextField);
        // Domain Package Label
        JLabel domainPkgLabel = new JLabel("Domain Package：");
        domainPkgLabel.setBounds(50, 340, 200, 35);
        domainPkgLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(domainPkgLabel);

        // Mapper Java Project TextField
        JTextField mpJavaTextField = new JTextField();
        mpJavaTextField.setToolTipText("Mapper.java所在的项目");
        mpJavaTextField.setText("src/main/java");
        mpJavaTextField.setBounds(260, 380, 400, 35);
        contentPane.add(mpJavaTextField);
        // Mapper Java Label
        JLabel mpJavaLabel = new JLabel("Mapper Java Project：");
        mpJavaLabel.setBounds(50, 380, 200, 35);
        mpJavaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(mpJavaLabel);

        // Mapper Java Package TextField
        JTextField mpJavaPkgTextField = new JTextField();
        mpJavaPkgTextField.setToolTipText("Mapper.java所在的包名");
        mpJavaPkgTextField.setText("com.kangyonggan.demo.mapper");
        mpJavaPkgTextField.setBounds(260, 420, 400, 35);
        contentPane.add(mpJavaPkgTextField);
        // Mapper Java Package Label
        JLabel mpJavaPckLabel = new JLabel("Mapper Java Package：");
        mpJavaPckLabel.setBounds(50, 420, 200, 35);
        mpJavaPckLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(mpJavaPckLabel);

        // Mapper Xml Project TextField
        JTextField mpXmlProjTextField = new JTextField();
        mpXmlProjTextField.setToolTipText("Mapper.xml所在的项目");
        mpXmlProjTextField.setText("src/main/resources");
        mpXmlProjTextField.setBounds(260, 460, 400, 35);
        contentPane.add(mpXmlProjTextField);
        // Mapper Xml Project Label
        JLabel mpXmlProjLabel = new JLabel("Mapper Xml Project：");
        mpXmlProjLabel.setBounds(50, 460, 200, 35);
        mpXmlProjLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(mpXmlProjLabel);

        // Mapper Xml Package TextField
        JTextField mpXmlPkgTextField = new JTextField();
        mpXmlPkgTextField.setToolTipText("Mapper.xml所在的包名");
        mpXmlPkgTextField.setText("mapper");
        mpXmlPkgTextField.setBounds(260, 500, 400, 35);
        contentPane.add(mpXmlPkgTextField);
        // Mapper Xml Package Label
        JLabel mpXmlPkgLabel = new JLabel("Mapper Xml Package：");
        mpXmlPkgLabel.setBounds(50, 500, 200, 35);
        mpXmlPkgLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(mpXmlPkgLabel);

        // OK Button
        JButton okButton = new JButton("Generate");
        okButton.setBounds(260, 560, 100, 35);
        contentPane.add(okButton);

        // OK Button
        JButton revertButton = new JButton("Revert");
        revertButton.setBounds(390, 560, 100, 35);
        contentPane.add(revertButton);
    }
}
