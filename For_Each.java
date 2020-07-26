class For_Each     
{
    public static void main(String[] arg)
    {
        {
            int[] marks = { 125, 132, 95, 116, "A" };
             
            int highest_marks = maximum(marks);
            System.out.println("El puntaje mas alto es " + highest_marks);
        }
    }
    public static int maximum(int[] numbers)
    { 
        int maxSoFar = numbers[0];
         
        // bucle for each
        for (int num : numbers) 
        {
            if (num > maxSoFar)
            {
                maxSoFar = num;
            }
        }
    return maxSoFar;
    }
}
