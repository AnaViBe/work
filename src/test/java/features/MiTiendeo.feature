
Feature: Categoria Mi Tiendeo.
  Un usuario quiere acceder a las opciones de 'Mi Tiendeo'

  @Login
  Scenario: Verificar que el usuario puede hacer Login desde la opcion 'Mi Tiendeo'
    Given   El usuario se encuentra en la pagina Home de Tiendeo
    When    Hace click sobre el titulo Mi Tiendeo
    And     Hace click sobre el boton Iniciar sesion
    And     Se muestra un popUp de Inicio de sesion
    Then    Se verifica que el usuario tiene la opcion Logueate con Facebook para hacer Login
    And     Se verifica que el usuario tiene la opcion Logueate con Google para hacer Login

  @MiTiendeoOpciones
  Scenario Outline: Verificar que cuando un usuario pulsa en cualquiera de las opciones del menu 'Mi Tiendeo' la pagina se redirige a la opcion solicitada correctamente
    Given   El usuario se encuentra en la pagina Home de Tiendeo
    When    Hace click sobre el titulo Mi Tiendeo
    And     Hace click sobre la opcion "<opcion>"
    Then    Se redirige correctamente al sitioWeb : "<sitioWeb>"

    Examples:
      | opcion              | sitioWeb                                 |
      | Tiendeo             | https://www.tiendeo.com/Barcelona        |
      | Cashback            | https://www.tiendeo.com/cashback         |
      | Chollos             | https://www.tiendeo.com/chollos          |
      | Favoritos           | https://www.tiendeo.com/alerts           |
      | Guardadas           | https://www.tiendeo.com/saved-pages      |
      | Gestionar mis datos | https://www.tiendeo.com/privacy-settings |

