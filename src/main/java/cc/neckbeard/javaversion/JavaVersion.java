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
        System.out.println("Pssst... The secret for publishing to Maven Central with nexus-staging-maven-plugin on Java > 8 is: \"--illegal-access=permit\"");
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
