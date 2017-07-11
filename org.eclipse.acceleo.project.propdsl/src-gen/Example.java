import org.chocosolver.solver.*;
public class Example {	
	public static void main(String[] args){	
		Model ExampleModel = new Model("Example");
		
		BoolVar A = ExampleModel.boolVar("A");
		BoolVar B = ExampleModel.boolVar("B");
		BoolVar C = ExampleModel.boolVar("C");
	
		ExampleModel.addClauses(
				LogOp.implies(	LogOp.and(	A
					,	B
					)	
				,	LogOp.nand(	C
					,	C
					)
				)
			
		,ExampleModel); 
	ExampleModel.getSolver().solve();
		for (BoolVar b : ExampleModel.retrieveBoolVars()) {
			System.out.println(b);
		}
	}
}		
