package hello;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/getNumSeats")
public class EventController {
        private ArrayList<Seat> list;


    @RequestMapping(value = "/total")
    @ResponseBody
    public String getNumSeats(@RequestParam(value = "rows", defaultValue = "10") int rows,
                              @RequestParam(value = "cols", defaultValue = "10") int cols) {
        return "Total Number of Seats : " + rows * cols;
    }


    @RequestMapping(value = "/adult")
    @ResponseBody
    public String getNumAdultSeats(@RequestParam(value = "rows", defaultValue = "10") int rows,
                                   @RequestParam(value = "cols", defaultValue = "10") int cols,
                                   @RequestParam(value = "childSeats", defaultValue = "35") int childSeats) {
        return "Total Number of Adult Seats : " + (rows * cols - childSeats);
    }


    @RequestMapping(value = "/child")
    @ResponseBody
    public String getNumChildSeats(@RequestParam(value = "rows", defaultValue = "10") int rows,
                                   @RequestParam(value = "cols", defaultValue = "10") int cols,
                                   @RequestParam(value = "adultSeats", defaultValue = "65") int adultSeats) {
        return "Total Number of Children Seats : " + (rows * cols - adultSeats);
    }

    @RequestMapping(value = "/aisleTotal")
    @ResponseBody
    public String getNumAisleSeats(@RequestParam(value = "rows", defaultValue = "10") int rows) {
        return "Total Number of Aisle Seats : " + (rows * 2);
    }

    @RequestMapping(value = "/aisle/child")
    @ResponseBody
    public String getNumChildAisleSeats(@RequestParam(value = "rows", defaultValue = "10") int rows,
                                        @RequestParam(value = "adultAisle", defaultValue = "12") int adultAisle)

    {
        return "Total Number of Children Aisle Seats : " + (rows * 2 - adultAisle);
    }

    @RequestMapping(value = "/aisle/adult")
    @ResponseBody
    public String getNumAdultAisleSeats(@RequestParam(value = "rows", defaultValue = "10") int rows,
                                        @RequestParam(value = "childAisle", defaultValue = "8") int childAisle)

    {
        return "Total Number of Adult Aisle Seats : " + (rows * 2 - childAisle);
    }

     // trying to make a dynamic method to return seat count
    // running into issues due to the fact there is no database to load from
    @RequestMapping(value = "/event")
    @ResponseBody
    public String getEvent(@RequestParam(value = "id", defaultValue = "00") int id,
                          @RequestParam(value = "rows", defaultValue = "10") int rows,
                          @RequestParam(value = "cols", defaultValue = "10") int cols)
    {
        Event e = new Event(id, rows, cols);
        e.loadSeats(rows,cols);
        int num=  e.getNumAvailSeats();
        String s = Integer.toString(num);
        return "Total seats: " + num;
    }

}

