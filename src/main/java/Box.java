import java.util.ArrayList;

public class Box<T extends Fruit>
{
    private ArrayList<T> productList=new ArrayList<>();
    public String loadName;
    public float summWeight;

    public Box()
    {
    this.summWeight=0;
    }

    public void addFruit(T obj) throws WrongFruitAdded
    {
        if(this.loadName==null || this.loadName==obj.name)
        {
        productList.add(obj);
        this.loadName = obj.name;
        }
        else
        {
            throw new WrongFruitAdded(obj,this);
        }
    }

    public float getWeight()
    {
        this.summWeight=0;
        for(int i = 0; productList.size()  > i; i++)
        {
            this.summWeight+= this.productList.get(i).weight;
        }
        System.out.println("Вес коробки содержащей "+loadName+" равен "+ this.summWeight);
        return this.summWeight;
    }

    public boolean compareBox(Box box)
    {
        return (this.getWeight()== box.getWeight());

    }
    public static void moveToAnotherBox (Box boxToMove, Box boxToGet) throws WrongFruitAdded
    {
        if(boxToGet.loadName==null || boxToMove.loadName==boxToGet.loadName)
        {
            for (int i=0;i<boxToMove.productList.size();i++)
            {
               boxToGet.productList.add(boxToMove.productList.get(i));
            }

            boxToGet.loadName = boxToMove.loadName;
            boxToMove.loadName=null;
            boxToMove.productList.clear();
            boxToMove.summWeight=0;
        }
        else
        {
            throw new WrongFruitAdded(boxToGet,boxToMove);
        }
    }
}
