package ImmutableClassChallengeTimSolution;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 8/12/2015.
 */
public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if(exits != null) {
            this.exits = new HashMap<String, Integer>(exits);
        } else {
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}

   /* Here is your challenge and the challenges to work out what is wrong with the location constructor that
    would allow the program to compile and crash at runtime so when you identify the problem modify the
    code to fix it so i’ll just say that again your challenge here is to work out what is wrong
        with the location constructor that you can see on screen line 14 that will allow the program to
        compile but crash on run time when you identify the problem modify the code to fix it.*/