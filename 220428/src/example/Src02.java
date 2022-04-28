package example;

// interface�� ���� ���� �ٸ� ��ü�鿡 ������ '�Ӽ�'�� �ο��� �� ����.

public class Src02
{
	public static void main(String[] args)
	{
		Scv scv = new Scv();
		Tank tank = new Tank();
		Marine marine = new Marine();
		Wraith wraith = new Wraith();
		
		tank.getHit(10);
		marine.getHit(10);
		wraith.getHit(10);
		
		scv.repair(tank);
		scv.repair(marine);
		scv.repair(wraith);
	}
}

interface Repairable { }

abstract class Unit
{
	protected int hp;
	protected final int MAX_HP;
	//	final ������ ���� �� �� �������� �ٲ� �� ������ (���)
	//	�� ���� �����ڰ� ������ ����Ǳ� ���������� ����Ǹ� ��.
	
	Unit(int _hp)
	{
		this.hp = _hp;
		this.MAX_HP = _hp;
	}
	
	void getHit(int _dmg)
	{
		this.hp = this.hp - _dmg;
	}
}

class GroundUnit extends Unit
{
	
	GroundUnit(int _hp)
	{
		super(_hp);
	}
}

class Aircraft extends Unit
{
	Aircraft(int _hp)
	{
		super(_hp);
	}
}

class Marine extends GroundUnit
{
	Marine()
	{
		super(40);
	}
}

// ���� �� ����� ���, �� class <- class, interface <- interface �� ��쿡�� extends.
// ���� �� ����� ���, �� class <- interface �� ��쿡�� implements�� �����.
class Tank extends GroundUnit implements Repairable
{
	Tank()
	{
		super(150);
	}
}

class Scv extends GroundUnit implements Repairable
{
	Scv()
	{
		super(60);
	}
	
	//	original
	/*
	 * void repair(Repairable _r) { Unit u = (Unit)_r;
	 * 
	 * while(u.hp != u.MAX_HP) { u.hp++; System.out.println(u.hp + "/" + u.MAX_HP);
	 * } }
	 */
	
	//	upgraded
	void repair(Unit _u)
	{
		System.out.println();
		
		if(_u instanceof Repairable)
		{
			while(_u.hp != _u.MAX_HP)
			{
				_u.hp++;
				System.out.println(_u.hp + "/" + _u.MAX_HP);
			}
			System.out.println("repair done!");
		}
		else
		{
			System.out.println("cannot repair!");
		}	
	}
}

class Wraith extends Aircraft implements Repairable
{
	Wraith()
	{
		super(300);
	}
}

