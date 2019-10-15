package com.kangyonggan.plugins;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;

/**
 * @author kangyonggan
 * @since 2019-10-15
 */
@State(name = "mbg", storages = {@Storage("mbg.xml")})
class MyService implements PersistentStateComponent<MyService.State> {

    static class State {
        public String host;
        public String port;
        public String database;
        public String user;
        public String password;
        public String tableName;
        public String modelName;
        public String modelProject;
        public String modelPackage;
        public String mapperJavaProject;
        public String mapperJavaPackage;
        public String mapperXmlProject;
        public String mapperXmlPackage;
        public boolean mapperPlugin;
        public boolean serializablePlugin;
        public boolean lombokPlugin;
    }

    private State myState;

    @Override
    public State getState() {
        return myState;
    }

    @Override
    public void loadState(State state) {
        myState = state;
    }

    public static MyService getInstance() {
        return ServiceManager.getService(MyService.class);
    }
}
