/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.ui.util.UIBuilder;

import java.util.Hashtable;

public abstract class StateMachineBase extends UIBuilder {
    public static final int COMMAND_MainNewProject = 1;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    private Container aboutToShowThisContainer;

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    /**
    * @deprecated use the version that accepts a resource as an argument instead

**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("DateSpinner", com.codename1.ui.spinner.DateSpinner.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("DateSpinner", com.codename1.ui.spinner.DateSpinner.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public com.codename1.ui.TextField findNewUserEntryOrgTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("newUserEntryOrgTextField", root);
    }

    public com.codename1.ui.TextField findNewUserEntryOrgTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("newUserEntryOrgTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("newUserEntryOrgTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewUserEntryCancelButton(Component root) {
        return (com.codename1.ui.Button)findByName("newUserEntryCancelButton", root);
    }

    public com.codename1.ui.Button findNewUserEntryCancelButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newUserEntryCancelButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newUserEntryCancelButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewBoreDataCancelButton(Component root) {
        return (com.codename1.ui.Button)findByName("newBoreDataCancelButton", root);
    }

    public com.codename1.ui.Button findNewBoreDataCancelButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newBoreDataCancelButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newBoreDataCancelButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewProjectSubmittedToAddButton(Component root) {
        return (com.codename1.ui.Button)findByName("newProjectSubmittedToAddButton", root);
    }

    public com.codename1.ui.Button findNewProjectSubmittedToAddButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newProjectSubmittedToAddButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newProjectSubmittedToAddButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNewBoreEntryLongitudeTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("newBoreEntryLongitudeTextField", root);
    }

    public com.codename1.ui.TextField findNewBoreEntryLongitudeTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("newBoreEntryLongitudeTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("newBoreEntryLongitudeTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer4(Component root) {
        return (com.codename1.ui.Container)findByName("Container4", root);
    }

    public com.codename1.ui.Container findContainer4() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewProjectDateOfTestingAddButton(Component root) {
        return (com.codename1.ui.Button)findByName("newProjectDateOfTestingAddButton", root);
    }

    public com.codename1.ui.Button findNewProjectDateOfTestingAddButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newProjectDateOfTestingAddButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newProjectDateOfTestingAddButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.DateSpinner findDateOfTestingDateSpinner(Component root) {
        return (com.codename1.ui.spinner.DateSpinner)findByName("dateOfTestingDateSpinner", root);
    }

    public com.codename1.ui.spinner.DateSpinner findDateOfTestingDateSpinner() {
        com.codename1.ui.spinner.DateSpinner cmp = (com.codename1.ui.spinner.DateSpinner)findByName("dateOfTestingDateSpinner", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.DateSpinner)findByName("dateOfTestingDateSpinner", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer7(Component root) {
        return (com.codename1.ui.Container)findByName("Container7", root);
    }

    public com.codename1.ui.Container findContainer7() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer5(Component root) {
        return (com.codename1.ui.Container)findByName("Container5", root);
    }

    public com.codename1.ui.Container findContainer5() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer6(Component root) {
        return (com.codename1.ui.Container)findByName("Container6", root);
    }

    public com.codename1.ui.Container findContainer6() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewBoreEntrySaveButton(Component root) {
        return (com.codename1.ui.Button)findByName("newBoreEntrySaveButton", root);
    }

    public com.codename1.ui.Button findNewBoreEntrySaveButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newBoreEntrySaveButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newBoreEntrySaveButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewBoreDataSaveButton(Component root) {
        return (com.codename1.ui.Button) findByName("newBoreDataSaveButton", root);
    }

    public com.codename1.ui.Button findNewBoreDataSaveButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button) findByName("newBoreDataSaveButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button) findByName("newBoreDataSaveButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewprojectLoadDataButton(Component root) {
        return (com.codename1.ui.Button) findByName("newprojectLoadDataButton", root);
    }

    public com.codename1.ui.Button findNewprojectLoadDataButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button) findByName("newprojectLoadDataButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button) findByName("newprojectLoadDataButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findNewProjectDateOfTestingList(Component root) {
        return (com.codename1.ui.List)findByName("newProjectDateOfTestingList", root);
    }

    public com.codename1.ui.List findNewProjectDateOfTestingList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("newProjectDateOfTestingList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("newProjectDateOfTestingList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewProjectPreparedByAddButton(Component root) {
        return (com.codename1.ui.Button)findByName("newProjectPreparedByAddButton", root);
    }

    public com.codename1.ui.Button findNewProjectPreparedByAddButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newProjectPreparedByAddButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newProjectPreparedByAddButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewProjectTypeOfStructureSaveButton(Component root) {
        return (com.codename1.ui.Button) findByName("newProjectTypeOfStructureSaveButton", root);
    }

    public com.codename1.ui.Button findNewProjectTypeOfStructureSaveButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button) findByName("newProjectTypeOfStructureSaveButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button) findByName("newProjectTypeOfStructureSaveButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewProjectCancelButton(Component root) {
        return (com.codename1.ui.Button)findByName("newProjectCancelButton", root);
    }

    public com.codename1.ui.Button findNewProjectCancelButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newProjectCancelButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newProjectCancelButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findNewProjectInPresenceOfList(Component root) {
        return (com.codename1.ui.List)findByName("newProjectInPresenceOfList", root);
    }

    public com.codename1.ui.List findNewProjectInPresenceOfList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("newProjectInPresenceOfList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("newProjectInPresenceOfList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNewBoreDataNTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("newBoreDataNTextField", root);
    }

    public com.codename1.ui.TextField findNewBoreDataNTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("newBoreDataNTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("newBoreDataNTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findDateOfTestingCancelButton(Component root) {
        return (com.codename1.ui.Button)findByName("dateOfTestingCancelButton", root);
    }

    public com.codename1.ui.Button findDateOfTestingCancelButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("dateOfTestingCancelButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("dateOfTestingCancelButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewProjectBoresAddButton(Component root) {
        return (com.codename1.ui.Button) findByName("newProjectBoresAddButton", root);
    }

    public com.codename1.ui.Button findNewProjectBoresAddButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button) findByName("newProjectBoresAddButton", Display.getInstance().getCurrent());
        if (cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button) findByName("newProjectBoresAddButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNewBoreEntryLatitudeTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("newBoreEntryLatitudeTextField", root);
    }

    public com.codename1.ui.TextField findNewBoreEntryLatitudeTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("newBoreEntryLatitudeTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("newBoreEntryLatitudeTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewBoreDataEntryAddButton(Component root) {
        return (com.codename1.ui.Button)findByName("newBoreDataEntryAddButton", root);
    }

    public com.codename1.ui.Button findNewBoreDataEntryAddButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newBoreDataEntryAddButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newBoreDataEntryAddButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findNewProjectBoresList(Component root) {
        return (com.codename1.ui.List)findByName("newProjectBoresList", root);
    }

    public com.codename1.ui.List findNewProjectBoresList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("newProjectBoresList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("newProjectBoresList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNewUserEntryDesgTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("newUserEntryDesgTextField", root);
    }

    public com.codename1.ui.TextField findNewUserEntryDesgTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("newUserEntryDesgTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("newUserEntryDesgTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNewUserEntryContactTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("newUserEntryContactTextField", root);
    }

    public com.codename1.ui.TextField findNewUserEntryContactTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("newUserEntryContactTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("newUserEntryContactTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNewBoreDataDTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("newBoreDataDTextField", root);
    }

    public com.codename1.ui.TextField findNewBoreDataDTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("newBoreDataDTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("newBoreDataDTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewBoreEntryCancelButton(Component root) {
        return (com.codename1.ui.Button)findByName("newBoreEntryCancelButton", root);
    }

    public com.codename1.ui.Button findNewBoreEntryCancelButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newBoreEntryCancelButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newBoreEntryCancelButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewUserEntrySaveButton(Component root) {
        return (com.codename1.ui.Button)findByName("newUserEntrySaveButton", root);
    }

    public com.codename1.ui.Button findNewUserEntrySaveButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newUserEntrySaveButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newUserEntrySaveButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel5(Component root) {
        return (com.codename1.ui.Label)findByName("Label5", root);
    }

    public com.codename1.ui.Label findLabel5() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel4(Component root) {
        return (com.codename1.ui.Label)findByName("Label4", root);
    }

    public com.codename1.ui.Label findLabel4() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findNewProjectPreparedByList(Component root) {
        return (com.codename1.ui.List)findByName("newProjectPreparedByList", root);
    }

    public com.codename1.ui.List findNewProjectPreparedByList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("newProjectPreparedByList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("newProjectPreparedByList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNewBoreDataTypeOfSoilTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("newBoreDataTypeOfSoilTextField", root);
    }

    public com.codename1.ui.TextField findNewBoreDataTypeOfSoilTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("newBoreDataTypeOfSoilTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("newBoreDataTypeOfSoilTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findNewBoreDataList(Component root) {
        return (com.codename1.ui.List)findByName("newBoreDataList", root);
    }

    public com.codename1.ui.List findNewBoreDataList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("newBoreDataList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("newBoreDataList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewProjectInPresenceOfAddButton(Component root) {
        return (com.codename1.ui.Button)findByName("newProjectInPresenceOfAddButton", root);
    }

    public com.codename1.ui.Button findNewProjectInPresenceOfAddButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newProjectInPresenceOfAddButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newProjectInPresenceOfAddButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findNewProjectSubmittedToList(Component root) {
        return (com.codename1.ui.List)findByName("newProjectSubmittedToList", root);
    }

    public com.codename1.ui.List findNewProjectSubmittedToList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("newProjectSubmittedToList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("newProjectSubmittedToList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewBoreEntryGetLocationButton(Component root) {
        return (com.codename1.ui.Button)findByName("newBoreEntryGetLocationButton", root);
    }

    public com.codename1.ui.Button findNewBoreEntryGetLocationButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newBoreEntryGetLocationButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newBoreEntryGetLocationButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNewUserEntryNameTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("newUserEntryNameTextField", root);
    }

    public com.codename1.ui.TextField findNewUserEntryNameTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("newUserEntryNameTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("newUserEntryNameTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findNewProjectTypeOfStructureComboBox(Component root) {
        return (com.codename1.ui.ComboBox)findByName("newProjectTypeOfStructureComboBox", root);
    }

    public com.codename1.ui.ComboBox findNewProjectTypeOfStructureComboBox() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("newProjectTypeOfStructureComboBox", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("newProjectTypeOfStructureComboBox", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findDateOfTestingSaveButton(Component root) {
        return (com.codename1.ui.Button)findByName("dateOfTestingSaveButton", root);
    }

    public com.codename1.ui.Button findDateOfTestingSaveButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("dateOfTestingSaveButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("dateOfTestingSaveButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNewBoreDataLTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("newBoreDataLTextField", root);
    }

    public com.codename1.ui.TextField findNewBoreDataLTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("newBoreDataLTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("newBoreDataLTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected boolean onMainNewProject() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_MainNewProject:
                if(onMainNewProject()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("newBoreEntry".equals(f.getName())) {
            exitNewBoreEntry(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("dateOftestingDialog".equals(f.getName())) {
            exitDateOftestingDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("newUserEntry".equals(f.getName())) {
            exitNewUserEntry(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("newProject".equals(f.getName())) {
            exitNewProject(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("newBoreData".equals(f.getName())) {
            exitNewBoreData(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitNewBoreEntry(Form f) {
    }


    protected void exitDateOftestingDialog(Form f) {
    }


    protected void exitNewUserEntry(Form f) {
    }


    protected void exitNewProject(Form f) {
    }


    protected void exitNewBoreData(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("newBoreEntry".equals(f.getName())) {
            beforeNewBoreEntry(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("dateOftestingDialog".equals(f.getName())) {
            beforeDateOftestingDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("newUserEntry".equals(f.getName())) {
            beforeNewUserEntry(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("newProject".equals(f.getName())) {
            beforeNewProject(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("newBoreData".equals(f.getName())) {
            beforeNewBoreData(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeNewBoreEntry(Form f) {
    }


    protected void beforeDateOftestingDialog(Form f) {
    }


    protected void beforeNewUserEntry(Form f) {
    }


    protected void beforeNewProject(Form f) {
    }


    protected void beforeNewBoreData(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("newBoreEntry".equals(c.getName())) {
            beforeContainerNewBoreEntry(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("dateOftestingDialog".equals(c.getName())) {
            beforeContainerDateOftestingDialog(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("newUserEntry".equals(c.getName())) {
            beforeContainerNewUserEntry(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("newProject".equals(c.getName())) {
            beforeContainerNewProject(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("newBoreData".equals(c.getName())) {
            beforeContainerNewBoreData(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerNewBoreEntry(Container c) {
    }


    protected void beforeContainerDateOftestingDialog(Container c) {
    }


    protected void beforeContainerNewUserEntry(Container c) {
    }


    protected void beforeContainerNewProject(Container c) {
    }


    protected void beforeContainerNewBoreData(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("newBoreEntry".equals(f.getName())) {
            postNewBoreEntry(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("dateOftestingDialog".equals(f.getName())) {
            postDateOftestingDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("newUserEntry".equals(f.getName())) {
            postNewUserEntry(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("newProject".equals(f.getName())) {
            postNewProject(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("newBoreData".equals(f.getName())) {
            postNewBoreData(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postNewBoreEntry(Form f) {
    }


    protected void postDateOftestingDialog(Form f) {
    }


    protected void postNewUserEntry(Form f) {
    }


    protected void postNewProject(Form f) {
    }


    protected void postNewBoreData(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("newBoreEntry".equals(c.getName())) {
            postContainerNewBoreEntry(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("dateOftestingDialog".equals(c.getName())) {
            postContainerDateOftestingDialog(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("newUserEntry".equals(c.getName())) {
            postContainerNewUserEntry(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("newProject".equals(c.getName())) {
            postContainerNewProject(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("newBoreData".equals(c.getName())) {
            postContainerNewBoreData(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerNewBoreEntry(Container c) {
    }


    protected void postContainerDateOftestingDialog(Container c) {
    }


    protected void postContainerNewUserEntry(Container c) {
    }


    protected void postContainerNewProject(Container c) {
    }


    protected void postContainerNewBoreData(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("newBoreEntry".equals(rootName)) {
            onCreateNewBoreEntry();
            aboutToShowThisContainer = null;
            return;
        }

        if("dateOftestingDialog".equals(rootName)) {
            onCreateDateOftestingDialog();
            aboutToShowThisContainer = null;
            return;
        }

        if("newUserEntry".equals(rootName)) {
            onCreateNewUserEntry();
            aboutToShowThisContainer = null;
            return;
        }

        if("newProject".equals(rootName)) {
            onCreateNewProject();
            aboutToShowThisContainer = null;
            return;
        }

        if("newBoreData".equals(rootName)) {
            onCreateNewBoreData();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateNewBoreEntry() {
    }


    protected void onCreateDateOftestingDialog() {
    }


    protected void onCreateNewUserEntry() {
    }


    protected void onCreateNewProject() {
    }


    protected void onCreateNewBoreData() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("newBoreEntry".equals(f.getName())) {
            getStateNewBoreEntry(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("dateOftestingDialog".equals(f.getName())) {
            getStateDateOftestingDialog(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("newUserEntry".equals(f.getName())) {
            getStateNewUserEntry(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("newProject".equals(f.getName())) {
            getStateNewProject(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("newBoreData".equals(f.getName())) {
            getStateNewBoreData(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateNewBoreEntry(Form f, Hashtable h) {
    }


    protected void getStateDateOftestingDialog(Form f, Hashtable h) {
    }


    protected void getStateNewUserEntry(Form f, Hashtable h) {
    }


    protected void getStateNewProject(Form f, Hashtable h) {
    }


    protected void getStateNewBoreData(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("newBoreEntry".equals(f.getName())) {
            setStateNewBoreEntry(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("dateOftestingDialog".equals(f.getName())) {
            setStateDateOftestingDialog(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("newUserEntry".equals(f.getName())) {
            setStateNewUserEntry(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("newProject".equals(f.getName())) {
            setStateNewProject(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("newBoreData".equals(f.getName())) {
            setStateNewBoreData(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateNewBoreEntry(Form f, Hashtable state) {
    }


    protected void setStateDateOftestingDialog(Form f, Hashtable state) {
    }


    protected void setStateNewUserEntry(Form f, Hashtable state) {
    }


    protected void setStateNewProject(Form f, Hashtable state) {
    }


    protected void setStateNewBoreData(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("newProjectDateOfTestingList".equals(listName)) {
            return initListModelNewProjectDateOfTestingList(cmp);
        }
        if("newProjectInPresenceOfList".equals(listName)) {
            return initListModelNewProjectInPresenceOfList(cmp);
        }
        if("newProjectBoresList".equals(listName)) {
            return initListModelNewProjectBoresList(cmp);
        }
        if("newProjectPreparedByList".equals(listName)) {
            return initListModelNewProjectPreparedByList(cmp);
        }
        if("newBoreDataList".equals(listName)) {
            return initListModelNewBoreDataList(cmp);
        }
        if("newProjectSubmittedToList".equals(listName)) {
            return initListModelNewProjectSubmittedToList(cmp);
        }
        if("newProjectTypeOfStructureComboBox".equals(listName)) {
            return initListModelNewProjectTypeOfStructureComboBox(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelNewProjectDateOfTestingList(List cmp) {
        return false;
    }

    protected boolean initListModelNewProjectInPresenceOfList(List cmp) {
        return false;
    }

    protected boolean initListModelNewProjectBoresList(List cmp) {
        return false;
    }

    protected boolean initListModelNewProjectPreparedByList(List cmp) {
        return false;
    }

    protected boolean initListModelNewBoreDataList(List cmp) {
        return false;
    }

    protected boolean initListModelNewProjectSubmittedToList(List cmp) {
        return false;
    }

    protected boolean initListModelNewProjectTypeOfStructureComboBox(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("newBoreEntry")) {
            if("newBoreEntrySaveButton".equals(c.getName())) {
                onNewBoreEntry_NewBoreEntrySaveButtonAction(c, event);
                return;
            }
            if("newBoreEntryCancelButton".equals(c.getName())) {
                onNewBoreEntry_NewBoreEntryCancelButtonAction(c, event);
                return;
            }
            if("newBoreEntryLatitudeTextField".equals(c.getName())) {
                onNewBoreEntry_NewBoreEntryLatitudeTextFieldAction(c, event);
                return;
            }
            if("newBoreEntryLongitudeTextField".equals(c.getName())) {
                onNewBoreEntry_NewBoreEntryLongitudeTextFieldAction(c, event);
                return;
            }
            if("newBoreEntryGetLocationButton".equals(c.getName())) {
                onNewBoreEntry_NewBoreEntryGetLocationButtonAction(c, event);
                return;
            }
            if("newBoreDataList".equals(c.getName())) {
                onNewBoreEntry_NewBoreDataListAction(c, event);
                return;
            }
            if("newBoreDataEntryAddButton".equals(c.getName())) {
                onNewBoreEntry_NewBoreDataEntryAddButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("dateOftestingDialog")) {
            if("dateOfTestingSaveButton".equals(c.getName())) {
                onDateOftestingDialog_DateOfTestingSaveButtonAction(c, event);
                return;
            }
            if("dateOfTestingCancelButton".equals(c.getName())) {
                onDateOftestingDialog_DateOfTestingCancelButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("newUserEntry")) {
            if("newUserEntryNameTextField".equals(c.getName())) {
                onNewUserEntry_NewUserEntryNameTextFieldAction(c, event);
                return;
            }
            if("newUserEntryDesgTextField".equals(c.getName())) {
                onNewUserEntry_NewUserEntryDesgTextFieldAction(c, event);
                return;
            }
            if("newUserEntryOrgTextField".equals(c.getName())) {
                onNewUserEntry_NewUserEntryOrgTextFieldAction(c, event);
                return;
            }
            if("newUserEntryContactTextField".equals(c.getName())) {
                onNewUserEntry_NewUserEntryContactTextFieldAction(c, event);
                return;
            }
            if("newUserEntrySaveButton".equals(c.getName())) {
                onNewUserEntry_NewUserEntrySaveButtonAction(c, event);
                return;
            }
            if("newUserEntryCancelButton".equals(c.getName())) {
                onNewUserEntry_NewUserEntryCancelButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("newProject")) {
            if ("newprojectLoadDataButton".equals(c.getName())) {
                onNewProject_NewprojectLoadDataButtonAction(c, event);
                return;
            }
            if("newProjectCancelButton".equals(c.getName())) {
                onNewProject_NewProjectCancelButtonAction(c, event);
                return;
            }
            if("newProjectDateOfTestingList".equals(c.getName())) {
                onNewProject_NewProjectDateOfTestingListAction(c, event);
                return;
            }
            if("newProjectDateOfTestingAddButton".equals(c.getName())) {
                onNewProject_NewProjectDateOfTestingAddButtonAction(c, event);
                return;
            }
            if("newProjectSubmittedToList".equals(c.getName())) {
                onNewProject_NewProjectSubmittedToListAction(c, event);
                return;
            }
            if("newProjectSubmittedToAddButton".equals(c.getName())) {
                onNewProject_NewProjectSubmittedToAddButtonAction(c, event);
                return;
            }
            if("newProjectPreparedByList".equals(c.getName())) {
                onNewProject_NewProjectPreparedByListAction(c, event);
                return;
            }
            if("newProjectPreparedByAddButton".equals(c.getName())) {
                onNewProject_NewProjectPreparedByAddButtonAction(c, event);
                return;
            }
            if("newProjectInPresenceOfList".equals(c.getName())) {
                onNewProject_NewProjectInPresenceOfListAction(c, event);
                return;
            }
            if("newProjectInPresenceOfAddButton".equals(c.getName())) {
                onNewProject_NewProjectInPresenceOfAddButtonAction(c, event);
                return;
            }
            if("newProjectTypeOfStructureComboBox".equals(c.getName())) {
                onNewProject_NewProjectTypeOfStructureComboBoxAction(c, event);
                return;
            }
            if ("newProjectTypeOfStructureSaveButton".equals(c.getName())) {
                onNewProject_NewProjectTypeOfStructureSaveButtonAction(c, event);
                return;
            }
            if("newProjectBoresList".equals(c.getName())) {
                onNewProject_NewProjectBoresListAction(c, event);
                return;
            }
            if ("newProjectBoresAddButton".equals(c.getName())) {
                onNewProject_NewProjectBoresAddButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("newBoreData")) {
            if("newBoreDataDTextField".equals(c.getName())) {
                onNewBoreData_NewBoreDataDTextFieldAction(c, event);
                return;
            }
            if("newBoreDataNTextField".equals(c.getName())) {
                onNewBoreData_NewBoreDataNTextFieldAction(c, event);
                return;
            }
            if("newBoreDataLTextField".equals(c.getName())) {
                onNewBoreData_NewBoreDataLTextFieldAction(c, event);
                return;
            }
            if("newBoreDataTypeOfSoilTextField".equals(c.getName())) {
                onNewBoreData_NewBoreDataTypeOfSoilTextFieldAction(c, event);
                return;
            }
            if("newBoreDataSaveButton".equals(c.getName())) {
                onNewBoreData_NewBoreDataSaveButtonAction(c, event);
                return;
            }
            if("newBoreDataCancelButton".equals(c.getName())) {
                onNewBoreData_NewBoreDataCancelButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("Button".equals(c.getName())) {
                onMain_ButtonAction(c, event);
                return;
            }
        }
    }

      protected void onNewBoreEntry_NewBoreEntrySaveButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreEntry_NewBoreEntryCancelButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreEntry_NewBoreEntryLatitudeTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreEntry_NewBoreEntryLongitudeTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreEntry_NewBoreEntryGetLocationButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreEntry_NewBoreDataListAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreEntry_NewBoreDataEntryAddButtonAction(Component c, ActionEvent event) {
      }

      protected void onDateOftestingDialog_DateOfTestingSaveButtonAction(Component c, ActionEvent event) {
      }

      protected void onDateOftestingDialog_DateOfTestingCancelButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewUserEntry_NewUserEntryNameTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onNewUserEntry_NewUserEntryDesgTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onNewUserEntry_NewUserEntryOrgTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onNewUserEntry_NewUserEntryContactTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onNewUserEntry_NewUserEntrySaveButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewUserEntry_NewUserEntryCancelButtonAction(Component c, ActionEvent event) {
      }

    protected void onNewProject_NewprojectLoadDataButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectCancelButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectDateOfTestingListAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectDateOfTestingAddButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectSubmittedToListAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectSubmittedToAddButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectPreparedByListAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectPreparedByAddButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectInPresenceOfListAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectInPresenceOfAddButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectTypeOfStructureComboBoxAction(Component c, ActionEvent event) {
      }

    protected void onNewProject_NewProjectTypeOfStructureSaveButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectBoresListAction(Component c, ActionEvent event) {
      }

    protected void onNewProject_NewProjectBoresAddButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreData_NewBoreDataDTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreData_NewBoreDataNTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreData_NewBoreDataLTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreData_NewBoreDataTypeOfSoilTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreData_NewBoreDataSaveButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewBoreData_NewBoreDataCancelButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonAction(Component c, ActionEvent event) {
      }

}
