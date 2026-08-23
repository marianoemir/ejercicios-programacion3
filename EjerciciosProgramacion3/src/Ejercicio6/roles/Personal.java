/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.roles;

import Ejercicio6.lugar.ParqueNacional;

/**
 *
 * @author andre
 */
public class Personal {
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private double sueldo;
    private String nroSegSocial;
    private ParqueNacional parqueTrabaja;

    // Roles opcionales (Overlapping)
    private RolCelador rolCelador;
    private RolInvestigador rolInvestigador;
    private RolGuarda rolGuarda;

    public Personal(String dni, String nombre, String direccion, String telefono, double sueldo, String nroSegSocial, ParqueNacional parque) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.nroSegSocial = nroSegSocial;
        this.parqueTrabaja = parque;
    }

    public void setRolCelador(RolCelador rolCelador) { this.rolCelador = rolCelador; }
    public void setRolInvestigador(RolInvestigador rolInvestigador) { this.rolInvestigador = rolInvestigador; }
    public void setRolGuarda(RolGuarda rolGuarda) { this.rolGuarda = rolGuarda; }

    public String getNombre() { return nombre; }
    public RolCelador getRolCelador() { return rolCelador; }
    public RolInvestigador getRolInvestigador() { return rolInvestigador; }
    public RolGuarda getRolGuarda() { return rolGuarda; }
}