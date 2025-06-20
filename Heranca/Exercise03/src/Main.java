public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Carlos";
        aluno.idade = 15;
        aluno.apresentarAluno();

        Professor professor = new Professor();

        professor.nome = "Ana";
        professor.materia = "Português";
        professor.apresentacaoProfessor();
    }
}
