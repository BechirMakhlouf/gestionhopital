package gestionhopital;

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
