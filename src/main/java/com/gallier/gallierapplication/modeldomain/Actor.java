package com.gallier.gallierapplication.modeldomain;

public class Actor
{
    private Long id;
	private String nameprotagonist;
	//private String passportNumber;

	public Actor() 
	{
		super();
	}

	public Actor(Long id, String nameprotagonist) {
		super();
		this.id = id;
		this.nameprotagonist = nameprotagonist;
		//this.passportNumber = passportNumber;
	}

	public Actor(String nameprotagonist) 
	{
		super();
		this.nameprotagonist = nameprotagonist;
		//this.passportNumber = passportNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getNameprotagonist() 
	{
		return this.nameprotagonist;
	}

	public void setNameprotagonist(String nameprotagonist) 
	{
		this.nameprotagonist = nameprotagonist;
	}

	
	public void write()
	{

		System.out.println(getId()+"|!"+getNameprotagonist());
	}
}