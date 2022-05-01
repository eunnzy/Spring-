package spring.di.sample05;

public class PlusOp implements OperatorBean{
	private int operand1;
	private int operand2;
	
	public PlusOp(int operand1, int operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	@Override
	public int calc() {
		return operand1 + operand2;
	}

}
