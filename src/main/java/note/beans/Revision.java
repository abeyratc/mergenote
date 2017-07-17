package note.beans;

public class Revision {
	private String artifact;
	private String versions;
	
	public Revision() {}
	
	public Revision(String artifact, String versions) {
		this.artifact = artifact;
		this.versions = versions;
	}
	
	public String getArtifact() {
		return artifact;
	}
	
	public void setArtifact(String artifact) {
		this.artifact = artifact;
	}
	
	public String getVersions() {
		return versions;
	}
	
	public void setVersions(String versions) {
		this.versions = versions;
	}
}
