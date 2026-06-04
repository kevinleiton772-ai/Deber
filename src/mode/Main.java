

package mode;

public class Main {
    public static void main(String[] args) {
        
        //Clase Cliente 
        Cliente c1 = new Cliente();
        c1.nombre="Kevin";
        c1.apellido="Leiton";
        c1.cedula=1005212772;
        c1.telefono="0962270260";
        c1.direccion="San Antonio";
        
        
        Cliente c2 = new Cliente();
        c2.nombre="David";
        c2.apellido="Rodriguez";
        c2.cedula=1005212882;
        c2.telefono="0962270250";
        c2.direccion="ibarra";
        
        Cliente c3 = new Cliente();
        c3.nombre="Steven";
        c3.apellido="Pinto";
        c3.cedula=1713232323;
        c3.telefono="0987651111";
        c3.direccion="Ibarra";

        Cliente c4 = new Cliente();
        c4.nombre="Emily";
        c4.apellido="Chávez";
        c4.cedula=1924545454;
        c4.telefono="0976542222";
        c4.direccion="Quito";

        Cliente c5 = new Cliente();
        c5.nombre="Jhon";
        c5.apellido="Caiza";
        c5.cedula=1105656565;
        c5.telefono="0965433333";
        c5.direccion="Otavalo";
        
        
        //Clase Producto
        
        Producto p1 = new Producto();
        p1.nombre="Laptop";
        p1.precio=850.50;
        p1.stock=10;
        p1.categoria="Tecnología";
        p1.codigo="P001";

        Producto p2 = new Producto();
        p2.nombre="Mouse";
        p2.precio=15.99;
        p2.stock=25;
        p2.categoria="Accesorios";
        p2.codigo="P002";

        Producto p3 = new Producto();
        p3.nombre="Teclado";
        p3.precio=30.75;
        p3.stock=18;
        p3.categoria="Periféricos";
        p3.codigo="P003";
        
        Producto p4 = new Producto();
        p4.nombre="Monitor";
        p4.precio=220.99;
        p4.stock=7;
        p4.categoria="Pantallas";
        p4.codigo="P004";

        Producto p5 = new Producto();
        p5.nombre="Impresora";
        p5.precio=145.50;
        p5.stock=5;
        p5.categoria="Oficina";
        p5.codigo="P005";
        
        // Clase Proveedor
        
        Proveedor pr1 = new Proveedor();
        pr1.nombreEmpresa="TecnoMarket";
        pr1.ruc=1790011223;
        pr1.telefono=987654321;
        pr1.direccion="Quito";
        pr1.correo="contacto@tecnomarket.com";

        Proveedor pr2 = new Proveedor();
        pr2.nombreEmpresa="CompuGlobal";
        pr2.ruc=1790044556;
        pr2.telefono=956789123;
        pr2.direccion="Guayaquil";
        pr2.correo="ventas@compuglobal.com";

        Proveedor pr3 = new Proveedor();
        pr3.nombreEmpresa="ElectroWorld";
        pr3.ruc=1790077889;
        pr3.telefono=945612378;
        pr3.direccion="Cuenca";
        pr3.correo="info@electroworld.com";

        Proveedor pr4 = new Proveedor();
        pr4.nombreEmpresa="Digital Center";
        pr4.ruc=1790099001;
        pr4.telefono=934567812;
        pr4.direccion="Ibarra";
        pr4.correo="soporte@digitalcenter.com";

        Proveedor pr5 = new Proveedor();
        pr5.nombreEmpresa="MegaTech";
        pr5.ruc=1790033445;
        pr5.telefono=923456781;
        pr5.direccion="Ambato";
        pr5.correo="admin@megatech.com";

        
        // Clase Vendedor
        
        Vendedor v1 = new Vendedor();
        v1.nombre="Carlos";
        v1.apellido="Mendoza";
        v1.codigoEmpleado="V001";
        v1.mensual=650.50;
        v1.turno="Mañana";

        Vendedor v2 = new Vendedor();
        v2.nombre="Andrea";
        v2.apellido="López";
        v2.codigoEmpleado="V002";
        v2.mensual=720.00;
        v2.turno="Tarde";

        Vendedor v3 = new Vendedor();
        v3.nombre="Luis";
        v3.apellido="Paredes";
        v3.codigoEmpleado="V003";
        v3.mensual=680.75;
        v3.turno="Noche";

        Vendedor v4 = new Vendedor();
        v4.nombre="Camila";
        v4.apellido="Torres";
        v4.codigoEmpleado="V004";
        v4.mensual=710.20;
        v4.turno="Mañana";

        Vendedor v5 = new Vendedor();
        v5.nombre="Jorge";
        v5.apellido="Ramírez";
        v5.codigoEmpleado="V005";
        v5.mensual=695.40;
        v5.turno="Tarde";

        
        
        
    
 
        
            
            
            
            
        
    }
    
}
