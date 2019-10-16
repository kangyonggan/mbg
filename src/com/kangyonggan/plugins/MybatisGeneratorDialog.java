package com.kangyonggan.plugins;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author kangyonggan
 * @since 2019-10-14
 */
public class MybatisGeneratorDialog extends JDialog {

    private JPanel contentPane;
    private Project project;
    private SettingService settingService;

    /**
     * 对话框入口
     *
     * @param project
     */
    public MybatisGeneratorDialog(Project project) {
        this.project = project;
        this.settingService = ServiceManager.getService(project, SettingService.class);
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
        Input.reset(contentPane, project);

        // 布局
        contentPane.setLayout(null);
        // 背景
        contentPane.setBackground(null);
        // 标题
        setTitle("Mybatis Generator");
        // 大小
        setSize(800, 590);
        // 位置
        setLocationRelativeTo(null);
    }

    /**
     * 初始化表单
     */
    private void initForm() {
        new Input("DriverClass", "连接数据库驱动");
        new Input("Url", "数据库连接地址");
        new Input("User", "用户名");
        new Input("Password", "密码");
        new Input("Table Name", "表名");
        new Input("Model Name", "实体名");
        new Input("Model Project", "实体所在的项目");
        new Input("Model Package", "实体所在的包名");
        new Input("Mapper Java Project", "Mapper.java所在的项目");
        new Input("Mapper Java Package", "Mapper.java所在的包名");
        new Input("Mapper Xml Project", "Mapper.xml所在的项目");
        new Input("Mapper Xml Package", "Mapper.xml所在的包名");

        JCheckBox mapperPlugin = new JCheckBox("Mapper Plugin");
        mapperPlugin.setToolTipText("是否使用通用Mapper插件");
        mapperPlugin.setSelected(settingService.isMapperPlugin());
        mapperPlugin.setBounds(260, Input.getY(), 130, 35);
        contentPane.add(mapperPlugin);

        JCheckBox serializablePlugin = new JCheckBox("Serializable Plugin");
        serializablePlugin.setToolTipText("是否使用序列化插件");
        serializablePlugin.setSelected(settingService.isSerializablePlugin());
        serializablePlugin.setBounds(390, Input.getY(), 150, 35);
        contentPane.add(serializablePlugin);

        JCheckBox lombokPlugin = new JCheckBox("Lombok Plugin");
        lombokPlugin.setToolTipText("是否使用Lombok插件");
        lombokPlugin.setSelected(settingService.isLombokPlugin());
        lombokPlugin.setBounds(540, Input.getY(), 130, 35);
        contentPane.add(lombokPlugin);

        // OK Button
        JButton genButton = new JButton("Generate");
        genButton.setBounds(260, Input.getY() + 50, 100, 35);
        genButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onGenerate();
            }
        });
        contentPane.add(genButton);

        // Revert Button
        JButton revertButton = new JButton("Revert");
        revertButton.setBounds(390, Input.getY() + 50, 100, 35);
        revertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onRevert();
            }
        });
        contentPane.add(revertButton);
    }

    private void onGenerate() {
        String[] args = new String[2];
        args[0] = "-configfile";
        args[1] = "generatorConfig.xml";
        MbgRunner.main(args);
    }

    private void onRevert() {
        dispose();
    }
}
