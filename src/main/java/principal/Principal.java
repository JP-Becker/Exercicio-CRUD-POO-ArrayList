package principal;
import model.Aluno;
import java.util.*;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
       ArrayList<Aluno> listaSimples = new ArrayList<>();
       int opcao = 0;
       while (opcao != 9) {
           opcao = Integer.parseInt(JOptionPane.showInputDialog(""
                   + "1 - Criar\n"
                   + "2- Ler\n"
                   + "3 - Atualizar\n"
                   + "4 - Deletar\n"
                   + "5 - Listar todos\n"
                   + "9 - Cancelar\n"));
        switch (opcao) {
            case 1:
                Aluno novo = new Aluno();
                novo.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite a ID:")));
                novo.setNome(JOptionPane.showInputDialog("Digite o Nome:"));
                novo.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")));
                novo.setCurso(JOptionPane.showInputDialog("Digite o Curso:"));
                novo.setFase(Integer.parseInt(JOptionPane.showInputDialog("Digite a Fase:")));
                
                listaSimples.add(novo);
                System.out.println("Aluno criado!");
            break;
            case 2:
            // ler;
                int idConsultar = Integer.parseInt(JOptionPane.showInputDialog("Digite a ID do aluno a ser excluido:"));
                int posicaoConsulta = -1;
                
                for (int i = 0; i< listaSimples.size(); i++) {
                    if (listaSimples.get(i).getId() == idConsultar) {
                        posicaoConsulta = i;
                    }
                    
                    if (posicaoConsulta == -1) {
                        System.out.println("ID nao existe");
                    } else {
                        System.out.println("Aluno encontrado!!");
                        System.out.println("ID: " + listaSimples.get(posicaoConsulta).getId());
                        System.out.println("ID: " + listaSimples.get(posicaoConsulta).getNome());
                        System.out.println("ID: " + listaSimples.get(posicaoConsulta).getIdade());
                        System.out.println("ID: " + listaSimples.get(posicaoConsulta).getCurso());
                        System.out.println("ID: " + listaSimples.get(posicaoConsulta).getFase());
                    }
                }
            break;
            case 3:
                
                int idAtualizar = Integer.parseInt(JOptionPane.showInputDialog("Digite a ID do aluno a ser excluido:"));
                int posicaoAtualizar = -1;
                
                for (int i = 0; i< listaSimples.size(); i++) {
                    if (listaSimples.get(i).getId() == idAtualizar) {
                        posicaoAtualizar = i;
                    }
                    
                    if (posicaoAtualizar == -1) {
                        System.out.println("ID nao existe");
                    } else {
                        Aluno alunoAtualizado = new Aluno();
                        
                        alunoAtualizado.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite a nova ID:")));
                        alunoAtualizado.setNome(JOptionPane.showInputDialog("Digite o novo nome:"));
                        alunoAtualizado.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a nova Idade:")));
                        alunoAtualizado.setCurso(JOptionPane.showInputDialog("Digite o novo curso:"));
                        alunoAtualizado.setFase(Integer.parseInt(JOptionPane.showInputDialog("Digite a nova fase:")));
                    }
                }
           
            break;
            case 4:
            // delete;
                int idExcluir = Integer.parseInt(JOptionPane.showInputDialog("Digite a ID do aluno a ser excluido:"));
                int posicaoExcluir = -1;
                
                for (int i = 0; i< listaSimples.size(); i++) {
                    if (listaSimples.get(i).getId() == idExcluir) {
                        posicaoExcluir = i;
                    }
                    
                    if (posicaoExcluir == -1) {
                        System.out.println("ID nao existe");
                    } else {
                        System.out.println("Aluno encontrado!!");
                        listaSimples.remove(posicaoExcluir);
                    }
                }
                
            break;
            case 5:
                for (int i=0;i < listaSimples.size();i++) {
                    System.out.println("ID:" + listaSimples.get(i).getId());
                    System.out.println("Nome:" + listaSimples.get(i).getNome());
                    System.out.println("Idade:" + listaSimples.get(i).getIdade());
                    System.out.println("Curso:" + listaSimples.get(i).getCurso());
                    System.out.println("Fase:" + listaSimples.get(i).getFase());
                }
                break;
            case 9:
                System.out.println("Operação cancelada");;
            break;
            default:
                System.out.println("Erro!");
                break;
        }}
    } 
}
