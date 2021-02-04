import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	static final int MAXFC = 9;
	public static int toret[][] = new int[MAXFC][MAXFC];
	public static boolean toretboolean[][] = new boolean[MAXFC][MAXFC];
	public static int sudoku = 1;

	public static int[][] tablero(int valor, int fil, int colum) {
		for (int i = 0; i < toret.length; i++) {
			for (int j = 0; j < toret[i].length; j++) {
				if (sudoku == 1) {
					if (j == 0) {
						toret[0][j] = 5;
						toret[1][j] = 6;
						toret[3][j] = 8;
						toret[4][j] = 4;
						toret[5][j] = 7;
					}
					if (j == 1) {
						toret[0][j] = 3;
						toret[2][j] = MAXFC;
						toret[6][j] = 6;
					}
					if (j == 2) {
						toret[2][j] = 8;
					}
					if (j == 3) {
						toret[1][j] = 1;
						toret[4][j] = 8;
						toret[7][j] = 4;
					}
					if (j == 4) {
						toret[0][j] = 7;
						toret[1][j] = MAXFC;
						toret[3][j] = 6;
						toret[5][j] = 2;
						toret[7][j] = 1;
						toret[8][j] = 8;
					}
					if (j == 5) {
						toret[1][j] = 5;
						toret[4][j] = 3;
						toret[7][j] = MAXFC;
					}
					if (j == 6) {
						toret[6][j] = 2;
					}
					if (j == 7) {
						toret[2][j] = 6;
						toret[6][j] = 8;
						toret[8][j] = 7;
					}
					if (j == 8) {
						toret[3][j] = 3;
						toret[4][j] = 1;
						toret[5][j] = 6;
						toret[7][j] = 5;
						toret[8][j] = MAXFC;
					}
				} else if (sudoku == 2) {
					if (j == 0) {
						toret[0][j] = 2;
						toret[4][j] = 4;
						toret[5][j] = 9;
						toret[7][j] = 7;
					}
					if (j == 1) {
						toret[7][j] = 3;
					}
					if (j == 2) {
						toret[0][j] = 4;
						toret[1][j] = 6;
						toret[2][j] = 7;
						toret[3][j] = 5;
						toret[7][j] = 9;
						toret[8][j] = 2;
					}
					if (j == 3) {
						toret[5][j] = 2;
						toret[8][j] = 3;
					}
					if (j == 4) {
						toret[0][j] = 8;
						toret[1][j] = 2;
						toret[2][j] = 3;
						toret[5][j] = 6;
						toret[6][j] = 1;
					}
					if (j == 5) {
						toret[7][j] = 8;
					}
					if (j == 6) {
						toret[0][j] = 6;
						toret[1][j] = 8;
						toret[3][j] = 9;
						toret[5][j] = 4;
						toret[6][j] = 7;
					}
					if (j == 7) {
						toret[0][j] = 3;
						toret[5][j] = 7;
						toret[6][j] = 6;
					}
					if (j == 8) {
						toret[2][j] = 9;
						toret[3][j] = 1;
						toret[6][j] = 3;
					}
				} else if (sudoku == 3) {
					toret[i][j] = 0;
				}

				if (i == fil && j == colum) {
					toret[i][j] = valor;
				}
			}
		}
		return toret;
	}

	public static boolean[][] tableroBoolean(int valor, int fil, int colum) {

		for (int i = 0; i < toretboolean.length; i++) {
			for (int j = 0; j < toretboolean.length; j++) {
				if (sudoku == 1) {
					if (j == 0) {
						toretboolean[0][j] = true;
						toretboolean[1][j] = true;
						toretboolean[3][j] = true;
						toretboolean[4][j] = true;
						toretboolean[5][j] = true;
					}
					if (j == 1) {
						toretboolean[0][j] = true;
						toretboolean[2][j] = true;
						toretboolean[6][j] = true;
					}
					if (j == 2) {
						toretboolean[2][j] = true;
					}
					if (j == 3) {
						toretboolean[1][j] = true;
						toretboolean[4][j] = true;
						toretboolean[7][j] = true;
					}
					if (j == 4) {
						toretboolean[0][j] = true;
						toretboolean[1][j] = true;
						toretboolean[3][j] = true;
						toretboolean[5][j] = true;
						toretboolean[7][j] = true;
						toretboolean[8][j] = true;
					}
					if (j == 5) {
						toretboolean[1][j] = true;
						toretboolean[4][j] = true;
						toretboolean[7][j] = true;
					}
					if (j == 6) {
						toretboolean[6][j] = true;
					}
					if (j == 7) {
						toretboolean[2][j] = true;
						toretboolean[6][j] = true;
						toretboolean[8][j] = true;
					}
					if (j == 8) {
						toretboolean[3][j] = true;
						toretboolean[4][j] = true;
						toretboolean[5][j] = true;
						toretboolean[7][j] = true;
						toretboolean[8][j] = true;
					}
				} else if (sudoku == 2) {
					if (j == 0) {
						toretboolean[0][j] = true;
						toretboolean[4][j] = true;
						toretboolean[5][j] = true;
						toretboolean[7][j] = true;
					}
					if (j == 1) {
						toretboolean[7][j] = true;
					}
					if (j == 2) {
						toretboolean[0][j] = true;
						toretboolean[1][j] = true;
						toretboolean[2][j] = true;
						toretboolean[3][j] = true;
						toretboolean[7][j] = true;
						toretboolean[8][j] = true;
					}
					if (j == 3) {
						toretboolean[5][j] = true;
						toretboolean[8][j] = true;
					}
					if (j == 4) {
						toretboolean[0][j] = true;
						toretboolean[1][j] = true;
						toretboolean[2][j] = true;
						toretboolean[5][j] = true;
						toretboolean[6][j] = true;
					}
					if (j == 5) {
						toretboolean[7][j] = true;
					}
					if (j == 6) {
						toretboolean[0][j] = true;
						toretboolean[1][j] = true;
						toretboolean[3][j] = true;
						toretboolean[5][j] = true;
						toretboolean[6][j] = true;
					}
					if (j == 7) {
						toretboolean[0][j] = true;
						toretboolean[5][j] = true;
						toretboolean[6][j] = true;
					}
					if (j == 8) {
						toretboolean[2][j] = true;
						toretboolean[3][j] = true;
						toretboolean[6][j] = true;
					}

				} else if (sudoku == 3) {
					toret[i][j] = 0;
				}

				if (i == fil && j == colum) {
					toretboolean[i][j] = true;
				}
				//toretboolean[i][j] = true;
			}
		}
		return toretboolean;
	}

	public static void dibujarSudok(int[][] matrizE) {
		int k = 0;
		for (int i = 0; i < MAXFC; i++) {

			for (int j = 0; j < MAXFC; j++) {
				if (i == 0 && j == 0) {
					System.out.print("    " + 0 + "   " + 1 + "   " + 2 + "  |   " + 3 + "   " + 4 + "   " + 5
							+ "  |   " + 6 + "   " + 7 + "   " + 8 + "  |\n");
					System.out.println("   ____________|______________|______________|");
				}

				if (sudoku == 1) {
					if (j == 0) {

						System.out.print(k + "  ");
						k++;

						if (i == 0)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 1)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 3)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 4)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 5)
							System.out.print("*" + toret[i][j] + "  ");
						else {
							System.out.print(" " + toret[i][j] + "  ");
						}
					} else if (j == 1) {
						if (i == 0)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 2)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 6)
							System.out.print("*" + toret[i][j] + "  ");
						else {
							System.out.print(" " + toret[i][j] + "  ");
						}
					} else if (j == 2) {
						if (i == 2)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 3) {
						if (i == 1)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 4)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 7)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 4) {
						if (i == 0)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 1)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 3)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 5)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 7)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 8)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 5) {
						if (i == 1)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 4)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 7)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 6) {
						if (i == 6)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 7) {
						if (i == 2)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 6)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 8)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 8) {
						if (i == 3)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 4)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 5)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 7)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 8)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					}
				} else if (sudoku == 2) {
					if (j == 0) {

						System.out.print(k + "  ");
						k++;

						if (i == 0)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 4)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 5)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 7)
							System.out.print("*" + toret[i][j] + "  ");
						else {
							System.out.print(" " + toret[i][j] + "  ");
						}
					} else if (j == 1) {
						if (i == 7)
							System.out.print("*" + toret[i][j] + "  ");
						else {
							System.out.print(" " + toret[i][j] + "  ");
						}
					} else if (j == 2) {
						if (i == 0)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 1)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 2)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 3)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 7)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 8)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 3) {
						if (i == 5)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 8)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 4) {
						if (i == 0)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 1)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 2)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 5)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 6)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 5) {
						if (i == 7)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 6) {
						if (i == 0)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 1)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 3)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 5)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 6)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 7) {
						if (i == 0)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 5)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 6)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					} else if (j == 8) {
						if (i == 2)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 3)
							System.out.print("*" + toret[i][j] + "  ");
						else if (i == 6)
							System.out.print("*" + toret[i][j] + "  ");
						else
							System.out.print(" " + toret[i][j] + "  ");
					}
				}

				if ((j + 1) % 3 == 0) {
					System.out.print("|  ");
				}
			}
			System.out.println();
			if ((i + 1) % 3 == 0) {
				System.out.print("   ____________|______________|______________|");
				System.out.println();
			}
		}
	}

	public static boolean leerCoordenadaFila(int fil) {
		if (fil < 0 || fil > 8) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean leerCoordenadaColumna(int colum) {
		if (colum < 0 || colum > 8) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean leerValor(int valor) {
		if (valor <= 0 || valor > MAXFC) {
			return false;
		} else {
			return true;
		}
	}

	public static int validarCasilla(int valor, int fil, int colum) {

		for (int i = 0; i < toret.length; i++) {
			for (int j = 0; j < toret.length; j++) {
				if (i == fil) {
					if (toret[fil][j] == valor) {
						valor = -1;
						i = MAXFC;
						j = MAXFC;
					}
				}
				if (j == colum) {
					if (toret[i][colum] == valor) {
						valor = -2;
						i = MAXFC;
						j = MAXFC;
					}
				}

				if ((fil < 3 && colum < 3) && ((i < 3) && (j < 3))) {
					if (toret[i][j] == valor) {
						valor = -3;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < 3) && (colum < 6 && colum > 2)) && ((i < 3) && (j < 6 && j > 2))) {
					if (toret[i][j] == valor) {
						valor = -3;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < 3) && (colum < MAXFC && colum > 5)) && ((i < 3) && (j < MAXFC && j > 5))) {
					if (toret[i][j] == valor) {
						valor = -3;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < 6 && fil > 2) && (colum < 3)) && ((i < 6 && i > 2) && (j < 3))) {
					if (toret[i][j] == valor) {
						valor = -3;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < 6 && fil > 2) && (colum < 6 && colum > 2))
						&& ((i < 6 && i > 2) && (j < 6 && j > 2))) {
					if (toret[i][j] == valor) {
						valor = -3;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < 6 && fil > 2) && (colum < MAXFC && colum > 5))
						&& ((i < 6 && i > 2) && (j < MAXFC && j > 5))) {
					if (toret[i][j] == valor) {
						valor = -3;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < MAXFC && fil > 5) && (colum < 3)) && ((i < MAXFC && i > 5) && (j < 3))) {
					if (toret[i][j] == valor) {
						valor = -3;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < MAXFC && fil > 5) && (colum < 6 && colum > 2))
						&& ((i < MAXFC && i > 5) && (j < 6 && j > 2))) {
					if (toret[i][j] == valor) {
						valor = -3;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < MAXFC && fil > 5) && (colum < MAXFC && colum > 5))
						&& ((i < MAXFC && i > 5) && (j < MAXFC && j > 5))) {
					if (toret[i][j] == valor) {
						valor = -3;
						i = MAXFC;
						j = MAXFC;
					}
				}
			}
		}
		return valor;
	}

	public static int y = -1, z = -1, r = -1;

	public static void introduciCasilla(int fil, int colum) {
		Scanner scan = new Scanner(System.in);

		int valor, w = 0, h = 0;

		if (fil == -5 && colum == -5) {
			h = 1;
		}

		while (w != -1) {
			System.out.println("Introduzca un -1 para volver al menú");
			System.out.println("Introduzca la coordenada de la fila:");
			fil = scan.nextInt();

			if (fil == -1)
				w = -1;

			if (fil != -1) {
				while (!leerCoordenadaFila(fil) && w != -1) {
					System.out.println("Introduzca un -1 para volver al menú");
					System.out.println("La coordenada de la fila no es válida\nIntroduzcala de nuevo:");
					fil = scan.nextInt();

					if (fil == -1) {
						w = -1;
					}
				}

				if (w != -1) {
					System.out.println("Introduzca un -1 para volver al menú");
					System.out.println("Introduzca la coordenada de la columna:");
					colum = scan.nextInt();

					if (colum == -1)
						w = -1;

					if (colum != -1) {
						while (!leerCoordenadaColumna(colum) && w != -1) {
							System.out.println("Introduzca un -1 para volver al menú");
							System.out.println("La coordenada de la columna no es válida\nIntroduzcala de nuevo:");
							colum = scan.nextInt();

							if (colum == -1) {
								w = -1;

							}
						}

						if (h == 1) {
							mostrarCandidatos(listaCandidatos(fil, colum));
						}

						if (w != -1) {
							System.out.println("Introduzca un -1 para volver al menú");
							System.out.println("Introduzca un valor para el sudoku:");
							valor = scan.nextInt();

							if (valor == -1)
								w = -1;

							if (valor != -1) {
								while (!leerValor(valor) && w != -1) {
									System.out.println("Introduzca un -1 para volver al menú");
									System.out.println(
											"ERROR!! El valor tiene que ser mayor de cero y menor que 10\nIntroduzcalo de nuevo:");
									valor = scan.nextInt();

									if (valor == -1) {
										w = -1;
									}
								}

								if (w != -1) {
									int x = validarCasilla(valor, fil, colum);

									if (x == -1) {
										System.out.println("Valor repetido en la fila");
										dibujarSudok(tablero(0, 0, 0));
									} else if (x == -2) {
										System.out.println("Valor repetido en la columna");
										dibujarSudok(tablero(0, 0, 0));
									} else if (x == -3) {
										System.out.println("Valor repetido en el cuadrante");
										dibujarSudok(tablero(0, 0, 0));
									} else {
										System.out.println("Valor valido");

										dibujarSudok(tablero(valor, fil, colum));
										r = valor;
										y = fil;
										z = colum;
										tablero(valor, fil, colum);
										tableroBoolean(valor, fil, colum);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static boolean comprobarCuadrante(int valor, int fil, int colum) {
		boolean tore = true;

		for (int i = 0; i < toretboolean.length; i++) {
			// System.out.println("\n");
			for (int j = 0; j < toretboolean.length; j++) {

				if ((fil < 3 && colum < 3) && ((i < 3) && (j < 3))) {
					if (toret[i][j] == valor) {
						tore = false;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < 3) && (colum < 6 && colum > 2)) && ((i < 3) && (j < 6 && j > 2))) {
					if (toret[i][j] == valor) {
						tore = false;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < 3) && (colum < MAXFC && colum > 5)) && ((i < 3) && (j < MAXFC && j > 5))) {
					if (toret[i][j] == valor) {
						tore = false;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < 6 && fil > 2) && (colum < 3)) && ((i < 6 && i > 2) && (j < 3))) {
					if (toret[i][j] == valor) {
						tore = false;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < 6 && fil > 2) && (colum < 6 && colum > 2))
						&& ((i < 6 && i > 2) && (j < 6 && j > 2))) {
					if (toret[i][j] == valor) {
						tore = false;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < 6 && fil > 2) && (colum < MAXFC && colum > 5))
						&& ((i < 6 && i > 2) && (j < MAXFC && j > 5))) {
					if (toret[i][j] == valor) {
						tore = false;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < MAXFC && fil > 5) && (colum < 3)) && ((i < 9 && i > 5) && (j < 3))) {
					if (toret[i][j] == valor) {
						tore = false;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < MAXFC && fil > 5) && (colum < 6 && colum > 2))
						&& ((i < MAXFC && i > 5) && (j < 6 && j > 2))) {
					if (toret[i][j] == valor) {
						tore = false;
						i = MAXFC;
						j = MAXFC;
					}
				} else if (((fil < MAXFC && fil > 5) && (colum < MAXFC && colum > 5))
						&& ((i < MAXFC && i > 5) && (j < MAXFC && j > 5))) {
					if (toret[i][j] == valor) {
						tore = false;
						i = MAXFC;
						j = MAXFC;
					}
				}

			}
		}

		return tore;
	}

	public static boolean comprobarFila(int valor, int fil, int colum) {
		boolean tore = true;
		for (int i = 0; i < toretboolean.length; i++) {
			// System.out.println("\n");
			for (int j = 0; j < toretboolean.length; j++) {
				if (i == fil) {
					if (toret[i][j] == valor) {
						tore = false;
						i = MAXFC;
						j = MAXFC;
					}
				}
			}
		}
		return tore;
	}

	public static boolean comprobarColumna(int valor, int fil, int colum) {
		boolean tore = true;
		for (int i = 0; i < toretboolean.length; i++) {
			// System.out.println("\n");
			for (int j = 0; j < toretboolean.length; j++) {
				if (j == colum) {
					if (toret[i][j] == valor) {
						tore = false;
						i = MAXFC;
						j = MAXFC;
					}
				}
			}
		}

		return tore;
	}

	public static int[] listaCandidatos(int fil, int colum) {
		int aux[] = { 1, 2, 3, 4, 5, 6, 7, 8, MAXFC };
		int candidatos[] = new int[MAXFC];
		int j = 0;

		for (int i = 0; i < aux.length; i++) {
			if (comprobarCuadrante(aux[i], fil, colum) == true && comprobarFila(aux[i], fil, colum) == true
					&& comprobarColumna(aux[i], fil, colum) == true) {
				candidatos[j] = aux[i];
				j++;
			}
		}

		int candidatos1[] = new int[j];

		for (int i = 0; i < j; i++) {
			candidatos1[i] = candidatos[i];
		}

		return candidatos1;
	}

	public static void mostrarCandidatos(int[] candidatos) {
		if (candidatos.length != 0) {
			System.out.print("Los candidatos disponibles para esa casilla son: ");

			for (int i = 0; i < candidatos.length; i++) {
				if (i == candidatos.length - 1) {
					System.out.print(candidatos[i]);
				} else {
					System.out.print(candidatos[i] + ", ");
				}
			}
		} else {
			System.out.println("Esta casilla no tiene candidatos posibles");
		}

		System.out.println();
	}

	public static boolean validarTablero() {
		boolean tore = true;

		for (int i = 0; i < toretboolean.length; i++) {
			for (int j = 0; j < toretboolean.length; j++) {
				if (toretboolean[i][j] == false) {
					tore = false;
				}
			}
		}
		return tore;
	}

	public static int repetir = 0;

	public static void validarSudoku() {
		Scanner scan = new Scanner(System.in);
		String respuesta = "";

		if (validarTablero() == true) {
			System.out.println("Felicidades!! \nHas terminado el sudoku\n¿Quieres volver a jugar?");
			respuesta = scan.nextLine();

			while (respuesta != "repetir") {
				if ((respuesta.contentEquals("Si")) || (respuesta.contentEquals("SI"))
						|| (respuesta.contentEquals("si"))) {
					respuesta = "repetir";

					sudoku = 3;
					tablero(0, 0, 0);
					tableroBoolean(0, 0, 0);

					sudoku = 2;
				} else if ((respuesta.contentEquals("No")) || (respuesta.contentEquals("NO"))
						|| (respuesta.contentEquals("no"))) {
					respuesta = "repetir";
					repetir = 1;
				} else {
					System.out.println(
							"Lo siento, no he entendido si quieres volver a jugar o no\nTienes que responder con si o con no\nTe lo volveré a preguntar ¿Quieres volver a jugar?");
					respuesta = scan.nextLine();
				}
			}
		} else {
			System.out.println("El sudoku no esta resuelto por completo\n");

			for (int i = 0; i < toretboolean.length; i++) {
				for (int j = 0; j < toretboolean.length; j++) {
					if (toretboolean[i][j] == false) {
						System.out.print("La posición en la fila " + i + " y la columna " + j);
						System.out.print(" le falta poner un valor");

						System.out.println();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opc = "g";

		do {

			if (repetir == 0) {
				System.out.println("\n\tBienvenido al Sudoku \n");

				dibujarSudok(tablero(y, z, r));

				System.out.println("\nEste sudoku cuenta con las siguientes opciones: ");
				System.out.println("  0. Salir ");
				System.out.println("  1. Rellenar casillas sin asistente.");
				System.out.println("  2. Rellenar casillas con asistente.");
				System.out.println("  3. Validar sudoku completo.");

				System.out.println("\nIntroduzca una opción para el sudoku: ");
				opc = scan.next();
			}

			if (repetir == 1) {
				opc = "0";
			}

			switch (opc) {
			case "1": introduciCasilla(0, 0); break;
			case "2": introduciCasilla(-5, -5); break;
			case "3": validarSudoku(); break;
			case "0": System.out.println("\n\nFin del programa"); break;
			default: System.out.println("ERROR! Ese dato no es válido"); break;
			}

		} while (!opc.contentEquals("0"));
		scan.close();
	}
}
