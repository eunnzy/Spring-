package spring.di.sample05;

public class MinusOp implements OperatorBean{
	private int operand1;
	private int operand2;
	
	public MinusOp(int operand1, int operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return operand1 - operand2;
	}

}
