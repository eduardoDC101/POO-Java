package pessoa;

import javax.swing.JOptionPane;
public class PessoaView {

    public static void main(String[] args) {
       FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
       FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
       
       funcionarioDTO.setNome(JOptionPane.showInputDialog("Digite o nome do Funcionário: "));
       funcionarioDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Funcionário: ")));
       funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Digite o telefone do Funcionário: "));
       funcionarioDTO.setEndereco(JOptionPane.showInputDialog("Digite o endereço do Funcionário: "));
       funcionarioDTO.setFuncao(JOptionPane.showInputDialog("Digite a função do Funcionário: "));
       funcionarioDTO.setSiap(JOptionPane.showInputDialog("Digite o Siap do Funcionário: "));
       
       JOptionPane.showMessageDialog(null, funcionarioDAO.mostrarDadosFuncionario(funcionarioDTO));
       
       AlunoDTO alunoDTO = new AlunoDTO();
       AlunoDAO alunoDAO = new AlunoDAO();
       
       alunoDTO.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno: "));
       alunoDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Aluno: ")));
       alunoDTO.setTelefone(JOptionPane.showInputDialog("Digite o telefone do Aluno: "));
       alunoDTO.setEndereco(JOptionPane.showInputDialog("Digite o endereço do Aluno: "));
       alunoDTO.setCurso(JOptionPane.showInputDialog("Digite o curso do Aluno: "));
       alunoDTO.setProntuario(JOptionPane.showInputDialog("Digite o prontuário do Aluno: "));
       
       JOptionPane.showMessageDialog(null, alunoDAO.mostrarDadosAluno(alunoDTO));
    }
    
}
