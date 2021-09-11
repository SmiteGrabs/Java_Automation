import java.util.Random;

public class Course
{
 public String[] course;
 final String [] obstacleList = {"Низкая колючая проволока", "Горизонтальный канат", "Рукоход","Наклонное бревно","«болотная кочка»"};

 public Course(int obstacleAmmount) //Вводим количество препятствий
 {
     this.course=new String[obstacleAmmount];
     Random rand = new Random();
     for(int i=0;i<course.length;i++) // Генерация случайных препятствий
     {
         this.course[i]=obstacleList[(rand.nextInt(5))];
     }
 }

    public void doIt(Team example)
    {
        for(int i=0;i<example.team.length;i++)
        {
            for(int j=0;j<course.length;j++)
            {
                System.out.println(example.team[i]+" из команды "+ example.name+ " пересёк "+course[j]+"!");
            }
        }
    }

}
