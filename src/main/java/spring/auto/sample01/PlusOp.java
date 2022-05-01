package spring.auto.sample01;

import org.springframework.beans.factory.annotation.Autowired;

public class PlusOp implements OperatorBean{
	@Autowired
	private Operand operand1;
	@Autowired
	private Operand operand2;
	
	
	public PlusOp(Operand operand1, Operand operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	@Override
	public int calc() {
		return operand1.getValue() + operand2.getValue();
	}

}
