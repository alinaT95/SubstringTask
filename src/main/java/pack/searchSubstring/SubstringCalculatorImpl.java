package pack.searchSubstring;

import java.util.HashSet;
import java.util.Set;

public class SubstringCalculatorImpl implements SubstringCalculator{

    @Override
    public String getSubstringContainingNoMoreThanTwoDifferentCharacters(String input) {
        if (input == null) throw new IllegalArgumentException("Input is null.");
        if (input.length() <= 2) return input;
        Set<Character> chars = new HashSet<>();
        String maxLengthSubstr = "";
        StringBuilder curStr = new StringBuilder();
        for(int i = 0; i < input.length() ; i++){
            Character curChar = input.charAt(i);
            chars.add(curChar);
            if (chars.size() > 2){
                if (curStr.length() > maxLengthSubstr.length())
                    maxLengthSubstr = curStr.toString();
                String suffix = getOneCharSuffix(curStr.toString());
                curStr.setLength(0);
                curStr.append(suffix).append(curChar);
                chars.clear();
                chars.add(suffix.charAt(suffix.length() - 1));
                chars.add(curChar);
            }
            else{
                curStr.append(curChar);
            }
        }
        return curStr.length() > maxLengthSubstr.length() ? curStr.toString() : maxLengthSubstr;
    }

    private String getOneCharSuffix(String input){
        if (input == null || input.length() == 0) return "";
        Character lastChar = input.charAt(input.length() - 1);
        StringBuilder res = new StringBuilder().append(lastChar);
        boolean changeSymbolFlag = true;
        for(int i = input.length() - 2 ; i >= 0 && changeSymbolFlag ; i--){
            Character curChar = input.charAt(i);
            if (curChar.equals(lastChar))
                res.append(curChar);
            else
                changeSymbolFlag = false;
        }
        return  res.toString();

    }
}
