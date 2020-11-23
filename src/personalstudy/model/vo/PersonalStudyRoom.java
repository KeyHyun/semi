package personalstudy.model.vo;

public class PersonalStudyRoom {
	private String userId;
	private String todayDate;
	private String studyGoal;
	private String studyStartTime;
	private String studyTotalTime;
	public PersonalStudyRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonalStudyRoom(String userId, String todayDate, String studyGoal, String studyStartTime,
			String studyTotalTime) {
		super();
		this.userId = userId;
		this.todayDate = todayDate;
		this.studyGoal = studyGoal;
		this.studyStartTime = studyStartTime;
		this.studyTotalTime = studyTotalTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTodayDate() {
		return todayDate;
	}
	public void setTodayDate(String todayDate) {
		this.todayDate = todayDate;
	}
	public String getStudyGoal() {
		return studyGoal;
	}
	public void setStudyGoal(String studyGoal) {
		this.studyGoal = studyGoal;
	}
	public String getStudyStartTime() {
		return studyStartTime;
	}
	public void setStudyStartTime(String studyStartTime) {
		this.studyStartTime = studyStartTime;
	}
	public String getStudyTotalTime() {
		return studyTotalTime;
	}
	public void setStudyTotalTime(String studyTotalTime) {
		this.studyTotalTime = studyTotalTime;
	}
	
	
}
