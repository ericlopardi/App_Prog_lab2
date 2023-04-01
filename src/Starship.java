import java.util.ArrayList;

/**
 * @author Eric Lopardi (eif833)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 * a class for the creation of Starships
 */
public class Starship {
/** variables needed for the class Starship */
    private String name;
    private String registry;
    private String starshipClass;
    ArrayList<CrewMember> crewMembers;
    /** this constructor creates the values the Starship name registry and class*/
    public Starship(String name, String registry, String starshipClass) {
        this.name = name;
        this.registry = registry;
        this.starshipClass = starshipClass;
        this.crewMembers = new ArrayList<>();
    }
    /** prints Strings of name rank position species */
    public String toString() {
        StringBuilder members = new StringBuilder();
        for (int i = 0; i < crewMembers.size(); i++) {
            members.append(crewMembers.get(i).toString());
        }
        return String.format("%s, %s. Registry: %s\n%s crew members assigned. %s\n\n",
                this.name, this.starshipClass, this.registry, getNumberOfPersonnel(), members.toString());
    }
/** adds crew members
 * @param crewMember the value being added
 */
    public void addCrewMember(CrewMember crewMember) {
        crewMembers.add(crewMember);
    }
/** gets Number of personnel
 */
    public int getNumberOfPersonnel() {
        return crewMembers.size();
    }
    /** getter for getName */
    public String getName() {
        return name;
    }
    /** setter for getName  */
    public void setName(String name) {
        this.name = name;
    }
    /** getter for getRegistry  */
    public String getRegistry() {
        return registry;
    }
    /** setter for setRegistry  */
    public void setRegistry(String registry) {
        this.registry = registry;
    }
    /** getter for getStarshipClass  */
    public String getStarshipClass() {
        return starshipClass;
    }
    /** setter for setStarshipClass  */
    public void setStarshipClass(String starshipClass){
        this.starshipClass = starshipClass;
    }
    /** getter for getCrewMembers  */
    public ArrayList<CrewMember> getCrewMembers() {
        return crewMembers;
    }
    /** setter for setCrewMembers  */
    public void setCrewMembers(ArrayList<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }
}




