/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
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
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
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

    public com.codename1.ui.Button findNewprojectSaveButton(Component root) {
        return (com.codename1.ui.Button)findByName("newprojectSaveButton", root);
    }

    public com.codename1.ui.Button findNewprojectSaveButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newprojectSaveButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newprojectSaveButton", aboutToShowThisContainer);
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

    public com.codename1.ui.Button findNewPreojectInPresenceOfAddButton(Component root) {
        return (com.codename1.ui.Button)findByName("newPreojectInPresenceOfAddButton", root);
    }

    public com.codename1.ui.Button findNewPreojectInPresenceOfAddButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newPreojectInPresenceOfAddButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newPreojectInPresenceOfAddButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewProjectboresAddButton(Component root) {
        return (com.codename1.ui.Button)findByName("newProjectboresAddButton", root);
    }

    public com.codename1.ui.Button findNewProjectboresAddButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("newProjectboresAddButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("newProjectboresAddButton", aboutToShowThisContainer);
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

    protected void exitForm(Form f) {
        if("newProject".equals(f.getName())) {
            exitNewProject(f);
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


    protected void exitNewProject(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("newProject".equals(f.getName())) {
            beforeNewProject(f);
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


    protected void beforeNewProject(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("newProject".equals(c.getName())) {
            beforeContainerNewProject(c);
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


    protected void beforeContainerNewProject(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("newProject".equals(f.getName())) {
            postNewProject(f);
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


    protected void postNewProject(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("newProject".equals(c.getName())) {
            postContainerNewProject(c);
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


    protected void postContainerNewProject(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("newProject".equals(rootName)) {
            onCreateNewProject();
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


    protected void onCreateNewProject() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("newProject".equals(f.getName())) {
            getStateNewProject(f, h);
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


    protected void getStateNewProject(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("newProject".equals(f.getName())) {
            setStateNewProject(f, state);
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


    protected void setStateNewProject(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("newProjectBoresList".equals(listName)) {
            return initListModelNewProjectBoresList(cmp);
        }
        if("newProjectDateOfTestingList".equals(listName)) {
            return initListModelNewProjectDateOfTestingList(cmp);
        }
        if("newProjectPreparedByList".equals(listName)) {
            return initListModelNewProjectPreparedByList(cmp);
        }
        if("newProjectSubmittedToList".equals(listName)) {
            return initListModelNewProjectSubmittedToList(cmp);
        }
        if("newProjectTypeOfStructureComboBox".equals(listName)) {
            return initListModelNewProjectTypeOfStructureComboBox(cmp);
        }
        if("newProjectInPresenceOfList".equals(listName)) {
            return initListModelNewProjectInPresenceOfList(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelNewProjectBoresList(List cmp) {
        return false;
    }

    protected boolean initListModelNewProjectDateOfTestingList(List cmp) {
        return false;
    }

    protected boolean initListModelNewProjectPreparedByList(List cmp) {
        return false;
    }

    protected boolean initListModelNewProjectSubmittedToList(List cmp) {
        return false;
    }

    protected boolean initListModelNewProjectTypeOfStructureComboBox(List cmp) {
        return false;
    }

    protected boolean initListModelNewProjectInPresenceOfList(List cmp) {
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
        if(rootContainerName.equals("newProject")) {
            if("newprojectSaveButton".equals(c.getName())) {
                onNewProject_NewprojectSaveButtonAction(c, event);
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
            if("newPreojectInPresenceOfAddButton".equals(c.getName())) {
                onNewProject_NewPreojectInPresenceOfAddButtonAction(c, event);
                return;
            }
            if("newProjectTypeOfStructureComboBox".equals(c.getName())) {
                onNewProject_NewProjectTypeOfStructureComboBoxAction(c, event);
                return;
            }
            if("newProjectBoresList".equals(c.getName())) {
                onNewProject_NewProjectBoresListAction(c, event);
                return;
            }
            if("newProjectboresAddButton".equals(c.getName())) {
                onNewProject_NewProjectboresAddButtonAction(c, event);
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

      protected void onNewProject_NewprojectSaveButtonAction(Component c, ActionEvent event) {
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

      protected void onNewProject_NewPreojectInPresenceOfAddButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectTypeOfStructureComboBoxAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectBoresListAction(Component c, ActionEvent event) {
      }

      protected void onNewProject_NewProjectboresAddButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonAction(Component c, ActionEvent event) {
      }

}
