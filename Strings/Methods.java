public class Methods
{
    public static void main(String[] args)
    {
        String str="Java Programming";
        String str1=" Java ";
        System.out.println("original:"+str);
        System.out.println("length:"+str.length());
        System.out.println("Character at index 3:"+str.charAt(3));
        System.out.println("uppercase:"+str.toUpperCase());
        System.out.println("lowercase:"+str.toLowerCase());
        System.out.println("equals:"+str.equals(str1));
        System.out.println("equalsIgnorecase:"+str.equalsIgnoreCase(str1));
        System.out.println("Contains:"+str.contains("J"));
        System.out.println("startswith:"+str.startsWith("P"));
        System.out.println("endswith:"+str.endsWith("g"));
        System.out.println("substring:"+str.substring(6));
        System.out.println("indexof:"+str.indexOf("a"));
        System.out.println("lastindexof:"+str.lastIndexOf("n"));
        System.out.println("replace:"+str.replace("Java","python"));
        System.out.println("trim:"+str.trim());
        System.out.println("split:"+str.split(",")[0]);
    }
}