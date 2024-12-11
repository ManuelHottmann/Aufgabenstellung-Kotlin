package com.example.kotlin_classes.classes.sealed_class

/**
 * 1.
 * Definiere eine Sealed Class OrderStatus, die die verschiedenen Status einer Bestellung darstellt. Jedes Stadium des Versandprozesses soll durch eine spezifische Klasse innerhalb der OrderStatus-Sealed Class dargestellt werden. Es gibt folgende Status:
 *
 * Pending                                               Die Bestellung wurde aufgegeben, aber noch nicht bearbeitet.
 * Processing(estimatedProcessingTime: Int)              Die Bestellung wird derzeit bearbeitet.
 * Shipped(trackingNumber: String, shippedDate: String)  Die Bestellung wurde versendet.
 * Delivered(deliveryDate: String, recipient: String)    Die Bestellung wurde zugestellt.
 * Cancelled(reason: String)                             Die Bestellung wurde storniert.
 
 * 2.
 * Erstelle eine Funktion printOrderStatus(status: OrderStatus),
 * die je nach OrderStatus-Typ den Status der Bestellung auf der Konsole ausgibt.
 * Die Ausgabe sollte spezifische Informationen für jeden Status anzeigen.
 
 * 3.
 * Implementiere eine Data-Klasse Order(orderId:String, status:OrderStatus)
 * Die Klasse soll eine Methode updateStatus(newStatus: OrderStatus) enthalten, um den Bestellstatus zu ändern.
 
 * 4.
 * Erstelle eine Methode estimateDeliveryTime() in der Order-Klasse.
 * Berechne eine geschätzte Lieferzeit in Tagen, basierend auf dem Status
 * Du kannst folgende Annahmen treffen:
 * Processing: 7  Für Bearbeitung und Versand
 * Shipped:    5  Für Versand
 * Delivered:  0
 * Cancelled: -1  Es findet keine Lieferung statt

 * 5.
 * Erstelle ein paar Bestellungen, aktualisiere deren Status, und teste die printOrderStatus()- und estimateDeliveryTime()-Methoden.
 */
