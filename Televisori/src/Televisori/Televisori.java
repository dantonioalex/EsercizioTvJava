package Televisori;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Televisori {
 private @Getter @Setter int pollici;
 private @Getter @Setter String modello;
 
 public Televisori(int pollici,String modello){
	 this.pollici = pollici;
	 this.modello = modello;
	 
 }
}
