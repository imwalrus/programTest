package test;

public class Exam06 {
	// 필드
	private int bNo; // 책번호
	private String bName; // 책이름
	private String gen; // 장르
	private String wri; // 저자
	private String pub; // 출판사

	// 생성자
	public Exam06() {
	}

	public Exam06(int bNo, String bName, String gen, String wri, String pub) {
		super();
		this.bNo = bNo;
		this.bName = bName;
		this.gen = gen;
		this.wri = wri;
		this.pub = pub;
	}

	// 메소드 (getter, setter)
	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public String getWri() {
		return wri;
	}

	public void setWri(String wri) {
		this.wri = wri;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}
	
}
