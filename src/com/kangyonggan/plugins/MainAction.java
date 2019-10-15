package com.kangyonggan.plugins;

import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * @author kangyonggan
 * @since 2019-10-14
 */
public class MainAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // 存放在.idea/workspace.xml 的PropertiesComponent中
        // 可以存放普通配置（一般不要存放密码等敏感信息）
        PropertiesComponent propertiesComponent = PropertiesComponent.getInstance(e.getProject());
        propertiesComponent.setValue("url", "mysql:jdbc:xxx");
        System.out.println("save url");
        String url = propertiesComponent.getValue("url", "defaultUrl");
        System.out.println("get url:" + url);

        new MybatisGeneratorDialog();
    }

}
