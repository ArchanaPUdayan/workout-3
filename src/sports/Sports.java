package sports;

abstract class OutdoorGame
{
    abstract void team();
}

class Football extends OutdoorGame
{
    void team()
    {
        System.out.println("ARGENTINA");
    }
}

class Cricket extends OutdoorGame
{
    void team()
    {
        System.out.println("ENGLAND");
    }
}

class class1 {
    public static void main(String args[])
    {
        System.out.println("Package Sports");

        Football f=new Football();
        f.team();

        Cricket c=new Cricket();
        c.team();
    }
}

