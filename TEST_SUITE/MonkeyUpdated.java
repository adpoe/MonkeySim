import java.util.*;


public class MonkeyUpdated {

    private static int _monkeyNum = 0;

    private int _thisMonkeyNum = 0;

    private int _id = -1;

    private BananaUpdated _b = null;

    /**
     * Get this monkey's number
     * @return int monkey number
     */

    public int getMonkeyNum() {
        return _thisMonkeyNum;
    }

    /**
     * Getter for id.
     * @return id of monkey
     */

    public int getId() throws NoIdException {
        if (_id < 0) {
            throw new NoIdException();
        } else {
            return _id;
        }
    }

    /**
     * Return which monkey should get banana next.
     * @return int which monkey should get banana.
     */

    public int nextMonkey() {
        if (_thisMonkeyNum % 2 == 0) {
            return _thisMonkeyNum / 2;
        } else {
            return (_thisMonkeyNum * 3) + 1;
        }
    }

    /**
     * Checks to see if this monkey has a banana
     * @return true if has banana, false otherwise
     */

    public boolean hasBanana() {
        return _b != null;
    }

    /**
     * Receive a banana from another monkey
     * @param b - Banana given to this monkey
     */

    public void throwBananaTo(BananaUpdated b) {
        _b = b;
    }

    /**
     *
     * @return Banana - the banana this monkey held
     */

    public BananaUpdated throwBananaFrom() {
        BananaUpdated toReturn = _b;
        _b = null;
        return toReturn;
    }

    /**
     * Generate a unique ID for this monkey.
     * Note that monkey ID generation must
     * always return the correct value for
     * a given n (i.e., the id for the first
     * monkey should always be the same).
     * @param n - monkey number
     * @return int - id for this monkey
     */
    // this is most likely highly inefficient... using atan and sin... ughh
    // and what's the deal with this bir thing?
    // it does 1000 iterations!!! to generate an id... each monkey can just GET an ID equal to its integer number!!
    // l.o.l.
    public int generateId(int n) {
        // start at 0 = 223492
        int toReturn = 223492;
        /*int toReturn = 100;
        int bird = -900;
        for (int l=0; l <1000; l++) {
            for (int m = 0; m < 100; m++) {
                bird += Math.round(Math.atan(l + m));
                bird -= Math.round(Math.sin(m * m)) * Math.exp(m * m);
                toReturn += bird;
            }
        }
        toReturn += 10;
        toReturn += n;*/
        return toReturn + n;
    }

    /**
     * Monkey constructor
     */
    public MonkeyUpdated() {
        _thisMonkeyNum = _monkeyNum;
        _monkeyNum++;
        _id = generateId(_thisMonkeyNum);
    }

}
