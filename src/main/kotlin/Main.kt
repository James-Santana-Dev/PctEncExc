fun main(args: Array<String>) {

    val rosnei: Estudante = Estudante("Rosnei", "da Silva",
        123, 50.0, 2)

    val maria: Estudante = Estudante("Maria", "da Silva",
        1234, 80.0, 1)

    val henrique: Estudante = Estudante("Henrique", "da Silva Felipe",
        12345, 10.0, 3)

    val rebeca: Estudante = Estudante("Rebeca", "da Silva",
        123456, 70.0, 1)

    val genivaldo: Estudante = Estudante("Rebeca", "da Silva",
        123456, 70.0, 1)

    rosnei.nomeCompleto()
    rosnei.mudarAnoSeAprovado()

    val cursoIngles = Cursos("Inglês", "Genivaldo",
        1)

    cursoIngles.cadastrar(rosnei)
    cursoIngles.cadastrar(maria)

    cursoIngles.numEstudantesCadastrados()

    cursoIngles.removerEstudante(rebeca)

    val estudantes: Array<Estudante?> = arrayOf(henrique, rebeca)

    cursoIngles.cadastrar(estudantes)

    cursoIngles.numEstudantesCadastrados()

    cursoIngles.melhorNota()

    cursoIngles.mostrarEstudantes()

    try {
        cursoIngles.verificarAluno(genivaldo)
    }catch (e: Exception){
        println(e.message)
    }

}