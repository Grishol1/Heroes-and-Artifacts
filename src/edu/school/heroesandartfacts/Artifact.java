package edu.school.heroesandartfacts;

public class Artifact {
	private String name;
	private BodyPart toPut;
	private int AttackPoints;
	private int DefencePoints;
	private int LevelAccesability;
	private int Weigth;
	private void setAttackPoints(int value)
	{
		AttackPoints = value;
	}
	public void setDefencePoints(int value)
	{
		DefencePoints = value;
	}
	public void setLevelAccesability(int value)
	{
		LevelAccesability = value;
	}
	public void setWeigth(int value)
	{
		Weigth = value;
	}
	public int getAttackPoints()
	{
		return AttackPoints;
	}
	public int getDefencePoints()
	{
		return DefencePoints;
	}
	public int getLevelAccesability()
	{
		return LevelAccesability;
	}
	public int getWeigth()
	{
		return Weigth;
	}
	public Artifact(String name, BodyPart toPut, int AttackPoints, int DefencePoints, int LevelAccesability, int Weigth)
	{
		this.name = name;
		this.toPut = toPut;
		setAttackPoints(AttackPoints);
		setDefencePoints(DefencePoints);
		setLevelAccesability(LevelAccesability);
		setWeigth(Weigth);
		/*String BPName = toPut.name().replace('_', ' ').toLowerCase();
		BPName = BPName.charAt(0) + BPName.substring(1).toLowerCase();
		//BPName = ((char)(BPName.charAt(0)-('a'- 'A')))+BPName.substring(1);*/
	}
	public String toString()
	{
		String description = "";
		description += "Name: "+name+"\n";
		description += "Part: "+toPut.getNormalName()+"\n";
		description += "Attack: "+AttackPoints+"\n";
		description += "Defence: "+DefencePoints+"\n";
		description += "Level: " +LevelAccesability+"\n";
		description += "Weigth: " +Weigth+"\n";
		return description;
	}
	
	
}
