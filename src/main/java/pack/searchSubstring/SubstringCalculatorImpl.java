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
        int suffixCounter = 0;

        for(int i = 0; i < input.length() ; i++){
            Character curChar = input.charAt(i);
            chars.add(curChar);
            if (chars.size() > 2){
                if (curStr.length() > maxLengthSubstr.length())
                    maxLengthSubstr = curStr.toString();
                String suffix = getOneCharSuffix(curStr.toString(), suffixCounter);
                suffixCounter = 1;
                curStr.setLength(0);
                curStr.append(suffix).append(curChar);
                chars.clear();
                chars.add(suffix.charAt(suffix.length() - 1));
                chars.add(curChar);
            }
            else{
                curStr.append(curChar);
                if (curStr.length() >= 2 && (curStr.charAt(curStr.length() - 1) == curStr.charAt(curStr.length() - 2)))
                    suffixCounter++;
                else
                    suffixCounter = 1;
            }
        }
        return curStr.length() > maxLengthSubstr.length() ? curStr.toString() : maxLengthSubstr;
    }

    private String getOneCharSuffix(String input, int suffixCounter) {
        return input.substring(input.length() - suffixCounter);
    }


}
