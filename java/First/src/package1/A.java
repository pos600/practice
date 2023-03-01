package package1;
import package2.*;

public class A {

    public static void main(String[] args) {

        C c = new C();
        // System.out.println(c.defaultMessage); <--- default
        // System.out.println(c.publicMessage);
        // protected String protectedMessage = "This is protected";
        B b = new B();
        // System.out.println(b.privateMessage); <--- can obly be accessed in B.java
        
    }
    
}

//NOTES

/*
 * DEFAULT = CAN ONLY BE VIEWED IF ITS IN THE SAME PACKAGE
 * PUBLIC = CAN BE VIEWED BY OTHER PACKAGES
 * PROTECTED =  IS ACCESSIBLE TO A DIFFERENT CLASS AND OR PACKAGE AS LONG AS THE CLASS IS A SUBCLASS/CHILDCLASS OF THE PROTECTED MEMBER.
 * PRIVATE = ONLY VISIBLE TO THE CLASS THAT IT CONTAINS ITSELF IN MY CASE ITS B.JAVA
 */