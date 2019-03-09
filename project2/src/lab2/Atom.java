package lab2;
/**
 * 
 * @author vismay
 * Model of an Atom.
 *
 */
public class Atom 
{
	/**
	 * Number of protons in the Atom.
	 */
	private int protons;
	
	/**
	 * Number of neutrons in the Atom.
	 */
	private int neutrons;
	
	/**
	 * Number of electrons in the Atom.
	 */
	private int electrons;
	
	/**
	 * constructs an Atom with the given number of protons, neutrons, and electrons.
	 * @param givenProtons
	 * 		The number of protons in this Atom.
	 * @param givenNeutrons
	 * 		The number of neutrons in this Atom.
	 * @param givenElectrons
	 * 		The number of electrons in this Atom.
	 */
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons)
	{
		protons = givenProtons;
		neutrons = givenNeutrons;
		electrons = givenElectrons;
	}
	
	/**
	 * Returns the atomic mass of this Atom.
	 * @return
	 * 		the atomic mass of this Atom.
	 */
	public int getAtomicMass()
	{
		return protons + neutrons;
	}
	
	/**
	 * Returns the atomic charge of this Atom.
	 * @return
	 * 		atomic charge of this Atom.
	 */
	public int getAtomicCharge()
	{
		return protons - electrons;
	}
	
	/**
	 * Decays this Atom by removing protons and neutrons.
	 */
	public void decay()
	{
		protons -= 2;
		neutrons -= 2;
	}
}
