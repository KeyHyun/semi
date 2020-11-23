package groupstudy.model.vo;

public class GroupStudyMember {
	private String userId;
	private int groupNo;
	private int memberNo;
	public GroupStudyMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GroupStudyMember(String userId, int groupNo, int memberNo) {
		super();
		this.userId = userId;
		this.groupNo = groupNo;
		this.memberNo = memberNo;
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
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	
	
}
