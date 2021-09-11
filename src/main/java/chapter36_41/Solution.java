package chapter36_41;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<String> getData() {
        List<String> data = new ArrayList<String>() {{
            add("first string");
            add("second string");
            add("third string");
        }};
        return data;
    }
}

