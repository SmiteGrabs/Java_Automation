public class ExecuteMainLesson3
{

    public static void main(String[] args)
    {

//Задание 1 *************************************************************
       String [] obj1 = {"One ","Two","Three","Four","Five"};
       arraySwap(obj1,0,2);
       for(int i=0;i< obj1.length;i++)
       {
           System.out.println(obj1[i]);
       }


// Задание 2 *******************************************************************
       Apple apple1 = new Apple();
       Apple apple2 = new Apple();
       Apple apple3 = new Apple();
       Orange orange1 = new Orange();
       Orange orange2 = new Orange();
       Box box1 =new Box();
       Box box2 = new Box();
       Box box3 =new Box();
        try
        {
       box1.addFruit(orange1);
       box2.addFruit(apple2);
       box2.addFruit(apple1);
       box2.addFruit(apple3);
       box1.addFruit(orange1);
       //System.out.println(box1.compareBox(box2));
        // Box.moveToAnotherBox(box1,box2);
            Box.moveToAnotherBox(box1,box3);
            System.out.println(box3.compareBox(box1));

       }
       catch (WrongFruitAdded e)
       {
           System.out.println("Нельзя добавить "+e.wrongFruitName+" в коробку,где хранится "+e.containerFruitName);
       }

    }

    public static void arraySwap(Object[] obj,int firstIndex,int secondIndex) // метод для  задания 1.
    {
        Object sample=obj[firstIndex];
        obj[firstIndex]=obj[secondIndex];
        obj[secondIndex]=sample;
    }
}
