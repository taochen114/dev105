package com.tao.bintree.tao1;

public class MyException extends Exception{
    private int id ;
    public MyException(String message, int id){
        super(message);// create fenzhi01
        this.id = id ;//test
        //feature/task1  change
    }

    public int getId() {
        return id;
    }
}
