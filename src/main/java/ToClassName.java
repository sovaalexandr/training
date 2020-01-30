public class ToClassName {
    public static void main(String[] args) {
        final String[] parts = "First Bad Version".split(" ");
        final StringBuilder sb = new StringBuilder();
        int length = 0;
        for (final String s : parts) {
            final char[] chars = s.toCharArray();
            chars[0] = Character.toLowerCase(chars[0]);
            sb.append(chars); sb.append('_');
            length += chars.length + 1;
        }
        sb.setCharAt(length - 1, '.');
        for (final String s : parts) sb.append(s);
        System.out.println(sb.toString());
    }
}
//First Bad Version