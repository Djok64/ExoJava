package com.sayhello ;

/** le programme commence ici et va appeler la methode ou fonction sayHelloTo */
public class HelloWorld {


    static String nom = "ANC";
    static String prenom = "Djoko";
    static String secondPrenom = "Djoko";

    public static void main(String[] args) {
        String infos = nom + " " + prenom + " " + secondPrenom;
       sayHelloTo("World");
       afficher(infos);

    }
    
    /**  afficher le message "hello" au destinataire fourni
     *
     * @param destinataire 
     */
    private static void sayHelloTo(String destinataire){
        System.out.println("Hello " + destinataire);
    }

    /**  afficher les infos stocké  dans cette variable ( on la transformera ces infos en tableau dans cette exemple )
     *
     * @param infos
     */
    static void afficher(String infos) {
        // Utilisation de split pour diviser la chaîne en mots
        String[] mots = infos.split(" ");
        switch(mots.length) {
            case 1:
                System.out.println("Nom : " + mots[0]);
                break;
                case 2:
                    System.out.println("Nom : " + mots[0] + "\nPrénom : " + mots[1]);
                    break;
                    case 3:
                        System.out.println("Nom : " + mots[0] + "\nPrénom : " + mots[1] + "\nSecond prénom : " + mots[2]);
                        break;
                        default:
                            System.out.println("Plus de trois éléments, informations complètes : " + infos);

        }
    }
}