package com.saramrobot.swdev.dao;

import java.util.List;

import com.saramrobot.swdev.model.NoteVO;

public interface NoteDAO {

	public List<NoteVO> getNoteList() throws Exception;
}
