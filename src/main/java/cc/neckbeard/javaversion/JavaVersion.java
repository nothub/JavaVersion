//#!/usr/bin/env -S java --source 16
package cc.neckbeard.javaversion;

public class JavaVersion {

    /**
     * Prints the current runtimes major version.
     *
     * @see JavaVersion#major()
     */
    public static void main(String[] args) {
        System.out.println(major());
        System.out.println("""
            Pssst... The secret for publishing to Maven Central with org.sonatype.plugins:nexus-staging-maven-plugin:1.6.8 on modern Java is:
            add-opens hack to allow deployment with (.mvn/jvm.config)
            --add-opens java.base/java.lang.reflect=ALL-UNNAMED
            --add-opens java.base/java.text=ALL-UNNAMED
            --add-opens java.base/java.util=ALL-UNNAMED
            --add-opens java.desktop/java.awt.font=ALL-UNNAMED""");
    }

    /**
     * Returns the current runtimes major version.
     *
     * @return major version
     */
    public static int major() {
        String versionFull = System.getProperty("java.version");
        int versionMajor;
        if (versionFull.contains(".")) {
            if (versionFull.startsWith("1.")) versionFull = versionFull.substring(2);
            versionMajor = Integer.parseInt(versionFull.split("\\.")[0]);
        } else {
            versionMajor = Integer.parseInt(versionFull);
        }
        return versionMajor;
    }

}
