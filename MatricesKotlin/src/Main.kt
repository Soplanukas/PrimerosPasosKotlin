fun multiplicarMatrizPorK() {
    print("Ingrese el número de filas (M): ")
    val M = readLine()!!.toInt()

    print("Ingrese el número de columnas (N): ")
    val N = readLine()!!.toInt()

    print("Ingrese el número K: ")
    val K = readLine()!!.toInt()

    val matrizA = Array(M) { IntArray(N) }

    println("Ingrese los elementos de la matriz A:")
    for (i in 0 until M) {
        for (j in 0 until N) {
            print("Elemento [$i][$j]: ")
            matrizA[i][j] = readLine()!!.toInt()
        }
    }

    println("\nMatriz resultante tras multiplicar por $K:")
    for (i in 0 until M) {
        for (j in 0 until N) {
            matrizA[i][j] *= K
            print("${matrizA[i][j]} \t")
        }
        println()
    }
} //Ejercicio 1

fun mostrarDiagonalesYTriangulares() {
    print("Ingrese el tamaño de la matriz cuadrada (P): ")
    val P = readLine()!!.toInt()

    val matrizC = Array(P) { IntArray(P) }

    println("Ingrese los elementos de la matriz C:")
    for (i in 0 until P) {
        for (j in 0 until P) {
            print("Elemento [$i][$j]: ")
            matrizC[i][j] = readLine()!!.toInt()
        }
    }

    println("\nDiagonal Principal:")
    for (i in 0 until P) {
        print("${matrizC[i][i]} \t")
    }
    println()

    println("\nDiagonal Secundaria:")
    for (i in 0 until P) {
        print("${matrizC[i][P - i - 1]} \t")
    }
    println()

    println("\nMatriz Triangular Superior:")
    for (i in 0 until P) {
        for (j in 0 until P) {
            if (i <= j) {
                print("${matrizC[i][j]} \t")
            } else {
                print(" \t")
            }
        }
        println()
    }

    println("\nMatriz Triangular Inferior:")
    for (i in 0 until P) {
        for (j in 0 until P) {
            if (i >= j) {
                print("${matrizC[i][j]} \t")
            } else {
                print(" \t")
            }
        }
        println()
    }
} //Ejercicio 2

fun hallarTranspuesta() {
    print("Ingrese el número de filas (A): ")
    val A = readLine()!!.toInt()
    print("Ingrese el número de columnas (B): ")
    val B = readLine()!!.toInt()

    val matrizX = Array(A) { IntArray(B) }

    println("Ingrese los elementos de la matriz X:")
    for (i in 0 until A) {
        for (j in 0 until B) {
            print("Elemento [$i][$j]: ")
            matrizX[i][j] = readLine()!!.toInt()
        }
    }

    val matrizTranspuesta = Array(B) { IntArray(A) }

    for (i in 0 until A) {
        for (j in 0 until B) {
            matrizTranspuesta[j][i] = matrizX[i][j]
        }
    }

    println("\nMatriz original (X):")
    for (i in 0 until A) {
        for (j in 0 until B) {
            print("${matrizX[i][j]} \t")
        }
        println()
    }

    println("\nMatriz transpuesta:")
    for (i in 0 until B) {
        for (j in 0 until A) {
            print("${matrizTranspuesta[i][j]} \t")
        }
        println()
    }
} //Ejercicio 3

