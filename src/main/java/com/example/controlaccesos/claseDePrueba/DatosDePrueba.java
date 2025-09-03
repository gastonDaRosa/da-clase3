package com.example.controlaccesos.claseDePrueba;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Date;


import com.example.controlaccesos.modelo.*;
import com.example.controlaccesos.servicios.ServiciosUsuario;




public class DatosDePrueba {

     
    public static void cargarJuegoPrueba2(ServiciosUsuario servicio){

     
        // Usuario 1: Isabel Moreno - 1 acceso - Total: 35 minutos
        Usuario isabel = new Usuario("imoreno", "Isabel", "Moreno", true);
        isabel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000), new Date(System.currentTimeMillis() - 86400000 + 2100000))); // 35 min
        servicio.agregarUsuario(isabel);
        
        // Usuario 2: Carlos Rodríguez - 1 acceso - Total: 45 minutos
        Usuario carlos = new Usuario("crodriguez", "Carlos", "Rodríguez", true);
        carlos.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000), new Date(System.currentTimeMillis() - 86400000 + 2700000))); // 45 min
        servicio.agregarUsuario(carlos);
        
        // Usuario 3: Carmen Ruiz - 2 accesos - Total: 110 minutos
        Usuario carmen = new Usuario("cruiz", "Carmen", "Ruiz", true);
        carmen.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000), new Date(System.currentTimeMillis() - 86400000 + 3000000))); // 50 min
        carmen.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000), new Date(System.currentTimeMillis() - 172800000 + 3600000))); // 60 min
        servicio.agregarUsuario(carmen);
        
        // Usuario 4: José López - 2 accesos - Total: 150 minutos
        Usuario jose = new Usuario("jlopez", "José", "López", true);
        jose.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000), new Date(System.currentTimeMillis() - 86400000 + 5400000))); // 90 min
        jose.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000), new Date(System.currentTimeMillis() - 172800000 + 3600000))); // 60 min
        servicio.agregarUsuario(jose);
        
        // Usuario 5: Miguel Sánchez - 3 accesos - Total: 165 minutos
        Usuario miguel = new Usuario("msanchez", "Miguel", "Sánchez", true);
        miguel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000), new Date(System.currentTimeMillis() - 86400000 + 3300000))); // 55 min
        miguel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000), new Date(System.currentTimeMillis() - 172800000 + 3600000))); // 60 min
        miguel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000), new Date(System.currentTimeMillis() - 259200000 + 3000000))); // 50 min
        servicio.agregarUsuario(miguel);
        
        // Usuario 6: María García - 3 accesos - Total: 185 minutos
        Usuario maria = new Usuario("mgarcia", "María", "García", true);
        maria.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000), new Date(System.currentTimeMillis() - 86400000 + 3600000))); // 60 min
        maria.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000), new Date(System.currentTimeMillis() - 172800000 + 4500000))); // 75 min
        maria.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000), new Date(System.currentTimeMillis() - 259200000 + 3000000))); // 50 min
        servicio.agregarUsuario(maria);
        
        // Usuario 7: Alejandro Torres - 4 accesos - Total: 240 minutos
        Usuario alejandro = new Usuario("atorres", "Alejandro", "Torres", true);
        alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000), new Date(System.currentTimeMillis() - 86400000 + 3600000))); // 60 min
        alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000), new Date(System.currentTimeMillis() - 172800000 + 3600000))); // 60 min
        alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000), new Date(System.currentTimeMillis() - 259200000 + 3600000))); // 60 min
        alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000), new Date(System.currentTimeMillis() - 345600000 + 3600000))); // 60 min
        servicio.agregarUsuario(alejandro);
        
        // Usuario 8: Lucía Martínez - 4 accesos - Total: 280 minutos
        Usuario lucia = new Usuario("lmartinez", "Lucía", "Martínez", true);
        lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000), new Date(System.currentTimeMillis() - 86400000 + 4200000))); // 70 min
        lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000), new Date(System.currentTimeMillis() - 172800000 + 4800000))); // 80 min
        lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000), new Date(System.currentTimeMillis() - 259200000 + 3600000))); // 60 min
        lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000), new Date(System.currentTimeMillis() - 345600000 + 4200000))); // 70 min
        servicio.agregarUsuario(lucia);
        
        // Usuario 9: Ana Fernández - 5 accesos - Total: 320 minutos
        Usuario ana = new Usuario("afernandez", "Ana", "Fernández", true);
        ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000), new Date(System.currentTimeMillis() - 86400000 + 3600000))); // 60 min
        ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000), new Date(System.currentTimeMillis() - 172800000 + 4800000))); // 80 min
        ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000), new Date(System.currentTimeMillis() - 259200000 + 4200000))); // 70 min
        ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000), new Date(System.currentTimeMillis() - 345600000 + 3000000))); // 50 min
        ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 432000000), new Date(System.currentTimeMillis() - 432000000 + 3600000))); // 60 min
        servicio.agregarUsuario(ana);
        
        // Usuario 10: Pedro González - 5 accesos - Total: 375 minutos
        Usuario pedro = new Usuario("pgonzalez", "Pedro", "González", true);
        pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000), new Date(System.currentTimeMillis() - 86400000 + 4800000))); // 80 min
        pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000), new Date(System.currentTimeMillis() - 172800000 + 4500000))); // 75 min
        pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000), new Date(System.currentTimeMillis() - 259200000 + 4200000))); // 70 min
        pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000), new Date(System.currentTimeMillis() - 345600000 + 5400000))); // 90 min
        pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 432000000), new Date(System.currentTimeMillis() - 432000000 + 3600000))); // 60 min
        servicio.agregarUsuario(pedro);
    }

    public static void cargarDatosIniciales() {
		
		Random random = new Random();
		
		// Fecha base: 1 de enero de 2025
		LocalDateTime fechaBase = LocalDateTime.of(2025, 1, 1, 8, 0); // 8:00 AM
		
		// Datos para usuarios
		String[][] datosUsuarios = {
			{"jperez", "Juan", "Pérez"},
			{"mgarcia", "María", "García"},
			{"crodriguez", "Carlos", "Rodríguez"},
			{"lfernandez", "Laura", "Fernández"},
			{"dmartinez", "Diego", "Martínez"},
			{"slopez", "Sofía", "López"},
			{"rgonzalez", "Roberto", "González"},
			{"aperez", "Ana", "Pérez"},
			{"jmorales", "Jorge", "Morales"},
			{"vsilva", "Valentina", "Silva"}
		};
		
		for (int i = 0; i < datosUsuarios.length; i++) {
			Usuario usuario = new Usuario();
			usuario.setUserName(datosUsuarios[i][0]);
			usuario.setNombre(datosUsuarios[i][1]);
			usuario.setApellido(datosUsuarios[i][2]);
			usuario.setHabilitado(random.nextBoolean());
			
			// Crear accesos para cada usuario (entre 2 y 5 accesos)
	
			int numeroAccesos = 2 + random.nextInt(4); // Entre 2 y 5 accesos
			
			for (int j = 0; j < numeroAccesos; j++) {
				Acceso acceso = new Acceso();
				
				// Crear horarios más variados a lo largo del día
				int horaBase;
				if (j == 0) {
					// Primera entrada: entre 7:00 AM y 9:00 AM
					horaBase = 7 + random.nextInt(3);
				} else if (j == 1) {
					// Segunda entrada: entre 10:00 AM y 12:00 PM
					horaBase = 10 + random.nextInt(3);
				} else if (j == 2) {
					// Tercera entrada: entre 1:00 PM y 3:00 PM
					horaBase = 13 + random.nextInt(3);
				} else {
					// Cuarta o quinta entrada: entre 4:00 PM y 6:00 PM
					horaBase = 16 + random.nextInt(3);
				}
				
				int minutoEntrada = random.nextInt(60);
				LocalDateTime entrada = fechaBase.withHour(horaBase).withMinute(minutoEntrada).withSecond(0).withNano(0);
				
				// Diferencia entre entrada y salida: entre 1 y 10 minutos
				int duracionMinutos = 1 + random.nextInt(10);
				LocalDateTime salida = entrada.plusMinutes(duracionMinutos);
				
				// Convertir LocalDateTime a Timestamp
				acceso.setEntrada(Timestamp.valueOf(entrada));
				acceso.setSalida(Timestamp.valueOf(salida));

				usuario.agregarAcceso(acceso);
			}
			
			
			ServiciosUsuario.getInstancia().agregarUsuario(usuario);
		}
		
			
		// Mostrar información de los datos cargados
		System.out.println("=== DATOS DE PRUEBA CARGADOS ===");
		System.out.println("Total de usuarios: " + ServiciosUsuario.getInstancia().getUsuarios().size());
		
		for (Usuario usuario : ServiciosUsuario.getInstancia().getUsuarios()) {
			System.out.println("\nUsuario: " + usuario.getNombre() + " " + usuario.getApellido() + 
							   " (" + usuario.getUserName() + ")");
			System.out.println("Habilitado: " + usuario.isHabilitado());
			System.out.println("Número de accesos: " + usuario.getAccesos().size());
			
			for (int i = 0; i < usuario.getAccesos().size(); i++) {
				Acceso acceso = usuario.getAccesos().get(i);
				System.out.println("  Acceso " + (i + 1) + ":");
				System.out.println("    Entrada: " + acceso.getEntrada());
				System.out.println("    Salida:  " + acceso.getSalida());
				
				// Calcular duración
				long duracion = acceso.getSalida().getTime() - acceso.getEntrada().getTime();
				long minutos = duracion / (60 * 1000);
				System.out.println("    Duración: " + minutos + " minutos");
			}
		}
		System.out.println("================================");
	}

}
