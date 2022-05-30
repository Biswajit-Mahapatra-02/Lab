package A3Q2;


public class A3Q2 {
    public static void main(String[] args) {
        String[] colorsStrings = {"Blue", "Black", "White", "Red", "Green"};
        try{
            int i = 0;
            while(true){
                if(i == colorsStrings.length)
                    throw new IndexOutOfBoundsException();
                System.out.print(colorsStrings[i++]+" ");
            }
        } catch(IndexOutOfBoundsException e){
            System.out.println("\nAll my favorite colors have been printed.");
        }
        int[] nullarr = null;
        try{
            System.out.println(nullarr.length);
        } catch(NullPointerException e){
            System.err.println("The array is null.");
        }
    }
}
