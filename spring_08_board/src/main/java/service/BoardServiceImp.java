package service;

import java.util.List;

import dao.BoardDAO;
import dto.BoardDTO;
import dto.PageDTO;

public class BoardServiceImp implements BoardService {
	private BoardDAO dao;
public BoardServiceImp() {
}
public void setDao(BoardDAO dao) {
	this.dao = dao;
}
@Override
public int countProcess() {
	// TODO Auto-generated method stub
	return dao.count();
}
@Override
public List<BoardDTO> listProcess(PageDTO pv) {
	// TODO Auto-generated method stub
	return dao.list(pv);
}
@Override
public void insertProcess(BoardDTO dto) {
//답변글이면
	if(dto.getRef() !=0) {
		dto.setRe_step(dto.getRe_step() +1);
		dto.setRe_level(dto.getRe_level() +1);
	}
	dao.save(dto);
}
@Override
public BoardDTO updateSelectProcess(int num) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void updateProcess(BoardDTO dto, String urlpath) {
	// TODO Auto-generated method stub
	
}
@Override
public void deleteProcess(int num, String urlpath) {
	// TODO Auto-generated method stub
	
}
@Override
public String fileSelectprocess(int num) {
	// TODO Auto-generated method stub
	return dao.getFile(num);
}
@Override
public BoardDTO contentProcess(int num) {
	dao.readCount(num);
	return dao.content(num);
}
@Override
public void reStepProcess(BoardDTO dto) {
	// TODO Auto-generated method stub
	
}
}
