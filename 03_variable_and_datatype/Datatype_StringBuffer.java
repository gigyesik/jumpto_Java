public class Datatype_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // object sb create (mutable)
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result); // hello jump to java

        String result1 = ""; // (immutable)
        result1 += "hello";
        result1 += " ";
        result1 += "jump to java";
        System.out.println(result1); // hello jump to java

        // insert
        sb.insert(0, "hello ");
        System.out.println(sb.toString()); // hello hello jump to java

        // substring
        System.out.println(sb.substring(0, 4)); // hell
    }
}
