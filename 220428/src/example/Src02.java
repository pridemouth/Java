package example;

// interface를 통해 서로 다른 객체들에 일종의 '속성'을 부여할 수 있음.

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
	//	final 변수의 값은 한 번 정해지면 바뀔 수 없으나 (상수)
	//	그 값은 생성자가 실제로 실행되기 이전까지만 선언되면 됨.
	
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

// 동종 간 상속일 경우, 즉 class <- class, interface <- interface 일 경우에는 extends.
// 이종 간 상속일 경우, 즉 class <- interface 일 경우에는 implements를 사용함.
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

