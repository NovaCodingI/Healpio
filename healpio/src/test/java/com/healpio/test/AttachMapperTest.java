package com.healpio.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.healpio.mapper.AttachMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class AttachMapperTest {

	@Autowired
	AttachMapper attachMapper;
	
	@Test
	public void deleteAttach() {
		attachMapper.delete("C000012");
	}
	
	@Test
	public void getOne() {
		attachMapper.getList("C000012");
	}
}
