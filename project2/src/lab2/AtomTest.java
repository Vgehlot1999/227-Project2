package lab2;

public class AtomTest {
	
	public static void main(String[] args)
	{
		Atom A;
		
		A = new Atom(92, 146, 92);
		
		System.out.println(A.getAtomicCharge());
		
		System.out.println(A.getAtomicMass());
		
		A.decay();
		
		System.out.println(A.getAtomicCharge());
		
		System.out.println(A.getAtomicMass());
		
	}

}
