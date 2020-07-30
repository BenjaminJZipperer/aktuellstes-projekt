package com.gallier.gallierapplication;
import com.gallier.gallierapplication.modeldomain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
@SpringBootApplication
public class GallierApplication  implements CommandLineRunner
{
	// Server läuft ohne Logger
	//private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	JdbcActorRepository repository;
	@Autowired
	JdbcSpeakerRepository repository2;

	public static void main(String[] args) 
	{
		SpringApplication.run(GallierApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception 
	{
		//logger.
		repository.findById(10001L).write();
		repository.findById(10002L).write();
		repository.findById(10003L).write();
		repository.findById(10004L).write();
		repository.findById(10005L).write();

		repository2.findById(1L).write();
		repository2.findById(2L).write();
			Actor abi = new Actor();
			abi.setId(1000800L);
			abi.setNameprotagonist("Hasan");
		repository.save(abi);
	}
}
