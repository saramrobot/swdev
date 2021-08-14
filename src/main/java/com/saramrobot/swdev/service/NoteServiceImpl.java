package com.saramrobot.swdev.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.saramrobot.swdev.dao.NoteDAO;
import com.saramrobot.swdev.model.NoteVO;

@Service
public class NoteServiceImpl implements NoteService {

	@Inject
	private NoteDAO noteDAO;
	
	public List<NoteVO> getNoteList() throws Exception {
		return noteDAO.getNoteList();
	}

	@Override
	public void insertNote(NoteVO noteVO) throws Exception {
		noteDAO.insertNote(noteVO);
	}
}
