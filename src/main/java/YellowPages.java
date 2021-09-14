import java.util.ArrayList;
import java.util.HashMap;

public class YellowPages
{

    public HashMap<String,ArrayList<Integer>> lastname;

    public YellowPages()
    {
        lastname=new HashMap<String,ArrayList<Integer> >();
    }
    public void add(String lastname, int phoneNumber)
    {
        if(this.lastname.get(lastname)==null)
        {
            ArrayList<Integer> phoneList =new ArrayList<>();
            phoneList.add(phoneNumber);
            this.lastname.put(lastname,phoneList);
        }
        else
        {
            ArrayList<Integer> phoneList =this.lastname.get(lastname);
            phoneList.add(phoneNumber);
            this.lastname.put(lastname,phoneList);
        }
    }
    public void get(String lastname)
    {
        System.out.println("По фамилии "+lastname+" найдены следующие номера "+this.lastname.get(lastname));
    }

}
