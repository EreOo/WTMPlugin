package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.popup.Balloon;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.WindowManager;
import com.intellij.ui.awt.RelativePoint;
import settings.WTMSettings;
import utils.GuiUtil;
import view.MainPanel;

import javax.swing.*;

import static com.intellij.util.PlatformIcons.SYNCHRONIZE_ICON;

public class RefreshToolWindowState extends AnAction {
    private com.intellij.openapi.project.Project project;

    public RefreshToolWindowState(){
        super("Refresh", "Create draft class", SYNCHRONIZE_ICON);
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        this.project = e.getProject();
        MainPanel.getInstance(e.getProject()).refresh();
    }

    public void update(AnActionEvent e){
//        if(!WTMSettings.getInstance(e.getProject()).isLogged){
//            StatusBar statusBar = WindowManager.getInstance()
//                    .getStatusBar(project);
//
//            JBPopupFactory.getInstance()
//                    .createHtmlTextBalloonBuilder("You are not logged in, <br>so may be not allowed to use plugin fully", MessageType.ERROR, null)
//                    .setFadeoutTime(7500)
//                    .createBalloon()
//                    .show(RelativePoint.getCenterOf(statusBar.getComponent()),
//                            Balloon.Position.atLeft);
//
//        }

    }
}