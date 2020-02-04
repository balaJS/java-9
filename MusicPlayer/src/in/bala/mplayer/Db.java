package in.bala.mplayer;

import java.io.Serializable;

public class Db implements Serializable {
	private static Db database = null;
	private Db() {
		System.out.println("I'm constructor of DB class. DB loaded.");
	}
	
	public static Db getSingleton() {
		
		if (database == null) {
			synchronized(Db.class) {
				if (database == null) {
					System.out.println("Ok, I'm calling constructor.");
					database = new Db();
				}
			}
		}
		return database;
	}
	
	protected Object resolve() {
		return Db.getSingleton();
	}
	
	public Boolean insert() {
		Boolean operation = false;
		System.out.println("Data inserted here.");
		return operation;
	}
	
	public Boolean update() {
		Boolean operation = false;
		System.out.println("Data updated here.");
		return operation;
	}
}
