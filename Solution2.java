public class Solution2 {
    public static void main(String[] args) {
        
        String [] list={"ab","bc","cd","de","ef","fg","gh"};
        System.out.println("printing string that is on odd index");
        for(int i=0;i<list.length;i++){
            if(i%2!=0) System.out.println(list[i]);
        }
    }
    
}
