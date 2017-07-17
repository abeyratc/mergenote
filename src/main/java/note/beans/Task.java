package note.beans;

import java.util.List;

public class Task {
	private int id;
	private String name;
	private String description;
	private Status status;
	private String startDate;
	private int duration;
	private List<Note> notes;
	
	public Task() {}

	public Task(int id, String name, String description, Status status, String startDate, int duration,
			List<Note> notes) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.startDate = startDate;
		this.duration = duration;
		this.notes = notes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
}
