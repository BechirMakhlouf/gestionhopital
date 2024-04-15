package gestionhopital;

import java.util.Iterator;
import java.util.TreeSet;

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
