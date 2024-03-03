package com.sayhello ;

/** le programme commence ici et va appeler la methode ou fonction sayHelloTo */
public class HelloWorld {
    public static void main(String[] args) {
       sayHelloTo("World");
    }
    
    /**  afficher le message "hello" au destinataire fourni
     *
     * @param destinataire 
     */
    private static void sayHelloTo(String destinataire){
        System.out.println("Hello " + destinataire);
    }
}