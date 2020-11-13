
Feature: Categoria Comics
  Como usuario quiero leer chistes de testers para reirme y pasar un buen rato.

  @Comics
  Scenario: Ingresar a la categoria Comics desde la pantalla Home
    Given   El usuario se encuentra en la pagina Home de imalittletester
    When    Hace click sobre el titulo The little tester comics
    Then    Se debe redirigir a la pantalla Comics

