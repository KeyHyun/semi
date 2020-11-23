package user.model.vo;

public class User {
	private int userNo;
	private String userId;
	private String userPw;
	private String userEmail;
	private String userNickname;
	private String filename;
	private String filepath;
	private String userEnrollSNS;
	private int userGrade;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userNo, String userId, String userPw, String userEmail, String userNickname, String filename,
			String filepath, String userEnrollSNS, int userGrade) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPw = userPw;
		this.userEmail = userEmail;
		this.userNickname = userNickname;
		this.filename = filename;
		this.filepath = filepath;
		this.userEnrollSNS = userEnrollSNS;
		this.userGrade = userGrade;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public String getUserEnrollSNS() {
		return userEnrollSNS;
	}
	public void setUserEnrollSNS(String userEnrollSNS) {
		this.userEnrollSNS = userEnrollSNS;
	}
	public int getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(int userGrade) {
		this.userGrade = userGrade;
	}
	
	
}
