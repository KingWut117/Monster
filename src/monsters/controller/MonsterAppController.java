package monsters.controller;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController 
{
	private MonsterView appView;
	private MarshmallowMonster myMonster;
	
	public MonsterAppController()
	{
		appView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Dorf", 3., 2., 1, 1, 2, true);
	}

	public void start()
	{
		appView.displayInformation();	
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}

}
