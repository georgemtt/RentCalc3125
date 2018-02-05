package uottawa.engineering.simplerentcalculator;

import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Tobe on 2018-02-03.
 */

public class roomTypes {

    private String roomNumber;
    private Spinner typeList;


    public roomTypes(String roomNumber, Spinner typeList) {
        super();
        this.roomNumber = roomNumber;
        this.typeList = typeList;
    }


    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Spinner getTypeList() {
        return typeList;
    }
    public void setTypeList(Spinner typeList) {
        this.typeList = typeList;
    }



}
