
class Roman {
    
    static int romanVal(char a){
        if('I' == a){
            return 1;
        }else if('V' == a){
            return 5;
        }else if('X' == a){
            return 10;
        }else if('L' == a){
            return 50;
        }else if('C' == a){
            return 100;
        }else if('D' == a){
            return 500;
        }else if('M' == a){
            return 1000;
        }
        return -1;
    }

    static void romanToNumber(String str){
            int I = 1;
            int V = 5;
            int X = 10;
            int L = 50;
            int C = 100;
            int D = 500;
            int M = 1000;
            
            int n = str.length();
            int result = 0;
            for(int i=0;i<n;i++){
                int first = romanVal(str.charAt(i));
                
                if(i+1 < n){
                    int second = romanVal(str.charAt(i+1));
                    
                    if(first >= second){
                        result = result + first;
                    }else{
                        result = result + second - first;
                        i++;
                    }
                }else{
                    result = result + first;
                }
            }
             System.out.println(result);
    }
    
    public static void main(String[] args) {
        romanToNumber("IV");
    }
}