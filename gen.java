public class gen {
    public <E> void printArray(E[] s)
    {
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
    public static void main(String[] args)
    {
        gen gen1 = new gen();
        String str[] = {"Hello","World"};
        Integer i[] = {1,2,3,4};
        gen1.printArray(str);
        gen1.printArray(i);
    }
}
