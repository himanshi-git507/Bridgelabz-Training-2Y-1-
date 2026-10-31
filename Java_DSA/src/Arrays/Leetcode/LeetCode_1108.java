package Arrays.Leetcode;

public class LeetCode_1108 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        LeetCode_1108 solution = new LeetCode_1108();
        System.out.println(solution.defangIPaddr("1.1.1.1"));
        System.out.println(solution.defangIPaddr("255.100.50.0"));
    }
}