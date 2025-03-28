public class CharacterCount {
    public static void main(String[] args) {
        System.out.println(str_count("Hello", 'o')); 
        System.out.println(str_count("Hello", 'l')); 
        System.out.println(str_count("Hello", 'z')); 
    }

    public static int str_count(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) { 
                count++; 
            }
        }
        return count; 
    }
}
