
Feature: Busqueda de catalogo en Tiendeo.
  Un usuario puede consultar catalogos desde la opcion de Busqueda

  @Busqueda1
  Scenario Outline: Verificar que el usuario puede realizar una consulta de diferentes catalogos disponibles en su region
    Given   El usuario se encuentra en la pagina Home de Tiendeo
    When    Escribe en la casilla de busqueda el catalogo: "<catalogo>" que desea consultar
    And     Hace click sobre el boton Buscar
    Then    Se muestra correctamente la busqueda solicitada
    Examples:
      | catalogo     |
      | Flying Tiger |
      | Ale-Hop      |


