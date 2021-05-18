package com.xyz.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-17T21:18:32")
@StaticMetamodel(TarjetaCredito.class)
public class TarjetaCredito_ { 

    public static volatile SingularAttribute<TarjetaCredito, Integer> codigo;
    public static volatile SingularAttribute<TarjetaCredito, Integer> id_cliente;
    public static volatile SingularAttribute<TarjetaCredito, Date> fechaVencimiento;
    public static volatile SingularAttribute<TarjetaCredito, Integer> idTarjetaCredito;
    public static volatile SingularAttribute<TarjetaCredito, String> nombre;

}