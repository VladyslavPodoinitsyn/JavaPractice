package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catTypes = "bengal cat tabby cat persian cat no here other cat type";
        String[] catsArray = catTypes.split(" cat ");
        System.out.println("number pf 'cat' = " + (catsArray.length - 1));

        for (String type : catsArray) {
            System.out.println(type);
        }
    }
}
