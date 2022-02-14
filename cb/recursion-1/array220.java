public class array220{
  public static boolean array220(int[] nums, int index) {
  if(index == nums.length){
    return false;
  }
  for(int i = index; i < nums.length; i++){
    if(nums[i] == (nums[index] * 10)){
      return true;
    }
  }
      return array220(nums, index + 1);
    }
    public static void main(String[] args) {
      System.out.println(array220([1, 2, 20], 0) + "true");
      System.out.println(array220([3, 30], 0) + "true");
      System.out.println(array220([3], 0) + "false");
    }
  }
