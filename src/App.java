
public class App {
    public static void main(String[] args) throws Exception {
        Lixeira novaLixeria = new Lixeira(false, null);

        novaLixeria.setCondição(false); 
        novaLixeria.setCor("Amarelo");
        System.out.println(novaLixeria);
    }
   }
