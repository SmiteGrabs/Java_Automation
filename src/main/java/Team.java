public class Team
{
    public String name;
    public String[] team = new String[4];

    public Team(String TeamName,String memberName1,String memberName2,String memberName3,String memberName4)
    {
        this.name=TeamName;
        this.team[0]=memberName1;
        this.team[1]=memberName2;
        this.team[2]=memberName3;
        this.team[3]=memberName4;
    }

}
