package hello;

import java.util.ArrayList;

public class Event
{
    private int id;
    private int rows;
    private int cols;
    private ArrayList<Seat> list;
    private int openSeats;


        public Event(int id, int rows, int cols) {
		this.id= id;
		this.rows= rows;
		this.cols = cols;
    }
    /*
    Loads Seats into Event
     */
    public void loadSeats(int rows, int cols){
            this.rows = rows;
           this.cols = cols;
            for(int i=0;  i<=rows; i++)
        {
            for(int j=0;j<=cols;j++) {
                list.add(new Seat(true, false,i,j));
            }
        }
    }


     /*
      * Returns Event's specific ID
      */
    public int getId() {

            return id;
    }

    /*
     * Sets Event's ID
     */
    public void setId(int id) {

        this.id = id;
    }

    /*
     * Returns number of rows in Event
     */
    public int getRows() {
        return rows;
    }

    /*
     * Sets number of rows for Event
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /*
        Gets number of Columns in Event
     */
    public int getCols() {
        return cols;
    }

    /*
        Sest number of Columns in Event
     */
    public void setCols(int cols) {
        this.cols = cols;
    }

    /*
        Adds Seats to ArrayList of Seats of Event
     */
    public void addSeat(Seat s) {
        list.add(s);
    }

    public int getNumAvailSeats() {
        for(Seat l:list)
            if(l.isSeatAvail()== true)
                openSeats++;
        return openSeats;

    }

}
