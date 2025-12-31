package infosys;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {

    public static List<String> generate(int n){
        List<String> list = new ArrayList<>();
        backtrack(list,"",0,0,n);
        return list;
    }
    private static void backtrack(List<String> result, String current, int open,int close,int n){
        if (current.length() == 2*n){
            result.add(current);
        }

        if (open < n){
            backtrack(result,current+"(",open+1,close,n);
        }
        if (close < open){
            backtrack(result,current+")",open,close+1,n);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generate(n);

        for (String each : result){
            System.out.println(each);
        }
    }
}
