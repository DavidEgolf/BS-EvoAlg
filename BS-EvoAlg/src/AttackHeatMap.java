public class AttackHeatMap {
	int[] theMap;
	int sumOfMap;
	
	AttackHeatMap()
	{
		theMap = new int[100];
	}

	AttackHeatMap(int[] inMap)
	{
		theMap = new int[100];
		populateHeatMap(inMap);
	}
	
	public void populateHeatMap(int[] inMap)
	{
		for(int i = 0; i < 100; i++)
			theMap[i] = inMap[i];
	}
	
	public int[] getHeatMap()
	{
		return theMap;
	}
	
	public void emptyCell(int cell)
	{
		if(cell >= 0 && cell < 100)
			theMap[cell] = 0;
	}
	
	public void setCell(int cell, int priority)
	{
		theMap[cell] = priority;
	}
	
	public int getCell(int cell)
	{
		if(cell >= 0 && cell < 100)
			return theMap[cell];
		return 9001;
	}
	
	public void reSum()
	{
		sumOfMap = 0;
		for(int i = 0; i < 100; i++)
			sumOfMap += theMap[i];
	}
	
	
}
