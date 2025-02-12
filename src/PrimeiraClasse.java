public class PrimeiraClasse {

    public static void main(String args[]) {
        System.out.println("Olá Renan");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        //cliente.imprimirEndereco();
        System.out.println(cliente.getValorTotal());
        System.out.println(cliente.retornarNomeCliente());
        String end = cliente.getNome();
        System.out.println(end);



    }
}