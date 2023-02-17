public class SubString {
    public static void findSubString(String str,String ans,int i){    //time o(n*2^n)
     //base case
     if(i==str.length()){
        if(ans.length()==0){
            System.out.println("null");
        }
        else{
            System.out.println(ans);
        }
        return;
     }


    //kam    
    //element say yes
    findSubString(str, ans+str.charAt(i), i+1);

    //element say no
    findSubString(str, ans, i+1);
    }
    public static void main(String []args){
        String str="abc";
        findSubString(str," ",0);
    }
}
