package ds.tree.node;

public class Test {

	public static void main(String[] args) {

		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hotDrink = new TreeNode("Hot");
		TreeNode coldDrink = new TreeNode("Cold");
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("Coffee");
		TreeNode coke = new TreeNode("Coke");
		
		drinks.addChild(hotDrink);
		drinks.addChild(coldDrink);
		hotDrink.addChild(tea);
		hotDrink.addChild(coffee);
		coldDrink.addChild(coke);
		
		System.out.println(drinks.print(0));

	}

}
