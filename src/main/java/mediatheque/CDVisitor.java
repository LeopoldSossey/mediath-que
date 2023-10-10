package mediatheque;

public class CDVisitor implements Visitor {

    public CDVisitor(){

    }

    public void visit(Book book)
    {


    }
    public void visit(CD cd)
    {
        System.out.println(cd);

    }
}
