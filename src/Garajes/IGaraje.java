
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Garajes;

import Vehiculos.Vehiculo;

/**
 *
 * Luis Fernando Castillo 20241222068
 * Edgar Jesid Velez Castellanos 20241222443
 */
public interface IGaraje {
  double calcularIngresos();
  int calcularOcupacionPorTipoVehiculo(Vehiculo v);
}