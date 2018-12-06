package edu.school.heroesandartfacts;

public enum BodyPart {
	HEAD,
	CHEST,
	LEFT_HAND,
	RIGHT_HAND,
	LEGS;
	
	public String getNormalName()
	{
		String BPName = name().replace('_', ' ');
		BPName = BPName.charAt(0) + BPName.substring(1).toLowerCase();
		return BPName;
	}
}
