	import org.chocosolver.solver.*
	Model InitModel = new Model("Init");
	
		

	InitModel.getSolver().solve();
	for (BoolVar b : model.retrieveBoolVars(true)) {
			System.out.println(b);
	}
		
