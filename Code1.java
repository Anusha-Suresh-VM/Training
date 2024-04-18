class Code{
  public static void main(String [] args){
    Scanner scan=new Scanner(System.in);
    int start=scan.nextInt();
    int end=scan.nextInt();
    int result=sum(start,end);
    System.out.println(result);
  }
  public static int sum(int start,int end){
    if(start<end){
      return start+sum(start+1);
      
    }
    else{
      return 0;
    }
  }
}
