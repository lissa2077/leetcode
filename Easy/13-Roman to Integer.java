class Solution {
   
    public int romanToInt(String s) {
        int sum = 0,last = 1001;
        for(int i = 0;i < s.length();i++){
            switch(s.charAt(i)){
                case 'I':
                    sum+=check(1,last);
                    last = 1;
                    break;
                case 'V':
                    sum+=check(5,last);
                    last = 5;
                    break;
                case 'X':
                    sum+=check(10,last);
                    last = 10;
                    break;
                case 'L':
                    sum+=check(50,last);
                    last = 50;
                    break;
                case 'C':
                    sum+=check(100,last);
                    last = 100;
                    break;
                case 'D':
                    sum+=check(500,last);
                    last = 500;
                    break;
                case 'M':
                    sum+=check(1000,last);
                    last = 1000;
                    break;
            }
            
        }
        return sum;
        
    }
    
    public int check(int current, int last){
        if(current > last){
            return (-(last*2)+current);
        }else{
            return current;
        }
    }
}
