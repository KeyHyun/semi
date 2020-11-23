package alarm.model.vo;

public class Alarm {
	private int alarmNo;
	private String alarmContent;
	private String userId;
	private int groupNo;
	private String alarmStatus;
	private int alarmSubject;
	public Alarm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alarm(int alarmNo, String alarmContent, String userId, int groupNo, String alarmStatus, int alarmSubject) {
		super();
		this.alarmNo = alarmNo;
		this.alarmContent = alarmContent;
		this.userId = userId;
		this.groupNo = groupNo;
		this.alarmStatus = alarmStatus;
		this.alarmSubject = alarmSubject;
	}
	public int getAlarmNo() {
		return alarmNo;
	}
	public void setAlarmNo(int alarmNo) {
		this.alarmNo = alarmNo;
	}
	public String getAlarmContent() {
		return alarmContent;
	}
	public void setAlarmContent(String alarmContent) {
		this.alarmContent = alarmContent;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(int groupNo) {
		this.groupNo = groupNo;
	}
	public String getAlarmStatus() {
		return alarmStatus;
	}
	public void setAlarmStatus(String alarmStatus) {
		this.alarmStatus = alarmStatus;
	}
	public int getAlarmSubject() {
		return alarmSubject;
	}
	public void setAlarmSubject(int alarmSubject) {
		this.alarmSubject = alarmSubject;
	}
	
	
}
