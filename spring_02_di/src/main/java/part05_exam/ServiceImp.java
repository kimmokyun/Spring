package part05_exam;

public class ServiceImp implements Service {
	private MemDaoImp memDao;

	public ServiceImp() {
		// TODO Auto-generated constructor stub
	}

	public void setMemDao(MemDaoImp memDao) {
		this.memDao = memDao;
	}

	@Override
	public void prn() {
		// TODO Auto-generated method stub
		memDao.selectMethod();
	}
}
