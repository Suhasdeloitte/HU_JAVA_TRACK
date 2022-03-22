public class AnimalsUsingSetAndGet {
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }
    public static void main(String[] args){
        AnimalsUsingSetAndGet obj1=new AnimalsUsingSetAndGet();
        AnimalsUsingSetAndGet obj2=new AnimalsUsingSetAndGet();
        AnimalsUsingSetAndGet obj3=new AnimalsUsingSetAndGet();
        obj1.setName("Tiger");
        obj2.setName("Cheetah");
        obj3.setName("Lion");
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        System.out.println(obj3.getName());

    }


}
