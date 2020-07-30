package com.gallier.gallierapplication.modeldomain;
import org.springframework.stereotype.Repository;//ok
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;
import java.sql.Types;
import javax.script.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
//https://mkyong.com/spring-boot/spring-boot-jdbc-examples/
@Repository
public class JdbcSpeakerRepository
{
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public Speaker findById(long id) 
    {
        return jdbcTemplate.queryForObject("select * from speaker where id=?", 
        new Object[] { id },
				new BeanPropertyRowMapper<Speaker>(Speaker.class));
    }
    public List<Speaker> findAll()
    {
          int tmp = 0;
          return jdbcTemplate.query("select * from speaker where id>=?",
          new Object[] {tmp},
          new BeanPropertyRowMapper<Speaker>(Speaker.class));
    }
    public int deleteSpeaker(long id) 
    {
      // define SQL types of the arguments
        int[] types = {Types.BIGINT};
        try
        {
          jdbcTemplate.update("delete from speaker where id=?", 
          new Object[] { id },
          types);
          return 1;
        }
        catch(Exception u)
        {
       
          System.out.println("Dieser Charakter besitzt einen Verweis auf einen anderen Eintrag in der Datenbank und"
          +"kann nicht gelöscht werden");
          return -1;
        }
    }
  }