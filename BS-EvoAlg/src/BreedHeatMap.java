import java.util.Random;
public class BreedHeatMap 
{
	AttackHeatMap mother;
	AttackHeatMap father;
	AttackHeatMap child;
	
	public void setMother(AttackHeatMap inMom)
	{
		mother = inMom;
	}
	
	public void setFather(AttackHeatMap inPop)
	{
		father = inPop;
	}
	
	public void breed()
	{
		Random generator = new Random(1306978);
		
		int shouldRebuild = generator.nextInt(100);
		if(shouldRebuild > 97)
		{
			completelyRebuild();
			return;
		}
		
		for(int i = 0; i < 100; i++)
		{
			int theChoice = generator.nextInt(100);
			if(theChoice < 45)
				child.setCell(i, mother.getCell(i));
			else if(theChoice < 90)
				child.setCell(i, father.getCell(i));
			else
				child.setCell(i, generator.nextInt(10));
		}
	}
	
	private void completelyRebuild()
	{
		Random generator = new Random(1389);
		
		for(int i = 0; i < 100; i++)
		{
			child.setCell(i, generator.nextInt(10));
		}
	}
	
	public AttackHeatMap getChild()
	{
		return child;
	}
}
