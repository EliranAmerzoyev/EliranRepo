import java.util.ArrayList;

/**
 * 
 * @author Eliran amerzoyev
 * @author Danielle sarusi
 *
 */
public class SharedData 
{
	/** Description of array */
	private ArrayList<Integer> array;

	/** Description of winArray */
	private boolean [] winArray;

	/** Description of flag */
	private boolean flag;

	/** Description of b */
	private final int b;

	/** Description of SharedData
	 * 
	 * @param array2 Description
	 * @param b Description
	 */
	public SharedData(ArrayList<Integer> array2, int b) {	
		this.array = array2;
		this.b = b;
	}

	/** Description of getWinArray()
	 * 
	 * @return Description of winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/** Description of setWinArray(boolean [] winArray) 
	 * 
	 * @param winArray Description
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/** Description of ArrayList getArray() 
	 * 
	 * @return array Description
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/** Description of getB() 
	 * 
	 * @return b
	 */
	public int getB() 
	{
		return b;
	}

	/** Description of getFlag() 
	 * 
	 * @return status of flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/** Description of setFlag(boolean flag) {
	 * 
	 * @param flag Description
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}