
public class Main {
    public static void main(String[] args) {
        //Pais

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
        Sucursal suc1 = new Sucursal("Sucursal 1", domCaba);
        Sucursal suc2 = new Sucursal("Sucursal 2", domLaPlata);
        Sucursal suc3 = new Sucursal("Sucursal 3", domCorboba);
        Sucursal suc4 = new Sucursal("Sucursal 4", domCarlosPaz);

        //Empresas
        Empresa emp1 = new Empresa("Empresa 1", "30-12345678-9");
        emp1.getSucursales().add(suc1);
        emp1.getSucursales().add(suc2);

        Empresa emp2 = new Empresa("Empresa 2", "30-87654321-0");
        emp2.getSucursales().add(suc3);
        emp2.getSucursales().add(suc4);
    }
}
