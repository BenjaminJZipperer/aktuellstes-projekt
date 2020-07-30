package com.gallier.gallierapplication.modeldomain;
public class Speaker
{
	private Long id;
	private String namespeaker;
	private String passport_number;
    private int ACTOR_ID;
    public Speaker() 
    {
		super();
	}

    public Speaker(Long id, String namespeaker, String passport_number, int ACTOR_ID) 
    {
		super();
		this.id = id;
		this.namespeaker = namespeaker;
		this.passport_number = passport_number;
		this.ACTOR_ID = ACTOR_ID;
	}

    public Speaker(String namespeaker, String passport_number) 
    {
		super();
		this.namespeaker = namespeaker;
		this.passport_number = passport_number;
	}

	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getNamespeaker() 
	{
		return namespeaker;
	}

	public void setNamespeaker(String namespeaker) 
	{
		this.namespeaker = namespeaker;
	}

	public String getPassport_number() 
	{
		return passport_number;
	}

	public void setPassportNumber(String passport_number) 
	{
		this.passport_number = passport_number;
	}
    public  int getACTOR_ID(){
		return this.ACTOR_ID;
	}
	public  void setACTOR_ID(int ACTOR_ID) 
	{
		this.ACTOR_ID = ACTOR_ID;
	}
	
	public void write()
	{
		System.out.println(getId()+"|"+getNamespeaker()+"|"+getPassport_number()+getACTOR_ID());
	}

}