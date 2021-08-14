package com.saramrobot.swdev.service;

import java.util.List;
import java.util.Map;

import com.saramrobot.swdev.model.NoteVO;

public interface NoteService {

	public List<NoteVO> getNoteList() throws Exception;
	
	public void insertNote(NoteVO noteVO) throws Exception;
}
