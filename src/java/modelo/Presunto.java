/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author hebertferreira
 */
public class Presunto {
    
    private String nome;
    private String email;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getMensurar(){
        
        return (peso / (altura * altura));
    }
    
    public String getResultadoImcDefunto(){
        
        if(getMensurar() > 40){
            return ("Defunto Gordo Morbido");
        }else if(getMensurar() > 35){
            return ("Não caberá no caixão, a menos que tiremos os braços ou as pernas");
        }else if(getMensurar() > 30){
            return ("Caberá prensado no caixão");
        }else if(getMensurar() > 25){
            return ("Parabéns, não precisaremos cortar nada para caber no caixão");
        }else if(getMensurar() > 18.5){
            return ("Perfeito, dará uma boa selfie");
        }else if(getMensurar() > 17){
            return ("Terá espaço sobrando,, vamos abri-lo e empalha-lo");
        }else{
            return ("Esse estava morto e não sabia!!!");
        }
    }
}
