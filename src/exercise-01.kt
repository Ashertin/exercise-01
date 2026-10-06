fun main() {
    // 1. Declaración de datos
    val nombre = "Asher"
    val nota1 = 4.0
    val nota2 = 3.5
    val nota3 = 5.0

    // 2. Validar que las notas estén entre 0.0 y 5.0
    if (nota1 !in 0.0..5.0 || nota2 !in 0.0..5.0 || nota3 !in 0.0..5.0) {
        println("Error: Las calificaciones deben estar entre 0.0 y 5.0")
        return
    }

    // 3. Calcular promedio
    val promedio = (nota1 + nota2 + nota3) / 3

    println("Estudiante: $nombre")
    println("Notas: $nota1, $nota2, $nota3")
    println("Promedio: $promedio")

    // 4. Indicar si aprobó o reprobó
    if (promedio >= 3.0) {
        println("Estado: APROBADO")
    } else {
        println("Estado: REPROBADO")
    }

    // 5. Indicar si es excelente
    if (promedio >= 4.5) {
        println("¡Felicidades! Promedio EXCELENTE")
    }
}