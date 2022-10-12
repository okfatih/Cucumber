package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= "stepDefinitions",
        //tags = "@wip", US1002 yi runnerdan çalıştırmak istersek
        tags = "@ScenarioOutlineUrl",
        dryRun = false
)

public class Runner {
    /*
    Bir framework'de bir tek Runner classi yeterli olabilir
    Runner class bodysinde hiç bir şey olmaz
    Runner classımızı önemli yapan iki adet annotation vardır
    @RunWith(Cucumber.class) notasyonu runner classına çalışma özelliği
    katar
    Bu notasyon olduğu için Cucumber frameworkumuzda Junit Kulllanmayı tercih ediyoruz
    features: runner dosyasının feature dosylarını nereden bulacağını tarif eder
    glue: Step definiton dosyalarını nerede bulacağımızı gösterir
    tags:O an hangi tagi çalıştırmak istiyorsak onu belli eder
    dryRun: iki seçenek var
    dryRun = true testimizi çalıştırmadan bize eksik adımları verir


     */

}
