package personalstudy.model.vo;

public class PersonalStudyTask {
	private int taskNo;
	private String userId;
	private String taskContent;
	private String taskStartDate;
	private String taskEndDate;
	private String taskColor;
	private String taskStatus;
	private int taskOrder;
	public PersonalStudyTask() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonalStudyTask(int taskNo, String userId, String taskContent, String taskStartDate, String taskEndDate,
			String taskColor, String taskStatus, int taskOrder) {
		super();
		this.taskNo = taskNo;
		this.userId = userId;
		this.taskContent = taskContent;
		this.taskStartDate = taskStartDate;
		this.taskEndDate = taskEndDate;
		this.taskColor = taskColor;
		this.taskStatus = taskStatus;
		this.taskOrder = taskOrder;
	}
	public int getTaskNo() {
		return taskNo;
	}
	public void setTaskNo(int taskNo) {
		this.taskNo = taskNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTaskContent() {
		return taskContent;
	}
	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}
	public String getTaskStartDate() {
		return taskStartDate;
	}
	public void setTaskStartDate(String taskStartDate) {
		this.taskStartDate = taskStartDate;
	}
	public String getTaskEndDate() {
		return taskEndDate;
	}
	public void setTaskEndDate(String taskEndDate) {
		this.taskEndDate = taskEndDate;
	}
	public String getTaskColor() {
		return taskColor;
	}
	public void setTaskColor(String taskColor) {
		this.taskColor = taskColor;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public int getTaskOrder() {
		return taskOrder;
	}
	public void setTaskOrder(int taskOrder) {
		this.taskOrder = taskOrder;
	}
	
	
}
