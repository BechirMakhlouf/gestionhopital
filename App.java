package gestionhopital;

import java.util.Iterator;
import java.util.TreeSet;

class Malade implements Comparable<Malade> {
  private String codeMalade;
  private float coutMalade;

  public Malade(String codeMalade, float coutMalade) {
    this.codeMalade = codeMalade;
    this.coutMalade = coutMalade;
  }

  public float getCoutMalade() {
    return this.coutMalade;
  }

  public String getCodeMalade() {
    return this.codeMalade;
  }

  @Override
  public String toString() {
    return "Code Malade: " + this.codeMalade + "\t tCout Malade: " + this.coutMalade + "\n";
  }

  public boolean equals(Object obj) {
    return this.codeMalade == ((Malade) obj).getCodeMalade();
  }

  @Override
  public int compareTo(Malade m1) {
    return Math.round(this.coutMalade - m1.getCoutMalade());
  }
}

class Hopital {
  private String nom;
  private TreeSet<Malade> desMalades = new TreeSet<Malade>();

  public Hopital(String nom) {
    this.nom = nom;
  }

  public void ajouterMalade(Malade m) {
    desMalades.add(m);
  }

  public float chercherCoutMalade(String codeMalade) {
    Iterator<Malade> it = desMalades.iterator();
    float result = -1;

    while (it.hasNext()) {
      Malade maladeI = it.next();
      if (maladeI.getCodeMalade() == codeMalade) {
        result = maladeI.getCoutMalade();
        break;
      }
    }
    return result;
  }

  @Override
  public String toString() {
    return "nom hopital : " + nom;
  }

  public void afficherHopital() {
    System.out.println(this);
    Iterator<Malade> it = desMalades.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

}

public class App {

  public static void main(String[] args) {
    Hopital h = new Hopital("h1");

    h.ajouterMalade(new Malade("code2", 124.4f));
    h.ajouterMalade(new Malade("code3", 125.4f));
    h.ajouterMalade(new Malade("code4", 126.4f));
    h.ajouterMalade(new Malade("code5", 127.4f));
    h.ajouterMalade(new Malade("code6", 128.4f));
    h.ajouterMalade(new Malade("code7", 129.4f));
    h.ajouterMalade(new Malade("code8", 1210.4f));
    h.ajouterMalade(new Malade("code9", 1211.4f));
    h.ajouterMalade(new Malade("code10", 1113.4f));
    h.ajouterMalade(new Malade("code11", 1123.4f));
    h.ajouterMalade(new Malade("code12", 1133.4f));
    h.ajouterMalade(new Malade("code13", 1143.4f));
    h.ajouterMalade(new Malade("code14", 1153.4f));
    h.ajouterMalade(new Malade("code15", 1163.4f));
    h.ajouterMalade(new Malade("code16", 1173.4f));
    h.ajouterMalade(new Malade("code17", 1183.4f));
    h.ajouterMalade(new Malade("code18", 1193.4f));
    h.ajouterMalade(new Malade("code19", 1203.4f));
    h.ajouterMalade(new Malade("code20", 1213.4f));
    h.ajouterMalade(new Malade("code21", 1223.4f));
    h.ajouterMalade(new Malade("code22", 1233.4f));

    h.afficherHopital();
  }
}
