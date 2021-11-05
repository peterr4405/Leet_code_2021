import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class leet_380 {

	  Set<Integer> set;
      Random random;
  public leet_380() {
      set = new HashSet();
      random = new Random();
  }
  
  public boolean insert(int val) {
      if(!set.contains(val)){
          set.add(val);
          return true;
      }
      return false;
  }
  
  public boolean remove(int val) {
      if(!set.contains(val)){
          return false;
      }
      set.remove(val);
      return true;
  }
  
  public int getRandom() {
      Integer[] temp = set.toArray(new Integer[0]);
      
      return temp[random.nextInt(set.size())];
  }

}
