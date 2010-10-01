package org.mrt.shared;

import java.util.List;

/**
 * Represents the physical Maven module with a {@link MavenTarget}, a list of
 * {@link MavenTarget} dependencies and additional meta-data.
 * 
 * @author Arthur Kalmenson
 */
public class MavenModule {

	private MavenTarget mavenTarget;
	private SourceCodeManagement scm;

	private List<MavenTarget> dependencies;

	public MavenTarget getMavenTarget() {
		return mavenTarget;
	}

	public void setMavenTarget(MavenTarget mavenTarget) {
		this.mavenTarget = mavenTarget;
	}

	public SourceCodeManagement getScm() {
		return scm;
	}

	public void setScm(SourceCodeManagement scm) {
		this.scm = scm;
	}

	public List<MavenTarget> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<MavenTarget> dependencies) {
		this.dependencies = dependencies;
	}

}
