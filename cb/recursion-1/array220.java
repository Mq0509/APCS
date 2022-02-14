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
      int[] a = {1,2,20};
      int[] b = {3,30};
      int[] cries = {3};
      System.out.println(array220(a, 0) + "\nReturn:true");
      System.out.println(array220(b, 0) + "\nReturn:true");
      System.out.println(array220(cries, 0) + "\nReturn:false");
    }
  }
