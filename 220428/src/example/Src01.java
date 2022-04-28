package example;

//	DataBase
//	interface and implement

public class Src01
{
	public static void main(String[] args)
	{
		Process p1 = new Process(new OracleImpl());
		p1.connect();
		p1.select();
		p1.insert();
		p1.update();
		p1.delete();

		System.out.println();
		
		Process p2 = new Process(new MsImpl());
		p2.connect();
		p2.select();
		p2.insert();
		p2.update();
		p2.delete();
		
		System.out.println();
		
		Process p3 = new Process(new MySqlImpl());
		p3.connect();
		p3.select();
		p3.insert();
		p3.update();
		p3.delete();
	}
}

class Process
{
	private DbInterface db;
	
	Process(DbInterface _db)
	{
		this.db = _db;	
	}
	
	void connect()
	{
		this.db.connect();
	}
	
	void select()
	{
		this.db.select();
	}
	
	void insert()
	{
		this.db.insert();
	}
	
	void update()
	{
		this.db.update();
	}
	
	void delete()
	{
		this.db.delete();
	}
}

interface DbInterface
{
	
	void connect();	// 연결
	void select();	// 검색
	void insert();	// 데이터 삽입
	void update();	// 데이터 업데이트
	void delete();	// 데이터 삭제
}

class OracleImpl implements DbInterface
{
	public void connect()
	{
		System.out.println("Oracle DB System connected");
	}
	
	public void select()
	{
		System.out.println("Oracle.select");
	}
	
	public void insert()
	{
		System.out.println("Oracle.insert()");
	}
	
	public void update()
	{
		System.out.println("Oracle.update()");
	}
	
	public void delete()
	{
		System.out.println("Oracle.delete()");
	}
}

class MySqlImpl implements DbInterface
{
	public void connect()
	{
		System.out.println("Microsoft DB System connected");
	}
	
	public void select()
	{
		System.out.println("MS.select()");
	}
	
	public void insert()
	{
		System.out.println("MS.insert()");
	}
	
	public void update()
	{
		System.out.println("MS.update()");
	}
	
	public void delete()
	{
		System.out.println("MS.delete()");
	}
}

class MsImpl implements DbInterface
{
	public void connect()
	{
		System.out.println("Microsoft DB System connected");
	}
	
	public void select()
	{
		System.out.println("MS.select()");
	}
	
	public void insert()
	{
		System.out.println("MS.insert()");
	}
	
	public void update()
	{
		System.out.println("MS.update()");
	}
	
	public void delete()
	{
		System.out.println("MS.delete()");
	}
}