@regresion
Feature: Registro de usuario
  Scenario: Registrar usuario exitosamente
    Given que estoy en la página de login
    When ingreso mis credenciales
    Then debería ver el panel principal