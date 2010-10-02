package org.mrt.shared;

import java.util.Map;

import com.google.gwt.dev.util.collect.HashMap;

/**
 * A container for a maven dependency tree, contains the root node and a list of
 * dependencies.
 * 
 * @author Arthur Kalmenson
 */
public class MavenTree {
	private MavenModule root;
	private Map<MavenTarget, MavenModule> dependencies;

	public MavenTree(MavenModule root) {
		this.root = root;
		dependencies = new HashMap<MavenTarget, MavenModule>();
	}

	public MavenModule getRoot() {
		return root;
	}

	public MavenModule getDependency(MavenTarget target) {
		return dependencies.get(target);
	}
}
