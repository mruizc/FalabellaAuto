Feature: realizar la compra de 2 productos en MyStore.
  Yo como cliente de la tienda MyStore
  Quiero comprar 2 productos de mujer por medio de la web con tarjeta de credito
  Para agilizar mi tiempo de compras.

  @myStore
  Scenario: Buscar productos en Falabella
    Given Ingreso a la pagina de Falabella
    When  Busca el producto "4K HDR Smart TV"
    Then  Verifica que traiga "Resultados"
