public String doubleChar(String str) {
  String ans="";
  for(int i=str.length();i<str.length();i--){
    ans += str.substring(i-1,i);
  }
  return ans;
}
