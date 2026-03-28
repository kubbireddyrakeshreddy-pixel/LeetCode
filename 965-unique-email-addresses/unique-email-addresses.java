import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            String[] arr = s.split("@");
            if (arr[0].contains("+")) {
                arr[0] = arr[0].substring(0, arr[0].indexOf("+"));
            }
            arr[0] = arr[0].replace(".", "");
            String email = arr[0] + "@" + arr[1];
            set.add(email);
        }
        return set.size();
    }
}