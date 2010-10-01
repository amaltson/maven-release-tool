package org.mrt.shared;

/**
 * A representation of the scm tag in a maven POM.
 * 
 * @author Arthur Kalmenson
 */
public class SourceCodeManagement {

	private ScmTypes scmTypes;
	private String url;
	private String developerUrl;

	public enum ScmTypes {
		SVN;
	}

	public ScmTypes getScmTypes() {
		return scmTypes;
	}

	public void setScmTypes(ScmTypes scmTypes) {
		this.scmTypes = scmTypes;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDeveloperUrl() {
		return developerUrl;
	}

	public void setDeveloperUrl(String developerUrl) {
		this.developerUrl = developerUrl;
	}
}
