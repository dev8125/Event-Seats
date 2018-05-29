package hello;

public class Seat
{
    private boolean seatAvail;
    private boolean isAisle;
    private int seatType;
    private int row;
    private int col;

    public Seat(boolean seatAvail, boolean isAisle, int row, int col)
    {
        this.seatAvail = seatAvail;
        this.isAisle = isAisle;
        this.row = row;
        this.col = col;
    }

    /*
    Returns true if seat is available/false is seat in unavaibale
     */
    public boolean isSeatAvail() {

        return seatAvail;
    }

    /*
    Sets seat avaiablity
     */
    public void setSeatAvail(boolean seatAvail) {

        this.seatAvail = seatAvail;
    }

    /*
    Sets seat type adult/child
     */
    public int getSeatType() {

        return seatType;
    }

    /*
     * Sets seat type
     * @param seatType 0 for child 1 for adult
     */
    public void setSeatType(int seatType) {

        this.seatType = seatType;
    }

    /*
    Checks is seat is Aisle seat
     */
    public boolean checkIfAisel(){

        return isAisle;
    }


}
