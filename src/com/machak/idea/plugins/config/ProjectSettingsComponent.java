/*
 * Copyright 2013 m.milicevic (http://www.machak.com)
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package com.machak.idea.plugins.config;


import javax.swing.JComponent;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;

import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class ProjectSettingsComponent extends BaseConfig implements Configurable {


    private PluginConfiguration configPane;

    public ProjectSettingsComponent(@NotNull Project project) {
        this.state = StorageState.getInstance(project);
    }

    @Nullable
    @Override
    public String getHelpTopic() {
        return null;
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        if (configPane == null) {
            configPane = new PluginConfiguration();
        }
        return configPane.createComponent();
    }

    @Override
    public boolean isModified() {
        return configPane != null && configPane.isModified(state);
    }

    @Override
    public void apply() throws ConfigurationException {
        if (configPane != null) {
            configPane.setData(state);
        }
    }

    @Override
    public void reset() {
        if (configPane != null) {
            configPane.getData(state);
        }
    }

    @Override
    public void disposeUIResources() {
        configPane = null;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return "Hippo shared libs (Project)";
    }


}
