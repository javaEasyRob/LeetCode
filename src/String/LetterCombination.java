package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName LetterCombination<br>
 * Function <br>
 * <p>
 * Given a string containing digits from 2-9 inclusive, return all possible letter
 * combinations that the number could represent.A mapping of digit to letters
 * (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/5/7 21:56
 */
public class LetterCombination {
    private Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    private List<String> output = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.length() !=  0){
            combination("",digits);
        }
        return output;
    }

    private void combination(String digits,String other){
        if (other.length() == 0){
            output.add(digits);
        } else {
            String digit = other.substring(0,1);
            char[] letters = phone.get(digit).toCharArray();
            for(char letter : letters){
                combination(digits+letter,other.substring(1));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(3*0.1);
    }
}
