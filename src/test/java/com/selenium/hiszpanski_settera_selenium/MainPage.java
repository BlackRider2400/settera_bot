package com.selenium.hiszpanski_settera_selenium;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementIsNotClickableException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class MainPage {

    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chromev2\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Selenium-drivers\\Edgev2\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        String acceptCookieDiv = "accept-choices";
        String areaCanaries = "AREA_CANARIANISLANDS";
        String areaBasqueCountry = "AREA_BASQUECOUNTRY";
        String areaAsturias = "AREA_ASTURIAS";
        String areaCantabria = "AREA_CANTABRIA";
        String areaMurcia = "AREA_MURCIA";
        String areaAndalusia = "AREA_ANDALUSIA";
        String areaLarioja = "AREA_LARIOJA";
        String areaExtremandura = "AREA_EXTREMADURA";
        String areaMadrid = "AREA_MADRID";
        String areaGalicia = "AREA_GALICIA";
        String areaCastileLaMancha = "AREA_CASTILELAMANCHA";
        String areaValencia = "AREA_VALENCIA";
        String areaCatalonia = "AREA_CATALONIA";
        String areaBaleares = "AREA_BALEARICISLANDS";
        String areaAragon = "AREA_ARAGON";
        String areaCastileLeon = "AREA_CASTILELEON";
        String areaNavarre = "AREA_NAVARRE";
        String questionText = "currQuestion";

        driver.get("https://online.seterra.com/pl/vgp/3005");

        WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(acceptCookieDiv)));

        WebElement cookie = driver.findElement(By.id(acceptCookieDiv));
        cookie.click();

        WebElement canaries = driver.findElement(By.id(areaCanaries));
        WebElement basque = driver.findElement(By.id(areaBasqueCountry));
        WebElement asturias = driver.findElement(By.id(areaAsturias));
        WebElement cantabra = driver.findElement(By.id(areaCantabria));
        WebElement murcia = driver.findElement(By.id(areaMurcia));
        WebElement andalusia = driver.findElement(By.id(areaAndalusia));
        WebElement larioja = driver.findElement(By.id(areaLarioja));
        WebElement extramandura = driver.findElement(By.id(areaExtremandura));
        WebElement madrid = driver.findElement(By.id(areaMadrid));
        WebElement galicia = driver.findElement(By.id(areaGalicia));
        WebElement castileLaMancha = driver.findElement(By.id(areaCastileLaMancha));
        WebElement valencia = driver.findElement(By.id(areaValencia));
        WebElement catalonia = driver.findElement(By.id(areaCatalonia));
        WebElement baleares = driver.findElement(By.id(areaBaleares));
        WebElement aragon = driver.findElement(By.id(areaAragon));
        WebElement castileLeon = driver.findElement(By.id(areaCastileLeon));
        WebElement navarre = driver.findElement(By.id(areaNavarre));
        WebElement question = driver.findElement(By.id(questionText));

        System.setProperty("file.encoding", "UTF-8");
        String text = question.getText();

        for(int i = 0; i < 17;i++){

            text = question.getText();
            System.out.println(text);
            switch (text) {
                case "| Kliknij La Rioja":
                    larioja.click();
                    break;
                case "| Kliknij Kastylia i Leon":
                    castileLeon.click();
                    break;
                case "| Kliknij Baleary":
                    baleares.click();
                    break;
                case "| Kliknij Asturia":
                    asturias.click();
                    break;
                case "| Kliknij Wyspy Kanaryjskie":
                    canaries.click();
                    break;
                case "| Kliknij Galicja":
                    galicia.click();
                    break;
                case "| Kliknij Andaluzja":
                    andalusia.click();
                    break;
                case "| Kliknij Murcja":
                    murcia.click();
                    break;
                case "| Kliknij Walencja":
                    valencia.click();
                    break;
                case "| Kliknij Katalonia":
                    catalonia.click();
                    break;
                case "| Kliknij Nawarra":
                    navarre.click();
                    break;
                case "| Kliknij Aragonia":
                    aragon.click();
                    break;
                case "| Kliknij Madryt":
                    madrid.click();
                    break;
                case "| Kliknij Kantabria":
                    cantabra.click();
                    break;
                case "| Kliknij Kastylia-La Mancha":
                    castileLaMancha.click();
                    break;
                case "| Kliknij Estremadura":
                    extramandura.click();
                    break;
                default:
                    basque.click();
            }
        }

        WebElement score = driver.findElement(By.id("lblFinalScore2"));
        System.out.println(score.getText());
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
