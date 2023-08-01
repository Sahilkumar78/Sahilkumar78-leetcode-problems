//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
         if(a.length() != b.length()){
            return false;
        }
        
       HashMap<Character, Integer> map = new HashMap<>();
        
         for(int i=0; i<a.length(); i++){
               char ch = a.charAt(i);
                map.put(ch , map.getOrDefault(ch , 0) +1);
         }
        
         for(int i=0; i< b.length(); i++){
                 char ch = b.charAt(i);
                  if(map.get(ch) != null){
                       if(map.get(ch) ==1){
                            map.remove(ch);
                       }else{
                            map.put(ch , map.get(ch)-1);
                       }
                  }else{
                      return false;
                  }
         }
        
        return map.isEmpty();
        
        // Your code here
        
    }
}