package javaConstructors;

public class UserConstructor {
    public static void main(String[] args) {
        Users user1 = new Users("koushik",1,"Frontend Developer");
        user1.display();
    }
}


class Users{
    String name;
    int id;
    String role;

    Users(String name,int id,String role){
        this.name = name;
        this.id = id;
        this.role = role;
        System.out.println("iam the default constructor");
    }

    void display(){
        System.out.println(this.name + "-" + this.id + "-" + this.role);
    }
}