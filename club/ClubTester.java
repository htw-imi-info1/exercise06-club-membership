
/**
 * This class eases testing your Club
 * Membership project - you can use it 
 * instead of interactively creating
 * everything by hand using the BlueJ
 * interface. 
 * 
 * You don't need to use it if you don't
 * want to.
 * 
 * @author Barne Kleinen 
 */
public class ClubTester
{
    private Club club;

    public ClubTester()
    {
        club = new Club();
    }
    /**
      * use this getter to get an
      * instance of club to call
      * methods/the inspector in BlueJ.
      */
    public Club getClub(){
        return club;
    }
    /**
     * Add some members to the club, and then
     * show how many there are.
     * Further example calls (or whole methods)
     * could be added if more functionality
     * is added to the Club class.
     */
    public void testNumberOfMembers()
    {
        club.join(new Membership("David", 2, 2016));
        club.join(new Membership("Michael", 1, 2015));
        System.out.println("The club has " +
                           club.numberOfMembers() +
                           " members.");
    }
}
