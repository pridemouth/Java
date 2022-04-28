package example;

public class Src04
{
	public static void main(String[] args)
	{
		

	}
}

class Player
{
	InteractiveCharacter ch;
	
	
	
	void play();
}

abstract class Character
{
	protected String name;
	protected int hp;
	protected int energy;
	protected int lvl;
	protected int exp;
	
	protected final int MAX_HP;
	protected final int MAX_ENERGY;
	protected final int MAX_EXP;
	
	Character()
	{
		this.name = "no-name";
		this.MAX_HP = 100;
		this.MAX_ENERGY = 100;
		this.MAX_EXP = 100;
	}
	
	Character(String _name)
	{
		this.name = _name;
		this.MAX_HP = 100;
		this.MAX_ENERGY = 100;
		this.MAX_EXP = 100;
	}
	
	Character(String _name, int _maxHp, int _maxEnergy, int _maxExp)
	{
		this.name = _name;
		this.MAX_HP = _maxHp;
		this.MAX_ENERGY = _maxEnergy;
		this.MAX_EXP = _maxExp;
	}
	
	abstract int checkHp();
	abstract int checkEnergy();
	abstract int checkExp();
}

interface Interactive
{
	void eat();
	void sleep();
	void play();
	void train();
	
	int statCheck();
	void lvlUp();
}

class InteractiveCharacter extends Character implements Interactive
{
	
	InteractiveCharacter()
	{
		super();
	}
	
	InteractiveCharacter(String _name)
	{
		super(_name);
	}
	
	InteractiveCharacter(String _name, int _maxHp, int _maxEnergy, int _maxExp)
	{
		super(_name, _maxHp, _maxEnergy, _maxExp);
	}
	
	void eat()
	{
		
	}
	
	void sleep()
	{
		
	}
	
	void play()
	{
		
	}
	
	void train()
	{
		
	}
	
	int statCheck()
	{
		
	}
	
	void lvlUp()
	{
		
	}
	
	int checkHp()
	{
		
	}
	
	int checkEnergy()
	{
		
	}
	
	int checkExp()
	{
		
	}
}

class Pikachu extends InteractiveCharacter
{
	
	Pikachu()
	{
		super();
	}
	
	Pikachu(String _name)
	{
		super(_name);
	}
	
	Pikachu(String _name, int _maxHp, int _maxEnergy, int _maxExp)
	{
		super(_name, _maxHp, _maxEnergy, _maxExp);
	}
	
}

class Squirtle extends InteractiveCharacter
{
	Squirtle()
	{
		super();
	}
	
	Squirtle(String _name)
	{
		super(_name);
	}
	
	Squirtle(String _name, int _maxHp, int _maxEnergy, int _maxExp)
	{
		super(_name, _maxHp, _maxEnergy, _maxExp);
	}
}

class Bulbasaur extends InteractiveCharacter
{
	Bulbasaur()
	{
		super();
	}
	
	Bulbasaur(String _name)
	{
		super(_name);
	}
	
	Bulbasaur(String _name, int _maxHp, int _maxEnergy, int _maxExp)
	{
		super(_name, _maxHp, _maxEnergy, _maxExp);
	}
}