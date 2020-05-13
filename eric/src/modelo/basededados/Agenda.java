package modelo.basededados;

import java.util.ArrayList;

public class Agenda
{   private ArrayList<Pessoa>contatos;
    Agenda() {  
    	pessoa = new ArrayList();
    }
    }
    public void inserir(ContatoBasico c){  
    	pessoa.add(c);
    }
    Public Pessoa (String nome){
    	for(int i=0;i<pessoa.size();i++){
    		Pessoa c= pessoa.get(i);
             if(c.getNome().equalsIgnoreCase(nome))
               return pessoa.get(i);
        }
        return null;
    }