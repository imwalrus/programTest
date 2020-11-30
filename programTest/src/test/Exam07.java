package test;

import java.util.List;
import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ExamService service = new ExamServiceImpl();

		while (true) {
			System.out.println("===========================");
			System.out.println("1. 등록 | 2. 수정 | 3. 삭제 | 4. 전체목록");
			System.out.println("===========================");
			System.out.println("선택> ");

			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				System.out.println("번호를 입력> ");
				int eId = scn.nextInt();
				scn.nextLine();
				System.out.println("이름을 입력> ");
				String eName = scn.nextLine();

				ExamVO vo = new ExamVO();
				vo.seteId(eId);
				vo.seteName(eName);

				service.insertExm(vo);
				
			} else if (selectNo == 2) {
				System.out.println("수정할 번호 입력> ");
				int eId = scn.nextInt();
				scn.nextLine();
				System.out.println("수정할 이름 입력> ");
				String eName = scn.nextLine();

				ExamVO vo = new ExamVO();
				vo.seteId(eId);
				vo.seteName(eName);

				service.updateExm(vo);
				
			} else if (selectNo == 3) {
				System.out.println("삭제할 번호 입력> ");
				int eId = scn.nextInt();
				scn.nextLine();

				ExamVO vo = new ExamVO();
				vo.seteId(eId);

				service.deleteExm(vo);
				
			} else if (selectNo == 4) {
				List list = service.getExmList();
				for (Object vo : list) {
					ExamVO exm = (ExamVO) vo;
					exm.showEmpInfo();
				}
			}

		}
	}
}
