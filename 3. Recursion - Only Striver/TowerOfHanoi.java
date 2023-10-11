public class TowerOfHanoi {

    public static void main(String[] args){
        recur(3,'A','B','C');
    }
    // Time Complexity: O(2^N)
    // Space Complexity: O(N)
    public static void recur(int n,char src, char aux, char dest){
        if(n==1){
            System.out.println("Move disk "+n+" from "+src+" to "+dest);
            return;
        }
        recur(n-1,src,dest,aux);
        System.out.println("Move disk "+n+" from "+src+" to "+dest);
        recur(n-1,aux,src,dest);
    }
}