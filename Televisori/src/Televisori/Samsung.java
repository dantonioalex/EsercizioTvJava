package Televisori;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper=true, includeFieldNames=true)
public class Samsung  extends Televisori{
  private  @Getter @Setter int numeroCanali,indice;
  private @Getter @Setter int[] canaliSalvati;
  private @Getter @Setter String[] nomeCanaleSalvati;
  private @Getter @Setter double[] frequenzaCanaliSalvati;
  
  public Samsung(String modello,int pollici,int numeroCanali)  throws Exception{
	  super(pollici,modello);
	  if (numeroCanali > 9) {
		  this.numeroCanali = numeroCanali;
		  this.canaliSalvati = new int[100];
		  this.nomeCanaleSalvati = new String[100];
		  this.frequenzaCanaliSalvati = new double[100];
		  this.indice =0;
	  }else {
		  throw new Exception("Il numero dei canali é minore di 9");
	  }
  }
  
  public double SetCanale(int canale, String nomeCanale ,double frequenza)throws Exception {
	  if (nomeCanale.length() <=20 && frequenza >= 600 && frequenza <= 800) {
		  for (int i= 0; i < this.nomeCanaleSalvati.length; i++) {
			  if(this.nomeCanaleSalvati[i] == nomeCanale || this.canaliSalvati[i] == canale || this.frequenzaCanaliSalvati[i] == frequenza) {
				  throw new Exception("Canale giá regisrato");
			  }else {
				  this.nomeCanaleSalvati[this.indice] = nomeCanale;
				  this.canaliSalvati[this.indice] = canale;
				  this.frequenzaCanaliSalvati[this.indice] = frequenza;
				  this.indice ++;
				  break;
			  }
		  }
		  return frequenza;
	  }else {
		  throw new Exception("Nome canale troppo lungo o frequenza errata");
	  }
  }
}
