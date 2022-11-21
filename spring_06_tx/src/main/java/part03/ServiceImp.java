package part03;

import org.springframework.transaction.annotation.Transactional;

import model.MemDAO;
import model.MemDTO;

public class ServiceImp implements Service {

	private MemDAO memDAO;

	public ServiceImp() {

	}

	public void setMemDAO(MemDAO memDAO) {
		this.memDAO = memDAO;
	}

	public MemDAO getMemDAO() {
		return memDAO;
	}

	@Transactional(rollbackFor = java.lang.Exception.class)
	@Override
	public void insertProcess() {
		memDAO.insertMethod(new MemDTO(53, "용팔이", 50, "경기"));
		memDAO.insertMethod(new MemDTO(53, "유대위", 20, "대전"));

	}
}
