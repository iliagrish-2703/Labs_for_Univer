package Lab_6.Task_2;

public class Main {
    public static void main(String[] args) {
        int n = 2;
        int h = 3;
        int w = 5;

        int left = 1;
        int right = Math.max(h, w) * n;
        
        while (left < right) {
            int mid = (right + left) / 2;
            int inWidth = mid / w;
            int inHeight = mid / h;
            
            if (inWidth * inHeight >= n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            } 
        }
        System.out.println("BinOutput: " + left);
    }
}
