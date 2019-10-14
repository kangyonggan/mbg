package com.kangyonggan.plugins;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        Input.reset(contentPane);
        // 布局
        contentPane.setLayout(null);
        // 背景
        contentPane.setBackground(null);
        // 标题
        setTitle("Mybatis Generator");
        // 大小
        setSize(800, 650);
        // 位置
        setLocationRelativeTo(null);
    }

    /**
     * 初始化表单
     */
    private void initForm() {
        new Input("Host", "127.0.0.1", "数据库IP地址");
        new Input("Port", "3306", "数据库端口");
        new Input("Database", "demodb", "数据库名称");
        new Input("User", "root", "用户名");
        new Input("Password", "123456", "密码");
        new Input("Table Name", "tb_user", "表名");
        new Input("Model Name", "User", "实体名");
        new Input("Model Project", "src/main/java", "实体所在的项目");
        new Input("Model Package", "com.kangyonggan.demo.model", "实体所在的包名");
        new Input("Mapper Java Project", "src/main/java", "Mapper.java所在的项目");
        new Input("Mapper Java Package", "com.kangyonggan.demo.mapper", "Mapper.java所在的包名");
        new Input("Mapper Xml Project", "src/main/resources", "Mapper.xml所在的项目");
        new Input("Mapper Xml Package", "mapper", "Mapper.xml所在的包名");

        JCheckBox mapperPlugin = new JCheckBox("Mapper Plugin");
        mapperPlugin.setSelected(true);
        mapperPlugin.setBounds(256, Input.getY(), 130, 35);
        contentPane.add(mapperPlugin);

        JCheckBox serializablePlugin = new JCheckBox("Serializable Plugin");
        serializablePlugin.setSelected(true);
        serializablePlugin.setBounds(390, Input.getY(), 130, 35);
        contentPane.add(serializablePlugin);

        JCheckBox lombokPlugin = new JCheckBox("Lombok Plugin");
        lombokPlugin.setSelected(true);
        lombokPlugin.setBounds(530, Input.getY(), 130, 35);
        contentPane.add(lombokPlugin);

        // OK Button
        JButton genButton = new JButton("Generate");
        genButton.setBounds(259, 560, 100, 35);
        genButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onGenerate();
            }
        });
        contentPane.add(genButton);

        // Revert Button
        JButton revertButton = new JButton("Revert");
        revertButton.setBounds(390, 560, 100, 35);
        revertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onRevert();
            }
        });
        contentPane.add(revertButton);
    }

    private void onGenerate() {
        dispose();
    }

    private void onRevert() {
        dispose();
    }
}
