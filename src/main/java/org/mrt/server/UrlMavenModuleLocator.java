package org.mrt.server;

import java.net.URL;

import org.mrt.shared.MavenModule;

import com.google.inject.Inject;

public class UrlMavenModuleLocator implements MavenModuleLocator {

	private URL repositoryRoot;
	
	@Inject
	public UrlMavenModuleLocator(URL repositoryRoot) {
		this.repositoryRoot = repositoryRoot;
	}

	public MavenModule locate(String groupId, String artifactId, String version) {
		return null;
	}
}
