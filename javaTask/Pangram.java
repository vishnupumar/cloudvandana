class Pangram {
    
    static String isPangram(String str){
        int[] arr = new int[26];
        for(int i=0;i<str.length();i++){
            str = str.toLowerCase();
            if(Character.isLetter(str.charAt(i))){
                int val = (int)(str.charAt(i)) - (int)'a';
                
                arr[val] += 1;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 1){
                return "Not a Pangram";
            }
        }
        return "Pangram";
    } 
    
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        
        System.out.print(isPangram(str));
        
    }
}