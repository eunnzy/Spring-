package spring.auto.sample01;

public class MinusOp implements OperatorBean{
	private Operand operand1;
	private Operand operand2;
	
	public MinusOp(Operand operand1, Operand operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	@Override
	public int calc() {
		return operand1.getValue() - operand2.getValue();
	}

}
