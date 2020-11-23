package questionboard.model.vo;

public class QuestionBoard {
	private int questionNo;
	private String questionTitle;
	private String questionWriteDate;
	private String questionWriter;
	private String questionContent;
	private String questionPw;
	private String questionStatus;
	private String answerContent;
	private String answerDate;
	public QuestionBoard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuestionBoard(int questionNo, String questionTitle, String questionWriteDate, String questionWriter,
			String questionContent, String questionPw, String questionStatus, String answerContent, String answerDate) {
		super();
		this.questionNo = questionNo;
		this.questionTitle = questionTitle;
		this.questionWriteDate = questionWriteDate;
		this.questionWriter = questionWriter;
		this.questionContent = questionContent;
		this.questionPw = questionPw;
		this.questionStatus = questionStatus;
		this.answerContent = answerContent;
		this.answerDate = answerDate;
	}
	public int getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getQuestionWriteDate() {
		return questionWriteDate;
	}
	public void setQuestionWriteDate(String questionWriteDate) {
		this.questionWriteDate = questionWriteDate;
	}
	public String getQuestionWriter() {
		return questionWriter;
	}
	public void setQuestionWriter(String questionWriter) {
		this.questionWriter = questionWriter;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	public String getQuestionPw() {
		return questionPw;
	}
	public void setQuestionPw(String questionPw) {
		this.questionPw = questionPw;
	}
	public String getQuestionStatus() {
		return questionStatus;
	}
	public void setQuestionStatus(String questionStatus) {
		this.questionStatus = questionStatus;
	}
	public String getAnswerContent() {
		return answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	public String getAnswerDate() {
		return answerDate;
	}
	public void setAnswerDate(String answerDate) {
		this.answerDate = answerDate;
	}
	
	
}
