package CURP;

public class EntidadFederativa {
    private String nombre;

    public EntidadFederativa() {
        this.nombre = "";
    }

    public static void mostrarCatalogo(){
        System.out.println("1. Aguascalientes");
        System.out.println("2. Baja California");
        System.out.println("3. Baja California Sur");
        System.out.println("4. Campeche");
        System.out.println("5. Coahuila");
        System.out.println("6. Colima");
        System.out.println("7. Chiapas");
        System.out.println("8. Chihuahua");
        System.out.println("9. Ciudad de México");
        System.out.println("10. Durango");
        System.out.println("11. Guanajuato");
        System.out.println("12. Guerrero");
        System.out.println("13. Hidalgo");
        System.out.println("14. Jalisco");
        System.out.println("15. México");
        System.out.println("16. Michoacán");
        System.out.println("17. Morelos");
        System.out.println("18. Nayarit");
        System.out.println("19. Nuevo León");
        System.out.println("20. Oaxaca");
        System.out.println("21. Puebla");
        System.out.println("22. Querétaro");
        System.out.println("23. Quintana Roo");
        System.out.println("24. San Luis Potosí");
        System.out.println("25. Sinaloa");
        System.out.println("26. Sonora");
        System.out.println("27. Tabasco");
        System.out.println("28. Tamaulipas");
        System.out.println("29. Tlaxcala");
        System.out.println("30. Veracruz");
        System.out.println("31. Yucatán");
        System.out.println("32. Zacatecas");
    }

    public String[] getClaveEntidad(int seleccionEntidadFederativa) {
        String codigoEntidad= "";
        String nom_entidadF = "";
        switch (seleccionEntidadFederativa) {
            case 1:
                codigoEntidad = "AS";
                nom_entidadF = "Aguascalientes";
                break;
            case 2:
                codigoEntidad = "BC";
                nom_entidadF = "Baja California";
                break;
            case 3:
                codigoEntidad = "BS";
                nom_entidadF = "Baja California Sur";
                break;
            case 4:
                codigoEntidad = "CC";
                nom_entidadF = "Campeche";
                break;
            case 5:
                codigoEntidad = "CL";
                nom_entidadF = "Coahuila";
                break;
            case 6:
                codigoEntidad = "CM";
                nom_entidadF = "Colima";
                break;
            case 7:
                codigoEntidad = "CS";
                nom_entidadF = "Chiapas";
                break;
            case 8:
                codigoEntidad = "CH";
                nom_entidadF = "Chihuahua";
                break;
            case 9:
                codigoEntidad = "DF";
                nom_entidadF = "Distrito Federal";
                break;
            case 10:
                codigoEntidad = "DG";
                nom_entidadF = "Durango";
                break;
            case 11:
                codigoEntidad = "GT";
                nom_entidadF = "Guanajuato";
                break;
            case 12:
                codigoEntidad = "GR";
                nom_entidadF = "Guerrero";
                break;
            case 13:
                codigoEntidad = "HG";
                nom_entidadF = "Hidalgo";
                break;
            case 14:
                codigoEntidad = "JC";
                nom_entidadF = "Jalisco";
                break;
            case 15:
                codigoEntidad = "MC";
                nom_entidadF = "México";
                break;
            case 16:
                codigoEntidad = "MN";
                nom_entidadF = "Michoacán";
                break;
            case 17:
                codigoEntidad = "MS";
                nom_entidadF = "Morelos";
                break;
            case 18:
                codigoEntidad = "NT";
                nom_entidadF = "Nayarit";
                break;
            case 19:
                codigoEntidad = "NL";
                nom_entidadF = "Nuevo León";
                break;
            case 20:
                codigoEntidad = "OC";
                nom_entidadF = "Oaxaca";
                break;
            case 21:
                codigoEntidad = "PL";
                nom_entidadF = "Puebla";
                break;
            case 22:
                codigoEntidad = "QT";
                nom_entidadF = "Querétaro";
                break;
            case 23:
                codigoEntidad = "QR";
                nom_entidadF = "Quintana Roo";
                break;
            case 24:
                codigoEntidad = "SP";
                nom_entidadF = "San Luis Potosí";
                break;
            case 25:
                codigoEntidad = "SL";
                nom_entidadF = "Sinaloa";
                break;
            case 26:
                codigoEntidad = "SR";
                nom_entidadF = "Sonora";
                break;
            case 27:
                codigoEntidad = "TC";
                nom_entidadF = "Tabasco";
                break;
            case 28:
                codigoEntidad = "TS";
                nom_entidadF = "Tamaulipas";
                break;
            case 29:
                codigoEntidad = "TL";
                nom_entidadF = "Tlaxcala";
                break;
            case 30:
                codigoEntidad = "VZ";
                nom_entidadF = "Veracruz";
                break;
            case 31:
                codigoEntidad = "YN";
                nom_entidadF = "Yucatán";
                break;
            case 32:
                codigoEntidad = "ZS";
                nom_entidadF = "Zacatecas";
                break;
            default:
                codigoEntidad = "NE";
                break;

        }

        return new String[]{codigoEntidad, nom_entidadF};
    }



}