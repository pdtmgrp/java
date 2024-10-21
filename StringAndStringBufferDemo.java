public class StringAndStringBufferDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Does the string contain 'World'? " + str.contains("World"));

        StringBuffer stringBuffer = new StringBuffer("Hello");

        stringBuffer.append(", World!");
        System.out.println("After append: " + stringBuffer);
        stringBuffer.insert(5, " Beautiful");
        System.out.println("After insert: " + stringBuffer);
        stringBuffer.delete(5, 16);
        System.out.println("After delete: " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);
        System.out.println("Capacity of StringBuffer: " + stringBuffer.capacity());
    }
}
