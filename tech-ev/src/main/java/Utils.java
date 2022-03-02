import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import problema8.Coordenada;

public class Utils {
	
	
	public static Coordenada[][]tablero5x4= {
			{
				new Coordenada(0, 0, new boolean[] {false, 	true, 	true,	false},	false,	""),
				new Coordenada(0, 1, new boolean[] {false, 	true, 	false,	true},	false,	""),
				new Coordenada(0, 2, new boolean[] {false, 	false, 	true,	true},	false,	""),
				new Coordenada(0, 3, new boolean[] {false, 	false, 	true,	false},	false,	"")
			},
			{
				new Coordenada(1, 0, new boolean[] {true, 	true, 	true,	false},	false,	"X"),
				new Coordenada(1, 1, new boolean[] {true, 	true, 	true,	true},	false,	"X"),
				new Coordenada(1, 2, new boolean[] {true, 	true, 	true,	true},	false,	""),
				new Coordenada(1, 3, new boolean[] {true, 	false, 	true,	true},	false,	"X")
			},
			{
				new Coordenada(2, 0, new boolean[] {true, 	true, 	true,	false},	false,	""),
				new Coordenada(2, 1, new boolean[] {true, 	true, 	true,	true},	false,	""),
				new Coordenada(2, 2, new boolean[] {true, 	true, 	true,	true},	false,	""),
				new Coordenada(2, 3, new boolean[] {true, 	false, 	true,	true},	false,	"")
			},
			{
				new Coordenada(3, 0, new boolean[] {true, 	true, 	true,	false},	false,	""),
				new Coordenada(3, 1, new boolean[] {true, 	true, 	true,	true},	false,	""),
				new Coordenada(3, 2, new boolean[] {true, 	true, 	true,	true},	false,	"X"),
				new Coordenada(3, 3, new boolean[] {true, 	false, 	true,	true},	false,	"")
			},
			{
				new Coordenada(4, 0, new boolean[] {true, 	true, 	false,	false},	false,	""),
				new Coordenada(4, 1, new boolean[] {true, 	true, 	false,	true},	false,	""),
				new Coordenada(4, 2, new boolean[] {true, 	true, 	false,	true},	false,	""),
				new Coordenada(4, 3, new boolean[] {true, 	false, 	false,	true},	true,	"")
			}
			
			
	};
	
	public static Coordenada[][]tablero4x4= {
			{
				new Coordenada(0, 0, new boolean[] {false, 	true, 	true,	false},	false,	""),
				new Coordenada(0, 1, new boolean[] {false, 	true, 	true,	true},	false,	""),
				new Coordenada(0, 2, new boolean[] {false, 	true, 	true,	true},	false,	""),
				new Coordenada(0, 3, new boolean[] {false, 	false, 	true,	true},	false,	"")
			},
			{
				new Coordenada(1, 0, new boolean[] {true, 	true, 	true,	false},	false,	"X"),
				new Coordenada(1, 1, new boolean[] {true, 	true, 	true,	true},	false,	"X"),
				new Coordenada(1, 2, new boolean[] {true, 	true, 	true,	true},	false,	""),
				new Coordenada(1, 3, new boolean[] {true, 	false, 	true,	true},	false,	"X")
			},
			{
				new Coordenada(2, 0, new boolean[] {true, 	true, 	true,	false},	false,	""),
				new Coordenada(2, 1, new boolean[] {true, 	true, 	true,	true},	false,	""),
				new Coordenada(2, 2, new boolean[] {true, 	true, 	true,	true},	false,	""),
				new Coordenada(2, 3, new boolean[] {true, 	false, 	true,	true},	false,	"")
			},
			{
				new Coordenada(3, 0, new boolean[] {true, 	true, 	false,	false},	false,	""),
				new Coordenada(3, 1, new boolean[] {true, 	true, 	false,	true},	false,	""),
				new Coordenada(3, 2, new boolean[] {true, 	true, 	false,	true},	false,	"X"),
				new Coordenada(3, 3, new boolean[] {true, 	false, 	false,	true},	true,	"")
			}
					
	};


	
}
