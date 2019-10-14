package com.kangyonggan.plugins;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * @author kangyonggan
 * @since 2019-10-14
 */
public class MainAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        new MybatisGeneratorDialog();
    }

}
