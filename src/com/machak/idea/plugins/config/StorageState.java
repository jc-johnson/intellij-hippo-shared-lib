/*
 * Copyright 2016 m.milicevic (http://www.machak.com)
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package com.machak.idea.plugins.config;


public class StorageState {
    //@Attribute("deleteAllJars")
    public boolean deleteAllJars;
    //@Attribute("copyOtherJars")
    public boolean copyOtherJars;
    //@Attribute("copyLog4J")
    public boolean copyLog4J;
    //@Attribute("showDialog")
    public boolean showDialog;
    //@Attribute("createProjectFile")
    public boolean createProjectFile;

    //@Tag("log4JDirectory")
    public String log4JDirectory;
    //@Tag("tomcatDirectory")
    public String tomcatDirectory;
    //@Tag("tomcatRootDirectory")
    public String tomcatRootDirectory;
    //@Tag("projectRootDirectory")
    public String projectRootDirectory;
    //@Tag("distFile")
    public String distFile;


    public boolean isDeleteAllJars() {
        return deleteAllJars;
    }

    public void setDeleteAllJars(final boolean deleteAllJars) {
        this.deleteAllJars = deleteAllJars;
    }

    public boolean isCopyOtherJars() {
        return copyOtherJars;
    }

    public void setCopyOtherJars(final boolean copyOtherJars) {
        this.copyOtherJars = copyOtherJars;
    }

    public boolean isCopyLog4J() {
        return copyLog4J;
    }

    public void setCopyLog4J(final boolean copyLog4J) {
        this.copyLog4J = copyLog4J;
    }

    public String getLog4JDirectory() {
        return log4JDirectory;
    }

    public void setLog4JDirectory(final String log4JDirectory) {
        this.log4JDirectory = log4JDirectory;
    }

    public String getTomcatDirectory() {
        return tomcatDirectory;
    }

    public void setTomcatDirectory(final String tomcatDirectory) {
        this.tomcatDirectory = tomcatDirectory;
    }

    public String getTomcatRootDirectory() {
        return tomcatRootDirectory;
    }

    public void setTomcatRootDirectory(final String tomcatRootDirectory) {
        this.tomcatRootDirectory = tomcatRootDirectory;
    }

    public String getProjectRootDirectory() {
        return projectRootDirectory;
    }

    public void setProjectRootDirectory(final String projectRootDirectory) {
        this.projectRootDirectory = projectRootDirectory;
    }

    public String getDistFile() {
        return distFile;
    }

    public void setDistFile(final String distFile) {
        this.distFile = distFile;
    }

    public boolean isShowDialog() {
        return showDialog;
    }

    public void setShowDialog(final boolean showDialog) {
        this.showDialog = showDialog;
    }

    public boolean isCreateProjectFile() {
        return createProjectFile;
    }

    public void setCreateProjectFile(final boolean createProjectFile) {
        this.createProjectFile = createProjectFile;
    }

}
