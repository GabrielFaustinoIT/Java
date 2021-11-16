//GABRIEL FAUSTINO - CB3005399

import java.lang.Object;
import java.util.Random;

public class Pessoa{
    protected static int kp;
    protected String nome;
    protected char sexo;
    protected int idade;
    Random gerador = new Random();
        Pessoa(){
            
            kp = 0;
            nome = "";
            sexo = 'N';
            idade = 0;

        }
        Pessoa(String n, char s, int i){
            kp++;
            nome = n;
            sexo = s;
            idade = i;
        }
  
        public int getKp() {
            return kp;
        }
    
        public String getNome() {
            return nome;
        }

        public char getSexo() {
            return sexo;
        }

        public int getIdade() {
            return idade;
        }
    
        public void setKp() {
            kp = gerador.nextInt();
        }
        public void setNome(String n) {
            nome = n;
        }
        public void setSexo(char s) {
            sexo = s;
        }
        public void setIdade(int i) {
            idade = i;
        }
    
  
    public static void main(String args[]) {
        //Aluno a = new Aluno();

        //a.setNome("aaaaaaa");
        //a.setUuid(UUID.fromString("3856c3da-ea56-4717-9f58-85f6c5f560a5"));

        //System.out.println(a.getUuid());
    }
  }
