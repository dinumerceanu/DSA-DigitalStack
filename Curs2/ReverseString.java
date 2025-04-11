package Curs2;

public class ReverseString {

    public static void reverse(char[] s) {
        int left = 0, right = s.length - 1;
        char aux;
        while (left < right) {
            aux = s[left];
            s[left] = s[right];
            s[right] = aux;
            left++;
            right--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd', 'e', 'f'};
        reverse(s);
    }
}