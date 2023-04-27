package jp.Test;

/*
 * Athlete の データを保存するためのクラス
 * 
 * 右クリック ⇒ ソース ⇒ getter,setterの自動入力 でまとめて入力できる
 */

public class AthleteData {
	private int athlete_id;
	private String name1;
	private String name2;
	private int event_id;
	private String gender;
	
	AthleteData(int a, String n1, String n2, int e, String g) {
		this.athlete_id = a;
		this.name1 = n1;
		this.name2 = n2;
		this.event_id = e;
		this.gender = g;
	}
	
	//setter
	public void setAthleteId(int a) {
		this.athlete_id = a;
	}
	public void setName1(String n1) {
		this.name1 = n1;
	}
	public void setName2(String n2) {
		this.name2 = n2;
	}
	public void setEventId(int e) {
		this.event_id = e;
	}
	public void setGender(String g) {
		this.gender = g;
	}
	
	//getter
	public int getAthleteId() {
		return this.athlete_id;
	}
	public String getName1() {
		return this.name1;
	}
	public String getName2() {
		return this.name2;
	}
	public int getEventId() {
		return this.event_id;
	}
	public String getGender() {
		return this.gender;
	}
}
