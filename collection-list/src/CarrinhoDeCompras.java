import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for (Item i : itemList ){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemRemover.add(i);
            }
        }
        itemList.removeAll(itemRemover);
    }
    public double calcularValorTotal(){
        double valor = 0;
        for(Item i : itemList){
            double valorItem = i.getPreco();
            int quant = i.getQuantidade();
            valor += (quant*valorItem);
        }
        return valor;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }
}
