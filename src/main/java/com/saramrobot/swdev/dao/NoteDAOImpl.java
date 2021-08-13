package com.saramrobot.swdev.dao;

import java.util.List;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.saramrobot.swdev.model.NoteVO;

@Repository
public class NoteDAOImpl implements NoteDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<NoteVO> getNoteList() throws Exception {
		return sqlSession.selectList("com.saramrobot.swdev.noteMapper.getNoteList");
	}

}
