public class WrongFruitAdded extends ClassCastException
{
    public String wrongFruitName;
    public String containerFruitName;
    public WrongFruitAdded(Fruit obj,Box obj1)
    {
        this.wrongFruitName=obj.name;
        this.containerFruitName= obj1.loadName;;
    }
    public WrongFruitAdded (Box obj,Box obj2)
    {
        this.wrongFruitName=obj2.loadName;
        this.containerFruitName=obj.loadName;
    }
}
