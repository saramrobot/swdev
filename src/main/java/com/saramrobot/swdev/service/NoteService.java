package com.saramrobot.swdev.service;

import java.util.List;

import com.saramrobot.swdev.model.NoteVO;

public interface NoteService {

	public List<NoteVO> getNoteList() throws Exception;
}
