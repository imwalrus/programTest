package test;

public class ExamVO {
	private int eId;
	private String eName;
	
	public ExamVO() {
		
	}

	public ExamVO(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public void showEmpInfo() {
		System.out.println("번호: " + eId + ", 이름: " + eName) ;
	}
}
