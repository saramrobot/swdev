package com.saramrobot.swdev;

import java.util.List;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.saramrobot.swdev.dao.NoteDAO;
import com.saramrobot.swdev.model.NoteVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring/root-context.xml",
		"classpath:spring/dataSource-context.xml"
		})
public class NoteDAOTest {
	private static final Logger logger = LoggerFactory.getLogger(NoteDAOTest.class);
	
	@Inject
	private NoteDAO noteDAO;
	
	@Test 
	public void testGetBoardList() throws Exception {
		List<NoteVO> noteList = noteDAO.getNoteList();
		logger.info("\n Board List \n " );
		if(noteList.size() > 0) {
			for(NoteVO list : noteList) {
				logger.info(list.getN_text());
			}
		} else {
			logger.info("데이터가 없습니다.");
		}
	}
}