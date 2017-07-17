package note.beans;

public class Note {

	private String project;
	private String lineOfBusiness;
	private String release;
	private Revision[] revision;
	private String environments;
	private String comments;
	
	public Note() {}

	public Note(String project, String lineOfBusiness, String release, Revision[] revision, String environments,
			String comments) {
		this.project = project;
		this.lineOfBusiness = lineOfBusiness;
		this.release = release;
		this.revision = revision;
		this.environments = environments;
		this.comments = comments;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getLineOfBusiness() {
		return lineOfBusiness;
	}

	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public Revision[] getRevision() {
		return revision;
	}

	public void setRevision(Revision[] revision) {
		this.revision = revision;
	}

	public String getEnvironments() {
		return environments;
	}

	public void setEnvironments(String environments) {
		this.environments = environments;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
