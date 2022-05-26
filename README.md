![bannerprojeto](https://user-images.githubusercontent.com/22267601/165681863-3f86f68f-1505-41cb-8125-276e11b40fd0.png)

Este projeto foi criado com o intuito de fornecer aplicativo para automação de testes IOS.

O sistema alvo é o <b>AWS DEVICE FARM</b>

👉 Desenvolvimento de Features utilizando a linguagem Gherkin atráves do Cucumber </br>
👉 Desenvolvimento de testes unitários para validação de funcionalides básicas

|Component |
|----------|
|Alerts|
|Crash|
|Http|
|Inputs|
|Login Page|
|Native|
|Nested View|
|Web View|

## Examples of Native Features
|Feature |
|--------|
|[Camera](https://developer.apple.com/library/ios/documentation/AudioVideo/Conceptual/CameraAndPhotoLib_TopicsForIOS/Introduction/Introduction.html)|
|[Image Gallery](https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/)|
|[Scroll View](https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollView_Class/)|
|Out of View Content|
|[Video](https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MediaPlayer_Framework/)|
|[Table of Elements](https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/)|

## Examples of Inputs
|Component |
|--------------|
|[DatePicker](https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDatePicker_Class/)|
|[ContactAddButton](https://developer.apple.com/library/ios/documentation/UserExperience/Conceptual/UIKitUICatalog/UIButton.html)|
|[TextView](https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/)|
|[Labels](https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/)|
|[Text Input](https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextField_Class/)|
|[Gestures Input](https://developer.apple.com/library/ios/documentation/EventHandling/Conceptual/EventHandlingiPhoneOS/GestureRecognizer_basics/GestureRecognizer_basics.html)|
|[Refresh Control](https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIRefreshControl_class/)|
|[Button](https://developer.apple.com/library/ios/documentation/UserExperience/Conceptual/UIKitUICatalog/UIButton.html)|
|[Data Picker](https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPickerView_Class/)|
|[Switch View](https://developer.apple.com/library/prerelease/ios/documentation/UIKit/Reference/UISwitch_Class/index.html)|

## Examples of Navigation
|Component |
|--------------|
|[Tab Bar](https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/)|
|[Page Viewer](https://developer.apple.com/library/prerelease/ios//documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html)| </br>


👉 Criação de Testes Data Driven Utilizando BDD
<ul>
  <li><b>Feature Input</b> (Text Field e Spinner) </li>
  <li><b>Nested View</b> (Quantidade de Levels)   </li>
</ul>

👉 Execução Parelela de Testes no BrowserStack </br>


![escritas](https://user-images.githubusercontent.com/22267601/165765039-3ff0dcb6-57da-40e5-809d-f2a399d96dd2.png)

<ul>
  <li><b> Linguagem - Java 8 </b></a></li>
  <li><b> Orquestrador de testes - TestNG 7.3.0 </b></a></li>
  <li><b> Relatório de testes automatizados - ExtentReports 3.1.5 </b></a></li>
  <li><b> Framework interação com elementos mobile - Appium 1.22.0 </b></a></li>
  <li><b> BDD - Cucumber 4.8.1 </b></a></li>
</ul>

![setupescritas](https://user-images.githubusercontent.com/22267601/165795825-cb43061e-1086-49d3-9d8c-9a5fbf2b211f.png)

 ## Instalações
<ul>
  <li><b> Linguagem - Java 8 </b></a></li>
  <li><a href="https://github.com/appium/appium-desktop/releases">Appium Desktop</a> </li>
  <li><a href="https://nodejs.org/en/download/"> Node.js </a> </li>
  <li><b> Abra um terminal  </b></li>
    <i>Execute o comando: <i> <br>
  
   ```
      npm install -g appium  
   ```
  <li><b><a href="https://developer.apple.com/xcode/"> XCode</b></a></li>
</ul>

 ## Configurações

  1. Instalar o Homebrew - Instalar o HomeBrew:
  
```
   /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

```
  
 2.  Instalar a dependência libimobiledevice executando o comando <b> brew install libimobiledevice </b> no terminal.
 3.  Para implantar  aplicativos nos dispositivos usa-se ios-deploy. Instalar com o comando <b> brew install ios-deploy </b>.
 4. <b>WebDriverAgent</b> para configurá-lo devemos fazer o seguinte passo:
   ```
      cd /usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/ 
   ```
  5. <b> open </b> </br>
  ![2022_05_24_23_11_12_iOS_Testing_Using_Appium_and_JAVA_iOS_Mobile_Test_Automation](https://user-images.githubusercontent.com/22267601/170164930-f57d8ea2-a9fd-497d-b4c6-66a65256efe1.png)

  6. Baixar o <b>WebDriverAgent</b> https://github.com/facebook/WebDriverAgent e abrir 
  7. Copiar o conteúdo para pasta abaixo:
  ![2022_05_24_23_15_58_iOS_Testing_Using_Appium_and_JAVA_iOS_Mobile_Test_Automation](https://user-images.githubusercontent.com/22267601/170165201-6159afbb-2ccc-4229-9cdf-2ac03c7418b8.png)
 8. Não fechando o caminho anterior digitar o seguinte comando:
  ```
        cd WebDriverAgent
        mkdir -p Resources/WebDriverAgent.bundle
        ./Scripts/bootstrap.sh  
   ```
 9. Por final finalize instalando o pacote abaixo:
   ```
        brew install carthage 
   ```
  
 ##	Instalar  Appium	Doctor ##
 <ul>
    <li><b> Abra um terminal  </b></li> 
  </ul>
    <i>Execute o comando: <i> 
     <br>
      
  
   ```
       npm install -g appium-doctor  
   ```


<b> Como saber se está tudo funcionando? </b>

Para realizar um diagnóstico se está tudo configurado corretamente vamos usar o appium-doctor. Appium-doctor tem os parâmetros android e ios para que você se as configurações estão corretas para o uso de cada tipo de sistema operacional, para isso: <br>
 <ul>
   <li> <b> Abra um terminal  </b> <br> </li>
 </ul> <br>
    <i>Execute o comando: <i> 
    
  ```
    appium-doctor --ios
  ```

<b> E caso a análise de dependência retorne algum erro, o item ficará com o símbolo em vermelho e uma sugestão para resolver o problema será apresentada. </b>
       
  <p align="center">
        <img src="https://user-images.githubusercontent.com/22267601/170547656-574f77f8-6a17-46d0-a289-456aa0498c57.png" width=100% height=40% >
   </p>

 ![xcode](https://user-images.githubusercontent.com/22267601/170549023-ee4c2c3f-c5aa-4a70-a83f-449887168e24.png)
   
#### Executar os testes com Emulador ####

1. Abrir o Xcode e Escolher o Emulador</br>
    
    <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170585252-0d670587-d31e-4778-9e09-68764bc81f35.png" width=100% height=40% >
      </p>

2. Fazer o build:
    
     <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170584941-ca2b100d-1c21-4048-8deb-fd3a5c05ec59.png" width=100% height=40% >
      </p>
      
 3. Simulador:
    
     <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170585510-1ce8fc0a-421e-4e81-9678-fb704997aa92.png" width=100% height=40% >
      </p>
      
 ## Gerar .ipa ##
      
1. Ir para Pasta onde Gerou .app</br>
    
    <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170585765-4b761811-fe7d-4b79-810d-56fdefbb9b16.png" width=100% height=40% >
    </p>

2. Pasta .app</br>
    
    <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170585944-751ce0f2-b203-446a-aed7-7698a13a9eee.png" width=100% height=40% >
    </p>

 3. Ir até a pasta do app no terminal e digitar os seguintes comandos:
   
      mkdir Payload </br>
      cp -R MyAppName.app Payload/ </br>
      zip -r -s 64 Payload.zip Payload/ </br>
      mv Payload.zip MyAppName.ipa </br>
 
![appiuminspector](https://user-images.githubusercontent.com/22267601/165868740-0609872f-8377-4f91-b51c-1857b9c471ea.png)
    
#### Passos para utilizar o Appium Inspector ####
    
1. Abrir Appium Inspector que agora é um componente isolado: </br>
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165869125-41a6db09-b3d8-4ecf-b19e-966844c96643.png" width=100% height=40% >
      </p>
      
2. Montar o JSON
 ```
  {
  "platformName": "iOS",
  "platformVersion": "15.2",
  "deviceName": "nome do device",
  "automationName": "XCUITest",
  "udid":"encontra no simulador"
  }

  ```
      
      
 ps: Será explicado mais a frente como pegar o nome do device

3. Salvar o Json 
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170546329-4597b14a-0f65-419e-bd14-26e7c9118bda.png" width=100% height=40% >
      </p>
     

![appiuminspectormapeamento](https://user-images.githubusercontent.com/22267601/165870502-845e1730-8095-4725-a611-61801fe860b0.png)

<b> Após ser feita a etapa anterior uma nova aba será aberta com a tela do celular e uma árvore como está os elementos da tela, como abaixo:</b>
         <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165968998-a9c6848a-7114-4926-818b-7c2508b3e6cb.png" width=100% height=40% >
      </p>

 #### Verificar Locator ####
1. Abrir a Lupa 
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165970320-5abe38bc-3852-452f-a7af-9887b57d85f9.png" width=100% height=40% >
      </p>
2. Colocar o Locator 
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165970849-6dffff25-594b-445a-bdcb-3098d10e51fe.png" width=100% height=40% >
      </p>
3. Ver se vai encontrar através desse Locator
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165971113-81927538-1bb0-4c21-9571-965347478d64.png" width=100% height=40% >
      </p>

![definicaoprojeto](https://user-images.githubusercontent.com/22267601/165971747-16467fc5-54b8-4188-9d47-1d743f8d511a.png)

   #### Algumas definições de Implementação do Projeto ####

 -  Mais de 25 casos de teste <br>
   Features <br>
      <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170393093-9d12a40e-83cb-4aab-8058-15240fe09a1e.png" width=50% height=40% >
      </p>
      
  
  Data Driven - Exemplo de Data Driven utilizando BDD     
      <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170393393-35a634db-b8fc-44af-a5e9-14acf76a7b78.png" width=50% height=40% >
      </p>
 
   Screen de uma tela
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170394717-5da21318-8c72-47fe-b3d9-bad24bbb1819.png" width=40% height=20% >
      </p>
     
   Configurações Emulador e Browserstack <br>     
     - É necessário para rodar no Browserstack colocar um ~ para não rodar os testes com a tag @naoRodarBrowserstack
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170544448-f06ca838-7e07-43f4-a316-c813ffdd8749.png" width=100% height=40% >
      </p>
    - Resultado de um relatório 
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170518133-ef2af278-f464-4d70-9e16-e1ccea2b5e1d.png" width=100% height=40% >
      </p>
![executarescritas](https://user-images.githubusercontent.com/22267601/167218496-73bc6ee8-f546-448e-bb95-dd7c80179d13.png)
## Configuração no Intellij para rodar o Device ##
- No global parameters e necessário ajustar as seguintes variáveis:
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170522263-aa7750aa-894d-4651-bc58-efa5c3ed251b.png" width=50% height=40% >
      </p>
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170521439-4ef4e017-2d1b-4973-8a6d-6bd07f8c7722.png" width=100% height=40% >
      </p>
ps: a configuração para um Emulador é a mesma de um deviceReal 
      
![executarescritas2](https://user-images.githubusercontent.com/22267601/167221029-cdf03edc-3a68-4ae2-9ef0-7e12bc4df1ae.png) 
  Para rodar no Browserstack foi necessário utilizar o ipa do seguinte repositório: https://github.com/aws-samples/aws-device-farm-sample-app-for-ios/tree/master/prebuilt
  - Pois o Browserstack não aceita .ipa gerado para um simulador e para gerar p device real no XCode é Pago.
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170543190-373feb9f-2ca9-4b7a-b8dc-ea52bf1cf68f.png" width=100% height=40% >
      </p>
- Upload IPA
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170542120-cef88252-a026-4614-9af2-72e6efbf7d2d.png" width=100% height=40% >
      </p>
- Abrirá essa nova janela (Para achar o AppIosUploadBrowserStack)
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167222191-6d292767-3dda-4f0c-b8f1-04861b2d258c.jpg" width=80% height=40% >
      </p>
- Para achar os dados do AcessKey e Username
         <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167222426-39eb0a30-82e0-4062-8932-552c26216e3c.png" width=100% height=40% >
      </p>
- Configuração no Intellij
         <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/170587369-869936be-ba73-4eaf-89ed-d9e810c9d0f1.png" width=100% height=40% >
      </p>

