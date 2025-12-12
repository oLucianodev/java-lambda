import java.util.ArrayList;
import java.util.function.Predicate;

public class Mainclass {
	public static void main(String[] args) {
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		lista.add(new Cliente(1,"Juninho","Juninho@email.com", true));
		lista.add(new Cliente(2,"Jose","Jose@email.com", false));
		lista.add(new Cliente(3,"Ana","Ana@email.com", true));
		lista.add(new Cliente(4,"Felipe","Felipe@email.com", true));
		lista.add(new Cliente(5,"Joana","Joana@email.com", false));
		lista.add(new Cliente(6,"Maria","Maria@email.com", true));
		lista.add(new Cliente(7,"Neymar","Neymar@email.com", true));
		lista.add(new Cliente(8,"Otavio","Otavio@email.com", false));
		lista.add(new Cliente(9,"Messi","Messi@email.com", true));
		lista.add(new Cliente(10,"Michael","Michael@email.com", true));
		
		System.out.println("---- Tudao ------");
		lista.forEach(c -> {
			System.out.println(c);
	     });
		System.out.println("-------------------");
		
		
		exibiPorCriterio(lista, c -> c.isAtivo());
}
	
	
	
	public static void exibiPorCriterio (ArrayList<Cliente> lista, Predicate<Cliente> predicate) {
		lista.forEach(c -> {
			if (predicate.test(c)) {
				System.out.println(c);
			}
			
				});
	}
}
