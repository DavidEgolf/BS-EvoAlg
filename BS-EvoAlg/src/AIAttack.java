import java.util.Random;
import java.util.Date;
public class AIAttack {
	private GameBoard board;
	private AttackHeatMap map;
	private Random generator = new Random(new Date().getTime());
	
	AIAttack(GameBoard inBoard)
	{
		board = inBoard;
	}
	
	public void doNextAttack()
	{
		
		map.reSum();
	}
}
