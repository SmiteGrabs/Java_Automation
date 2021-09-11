public class ExecuteMainLesson2
{
    public static void arrayGetter(String [][] array) throws MyArraySizeException,MyArrayDataException
    {
       if (array.length>4 || array.length<4)
       {
           throw new MyArraySizeException();
       }
       if (array[0].length<4|| array[0].length>4)
       {
           throw new MyArraySizeException();
       }
       int summ=0;
       for(int i=0;i<4;i++)
       {
           for (int j=0;j<4;j++)
           {
               if(array[i][j].matches("\\d"))
               {
                   summ += Integer.parseInt(array[i][j]);
               }
               else
               {
                   throw new MyArrayDataException(i,j);
               }
           }
       }
       System.out.println(summ);

    }

    public static void main(String[] args)
    {
        String [][] array=new String[4][4];
        for(int i=0;i<4;i++)
        {
            for (int j = 0; j < 4; j++)
            {
                array[i][j]="1";
            }
        }
        array[2][2]="+";
        try
        {
            arrayGetter(array);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Используйте массив размером 4х4");
        }
        catch (MyArrayDataException e)
        {
            System.out.println("В ячейке arrey["+MyArrayDataException.i+"]["+MyArrayDataException.j+"] находится символ, который невозможно конвентировать в int");
        }
        finally {
        }


    }
}
