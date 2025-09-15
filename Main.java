import modelo.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //modelo.Pais

        Pais argentina = new Pais("Argentina");

        //Provincias

        Provincia bsAs = new Provincia("Buenos Aires");
        Provincia cordoba = new Provincia("Mendoza");
        argentina.getProvincias().add(bsAs);
        argentina.getProvincias().add(cordoba);

        //Localidades

        Localidad caba = new Localidad("CABA", bsAs);
        Localidad laPlata = new Localidad("La Plata", bsAs);
        Localidad cordobaCapital = new Localidad("Cordoba Capital", cordoba);
        Localidad carlosPaz = new Localidad("Villa Carlos Paz", cordoba);
        bsAs.getLocalidades().add(caba);
        bsAs.getLocalidades().add(laPlata);
        cordoba.getLocalidades().add(cordobaCapital);
        cordoba.getLocalidades().add(carlosPaz);

        //Domicilios

        Domicilio domCaba = new Domicilio("Avenida Siempre Viva 123", caba);
        Domicilio domLaPlata = new Domicilio("Calle 9 N°1000", laPlata);
        Domicilio domCorboba = new Domicilio("Mathus Hoyos 2910", cordobaCapital);
        Domicilio domCarlosPaz = new Domicilio("Belgrano 20", carlosPaz);


        //Sucursales
        Sucursal suc1 = new Sucursal("modelo.Sucursal 1", domCaba);
        Sucursal suc2 = new Sucursal("modelo.Sucursal 2", domLaPlata);
        Sucursal suc3 = new Sucursal("modelo.Sucursal 3", domCorboba);
        Sucursal suc4 = new Sucursal("modelo.Sucursal 4", domCarlosPaz);

        //Empresas
        Empresa emp1 = new Empresa("modelo.Empresa 1", 30123456789L);
        emp1.getSucursales().add(suc1);
        emp1.getSucursales().add(suc2);

        Empresa emp2 = new Empresa("modelo.Empresa 2", 30876543210L);
        emp2.getSucursales().add(suc3);
        emp2.getSucursales().add(suc4);

        HashSet<Empresa> empresas = new HashSet<>();
        empresas.add(emp1);
        empresas.add(emp2);

        System.out.println("------------------------------------------PUNTO 5.A------------------------------------------");


        System.out.println("=== Todas las empresas  ===");

        if (empresas == null || empresas.isEmpty()) {
            System.out.println("No hay empresas registradas.");
        } else {
            for (Empresa e : empresas) {
                // mostramos los datos básicos
                System.out.printf("ID: %d | Nombre: %s | CUIT: %s | Cantidad de Sucursales: %d%n",
                        e.getId(),
                        e.getNombre(),
                        String.valueOf(e.getCuit()),
                        (e.getSucursales() == null ? 0 : e.getSucursales().size()));

                // mostramos las sucursales
                if (e.getSucursales() != null && !e.getSucursales().isEmpty()) {
                    for (Sucursal s : e.getSucursales()) { //recorre las sucursales de esa empresa
                        String calle; // declaro la variable

                        if (s.getDomicilio() != null) {
                            calle = s.getDomicilio().getCalle();
                        } else {
                            calle = "sin domicilio";
                        }
                    }
                    System.out.println(); // línea en blanco entre empresas
                }

            }

            System.out.println("------------------------------------------PUNTO 5.B------------------------------------------");

            int idBuscado = 1; // el id que quieras buscar
            Empresa encontrada = null;

            for (Empresa e : empresas) {
                if (e.getId() == idBuscado) {
                    encontrada = e;
                    break;
                }
            }

            if (encontrada != null) {
                System.out.println("modelo.Empresa encontrada:");
                System.out.printf("ID: %d | Nombre: %s | CUIT: %s%n",
                        encontrada.getId(),
                        encontrada.getNombre(),
                        encontrada.getRazonSocial(),
                        String.valueOf(encontrada.getCuit()));

            } else {
                System.out.println("No se encontró ninguna empresa con id=" + idBuscado);
            }


        }

        System.out.println("------------------------------------------PUNTO 5.C------------------------------------------");

        String nombreBuscado = "modelo.Empresa s";
        Empresa encontradaNombre = null;

        for (Empresa e : empresas){
            if (e.getNombre().equalsIgnoreCase(nombreBuscado)) { //compara los Strings ignorando mayúsculas y minúsculas
                encontradaNombre = e;
                break;
            }
        }

        if (encontradaNombre != null) {
            System.out.printf("modelo.Empresa encontrada por nombre: ");
            System.out.printf("ID: %d | Nombre: %s |  CUIT: %s%n",
                    encontradaNombre.getId(),
                    encontradaNombre.getNombre(),
                    String.valueOf(encontradaNombre.getCuit()));
        } else {
            System.out.println("No se encontró ninguna empresa con nombre: "+nombreBuscado);
        }

        System.out.println("------------------------------------------PUNTO 5.D------------------------------------------");

        int idActualizar= 1; //id de la empresa a modificar
        long nuevoCuit = 30203314565L;

        Empresa empresaActualizar = null;

        for (Empresa e : empresas){
            if (e.getId() == idActualizar){
                empresaActualizar = e;
                break;
            }
        }

        if (empresaActualizar != null){
            empresaActualizar.setCuit(nuevoCuit);
            System.out.println("modelo.Empresa actualizada: ");
            System.out.printf("ID: %d | Nombre: %s | Nuevo CUIT: %s%n",
                    empresaActualizar.getId(),
                    empresaActualizar.getNombre(),
                    String.valueOf(empresaActualizar.getCuit())
            );
        } else {
            System.out.println("No se encontró la empresa con id = "+ idActualizar);
        }

        System.out.println("------------------------------------------PUNTO 5.E------------------------------------------");

        int idEliminar = 2;
        Empresa empresaEliminar = null;

        for (Empresa e : empresas){
            if (e.getId()==idEliminar){
                empresaEliminar = e;
                break;
            }
        }

        if (empresaEliminar != null){
            empresas.remove(empresaEliminar);
            System.out.println("modelo.Empresa con id: "+idEliminar+ " eliminada correctamente.");
        } else {
            System.out.println("No se encontró la empresa con id: "+idEliminar);
        }
        System.out.println("Empresas que quedan en el HashSet: ");
        for (Empresa e : empresas) {
            // empresas que quedan despues de eliminar
            System.out.printf("ID: %d | Nombre: %s | CUIT: %s",
                    e.getId(),
                    e.getNombre(),
                    String.valueOf(e.getCuit()));


        }
    }
}
