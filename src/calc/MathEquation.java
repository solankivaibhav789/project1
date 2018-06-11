package calc;

public class MathEquation {

		public double leftVal;
		public double rightVal;
		public char opCode;
		public double result;
		
		public MathEquation() {
			// TODO Auto-generated constructor stub
		}
		
		MathEquation(double leftVal , double rightVal , char opCode)
		{
			this.leftVal=leftVal;
			this.rightVal=rightVal;
			this.opCode=opCode;
		}
		
		

		public void execute()
		{
			switch(opCode)
			{
			case 'a':
				result=leftVal+rightVal;
				break;
			case 's':
				result=leftVal-rightVal;
				break;
			case 'm':
				result=leftVal*rightVal;
				break;
			case 'd':
				result=rightVal!=0.0f ? leftVal/rightVal : 0.0f;
				break;
			default:
				System.out.println("error");
				break;
			}
		}
}
