package note.beans;

public class Result {
	private String status;
	private String reason;
	
	public Result() {}

	public Result(String status, String reason) {
		super();
		this.status = status;
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
