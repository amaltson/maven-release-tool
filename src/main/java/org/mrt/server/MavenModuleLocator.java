package org.mrt.server;

import org.mrt.shared.MavenModule;

public interface MavenModuleLocator {

	MavenModule locate(String groupId, String artifactId, String version);
}
