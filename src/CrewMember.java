/**
 * @author Eric Lopardi (eif833)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 * a class for Creation of crew members
 */

public class CrewMember {

    private String name;
    private String position;
    private String rank;
    private String species;
    private String assignment;
/** this constructor creates the values the crew member name position rank species and assignment */
    public CrewMember(String name, String position, String rank, String species, String assignment) {
        this.name = name;
        this.position = position;
        this.rank = rank;
        this.species = species;
        this.assignment = assignment;
    }
/** same as other constructor */
    public CrewMember(String name, String position, String rank, String species) {
        this.name = name;
        this.position = position;
        this.rank = rank;
        this.species = species;
    }
/** prints Strings of name rank position species */
    public String toString() {
        return String.format("\n- %s (%s) - %s, [%s]",
                this.name, this.rank, this.position,this.species);
    }
    /** getter for getName  */
    public String getName() {
        return name;
    }
    /** setter for setName */
    private void setName(String name) {
        this.name = name;
    }
    /** getter for getPosition */
    public String getPosition() {
        return position;
    }
    /** setter for setPosition */
    private void setPosition(String position) {
        this.position = position;
    }
    /** getter for getRank */
    public String getRank () {
        return rank;
    }
    /** setter for setRank */
    private void setRank (String rank){
        this.rank = rank;
    }
    /** getter for getSpecies */
    public String getSpecies () {
        return species;
    }
    /** setter for setSpecies */
    private void setSpecies (String species) {
        this.species = species;
    }
    /** getter for getAssignment */
    public String getAssignment () {
        return assignment;
    }
    /** setter for setAssignment */
    private void setAssignment(String assignment) {
        this.assignment = assignment;
    }
}