
public class CharacterClassDemo {
	public static void main(String[] args) {
        char c1 = '8';
        char c2 = 'y';
        char c3 = 'f';
        char c4 = 'F';
        char c5 = ' ';
         
        System.out.println(Character.isDigit(c1));
        System.out.println(Character.isLetter(c2));
        System.out.println(Character.isLowerCase(c3));
        System.out.println(Character.isUpperCase(c4));
        System.out.println(Character.isWhitespace(c5));
        System.out.println(Character.toUpperCase(c3));
        System.out.println(Character.toLowerCase(c4));
        System.out.println(Character.toString(c4));
        //±Nchar ¡¥F¡¦ Âà¬°String type
  if(Character.toString(c4) instanceof java.lang.String) {
   System.out.println("is a String");
  }

    }

}
