import java.lang.Exception

class Cursos (private val nomeCurso: String?,
               private var nomeProfessor: String?,
               private var ano: Int) {

    private val listaEstudantes = mutableListOf<Estudante?>()

    fun mostrarEstudantes(){
        for(i in listaEstudantes){
            println(i?.nome)
        }
    }

    fun cadastrar(estudante: Estudante?) {
        listaEstudantes.add(estudante)
        println("Estudante cadastrado com sucesso!")
    }

    fun cadastrar(estudante: Array<Estudante?>?) {
        if (estudante != null) {
            for(i in estudante){
                listaEstudantes.add(i)
            }
        }
        println("Estudantes cadastrados com sucesso!")
    }

    fun removerEstudante(estudante: Estudante?) {
        if(listaEstudantes.contains(estudante)){
            listaEstudantes.remove(estudante)
            println("O Estudante foi removido com sucesso!")
        }else{
            println("Esse estudante não existe na lista")
        }
    }

    fun numEstudantesCadastrados(){
        println("O número de estudantes cadastrados no curso é" +
                " ${listaEstudantes.size}")
    }

    fun melhorNota(){
        var melhorNota = listaEstudantes[0]?.nota
        for(i in listaEstudantes){
            if(i?.nota!! > melhorNota!!){
                melhorNota = i.nota
            }
        }
        println("A maior nota desse curso é $melhorNota")
    }

   fun verificarAluno(estudante: Estudante?){
       if(listaEstudantes.contains(estudante)){
           println("Esse estudante existe!")
       }else{
           throw Exception("O aluno não existe na lista!")
       }
   }

}