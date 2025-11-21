package com.project.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class StudentPodaci {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String ime;
	 private String prezime;
	 private String srednjeIme;
	 private String jmbg;    
	 private LocalDate datumRodjenja;
	 private String mestoRodjenja; 
	 private String mestoPrebivalista;
	 private String drzavaRodjenja;   
	 private String drzavljanstvo;
	 private String nacionalnost;
	 private Character pol;
	 private String adresa;
	 private String brojTelefonaMobilni;  
	 private String brojTelefonaFiksni;
	 private String email;
	 private String brojLicneKarte; 
	 private String licnuKartuIzdao;
	 private String mestoStanovanja;
	 private String adresaStanovanja;
}
