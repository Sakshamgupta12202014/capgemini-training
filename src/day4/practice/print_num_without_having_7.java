package src.day4.practice;

class rem_without_mod 
{
    public static void main(String []args) 
    {
        int m=10, n=200;
        for( ; m<= n; m++) {
            String num = "";
            num += m;

            boolean f = true;
            for(int i=0 ; i<num.length(); i++) {
                if(num.charAt(i) == '7') {
                    f = false;
                    break;
                }
            }
            if(f) System.out.print(m + "  ");
        }
    }
}