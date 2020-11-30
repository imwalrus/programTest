package test;

import java.util.List;

public class ExamServiceImpl implements ExamService {

	ExamDAO dao = new ExamDAO();

	@Override
	public void insertExm(ExamVO exmVo) {
		dao.insertExm(exmVo);
	}

	@Override
	public void updateExm(ExamVO exmVo) {
		dao.updateExm(exmVo);
	}

	@Override
	public void deleteExm(ExamVO exmVo) {
		dao.deleteExm(exmVo);
	}

	@Override
	public List getExmList() {
		return dao.getExmList();
	}
}
