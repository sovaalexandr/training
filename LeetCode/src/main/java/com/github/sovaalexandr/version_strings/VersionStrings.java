package com.github.sovaalexandr.version_strings;

public class VersionStrings
{
    public int compareVersion(String version1, String version2) {
        if (null == version1) throw new RuntimeException("version 1 can't be null");
        if (0 == version1.length()) throw new RuntimeException("version 1 can't be empty");
        if (null == version2) throw new RuntimeException("version 2 can't be null");
        if (0 == version2.length()) throw new RuntimeException("version 2 can't be empty");

        Struct versionPart1 = new Struct(0, version1), versionPart2 = new Struct(0, version2);
        do {
            versionPart1 = versionPart(versionPart1.reminder);
            versionPart2 = versionPart(versionPart2.reminder);

            final int compare = Integer.compare(versionPart1.versionPart, versionPart2.versionPart);
            if (0 != compare) return compare;

        } while (!(versionPart1.reminder.isEmpty() && versionPart2.reminder.isEmpty()));

        return 0;
    }

    private Struct versionPart(String version) {
        final int i = version.indexOf('.');
        if (0 == version.length()) {
            return new Struct(
                    0,
                    ""
            );
        } else if (-1 == i) {
            return new Struct(
                    Integer.parseInt(version),
                    ""
            );
        } else if (0 == i) {
            throw new RuntimeException("Malformed version" + version);
        } else {
            return new Struct(
                    Integer.parseInt(version.substring(0, i)),
                    version.substring(i + 1)
            );
        }
    }

    public static class Struct {
        public int versionPart;
        public String reminder;

        public Struct(int versionPart, String reminder)
        {
            this.versionPart = versionPart;
            this.reminder = reminder;
        }
    }
}
