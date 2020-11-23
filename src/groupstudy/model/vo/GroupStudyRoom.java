package groupstudy.model.vo;

public class GroupStudyRoom {
	private int groupNo;
	private String groupExplan;
	private String groupRule;
	private int groupPersonnel;
	private String groupContent;
	private String groupStartDate;
	private String groupEndDate;
	private String subjectName;
	private String groupManager;
	private String groupTitle;
	public GroupStudyRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GroupStudyRoom(int groupNo, String groupExplan, String groupRule, int groupPersonnel, String groupContent,
			String groupStartDate, String groupEndDate, String subjectName, String groupManager, String groupTitle) {
		super();
		this.groupNo = groupNo;
		this.groupExplan = groupExplan;
		this.groupRule = groupRule;
		this.groupPersonnel = groupPersonnel;
		this.groupContent = groupContent;
		this.groupStartDate = groupStartDate;
		this.groupEndDate = groupEndDate;
		this.subjectName = subjectName;
		this.groupManager = groupManager;
		this.groupTitle = groupTitle;
	}
	public int getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(int groupNo) {
		this.groupNo = groupNo;
	}
	public String getGroupExplan() {
		return groupExplan;
	}
	public void setGroupExplan(String groupExplan) {
		this.groupExplan = groupExplan;
	}
	public String getGroupRule() {
		return groupRule;
	}
	public void setGroupRule(String groupRule) {
		this.groupRule = groupRule;
	}
	public int getGroupPersonnel() {
		return groupPersonnel;
	}
	public void setGroupPersonnel(int groupPersonnel) {
		this.groupPersonnel = groupPersonnel;
	}
	public String getGroupContent() {
		return groupContent;
	}
	public void setGroupContent(String groupContent) {
		this.groupContent = groupContent;
	}
	public String getGroupStartDate() {
		return groupStartDate;
	}
	public void setGroupStartDate(String groupStartDate) {
		this.groupStartDate = groupStartDate;
	}
	public String getGroupEndDate() {
		return groupEndDate;
	}
	public void setGroupEndDate(String groupEndDate) {
		this.groupEndDate = groupEndDate;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getGroupManager() {
		return groupManager;
	}
	public void setGroupManager(String groupManager) {
		this.groupManager = groupManager;
	}
	public String getGroupTitle() {
		return groupTitle;
	}
	public void setGroupTitle(String groupTitle) {
		this.groupTitle = groupTitle;
	}
	
}
