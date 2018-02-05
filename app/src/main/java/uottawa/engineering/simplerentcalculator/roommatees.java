package uottawa.engineering.simplerentcalculator;

import android.widget.EditText;

/**
 * Created by Tobe on 2018-02-03.
 */

public class roommatees {

    private String roomNumber;
    private String roommateName;
    private EditText mateName;

    public roommatees(String roomNumber, String roommateName) {
        super();
        this.roomNumber = roomNumber;
        this.roommateName = roommateName;
    }

    public roommatees(String roomNumber, EditText mateName) {
        super();
        this.roomNumber = roomNumber;
        this.mateName = mateName;
    }


    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getRoommateName() {
        return roommateName;
    }
    public void setRoommateName(String roommateName) {
        this.roommateName = roommateName;
    }

    public EditText getMateName() { return mateName;}
    public void setRoommateName(EditText mateName) {
        this.mateName = mateName;
    }

}
