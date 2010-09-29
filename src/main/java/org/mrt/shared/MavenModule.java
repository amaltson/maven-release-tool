package org.mrt.shared;

import java.util.List;

public class MavenModule {

    private String groupId, artifactId, version;
    private List<MavenModule> dependencies;

    public MavenModule(String groupId, String artifactId, String version, List<MavenModule> dependencies) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.dependencies = dependencies;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public String getVersion() {
        return version;
    }

    public List<MavenModule> getDependencies() {
        return dependencies;
    }
}
