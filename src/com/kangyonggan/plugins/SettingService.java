package com.kangyonggan.plugins;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import com.intellij.util.xmlb.XmlSerializerUtil;

import java.lang.reflect.Method;

/**
 * @author kangyonggan
 * @since 2019-10-15
 */
@State(name = "com.kangyonggan.plugins.mbg", storages = {@Storage("settings.xml")})
class SettingService implements PersistentStateComponent<SettingService> {

    private String driverClass = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/demodb";
    private String user = "root";
    private String password = "123456";
    private String tableName = "tb_user";
    private String modelName = "User";
    private String modelProject = "src/main/java";
    private String modelPackage = "com.kangyonggan.demo.model";
    private String mapperJavaProject = "src/main/java";
    private String mapperJavaPackage = "com.kangyonggan.demo.mapper";
    private String mapperXmlProject = "src/main/resources";
    private String mapperXmlPackage = "mapper";
    private boolean mapperPlugin;
    private boolean serializablePlugin = true;
    private boolean lombokPlugin;

    @Override
    public SettingService getState() {
        return this;
    }

    @Override
    public void loadState(SettingService settingService) {
        XmlSerializerUtil.copyBean(settingService, this);
    }

    public static SettingService getInstance(Project project) {
        return ServiceManager.getService(project, SettingService.class);
    }

    public String getValueBySettingName(String settingName) {
        try {
            Method method = this.getClass().getDeclaredMethod("get" + settingName);
            return (String) method.invoke(this);
        } catch (Exception e) {
            return "";
        }
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelProject() {
        return modelProject;
    }

    public void setModelProject(String modelProject) {
        this.modelProject = modelProject;
    }

    public String getModelPackage() {
        return modelPackage;
    }

    public void setModelPackage(String modelPackage) {
        this.modelPackage = modelPackage;
    }

    public String getMapperJavaProject() {
        return mapperJavaProject;
    }

    public void setMapperJavaProject(String mapperJavaProject) {
        this.mapperJavaProject = mapperJavaProject;
    }

    public String getMapperJavaPackage() {
        return mapperJavaPackage;
    }

    public void setMapperJavaPackage(String mapperJavaPackage) {
        this.mapperJavaPackage = mapperJavaPackage;
    }

    public String getMapperXmlProject() {
        return mapperXmlProject;
    }

    public void setMapperXmlProject(String mapperXmlProject) {
        this.mapperXmlProject = mapperXmlProject;
    }

    public String getMapperXmlPackage() {
        return mapperXmlPackage;
    }

    public void setMapperXmlPackage(String mapperXmlPackage) {
        this.mapperXmlPackage = mapperXmlPackage;
    }

    public boolean isMapperPlugin() {
        return mapperPlugin;
    }

    public void setMapperPlugin(boolean mapperPlugin) {
        this.mapperPlugin = mapperPlugin;
    }

    public boolean isSerializablePlugin() {
        return serializablePlugin;
    }

    public void setSerializablePlugin(boolean serializablePlugin) {
        this.serializablePlugin = serializablePlugin;
    }

    public boolean isLombokPlugin() {
        return lombokPlugin;
    }

    public void setLombokPlugin(boolean lombokPlugin) {
        this.lombokPlugin = lombokPlugin;
    }
}
