public class StringOperation {
      public static void main(String[] args) {
            String str1 = "Hello World";
            String str2 = "Java Programming";

            
            // parshing
            System.out.println(str1.substring(6));
            System.out.println(str1.substring(0,5));

            // concatination
            System.out.println(str1.concat(str2));

            // Compare
            if(str1.compareTo(str2) == 0){
                  System.out.println("Strings are equal");
            }
            else{
                  System.out.println("Strings are not equal");
            }

            // Length

            System.out.println("Length of str1: " + str1.length());


            // String BUilder

            StringBuilder sb = new StringBuilder("Hello");
            System.out.println(sb);

            // Replace
            sb.setCharAt(1,'e'); 
            System.out.println(sb);

            //  Insert new character like append

            sb.insert(2, 'e');
            System.out.println(sb);

            sb.delete(2, 3);
            System.out.println(sb);
      }
}