fun procesarMatrizYCalcularPromedios() {
    var N: Int
    var M: Int
    do {
        print("Ingrese el número de filas (N): ")
        N = readLine()!!.toInt()
        print("Ingrese el número de columnas (M): ")
        M = readLine()!!.toInt()

        if (N <= 0 || M <= 0) {
            println("Las dimensiones de la matriz deben ser mayores que cero. Intente de nuevo.")
        }
    } while (N <= 0 || M <= 0)

    val matriz = Array(N) { IntArray(M) }

    println("Ingrese los elementos de la matriz:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("Elemento [$i][$j]: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    if (N == M) {
        println("\nLa matriz es cuadrada.")
    } else {
        println("\nLa matriz NO es cuadrada.")
    }

    var sumaTotal = 0
    for (i in 0 until N) {
        for (j in 0 until M) {
            sumaTotal += matriz[i][j]
        }
    }
    val promedioTotal = sumaTotal.toDouble() / (N * M)
    println("Promedio de todos los elementos: $promedioTotal")

    println("\nPromedio por fila:")
    for (i in 0 until N) {
        var sumaFila = 0
        for (j in 0 until M) {
            sumaFila += matriz[i][j]
        }
        val promedioFila = sumaFila.toDouble() / M
        println("Fila $i: $promedioFila")
    }

    println("\nPromedio por columna:")
    for (j in 0 until M) {
        var sumaColumna = 0
        for (i in 0 until N) {
            sumaColumna += matriz[i][j]
        }
        val promedioColumna = sumaColumna.toDouble() / N
        println("Columna $j: $promedioColumna")
    }
} //Ejercicio 4

fun esMatrizRala(): Boolean {
    print("Ingrese el número de filas (N): ")
    val N = readLine()!!.toInt()
    print("Ingrese el número de columnas (M): ")
    val M = readLine()!!.toInt()

    val matriz = Array(N) { IntArray(M) }

    println("Ingrese los elementos de la matriz:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("Elemento [$i][$j]: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    for (i in 0 until N) {
        var countOne = 0
        for (j in 0 until M) {
            if (matriz[i][j] == 1) {
                countOne++
            } else if (matriz[i][j] != 0) {
                return false
            }
        }
        if (countOne != 1) {
            return false
        }
    }

    for (j in 0 until M) {
        var countOne = 0
        for (i in 0 until N) {
            if (matriz[i][j] == 1) {
                countOne++
            } else if (matriz[i][j] != 0) {
                return false
            }
        }
        if (countOne != 1) {
            return false
        }
    }

    return true
} //Ejercicio 5

fun leerMatriz(N: Int, M: Int): Array<IntArray> {
    val matriz = Array(N) { IntArray(M) }
    println("Ingrese los elementos de la matriz:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("Elemento [$i][$j]: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }
    return matriz
} //Ejercicio 6

fun mostrarMatriz(matriz: Array<IntArray>) {
    println("Matriz resultante:")
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
} //Ejercicio 6

fun sumarMatrices() {
    print("Ingrese el número de filas (N): ")
    val N = readLine()!!.toInt()
    print("Ingrese el número de columnas (M): ")
    val M = readLine()!!.toInt()

    println("Ingrese la primera matriz:")
    val matriz1 = leerMatriz(N, M)

    println("Ingrese la segunda matriz:")
    val matriz2 = leerMatriz(N, M)

    val matrizSuma = Array(N) { IntArray(M) }
    for (i in 0 until N) {
        for (j in 0 until M) {
            matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    mostrarMatriz(matrizSuma)
} //Ejercicio 6

fun multiplicarMatrices() {
    print("Ingrese el número de filas de la primera matriz (N): ")
    val N1 = readLine()!!.toInt()
    print("Ingrese el número de columnas de la primera matriz (M): ")
    val M1 = readLine()!!.toInt()

    print("Ingrese el número de filas de la segunda matriz (P): ")
    val N2 = readLine()!!.toInt()
    print("Ingrese el número de columnas de la segunda matriz (Q): ")
    val M2 = readLine()!!.toInt()

    if (M1 != N2) {
        println("La multiplicación no es posible: el número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.")
        return
    }

    println("Ingrese la primera matriz:")
    val matriz1 = leerMatriz(N1, M1)

    println("Ingrese la segunda matriz:")
    val matriz2 = leerMatriz(N2, M2)

    val matrizProducto = Array(N1) { IntArray(M2) }
    for (i in 0 until N1) {
        for (j in 0 until M2) {
            var suma = 0
            for (k in 0 until M1) {
                suma += matriz1[i][k] * matriz2[k][j]
            }
            matrizProducto[i][j] = suma
        }
    }

    mostrarMatriz(matrizProducto)
} //Ejercicio 6

// Función para eliminar una fila de la matriz
fun eliminarFilaDeMatriz2(matriz: Array<IntArray>, filaEliminar: Int): Array<IntArray> {
    val N = matriz.size
    val M = matriz[0].size
    val nuevaMatriz = Array(N - 1) { IntArray(M) }
    var filaActual = 0
    for (i in 0 until N) {
        if (i != filaEliminar) {
            nuevaMatriz[filaActual] = matriz[i].copyOf()
            filaActual++
        }
    }
    return nuevaMatriz
}

// Función para eliminar una columna de la matriz
fun eliminarColumnaDeMatriz2(matriz: Array<IntArray>, columnaEliminar: Int): Array<IntArray> {
    val N = matriz.size
    val M = matriz[0].size
    val nuevaMatriz = Array(N) { IntArray(M - 1) }
    for (i in 0 until N) {
        var colActual = 0
        for (j in 0 until M) {
            if (j != columnaEliminar) {
                nuevaMatriz[i][colActual] = matriz[i][j]
                colActual++
            }
        }
    }
    return nuevaMatriz
}

// Función para insertar una fila en la matriz
fun insertarFilaEnMatriz2(matriz: Array<IntArray>, filaNueva: IntArray, filaInsertar: Int): Array<IntArray> {
    val N = matriz.size
    val M = matriz[0].size
    val nuevaMatriz = Array(N + 1) { IntArray(M) }
    var filaActual = 0
    for (i in 0 until N + 1) {
        if (i == filaInsertar) {
            nuevaMatriz[i] = filaNueva.copyOf()
        } else {
            nuevaMatriz[i] = matriz[filaActual]
            filaActual++
        }
    }
    return nuevaMatriz
}

// Función para insertar una columna en la matriz
fun insertarColumnaEnMatriz2(matriz: Array<IntArray>, columnaNueva: IntArray, columnaInsertar: Int): Array<IntArray> {
    val N = matriz.size
    val M = matriz[0].size
    val nuevaMatriz = Array(N) { IntArray(M + 1) }
    for (i in 0 until N) {
        var colActual = 0
        for (j in 0 until M + 1) {
            if (j == columnaInsertar) {
                nuevaMatriz[i][j] = columnaNueva[i]
            } else {
                nuevaMatriz[i][j] = matriz[i][colActual]
                colActual++
            }
        }
    }
    return nuevaMatriz
}

fun manejarFilasYColumnas2() {
    print("Ingrese el número de filas (N): ")
    val N = readLine()!!.toInt()
    print("Ingrese el número de columnas (M): ")
    val M = readLine()!!.toInt()

    println("Ingrese la matriz:")
    val matriz = leerMatriz(N, M)

    mostrarMatriz(matriz)

    print("Ingrese el índice de la fila a eliminar: ")
    val filaEliminar = readLine()!!.toInt()
    if (filaEliminar in 0 until N) {
        val matrizSinFila = eliminarFilaDeMatriz2(matriz, filaEliminar)
        println("Matriz después de eliminar la fila $filaEliminar:")
        mostrarMatriz(matrizSinFila)
    } else {
        println("Índice de fila inválido.")
    }

    print("Ingrese el índice de la columna a eliminar: ")
    val columnaEliminar = readLine()!!.toInt()
    if (columnaEliminar in 0 until M) {
        val matrizSinColumna = eliminarColumnaDeMatriz2(matriz, columnaEliminar)
        println("Matriz después de eliminar la columna $columnaEliminar:")
        mostrarMatriz(matrizSinColumna)
    } else {
        println("Índice de columna inválido.")
    }

    print("Ingrese el índice de la fila en la que insertar: ")
    val filaInsertar = readLine()!!.toInt()
    if (filaInsertar in 0..N) {
        val nuevaFila = IntArray(M) { 0 }
        println("Ingrese los elementos de la nueva fila:")
        for (j in nuevaFila.indices) {
            print("Elemento [$j]: ")
            nuevaFila[j] = readLine()!!.toInt()
        }
        val matrizConFila = insertarFilaEnMatriz2(matriz, nuevaFila, filaInsertar)
        println("Matriz después de insertar la fila en el índice $filaInsertar:")
        mostrarMatriz(matrizConFila)
    } else {
        println("Índice de fila inválido.")
    }

    print("Ingrese el índice de la columna en la que insertar: ")
    val columnaInsertar = readLine()!!.toInt()
    if (columnaInsertar in 0..M) {
        val nuevaColumna = IntArray(N) { 0 }
        println("Ingrese los elementos de la nueva columna:")
        for (i in nuevaColumna.indices) {
            print("Elemento [$i]: ")
            nuevaColumna[i] = readLine()!!.toInt()
        }
        val matrizConColumna = insertarColumnaEnMatriz2(matriz, nuevaColumna, columnaInsertar)
        println("Matriz después de insertar la columna en el índice $columnaInsertar:")
        mostrarMatriz(matrizConColumna)
    } else {
        println("Índice de columna inválido.")
    }
} //Ejercicio 7

fun reemplazarYMostrarMatriz() {
    print("Ingrese el número de filas y columnas (N): ")
    val N = readLine()!!.toInt()

    val matriz = Array(N) { IntArray(N) }

    println("Ingrese los elementos de la matriz:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("Elemento [$i][$j]: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    println("Matriz original:")
    mostrarMatriz(matriz)

    println("Matriz cambiada:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            matriz[i][j] = if (matriz[i][j] < 0) 0 else 9
        }
    }

    mostrarMatriz(matriz)
} //Ejercicio 8

fun analizarVentas() {
    print("Ingrese el número de sucursales (N): ")
    val N = readLine()!!.toInt()

    val ventas = Array(N) { IntArray(12) }

    println("Ingrese las ventas para cada sucursal durante los 12 meses:")
    for (i in 0 until N) {
        println("Sucursal ${i + 1}:")
        for (j in 0 until 12) {
            print("Mes ${j + 1}: ")
            ventas[i][j] = readLine()!!.toInt()
        }
    }

    var totalVentasCompania = 0
    for (i in ventas.indices) {
        for (j in ventas[i].indices) {
            totalVentasCompania += ventas[i][j]
        }
    }
    println("Total de ventas de la compañía: $totalVentasCompania")

    println("Total de ventas por sucursal:")
    val ventasPorSucursal = IntArray(N)
    for (i in ventas.indices) {
        ventasPorSucursal[i] = ventas[i].sum()
        println("Sucursal ${i + 1}: ${ventasPorSucursal[i]}")
    }

    val sucursalMayorVentas = ventasPorSucursal.indices.maxByOrNull { ventasPorSucursal[it] } ?: -1
    println("Sucursal que más vendió durante el año: ${sucursalMayorVentas + 1}")

    val totalVentasPorMes = IntArray(12)
    for (j in 0 until 12) {
        totalVentasPorMes[j] = ventas.sumOf { it[j] }
    }
    val mesMenorVentas = totalVentasPorMes.indices.minByOrNull { totalVentasPorMes[it] } ?: -1
    println("Mes que menos vendió la compañía: ${mesMenorVentas + 1}")
} //Ejercicio 9

fun analizarCalificaciones() {
    print("Ingrese el número de estudiantes (M): ")
    val M = readLine()!!.toInt()

    val matriz = Array(M) { IntArray(6) }

    println("Ingrese las calificaciones para cada estudiante en 6 materias:")
    for (i in 0 until M) {
        println("Estudiante ${i + 1}:")
        for (j in 0 until 6) {
            print("Materia ${j + 1}: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    println("Nota promedio de cada estudiante:")
    val promedioEstudiantes = DoubleArray(M)
    for (i in 0 until M) {
        promedioEstudiantes[i] = matriz[i].average()
        println("Estudiante ${i + 1}: ${promedioEstudiantes[i]}")
    }

    val materiaAprobados = IntArray(6)
    val materiaReprobados = IntArray(6)
    val notaAprobacion = 60

    for (j in 0 until 6) {
        var aprobados = 0
        var reprobados = 0
        for (i in 0 until M) {
            if (matriz[i][j] >= notaAprobacion) {
                aprobados++
            } else {
                reprobados++
            }
        }
        materiaAprobados[j] = aprobados
        materiaReprobados[j] = reprobados
        println("Materia ${j + 1}: Aprobados = $aprobados, Reprobados = $reprobados")
    }

    println("Nota promedio de cada materia:")
    val promedioMaterias = DoubleArray(6)
    for (j in 0 until 6) {
        promedioMaterias[j] = (0 until M).sumOf { matriz[it][j] }.toDouble() / M
        println("Materia ${j + 1}: ${promedioMaterias[j]}")
    }
} //Ejercicio 10

fun calcularPagosEmpleados2() {
    val sueldoHoraNormal = 2350
    val sueldoHoraSobretiempo = 3500

    print("Ingrese el número de empleados: ")
    val numEmpleados = readLine()!!.toInt()

    val empleados = Array(numEmpleados) { IntArray(3) }

    for (i in 0 until numEmpleados) {
        print("Ingrese el código del empleado ${i + 1} (entre 1 y 100): ")
        empleados[i][0] = readLine()!!.toInt()
        print("Ingrese las horas normales trabajadas del empleado ${empleados[i][0]}: ")
        empleados[i][1] = readLine()!!.toInt()
        print("Ingrese las horas de sobretiempo trabajadas del empleado ${empleados[i][0]}: ")
        empleados[i][2] = readLine()!!.toInt()
    }

    println("\n--- Informe de Pagos de Empleados ---")
    for (i in 0 until numEmpleados) {
        val codigoEmpleado = empleados[i][0]
        val horasNormales = empleados[i][1]
        val horasSobretiempo = empleados[i][2]

        val pagoHorasNormales = horasNormales * sueldoHoraNormal
        val pagoHorasSobretiempo = horasSobretiempo * sueldoHoraSobretiempo
        val totalPago = pagoHorasNormales + pagoHorasSobretiempo

        println("\nEmpleado Código: $codigoEmpleado")
        println("Horas Normales Trabajadas: $horasNormales")
        println("Pago por Horas Normales: $$pagoHorasNormales")
        println("Horas Sobretiempo Trabajadas: $horasSobretiempo")
        println("Pago por Horas Sobretiempo: $$pagoHorasSobretiempo")
        println("Total a Pagar: $$totalPago")
    }
} //Ejercicio 11

fun generarMatrizDiagonales() {
    print("Ingrese el valor impar para N (mayor que 3): ")
    val N = readLine()!!.toInt()

    if (N <= 3 || N % 2 == 0) {
        println("El valor de N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    for (i in 0 until N) {
        for (j in 0 until N) {
            if (i == j) {
                matriz[i][j] = j
            } else {
                matriz[i][j] = 0
            }
        }
    }

    println("Matriz de orden $N x $N:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
} //Ejercicio 12

fun generarMatrizPatron() {
    print("Ingrese el valor impar para N (mayor que 3): ")
    val N = readLine()!!.toInt()

    if (N <= 3 || N % 2 == 0) {
        println("El valor de N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    for (i in 0 until N) {
        for (j in 0 until N) {
            if (i == 0 || i == N - 1) {
                matriz[i][j] = if (j == 0 || j == N - 1) 1 else 0
            }
            else if (j == 0 || j == N - 1) {
                matriz[i][j] = if (i == 0 || i == N - 1) 1 else 0
            }
            else if (i > 0 && i < N - 1 && j > 0 && j < N - 1) {
                if (i == j || i + j == N - 1) matriz[i][j] = 1
                else matriz[i][j] = 0
            }
        }
    }

    println("Matriz de orden $N x $N:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
} //Ejercicio 13

fun generarMatrizPatronEspecial() {
    print("Ingrese el valor impar para N (mayor que 3): ")
    val N = readLine()!!.toInt()

    if (N <= 3 || N % 2 == 0) {
        println("El valor de N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    for (j in 0 until N) {
        matriz[0][j] = j
    }

    val A = N / 2
    for (j in 0 until N) {
        matriz[A][j] = (j + A) % N
    }

    println("Matriz de orden $N x $N:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
} //Ejercicio 14

fun generarMatrizEspiral() {
    print("Ingrese el valor impar para N (mayor que 3): ")
    val N = readLine()!!.toInt()

    if (N <= 3 || N % 2 == 0) {
        println("El valor de N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    var valor = 1
    var arriba = 0
    var abajo = N - 1
    var izquierda = 0
    var derecha = N - 1

    while (valor <= N * N) {
        for (i in izquierda..derecha) {
            matriz[arriba][i] = valor++
        }
        arriba++

        for (i in arriba..abajo) {
            matriz[i][derecha] = valor++
        }
        derecha--

        for (i in derecha downTo izquierda) {
            matriz[abajo][i] = valor++
        }
        abajo--

        for (i in abajo downTo arriba) {
            matriz[i][izquierda] = valor++
        }
        izquierda++
    }

    println("Matriz de orden $N x $N:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
} //Ejercicio 15

fun generarMatrizDiagonal() {
    print("Ingrese el valor impar para N (mayor que 3): ")
    val N = readLine()!!.toInt()

    if (N <= 3 || N % 2 == 0) {
        println("El valor de N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    var valor = 1

    for (i in 0 until N) {
        for (j in 0 until N) {
            if (j >= i) {
                matriz[i][j] = valor++
            }
        }
    }

    println("Matriz de orden $N x $N:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
} //Ejercicio 16

fun generarMatrizBordeYDiagonal() {
    print("Ingrese el valor impar para N (mayor que 3): ")
    val N = readLine()!!.toInt()

    if (N <= 3 || N % 2 == 0) {
        println("El valor de N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    for (i in 0 until N) {
        matriz[0][i] = 1
        matriz[N-1][i] = 1
        matriz[i][0] = 1
        matriz[i][N-1] = 1
    }

    for (i in 0 until N) {
        matriz[i][N-1-i] = 1
    }

    println("Matriz de orden $N x $N:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
} //Ejercicio 17

fun generarMatrizPatron18() {
    print("Ingrese el valor impar para N (mayor que 3): ")
    val N = readLine()!!.toInt()

    if (N <= 3 || N % 2 == 0) {
        println("El valor de N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    var valor = 1

    for (i in 0 until N) {
        for (j in N-1 downTo N-1-i) {
            matriz[i][j] = valor++
        }
    }

    for (i in 1 until N) {
        for (j in i until N) {
            matriz[i][j] = matriz[i][j] - 1
        }
    }

    println("Matriz de orden $N x $N:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
} //Ejercicio 18

fun generarMatrizPatron19() {
    print("Ingrese el valor impar para N (mayor que 3): ")
    val N = readLine()!!.toInt()

    if (N <= 3 || N % 2 == 0) {
        println("El valor de N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    var valor = N * N
    var top = 0
    var bottom = N - 1
    var left = 0
    var right = N - 1

    while (top <= bottom && left <= right) {
        for (i in left..right) {
            matriz[top][i] = valor--
        }
        top++

        for (i in top..bottom) {
            matriz[i][right] = valor--
        }
        right--

        if (top <= bottom) {
            for (i in right downTo left) {
                matriz[bottom][i] = valor--
            }
            bottom--
        }

        if (left <= right) {
            for (i in bottom downTo top) {
                matriz[i][left] = valor--
            }
            left++
        }
    }

    println("Matriz de orden $N x $N:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
} //Ejercicio 19

fun generarMatrizPatron20() {
    print("Ingrese el valor impar para N (mayor que 3): ")
    val N = readLine()!!.toInt()

    if (N <= 3 || N % 2 == 0) {
        println("El valor de N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    var valor = 1
    var top = 0
    var bottom = N - 1
    var left = 0
    var right = N - 1

    while (top <= bottom && left <= right) {
        for (i in left..right) {
            matriz[top][i] = valor++
        }
        top++

        for (i in top..bottom) {
            matriz[i][right] = valor++
        }
        right--

        if (top <= bottom) {
            for (i in right downTo left) {
                matriz[bottom][i] = valor++
            }
            bottom--
        }

        if (left <= right) {
            for (i in bottom downTo top) {
                matriz[i][left] = valor++
            }
            left++
        }
    }

    println("Matriz de orden $N x $N:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
} //Ejercicio 20

fun creadorDelPrograma(){
    println("El creador del programa es: Daniel Ospina Agudelo.")
    println("Estudiante de Ingenieria informatica en la Universidad de Caldas")
}


fun main() {
    while (true) {
        println("\nElige una opción:")
        println("1. Multiplicar una matriz por un número K")
        println("2. Mostrar diagonales y matrices triangulares de una matriz cuadrada")
        println("3. Hallar la transpuesta de una matriz")
        println("4. Validar matriz y calcular promedios")
        println("5. Verificar si la matriz es rala")
        println("6. Realizar operaciones con dos matrices")
        println("7. Realizar operaciones de fila y columna en una matriz")
        println("8. Reemplazar elementos negativos y positivos en una matriz")
        println("9. Analizar ventas de sucursales")
        println("10. Analizar calificaciones de estudiantes")
        println("11. Calcular pagos de empleados en La Huelga S.A.")
        println("12. Generar matriz con diagonal principal")
        println("13. Generar matriz con patrón específico")
        println("14. Generar matriz con patrón especial")
        println("15. Generar matriz en espiral")
        println("16. Generar matriz con patrón diagonal")
        println("17. Generar matriz con borde y diagonal")
        println("18. Generar matriz con patrón específico")
        println("19. Generar matriz en espiral descendente")
        println("20. Generar matriz en espiral con números")
        println("21. Creditos")
        println("0. Salir")

        print("Opción: ")
        when (readLine()!!.toInt()) {
            1 -> multiplicarMatrizPorK()
            2 -> mostrarDiagonalesYTriangulares()
            3 -> hallarTranspuesta()
            4 -> procesarMatrizYCalcularPromedios()
            5 -> {
                if (esMatrizRala()) {
                    println("La matriz es rala.")
                } else {
                    println("La matriz NO es rala.")
                }
            }
            6 -> {
                println("Seleccione una operación:")
                println("a. Sumar dos matrices")
                println("b. Multiplicar dos matrices")
                when (readLine()!!.toLowerCase()) {
                    "a" -> sumarMatrices()
                    "b" -> multiplicarMatrices()
                    else -> println("Opción no válida.")
                }
            }
            7 -> manejarFilasYColumnas2()
            8 -> reemplazarYMostrarMatriz()
            9 -> analizarVentas()
            10 -> analizarCalificaciones()
            11 -> calcularPagosEmpleados2()
            12 -> generarMatrizDiagonales()
            13 -> generarMatrizPatron()
            14 -> generarMatrizPatronEspecial()
            15 -> generarMatrizEspiral()
            16 -> generarMatrizDiagonal()
            17 -> generarMatrizBordeYDiagonal()
            18 -> generarMatrizPatron18()
            19 -> generarMatrizPatron19()
            20 -> generarMatrizPatron20()
            21 -> creadorDelPrograma()
            0 -> {
                println("Saliendo del programa...")
                break
            }
            else -> println("Opción no válida, por favor intenta de nuevo.")
        }
    }
}