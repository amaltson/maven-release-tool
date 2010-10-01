package org.mrt.server;

import org.mrt.shared.MavenTarget;
import org.mrt.shared.MavenTree;

/**
 * The <code>MavenTreeBuilder</code> is used to create {@link MavenTree}s from a maven repository.
 */
public interface MavenTreeBuilder {

	MavenTree build(MavenTarget targetToBuild);
}
