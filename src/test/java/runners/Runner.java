package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(
        plugin={"html:target/cucumber-html-reports/cucumber.html", // buradaki / \\ idi, degistirdim, emin degilim
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features="src/test/resources/features",
        glue = "StepDefinitions",
        tags = "",
        dryRun = false


)


public class Runner {



}
/* Runner is used to run the feature files (Test Cases)
   @RunWith =>>>         This makes the class runnable.
   @CucumberOptions =>>> This is used to add path of features folder and step definitions folder.
     - tags
     - dryRun
     - Report plugins
     - failedRunner plugin

     What is the role of feature keyword?
     features=   =>> It is path of the  features folder.

     What is the role of glue keyword?
     glue=  =>>>  It is the path of step definitions folder

     What is the role of tags keyword?
     tags=  to run individual or multiple features or scenarios.
     for example, if I pass same tag to multiple feature, then all features with that tag will run.

     What is the role of dryRun keyword?
      It is used to check if there is any missing step definition (JAVA Code)
      dryRun can be true or false
      dryRun = false  -> default behaviour. Runs the testbon the browser while checking the missing steps
      dryRun = true   -> don't run tests on the browser and check if there is any missing step definition

 */



    // Runner class'inin body'sine hicbir kod yazmayacagiz
    // Bu class icin onemli olan kullanacagimiz iki adet notasyon

    // dryRun=false : yazildiginda belirlenen tag'la etiketlenen tum scenario'lari sirasiyla calistirir
    // dryRun=true :  dedigimizde ise kodlari calistirmadan eksik step defination'lar olup olmadigini kontrol eder
    //                ve varsa bize eksik step defination'lari rapor eder, ve kodlari hic calistirmaz

    // features ve glue olarak spesific bir class veya feature dosyasini degil tum klasor ve package'i
    // sectik. Dolayisiyla stepdefinitions package'i icerisinde hangi class'da olursa olsun
    // isimize yarayan bir step definitions varsa rahatlikla kullanabiliriz









