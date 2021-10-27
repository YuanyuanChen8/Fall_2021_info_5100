package com.company;

class Printer {
    private static Printer _instance;
    private Printer(){}
    private static Object obj = new Object();
    public String name = "Default";

    public static Printer getInstance() {
        if(_instance == null){
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Printer();
                }
            }
        }
        return _instance;
    }

    public void getConnection() {
        this.getConnection();
    }
}
   class Main {
       public static void main(String[] args) {
          Printer p1;

      // refers to the only object of Database
          p1= Printer.getInstance();
          System.out.println("Your Printer is working");

          p1.getConnection();
      }
}