package org.mrt.server;

import org.mrt.shared.MavenModule;
import org.mrt.shared.MavenTarget;

/**
 * The <code>MavenModuleLocator</code> defines a way to retrieve a
 * {@link MavenModule} from a given {@link MavenTarget}. The implementation
 * details of how this information is extracted depends on how the Maven
 * repository is to be crawled.
 * 
 * @author Arthur Kalmenson
 */
public interface MavenModuleLocator {

	MavenModule locate(MavenTarget target);
}
