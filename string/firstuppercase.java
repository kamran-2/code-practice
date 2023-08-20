package string;

public class firstuppercase {
    
    public static StringBuilder firstupper(String letter){
        StringBuilder str =  new StringBuilder(" ");
        
       char cha = Character.toUpperCase(letter.charAt(0));
       str.append(cha);
        for(int ch=1;ch<letter.length();ch++){
              if(letter.charAt(ch)==' ' && ch<letter.length()-1){
                         cha = letter.charAt(ch);
                          ch++;
                         str.append(cha);
                         cha = Character.toUpperCase(letter.charAt(ch));
                         str.append(cha);
              }
              else{
                 str.append(letter.charAt(ch));
              }
        }
        return str;
    }
    public static void main(String aa[]){
        String name = "my name is kamran";
        System.out.print(firstupper(name));
    }
}
