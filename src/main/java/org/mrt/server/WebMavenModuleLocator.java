package org.mrt.server;

import java.net.URL;

import org.mrt.shared.MavenModule;
import org.mrt.shared.MavenTarget;

import com.google.inject.Inject;

/**
 * A concrete implementation of the {@link MavenModuleLocator} for a web based
 * maven repository.
 * 
 * @author Arthur Kalmenson
 */
public class WebMavenModuleLocator implements MavenModuleLocator {

	private URL repositoryRoot;

	@Inject
	public WebMavenModuleLocator(URL repositoryRoot) {
		this.repositoryRoot = repositoryRoot;
	}

	public MavenModule locate(MavenTarget target) {
		return null;
	}
}
