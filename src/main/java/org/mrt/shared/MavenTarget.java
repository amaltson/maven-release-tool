package org.mrt.shared;

/**
 * A class that represents the standard maven target (groupId, artifactId,
 * version).
 * 
 * @author Arthur Kalmenson
 */
public class MavenTarget {

	private String groupId, artifactId, version;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
