package eventboard.model.vo;

public class EventWinner {
	private int eventNo;
	private String winnerId;
	private int winnerNo;
	public EventWinner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventWinner(int eventNo, String winnerId, int winnerNo) {
		super();
		this.eventNo = eventNo;
		this.winnerId = winnerId;
		this.winnerNo = winnerNo;
	}
	public int getEventNo() {
		return eventNo;
	}
	public void setEventNo(int eventNo) {
		this.eventNo = eventNo;
	}
	public String getWinnerId() {
		return winnerId;
	}
	public void setWinnerId(String winnerId) {
		this.winnerId = winnerId;
	}
	public int getWinnerNo() {
		return winnerNo;
	}
	public void setWinnerNo(int winnerNo) {
		this.winnerNo = winnerNo;
	}
	
}
