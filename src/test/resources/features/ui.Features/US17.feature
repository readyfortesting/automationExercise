@regression
Feature: Automation Exercise US17

  Scenario: TC17
    Then "url" sayfasina gidilir
    And Ana sayfanin basariyla gorunur oldugu dogrulanir
    And Sepete ürün eklenir
    And Sepet sayfasinin goruntulendigi dogrulanir
    And X butonu tiklanir
    And Urunun sepetten kaldirildigini dogrular
    And Sayfa Kapatilir