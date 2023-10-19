 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev;

import java.sql.SQLException;
import java.util.Date;
import tn.edu.esprit.entities.ReservationVehicule;
import tn.edu.esprit.entities.Vehicule;
import tn.edu.esprit.services.ServiceReservationVehicule;
import tn.edu.esprit.services.ServiceVehicule;
import tn.edu.esprit.tools.Datasource;

/**
 *
 * @author ismail
 */
public class PIDEV {
    ServiceVehicule serviceVehicule=new ServiceVehicule();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Datasource.getInstance();
        Datasource.getInstance();
        Datasource.getInstance();
        Datasource.getInstance();
        Datasource.getInstance();
        
      try {
        // Initialiser votre connexion à la base de données (assurez-vous que la variable "connection" est correctement initialisée).

        // Créer un objet Vehicule avec des données
        Vehicule vehicule = new Vehicule();
        vehicule.setMarque("mercedes");
        vehicule.setModèle("tesla");
        vehicule.setAnnée(2022);
        vehicule.setId(23);
        
        vehicule.setMarque("Toyota3");
        vehicule.setModèle("verso");
        vehicule.setAnnée(2022);
        vehicule.setId(23);

        // Créer une instance de ServiceVehicule
        ServiceVehicule serviceVehicule = ServiceVehicule.getInstance();

        // Appeler la méthode ajouter
        serviceVehicule.ajouter(vehicule);// Ajouter la réservation de véhicule
        ReservationVehicule reservationVehicule = new ReservationVehicule();
        reservationVehicule.setIdVehicule(vehicule.getId()); // Remplacez par l'ID du véhicule réservé
        reservationVehicule.setIdClient(1); // Remplacez par l'ID du client effectuant la réservation
        // Set the start and end dates for the reservation
        reservationVehicule.setDateDebut(new Date());
        reservationVehicule.setDateFin(new Date());
        // Ajouter la réservation à la base de données
        ServiceReservationVehicule serviceReservationVehicule = ServiceReservationVehicule.getInstance();
        serviceReservationVehicule.ajouter(reservationVehicule);
        
    } catch (Exception ex) {
        System.out.println("Erreur lors de l'ajout du véhicule : " + ex.getMessage());
    
}
    }
    
}