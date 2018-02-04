/**
 * Created by Tobe on 2018-02-03.
 */

public class roommatees {

    private String roomNumber;
    private String roommateName;

    public roommatees(String roomNumber, String roommateName) {
        super();
        this.roomNumber = roomNumber;
        this.roommateName = roommateName;
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

}
