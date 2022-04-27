package Bases;

import io.appium.java_client.*;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

import static Utils.DriverFactory.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class PageBase {

    private AppiumDriver driver = null;
    private WebDriverWait wait = null;
    protected JavascriptExecutor javaScriptExecutor = null;

    public PageBase() {
        driver = getDriver();
        wait = new WebDriverWait(driver, 90);
        javaScriptExecutor = (JavascriptExecutor) driver;
    } //fim construtor

    //mobile elements
    protected void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(elementToBeClickable(element));
    }

    protected void scrollUsingTouchActions(int seconds) {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width / 2);

        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(seconds)))// Start at 100,100
                .moveTo(PointOption.point(startx, endy)).release().perform(); // Passing absolute values of 200,200 ending up at 200,200
    }

    protected void scrollUsingTouchActionsE(int seconds) {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height / 2);

        int startx = (int) (size.width * 0.80);
        int endy = (int) (size.width * 0.20);
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(seconds)))// Start at 100,100
                .moveTo(PointOption.point(endy, starty)).release().perform(); // Passing absolute values of 200,200 ending up at 200,200
    }


    protected void click(MobileElement element) {
        waitForElement(element);
        element.click();
    }

    protected int quantidadeElementos(By locator) {

        waitForElement(locator);
        List<MobileElement> result = driver.findElements(locator);
        return result.size();
    }


    protected String getText(MobileElement element) {
        waitForElement(element);
        String text = element.getText();
        return text;
    }


    public void topToBottonSwipe() {
        Dimension dim = driver.manage().window().getSize();
        int height = (int) dim.getHeight();
        int width = (int) dim.getWidth();
        int x = width / 2;
        int startY = (int) (height * 0.80);
        int endY = (int) (height * 0.20);

        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(x, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(x, endY)).release().perform();
    }


    public void topToBottonSwipeTexto(By swipeTexto, String direcao) {
        littleSwipeByElement(swipeTexto, direcao);
    }


    public void littleSwipeByElement(By locator, String direction) {
        MobileElement element = waitForElement(locator);

        String action = "";
        double endXPercen = 0.72;
        int startX, startY, endX, endY;

        //Coleta a largura da tela
        int screenWidth = driver.manage().window().getSize().width;

        //Coleta a altura da tela
        int screenHeight = driver.manage().window().getSize().height;

        switch (direction) {
            case "TOP":
                //Coleta o centro eixo x do elemento
                startX = element.getCenter().getX();
                //Coleta a altura do elemento
                startY = element.getSize().getHeight();

                endX = startX;

                //Calculo do limite do eixo Y (altura - percentil de altura aceitavel)
                endY = screenHeight - (int) (screenHeight * endXPercen);
                action = "TOP";
                break;

            case "RIGHT":
                //Coleta o centro eixo x do elemento
                startX = element.getCenter().getX();
                //Coleta a altura do elemento
                startY = element.getCenter().getY();

                //Calcula o ponto final do eixo X: baseando-se na largura da tela x percentil
                endX = (int) (screenWidth * endXPercen);
                endY = startY;
                action = "RIGHT";
                break;

            case "LEFT":
                //Coleta o centro eixo x do elemento
                startX = element.getSize().getWidth();
                //Coleta a altura do elemento
                startY = element.getCenter().getY();

                //Calcula o ponto final do eixo X: largura - percentil do elemento
                endX = screenWidth - (int) (screenWidth * endXPercen);
                endY = startY;
                action = "LEFT";
                break;

            default:
                //Coleta o centro eixo x do elemento
                startX = element.getCenter().getX();
                //Coleta a altura do elemento
                startY = element.getLocation().getY();

                endX = startX;

                //Calcula o ponto final do eixo X: baseando-se na altura da tela x percentil
                endY = (int) (screenHeight * endXPercen);
                action = "DOWN";
                break;
        }

        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endX, endY)).release().perform();

    }


    ///TOP, RIGHT, BOTTOM e LEFT
    public void swipeElementWithDirection2(By locator, String direction) {
        Dimension dim = driver.manage().window().getSize();
        System.out.println(dim);
        RemoteWebElement element = (RemoteWebElement) driver.findElement(locator);
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID); // Only for ‘scroll in element’
        scrollObject.put("direction", direction);
        driver.executeScript("mobile:scroll", scrollObject);
    }


    protected void waitForBy(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected MobileElement waitForElement(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        MobileElement element = (MobileElement) driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(elementToBeClickable(element));

        return element;
    }

    protected void click(By locator) {
        waitForElement(locator).click();
    }

    protected void clear(By locator) {
        waitForElement(locator).clear();
    }

    protected void sendKeys(By locator, String text) {
        waitForElement(locator).sendKeys(text);
    }


    protected String getText(By locator) {
        String text = waitForElement(locator).getText();
        return text;
    }

    protected boolean returnElementDisplayed(By locator) {
        return waitForElementBeVisible(locator).isDisplayed();
    }


    protected boolean returnElementDisplayedElement(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    protected boolean returnIfElementExists(By locator) {
        boolean result = false;
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            result = true;
        } catch (Exception e) {

        }
        return result;
    }

    protected boolean returnElementExists(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected MobileElement waitForElementBeVisible(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        MobileElement element = (MobileElement) driver.findElement(locator);

        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }


}//fim classe
