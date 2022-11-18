import java.util.ArrayList;
public class RemoveAll {
	public static void main(String[] args) {
        ArrayList<String> seniors = new ArrayList<>();
        seniors.add("jhanu");
        seniors.add("suresh");
        seniors.add("srikanth");
        System.out.println("seniors"+ " "+ seniors);
        ArrayList<String> juniors = new ArrayList<>();
        juniors.add("chaitanya");
        juniors.add("srutha keerthi");
        juniors.add("roshini");
        juniors.add("savitri");
        juniors.add("vishal");
        juniors.add("vardhil");
        System.out.println("juniors"+" " + juniors);
        seniors.removeAll(juniors);
        seniors.retainAll(juniors);
        System.out.println( juniors);
        System.out.println(seniors);
        }
}
