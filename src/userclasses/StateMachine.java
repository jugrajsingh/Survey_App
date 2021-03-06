package userclasses;

import ca.weblite.codename1.json.JSONArray;
import ca.weblite.codename1.json.JSONException;
import ca.weblite.codename1.json.JSONObject;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.NetworkManager;
import com.codename1.io.Storage;
import com.codename1.location.Location;
import com.codename1.location.LocationManager;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.list.ListModel;
import com.codename1.ui.spinner.DateSpinner;
import com.codename1.ui.util.Resources;
import generated.StateMachineBase;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author Jugraj Singh
 */
public class StateMachine extends StateMachineBase {

    private static final String storageKey = "storedData";
    private JSONObject project;
    private JSONObject newBoreDataJSON;
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
    }

    @Override
    protected void onNewProject_NewProjectDateOfTestingAddButtonAction(Component c, ActionEvent event) {
        Dialog d = (Dialog) createContainer(fetchResourceFile(), "dateOftestingDialog");
        d.setDisposeWhenPointerOutOfBounds(true);
        Button saveButton = (Button) findByName("dateOfTestingSaveButton", d);
        DateSpinner date = (DateSpinner) findByName("dateOfTestingDateSpinner",d);
        List dateOfTesting = findNewProjectDateOfTestingList();
        saveButton.addActionListener(evt -> {
            int mm = date.getCurrentMonth();
            int dd = date.getCurrentDay();
            int yyyy = date.getCurrentYear();
            try {
                if (!project.has("dateOfTesting")){
                    project.put("dateOfTesting",new JSONArray());
                }
                JSONArray temp = project.getJSONArray("dateOfTesting");
                temp.put(mm+"/"+dd+"/"+yyyy);
                project.put("dateOfTesting",temp);
                ArrayList<Object> t = new ArrayList<>();
                for (int i=0;i<temp.length();i++){
                    t.add(temp.get(i));
                }
                dateOfTesting.setModel(new DefaultListModel<>(t));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Dialog.show("Greetings", project.toString(), "OK", null);
            d.dispose();
        });
        Button cancelButton = (Button) findByName("dateOfTestingCancelButton",d);
        cancelButton.addActionListener(evt -> d.dispose());
        d.show();
    }

    @Override
    protected void onNewProject_NewProjectSubmittedToAddButtonAction(Component c, ActionEvent event) {
        Dialog d = (Dialog) createContainer(fetchResourceFile(), "newUserEntry");
        d.setDisposeWhenPointerOutOfBounds(true);
        Button saveButton = (Button) findByName("newUserEntrySaveButton", d);
        TextField nameField = (TextField) findByName("newUserEntryNameTextField",d);
        TextField designationField = (TextField) findByName("newUserEntryDesgTextField",d);
        TextField organisationField = (TextField) findByName("newUserEntryOrgTextField",d);
        TextField contactField = (TextField) findByName("newUserEntryContactTextField",d);
        List list = findNewProjectSubmittedToList();
        saveButton.addActionListener(evt -> {
            String name = nameField.getText();
            String designation = designationField.getText();
            String org = organisationField.getText();
            String contact = contactField.getText();
            try {
                if (!project.has("submittedTo")) {
                    project.put("submittedTo",new JSONArray());
                }
                if (name.length() > 0) {
                    JSONArray temp = project.getJSONArray("submittedTo");
                    JSONObject obj = new JSONObject();
                    obj.put("name",name);
                    obj.put("org",org);
                    obj.put("designation",designation);
                    obj.put("contact",contact);
                    temp.put(obj);
                    project.put("submittedTo",temp);
                    ArrayList<String> t = new ArrayList<>();
                    for (int i=0;i<temp.length();i++){
                        t.add(temp.getJSONObject(i).getString("name"));
                    }
                    list.setModel(new DefaultListModel<>(t));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Dialog.show("Greetings", "SubmittedToAddButton", "OK", null);
            d.dispose();
        });
        Button cancelButton = (Button) findByName("newUserEntryCancelButton",d);
        cancelButton.addActionListener(evt -> d.dispose());
        d.show();
    }

    @Override
    protected void onNewProject_NewProjectPreparedByAddButtonAction(Component c, ActionEvent event) {
        Dialog d = (Dialog) createContainer(fetchResourceFile(), "newUserEntry");
        d.setDisposeWhenPointerOutOfBounds(true);
        Button saveButton = (Button) findByName("newUserEntrySaveButton", d);
        TextField nameField = (TextField) findByName("newUserEntryNameTextField",d);
        TextField designationField = (TextField) findByName("newUserEntryDesgTextField",d);
        TextField organisationField = (TextField) findByName("newUserEntryOrgTextField",d);
        TextField contactField = (TextField) findByName("newUserEntryContactTextField",d);
        List list = findNewProjectPreparedByList();
        saveButton.addActionListener(evt -> {
            String name = nameField.getText();
            String designation = designationField.getText();
            String org = organisationField.getText();
            String contact = contactField.getText();
            try {
                if (!project.has("preparedBy")) {
                    project.put("preparedBy",new JSONArray());
                }
                if (name.length() > 0) {
                    JSONArray temp = project.getJSONArray("preparedBy");
                    JSONObject obj = new JSONObject();
                    obj.put("name",name);
                    obj.put("org",org);
                    obj.put("designation",designation);
                    obj.put("contact",contact);
                    temp.put(obj);
                    project.put("preparedBy",temp);
                    ArrayList<String> t = new ArrayList<>();
                    for (int i=0;i<temp.length();i++){
                        t.add(temp.getJSONObject(i).getString("name"));
                    }
                    list.setModel(new DefaultListModel<>(t));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Dialog.show("Greetings", "PreparedByAddButton", "OK", null);
            d.dispose();
        });
        Button cancelButton = (Button) findByName("newUserEntryCancelButton",d);
        cancelButton.addActionListener(evt -> d.dispose());
        d.show();
    }

    @Override
    protected void onNewProject_NewProjectInPresenceOfAddButtonAction(Component c, ActionEvent event) {
        Dialog d = (Dialog) createContainer(fetchResourceFile(), "newUserEntry");
        d.setDisposeWhenPointerOutOfBounds(true);
        Button saveButton = (Button) findByName("newUserEntrySaveButton", d);
        TextField nameField = (TextField) findByName("newUserEntryNameTextField",d);
        TextField designationField = (TextField) findByName("newUserEntryDesgTextField",d);
        TextField organisationField = (TextField) findByName("newUserEntryOrgTextField",d);
        TextField contactField = (TextField) findByName("newUserEntryContactTextField",d);
        List list = findNewProjectInPresenceOfList();
        saveButton.addActionListener(evt -> {
            String name = nameField.getText();
            String designation = designationField.getText();
            String org = organisationField.getText();
            String contact = contactField.getText();
            try {
                if (!project.has("inPresenceOf")) {
                    project.put("inPresenceOf", new JSONArray());
                }
                if (name.length() > 0) {
                    JSONArray temp = project.getJSONArray("inPresenceOf");
                    JSONObject obj = new JSONObject();
                    obj.put("name",name);
                    obj.put("org",org);
                    obj.put("designation",designation);
                    obj.put("contact",contact);
                    temp.put(obj);
                    project.put("inPresenceOf", temp);
                    ArrayList<String> t = new ArrayList<>();
                    for (int i=0;i<temp.length();i++){
                        t.add(temp.getJSONObject(i).getString("name"));
                    }
                    list.setModel(new DefaultListModel<>(t));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Dialog.show("Greetings", "InPresenceOf", "OK", null);
            d.dispose();
        });
        Button cancelButton = (Button) findByName("newUserEntryCancelButton",d);
        cancelButton.addActionListener(evt -> d.dispose());
        d.show();
    }

    @Override
    protected void onNewProject_NewProjectTypeOfStructureSaveButtonAction(Component c, ActionEvent event) {
        ComboBox comboBox = findNewProjectTypeOfStructureComboBox();
        ListModel listModel = comboBox.getModel();
        try {
            project.put("typeOfStructure", listModel.getItemAt(comboBox.getSelectedIndex()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected boolean initListModelNewProjectTypeOfStructureComboBox(List cmp) {
        ArrayList<String> itemList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            itemList.add("item " + (i + 1));
        }
        cmp.setModel(new DefaultListModel<>(itemList));
        return true;
    }

    @Override
    protected void onNewProject_NewProjectBoresAddButtonAction(Component c, ActionEvent event) {
        newBoreDataJSON = null;
        showForm("newBoreEntry", null);
    }

    @Override
    protected void onNewBoreEntry_NewBoreEntryCancelButtonAction(Component c, ActionEvent event) {
        back();
    }

    @Override
    protected void onNewBoreEntry_NewBoreEntrySaveButtonAction(Component c, ActionEvent event) {
        try {
            if (!project.has("bores")) {
                project.put("bores", new JSONArray());
            }
            JSONObject ob = new JSONObject();
            ob.put("lat", String.valueOf(findNewBoreEntryLatitudeTextField().getText()));
            ob.put("long", String.valueOf(findNewBoreEntryLongitudeTextField().getText()));
            newBoreDataJSON.put("locationData", ob);
            if ((newBoreDataJSON != null) && (newBoreDataJSON.has("data"))) {
                JSONArray temp = project.getJSONArray("bores");
                temp.put(newBoreDataJSON);
                project.put("bores", temp);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        back();
    }

    @Override
    protected void onNewProject_NewProjectCancelButtonAction(Component c, ActionEvent event) {
        back();
    }

    @Override
    protected void onNewBoreEntry_NewBoreEntryGetLocationButtonAction(Component c, ActionEvent event) {
        Location location = LocationManager.getLocationManager().getCurrentLocationSync();
        findNewBoreEntryLatitudeTextField().setText(String.valueOf(location.getLatitude()));
        findNewBoreEntryLongitudeTextField().setText(String.valueOf(location.getLongitude()));
    }

    @Override
    protected void onNewBoreEntry_NewBoreDataEntryAddButtonAction(Component c, ActionEvent event) {
        Dialog d = (Dialog) createContainer(fetchResourceFile(), "newBoreData");
        d.setDisposeWhenPointerOutOfBounds(true);
        Button saveButton = (Button) findByName("newBoreDataSaveButton", d);
        TextField dValue = (TextField) findByName("newBoreDataDTextField", d);
        TextField nValue = (TextField) findByName("newBoreDataNTextField", d);
        TextField lValue = (TextField) findByName("newBoreDataLTextField", d);
        TextField typeOfSoil = (TextField) findByName("newBoreDataTypeOfSoilTextField", d);
        List list = findNewBoreDataList();
        saveButton.addActionListener(evt -> {
            String D = dValue.getText();
            String N = nValue.getText();
            String L = lValue.getText();
            String TOS = typeOfSoil.getText();
            if (!(D.length() == 0 || N.length() == 0 || L.length() == 0 || TOS.length() == 0)) {
                try {
                    if (newBoreDataJSON == null) {
                        newBoreDataJSON = new JSONObject();
                    }
                    if (!newBoreDataJSON.has("data")) {
                        newBoreDataJSON.put("data", new JSONArray());
                    }
                    JSONArray temp = newBoreDataJSON.getJSONArray("data");
                    JSONObject obj = new JSONObject();
                    obj.put("D", D);
                    obj.put("N", N);
                    obj.put("L", L);
                    obj.put("soilType", TOS);
                    temp.put(obj);
                    newBoreDataJSON.put("data", temp);
                    ArrayList<String> t = new ArrayList<>();
                    for (int i = 0; i < temp.length(); i++) {
                        t.add("D = " + temp.getJSONObject(i).getString("D") + ", Soil type = "
                                + temp.getJSONObject(i).getString("soilType"));
                    }
                    list.setModel(new DefaultListModel<>(t));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            d.dispose();
        });
        Button cancelButton = (Button) findByName("newBoreDataCancelButton", d);
        cancelButton.addActionListener(evt -> d.dispose());
        d.show();
    }

    @Override
    protected void onNewProject_NewProjectUploadDataButtonAction(Component c, ActionEvent event) {
        String finalRequestBody = project.toString();
        ConnectionRequest connectionRequest = new ConnectionRequest() {
            @Override
            protected void buildRequestBody(OutputStream os) throws IOException {
                os.write(finalRequestBody.getBytes("UTF-8"));
                super.buildRequestBody(os);
            }
        };
        connectionRequest.setUrl("http://202.164.53.122:8080/json/");
        connectionRequest.setContentType("application/json");
        connectionRequest.setPost(true);
        NetworkManager.getInstance().addToQueueAndWait(connectionRequest);
    }

    @Override
    protected boolean initListModelNewProjectDateOfTestingList(List cmp) {
        try {
            if (project.has("dateOfTesting")) {
                JSONArray temp = project.getJSONArray("dateOfTesting");
                ArrayList<String> t = new ArrayList<>();
                for (int i = 0; i < temp.length(); i++) {
                    t.add(String.valueOf(temp.get(i)));
                }
                cmp.setModel(new DefaultListModel<>(t));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    protected boolean initListModelNewProjectSubmittedToList(List cmp) {
        try {
            if (project.has("submittedTo")) {
                JSONArray temp = project.getJSONArray("submittedTo");
                ArrayList<String> t = new ArrayList<>();
                for (int i = 0; i < temp.length(); i++) {
                    t.add(temp.getJSONObject(i).getString("name"));
                }
                cmp.setModel(new DefaultListModel<>(t));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    protected boolean initListModelNewProjectPreparedByList(List cmp) {
        try {
            if (project.has("preparedBy")) {
                JSONArray temp = project.getJSONArray("preparedBy");
                ArrayList<String> t = new ArrayList<>();
                for (int i = 0; i < temp.length(); i++) {
                    t.add(temp.getJSONObject(i).getString("name"));
                }
                cmp.setModel(new DefaultListModel<>(t));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    protected boolean initListModelNewProjectInPresenceOfList(List cmp) {
        try {
            if (project.has("inPresenceOf")) {
                JSONArray temp = project.getJSONArray("inPresenceOf");
                ArrayList<String> t = new ArrayList<>();
                for (int i = 0; i < temp.length(); i++) {
                    t.add(temp.getJSONObject(i).getString("name"));
                }
                cmp.setModel(new DefaultListModel<>(t));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    protected boolean initListModelNewProjectBoresList(List cmp) {
        try {
            if (project.has("bores")) {
                JSONArray temp = project.getJSONArray("bores");
                ArrayList<String> t = new ArrayList<>();
                for (int i = 0; i < temp.length(); i++) {
                    t.add("lat = " + temp.getJSONObject(i).getJSONObject("locationData").getString("lat")
                            + ",long = " + temp.getJSONObject(i).getJSONObject("locationData").getString("long"));
                }
                cmp.setModel(new DefaultListModel<>(t));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    protected void onMain_NewProjectAction(Component c, ActionEvent event) {
        project = new JSONObject();
    }

    @Override
    protected void onMain_LoadProjectAction(Component c, ActionEvent event) {
        if (project != null) {
            showForm("newProject", null);
        } else if (Storage.getInstance().exists(storageKey)) {
            project = (JSONObject) Storage.getInstance().readObject(storageKey);
        } else {
            Dialog.show("Error", "No Saved Data Found", Dialog.TYPE_ERROR, null, "OK", null);
        }
    }

    @Override
    protected void onNewProject_NewProjectDateOfTestingListAction(Component c, ActionEvent event) {
        if (event.isLongEvent()) {
            Dialog d = (Dialog) createContainer(fetchResourceFile(), "contextMenu");
            Button edit = (Button) findByName("contextMenuEditButton", d);
            edit.addActionListener(evt -> {
                List list = (List) event.getSource();
                Dialog d2 = (Dialog) createContainer(fetchResourceFile(), "dateOftestingDialog");
                d2.setDisposeWhenPointerOutOfBounds(true);
                DateSpinner date = (DateSpinner) findByName("dateOfTestingDateSpinner", d2);
                Button saveButton = (Button) findByName("dateOfTestingSaveButton", d2);
                int selectedDataIndex = list.getSelectedIndex();
                saveButton.addActionListener(evt1 -> {
                    int mm = date.getCurrentMonth();
                    int dd = date.getCurrentDay();
                    int yyyy = date.getCurrentYear();
                    try {
                        if (!project.has("dateOfTesting")) {
                            project.put("dateOfTesting", new JSONArray());
                        }
                        JSONArray temp = project.getJSONArray("dateOfTesting");
                        ArrayList<String> t = new ArrayList<>();
                        for (int i = 0; i < temp.length(); i++) {
                            if (i == selectedDataIndex) {
                                t.add(mm + "/" + dd + "/" + yyyy);
                            } else {
                                t.add(String.valueOf(temp.get(i)));
                            }
                        }
                        project.put("dateOfTesting", new JSONArray(t));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    Dialog.show("Greetings", project.toString(), "OK", null);
                    d2.dispose();
                });
                Button cancelButton = (Button) findByName("dateOfTestingCancelButton", d2);
                cancelButton.addActionListener(evt1 -> d2.dispose());
                String selectedData = String.valueOf(list.getSelectedItem());
                //String[] splitSelectedData = selectedData.split("/");
                //date.setCurrentMonth(Integer.parseInt(splitSelectedData[0]));
                //date.setCurrentDay(Integer.parseInt(splitSelectedData[1]));
                // date.setCurrentYear(Integer.parseInt(splitSelectedData[2]));
                d2.show();
                d.dispose();
            });
            Button delete = (Button) findByName("contextMenuDeleteButton", d);
            delete.addActionListener(evt -> {
                List list = (List) event.getSource();
                int selectedDataIndex = list.getSelectedIndex();
                try {
                    JSONArray temp = project.getJSONArray("dateOfTesting");
                    ArrayList<String> t = new ArrayList<>();
                    for (int i = 0; i < temp.length(); i++) {
                        if (i != selectedDataIndex) {
                            t.add(String.valueOf(temp.get(i)));
                        }
                    }
                    project.put("dateOfTesting", new JSONArray(t));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                d.dispose();
            });
            d.setDisposeWhenPointerOutOfBounds(true);
            d.show();
        }
    }

    @Override
    protected void onNewProject_NewProjectSubmittedToListAction(Component c, ActionEvent event) {
        if (event.isLongEvent()) {
            Dialog d = (Dialog) createContainer(fetchResourceFile(), "contextMenu");
            Button edit = (Button) findByName("contextMenuEditButton", d);
            edit.addActionListener(evt -> {
                List list = (List) event.getSource();
                int selectedDataIndex = list.getSelectedIndex();
                try {
                    JSONObject object = project.getJSONArray("submittedTo").getJSONObject(selectedDataIndex);
                    Dialog d2 = (Dialog) createContainer(fetchResourceFile(), "newUserEntry");
                    d2.setDisposeWhenPointerOutOfBounds(true);
                    TextField nameField = (TextField) findByName("newUserEntryNameTextField", d2);
                    nameField.setText(object.getString("name"));
                    TextField designationField = (TextField) findByName("newUserEntryDesgTextField", d2);
                    designationField.setText(object.getString("designation"));
                    TextField organisationField = (TextField) findByName("newUserEntryOrgTextField", d2);
                    organisationField.setText(object.getString("org"));
                    TextField contactField = (TextField) findByName("newUserEntryContactTextField", d2);
                    contactField.setText(object.getString("contact"));
                    Button saveButton = (Button) findByName("newUserEntrySaveButton", d2);
                    saveButton.addActionListener(evt1 -> {
                        String name = nameField.getText();
                        String designation = designationField.getText();
                        String org = organisationField.getText();
                        String contact = contactField.getText();
                        try {
                            if (!project.has("submittedTo")) {
                                project.put("submittedTo", new JSONArray());
                            }
                            if (name.length() > 0) {
                                JSONArray temp = project.getJSONArray("submittedTo");
                                JSONObject obj = new JSONObject();
                                obj.put("name", name);
                                obj.put("org", org);
                                obj.put("designation", designation);
                                obj.put("contact", contact);
                                ArrayList<Object> arrayList = new ArrayList<>();
                                for (int i = 0; i < temp.length(); i++) {
                                    if (i == selectedDataIndex) {
                                        arrayList.add(obj);
                                    } else {
                                        arrayList.add(temp.getJSONObject(i));
                                    }
                                }
                                project.put("submittedTo", new JSONArray(arrayList));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        Dialog.show("Greetings", "SubmittedToAddButton", "OK", null);
                        d2.dispose();
                    });
                    Button cancelButton = (Button) findByName("newUserEntryCancelButton", d2);
                    cancelButton.addActionListener(evt1 -> d2.dispose());
                    d2.show();
                    d.dispose();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            });
            Button delete = (Button) findByName("contextMenuDeleteButton", d);
            delete.addActionListener(evt -> {
                List list = (List) event.getSource();
                int selectedDataIndex = list.getSelectedIndex();
                try {
                    JSONArray temp = project.getJSONArray("submittedTo");
                    ArrayList<Object> t = new ArrayList<>();
                    for (int i = 0; i < temp.length(); i++) {
                        if (i != selectedDataIndex) {
                            t.add(temp.get(i));
                        }
                    }
                    project.put("submittedTo", new JSONArray(t));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                d.dispose();
            });
            d.setDisposeWhenPointerOutOfBounds(true);
            d.show();
        }
    }

    @Override
    protected void onNewProject_NewProjectPreparedByListAction(Component c, ActionEvent event) {
        if (event.isLongEvent()) {
            Dialog d = (Dialog) createContainer(fetchResourceFile(), "contextMenu");
            Button edit = (Button) findByName("contextMenuEditButton", d);
            edit.addActionListener(evt -> {
                List list = (List) event.getSource();
                int selectedDataIndex = list.getSelectedIndex();
                try {
                    JSONObject object = project.getJSONArray("preparedBy").getJSONObject(selectedDataIndex);
                    Dialog d2 = (Dialog) createContainer(fetchResourceFile(), "newUserEntry");
                    d2.setDisposeWhenPointerOutOfBounds(true);
                    TextField nameField = (TextField) findByName("newUserEntryNameTextField", d2);
                    nameField.setText(object.getString("name"));
                    TextField designationField = (TextField) findByName("newUserEntryDesgTextField", d2);
                    designationField.setText(object.getString("designation"));
                    TextField organisationField = (TextField) findByName("newUserEntryOrgTextField", d2);
                    organisationField.setText(object.getString("org"));
                    TextField contactField = (TextField) findByName("newUserEntryContactTextField", d2);
                    contactField.setText(object.getString("contact"));
                    Button saveButton = (Button) findByName("newUserEntrySaveButton", d2);
                    saveButton.addActionListener(evt1 -> {
                        String name = nameField.getText();
                        String designation = designationField.getText();
                        String org = organisationField.getText();
                        String contact = contactField.getText();
                        try {
                            if (!project.has("preparedBy")) {
                                project.put("preparedBy", new JSONArray());
                            }
                            if (name.length() > 0) {
                                JSONArray temp = project.getJSONArray("preparedBy");
                                JSONObject obj = new JSONObject();
                                obj.put("name", name);
                                obj.put("org", org);
                                obj.put("designation", designation);
                                obj.put("contact", contact);
                                ArrayList<Object> arrayList = new ArrayList<>();
                                for (int i = 0; i < temp.length(); i++) {
                                    if (i == selectedDataIndex) {
                                        arrayList.add(obj);
                                    } else {
                                        arrayList.add(temp.getJSONObject(i));
                                    }
                                }
                                project.put("preparedBy", new JSONArray(arrayList));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        Dialog.show("Greetings", "PreparedByListAction", "OK", null);
                        d2.dispose();
                    });
                    Button cancelButton = (Button) findByName("newUserEntryCancelButton", d2);
                    cancelButton.addActionListener(evt1 -> d2.dispose());
                    d2.show();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                d.dispose();
            });
            Button delete = (Button) findByName("contextMenuDeleteButton", d);
            delete.addActionListener(evt -> {
                List list = (List) event.getSource();
                int selectedDataIndex = list.getSelectedIndex();
                try {
                    JSONArray temp = project.getJSONArray("preparedBy");
                    ArrayList<Object> t = new ArrayList<>();
                    for (int i = 0; i < temp.length(); i++) {
                        if (i != selectedDataIndex) {
                            t.add(temp.get(i));
                        }
                    }
                    project.put("preparedBy", new JSONArray(t));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                d.dispose();
            });
            d.setDisposeWhenPointerOutOfBounds(true);
            d.show();
        }
    }

    @Override
    protected void onNewProject_NewProjectInPresenceOfListAction(Component c, ActionEvent event) {
        if (event.isLongEvent()) {
            Dialog d = (Dialog) createContainer(fetchResourceFile(), "contextMenu");
            Button edit = (Button) findByName("contextMenuEditButton", d);
            edit.addActionListener(evt -> {
                List list = (List) event.getSource();
                int selectedDataIndex = list.getSelectedIndex();
                try {
                    JSONObject object = project.getJSONArray("inPresenceOf").getJSONObject(selectedDataIndex);
                    Dialog d2 = (Dialog) createContainer(fetchResourceFile(), "newUserEntry");
                    d2.setDisposeWhenPointerOutOfBounds(true);
                    TextField nameField = (TextField) findByName("newUserEntryNameTextField", d2);
                    nameField.setText(object.getString("name"));
                    TextField designationField = (TextField) findByName("newUserEntryDesgTextField", d2);
                    designationField.setText(object.getString("designation"));
                    TextField organisationField = (TextField) findByName("newUserEntryOrgTextField", d2);
                    organisationField.setText(object.getString("org"));
                    TextField contactField = (TextField) findByName("newUserEntryContactTextField", d2);
                    contactField.setText(object.getString("contact"));
                    Button saveButton = (Button) findByName("newUserEntrySaveButton", d2);
                    saveButton.addActionListener(evt1 -> {
                        String name = nameField.getText();
                        String designation = designationField.getText();
                        String org = organisationField.getText();
                        String contact = contactField.getText();
                        try {
                            if (!project.has("inPresenceOf")) {
                                project.put("inPresenceOf", new JSONArray());
                            }
                            if (name.length() > 0) {
                                JSONArray temp = project.getJSONArray("inPresenceOf");
                                JSONObject obj = new JSONObject();
                                obj.put("name", name);
                                obj.put("org", org);
                                obj.put("designation", designation);
                                obj.put("contact", contact);
                                ArrayList<Object> arrayList = new ArrayList<>();
                                for (int i = 0; i < temp.length(); i++) {
                                    if (i == selectedDataIndex) {
                                        arrayList.add(obj);
                                    } else {
                                        arrayList.add(temp.getJSONObject(i));
                                    }
                                }
                                project.put("inPresenceOf", new JSONArray(arrayList));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        Dialog.show("Greetings", "InPresenceOfListAction", "OK", null);
                        d2.dispose();
                    });
                    Button cancelButton = (Button) findByName("newUserEntryCancelButton", d2);
                    cancelButton.addActionListener(evt1 -> d2.dispose());
                    d2.show();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                d.dispose();
            });
            Button delete = (Button) findByName("contextMenuDeleteButton", d);
            delete.addActionListener(evt -> {
                List list = (List) event.getSource();
                int selectedDataIndex = list.getSelectedIndex();
                try {
                    JSONArray temp = project.getJSONArray("inPresenceOf");
                    ArrayList<Object> t = new ArrayList<>();
                    for (int i = 0; i < temp.length(); i++) {
                        if (i != selectedDataIndex) {
                            t.add(temp.get(i));
                        }
                    }
                    project.put("inPresenceOf", new JSONArray(t));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                d.dispose();
            });
            d.setDisposeWhenPointerOutOfBounds(true);
            d.show();
        }
    }

    @Override
    protected void onNewProject_NewProjectBoresListAction(Component c, ActionEvent event) {
        if (event.isLongEvent()) {
            Dialog d = (Dialog) createContainer(fetchResourceFile(), "contextMenu");
            Button edit = (Button) findByName("contextMenuEditButton", d);
            edit.addActionListener(evt -> {
                List list = (List) event.getSource();
                int selectedDataIndex = list.getSelectedIndex();
                try {
                    /*newBoreDataJSON =*/
                    project.getJSONArray("bores").getJSONObject(selectedDataIndex);
                    showForm("newBoreEntry", null);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                d.dispose();
            });
            Button delete = (Button) findByName("contextMenuDeleteButton", d);
            delete.addActionListener(evt -> {
                List list = (List) event.getSource();
                int selectedDataIndex = list.getSelectedIndex();
                try {
                    JSONArray temp = project.getJSONArray("bores");
                    ArrayList<Object> t = new ArrayList<>();
                    for (int i = 0; i < temp.length(); i++) {
                        if (i != selectedDataIndex) {
                            t.add(temp.get(i));
                        }
                    }
                    project.put("bores", new JSONArray(t));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                d.dispose();
            });
            d.setDisposeWhenPointerOutOfBounds(true);
            d.show();
        }
    }

    @Override
    protected void beforeNewBoreEntry(Form f) {
        /*
        if (newBoreDataJSON != null) {
            TextField latitude = findNewBoreEntryLatitudeTextField();
            TextField longitude = findNewBoreEntryLongitudeTextField();
            try {
                JSONObject locationData = newBoreDataJSON.getJSONObject("locationData");
                latitude.setText(locationData.getString("lat"));
                longitude.setText(locationData.getString("long"));
            } catch (JSONException e) {
                e.printStackTrace();
            }*/
    }
}
