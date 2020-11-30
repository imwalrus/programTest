package test;

import java.util.List;

public interface ExamService {

	public void insertExm(ExamVO exmVo);

	public void updateExm(ExamVO exmVo);

	public void deleteExm(ExamVO exmVo);

	public List getExmList();

}
