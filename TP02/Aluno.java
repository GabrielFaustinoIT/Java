//GABRIEL FAUSTINO MARCELINO DOS SANTOS

import java.lang.Object;
import java.util.UUID;


public class Aluno {
    private String endereco;
    private int idade;
    private String nome;
    private UUID uuid;
    
    Aluno(String e, int i, String n){
        endereco = e;
        idade = i;
        nome = n;
        uuid = UUID.randomUUID();
    }
  
    public String getEndereco() {
        return endereco;
      }
    
      public int getIdade() {
        return idade;
      }

      public String getNome() {
        return nome;
      }

      public UUID getUuid() {
        return uuid;
      }
    
    public void setEndereco(String x) {
      endereco = x;
    }
  
    public void setIdade(int x) {
      idade = x;
    }
    public void setNome(String x) {
        nome = x;
      }

      public void setUuid(UUID x) {
        uuid = x;
      }

  
    public static void main(String args[]) {

    }
  }
