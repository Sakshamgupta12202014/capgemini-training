package src.day4.practice;

class Print_table_without_multiply 
{
    public static void main(String []args) 
    {
        int num = 12;
        int i=1;

        int prod = 0;
        while(i <= 10) {
            prod += num;
            System.out.println(num + " x " + i + " = " + prod);
            i++;
        }
    }
}