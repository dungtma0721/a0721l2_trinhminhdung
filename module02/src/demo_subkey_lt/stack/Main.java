package demo_subkey_lt.stack;
// Driver Code
class Main {
    // Function to reverse the array elements
    public static void reverse(int arr[], int n)
    {
        // Initialize a stack of capacity n
        Stack obj = new Stack(n);
        for (int i = 0; i < n; i++) {
            // Insert arr[i] into the stack
            obj.push(arr[i]);
        }
        // Reverse the array elements
        for (int i = 0; i < n; i++) {
            // Update arr[i]
            arr[i] = obj.pop();
        }
        // Print array elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // Driver function
    public static void main(String args[])
    {
        int n = 4;
        // Create a new array
        int[] a = new int[] { 100, 200, 300, 400 };
        // Call reverse method
        reverse(a, n);
    }
}
