package calc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathEquation[] ome = new MathEquation[4];
		ome[0] = new MathEquation(1.0,2.0,'s');
		ome[1] = create(1.0,2.0,'d');
		
		ome[0].execute();
		ome[1].execute();
		
		System.out.println("ome[0] answer is = " + ome[0].result);
		System.out.println("ome[1] answer is = " + ome[1].result);
	}

	public static MathEquation create(double leftVal , double rightVal , char opCode)
	{
		MathEquation ome=new MathEquation();
		ome.leftVal=leftVal;
		ome.rightVal=rightVal;
		ome.opCode=opCode;
		return ome;
		
	}
}
