package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guru = new GuruPage();
    @And("User gets all values printed under the {string}")
    public void userGetsAllValuesPrintedUnderThe(String istenenSutun) {

    List<WebElement> tabloBaslikListesi =  guru.basliklar;
    //Listemiz web elementlerden oluşuyor
        //Dolayısıyla bu webelementlerden hangisi istenen sütün başlığını taşıyor bilemeyiz
        int istenenBaslikIndexi = -1;
        for (int i = 0; i <tabloBaslikListesi.size() ; i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi=i;
                break;
            }

        }
        /*
For loop ile tüm sütün başlıklarını bana verilen istenen sütün değeri ile karşılaştırdım
Loop bittiğinde başlığın bulunup bulunamadığını kontrol etmek ve bulundu ise yoluma devam etmek istiyorum
 */
            if (istenenBaslikIndexi != -3){
                List<WebElement>istenenSutundakiElementler =
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));
                istenenSutundakiElementler.forEach(t-> System.out.println(t.getText()));

            }else{
                System.out.println("Istenen baslik bulunamadi");
            }
    }

    @Then("if asked accepts cookies")
    public void ifAskedAcceptsCookies() {
        Driver.getDriver().switchTo().frame(guru.cookiesIframe);
        guru.cookiesAccept.click();
    }
}
