public class intro_to_array {
    public static void main(String[] args) {
        // String[] names = new String[5];
        // names[0] = "Arnav";
        // names[1] = "Vaibhav";
        // names[2] = "Shivain";
        // names[3] = "Jagroop";
        // names[4] = "Harsimran";
        // System.out.println(names[1]);
        // String[] names = { "Arnav", "Vaibhav", "Shivain", "Jagroop", "Harsimran" };
        // System.out.println(names[1]);//--> Prints Vaibhav
        // for (int i = names.length - 1; i >= 0; i--) {
        // System.out.println(names[i]);
        // }
        // for (int i = 0; i < names.length; i++) {
        // System.out.println(names[i]);
        // }
        // for (String element : names) {
        // System.out.println(element);
        // }

        int[][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
