package DAY5;

public class arrayNstrings {
    public static void main(String[] args) {
//        Arrays & arrays with loop
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
    for (int x  : arr){
        System.out.print(x+ ", ");
    }
    System.out.println();
    System.out.println(arr.length);
    double[] x = {1.1,2.2,3.3,4.4,5.5};
        for (double y  : x){
            System.out.print(y+", ");
        }
        System.out.println();
//      Strings
        String name = "Manoj";
        name.concat("S");
        System.out.println(name);
        String s = "Hello";
        s = s + " World";
        System.out.println(s);
        String test = "Java JavaScript Python";
        String[] lang = test.split(" ");
        for (String l:lang){
            System.out.print(l+" ");
        }
        System.out.println(test.charAt(4));
        System.out.println(test.length());
        System.out.println(test.substring(0,4));
        String c = "Hello";
        System.out.println(c.length());
        System.out.println(c.charAt(4));
        System.out.println(test.charAt(test.length()-1));
        String ss = "Code";
        for (int i=0;i<ss.length();i++){
            System.out.println(ss.charAt(i));
        }

    }
}
