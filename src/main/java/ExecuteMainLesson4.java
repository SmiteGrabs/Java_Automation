import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ExecuteMainLesson4
{
    public static void main(String[] args)
    {
        ArrayList<String > array = new ArrayList<>();
        ArrayList<String> arrayRepeat = array;
        array.add("Один");
        array.add("Два");
        array.add("Три");
        array.add("Четыре");
        array.add("Пять");
        array.add("Шесть");
        array.add("Один");
        array.add("Четыре");
        array.add("Три");
        array.add("Десять");
        HashSet<String> unqArray=new HashSet<String>(array);
        Iterator<String> iter= unqArray.iterator();
        System.out.println(unqArray);
        while(iter.hasNext())
        {
           String iterMove = iter.next();
            int summ=0;
           for(int j=0;j< array.size();j++)
           {
               if (iterMove==array.get(j))
               {
                   summ+=1;
               }

           }
           if(summ>=1)
           {
               System.out.println(iterMove+" повторяется "+summ +" раз ");
           }
        }



        // Задание 2*******************************************************************

        YellowPages pages = new YellowPages();
        pages.add("Иванов",79998884);
        pages.add("Иванов", 888999888);
        pages.add("Петров",222333444);
        pages.add("Петров", 777888222);
        pages.get("Петров");

    }
}



