package calc;

public class MathEquation {

		private double leftVal;
		private double rightVal;
		private char opCode;
		private double result;
		
		
		
		public double getLeftVal() {
			return leftVal;
		}

		public double getRightVal() {
			return rightVal;
		}

		public char getOpCode() {
			return opCode;
		}

		public double getResult() {
			return result;
		}

		public void setLeftVal(double leftVal) {
			this.leftVal = leftVal;
		}

		public void setRightVal(double rightVal) {
			this.rightVal = rightVal;
		}

		public void setOpCode(char opCode) {
			this.opCode = opCode;
		}

		public void setResult(double result) {
			this.result = result;
		}

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
				result = (rightVal!=0.0f ? leftVal/rightVal : 0.0f);
				break;
			default:
				System.out.println("error");
				break;
			}
		}
}
