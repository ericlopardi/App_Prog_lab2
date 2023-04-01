import java.io.*;
import java.util.ArrayList;

/**
 * Eric Lopardi (eif833)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 * a class for the loading of both starship and crew members
 */
public class Fleet {
    /** Variables for fleet class */
    private String name;
    ArrayList<Starship> starships;
    /** this constructor creates the values of the name and arraylist of the fleet*/
    public Fleet (String name) {
        this.name = name;
        this.starships = new ArrayList<>();
    }
/** @return starships array list used to to find the size */
    public int getSizeOfFleet() {
        return starships.size();
    }
/**
 * @param starship - used for the add starship method
 */
    public void addStarship(Starship starship) {
        starships.add(starship);
    }
/**
 * @return String description of the object that this method was used on
 */
    public String toString() {
        String s;
        s = "----------------------------\n" + getName() +"\n----------------------------\n";
        for (Starship starship : starships) {
            s += starship.toString();
        }
        return s;
    }
    /** getter for getName */
    public String getName() {
        return name;
    }
    /** setter for setName */
    public void setName(String name) {
        this.name = name;
    }
    /** getter for getStarships */
    public ArrayList<Starship> getStarships() {
        return starships;
    }
    /** setter for getStarships */
    public void setStarships(ArrayList<Starship> starships) {
        this.starships = starships;
    }
/**
 * @param directoryName - directory file that is inputed for observation
 */
    public void loadStarships(String directoryName) throws FileNotFoundException, IOException {
        File fileO = new File(directoryName);
        if (fileO.exists()) {
            for(String fileTag: fileO.list()) {
                String fileName = fileTag;
                fileTag = directoryName + File.separator + fileTag;
                BufferedReader bRead = new BufferedReader(new FileReader(fileTag));
                Starship ship;
                String flLine = bRead.readLine();
                if (flLine != null) {
                    String[] label = flLine.split(",");
                    ship = new Starship(label[0], label[1], label[2]);
                    this.addStarship(ship);
                    flLine = bRead.readLine();
                    while (flLine != null) {
                        String[] pieces = flLine.split(",");
                        CrewMember crewMem = new CrewMember(pieces[0], pieces[1], pieces[2], pieces[3], fileName);
                        ship.addCrewMember(crewMem);
                        flLine = bRead.readLine();
                    }
                }
                bRead.close();
            }
        }
    }
}
