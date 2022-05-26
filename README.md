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
        <img src="https://user-images.githubusercontent.com/22267601/165968299-bc10fb27-8b80-4cfb-b51d-092ffaca01d5.png" width=100% height=40% >
   </p>

      ### essa parte falar do xcode
      
#### Executar os testes com Emulador ####

1. Utilizando o prompt do Windows vá até a pasta onde se encontra o sdk é encontre o emulador é digite o seguinte comando conforme a imagem: </br>
    
    <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165868287-7f42153d-da27-4b89-bab5-bb75962d8e09.png" width=100% height=40% >
      </p>

2. Execute o Emulador escolhido da seguinte forma:
    
     <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165868551-48689334-f6a0-458c-9caf-05c253041ac0.png" width=100% height=40% >
      </p>

![appiuminspector](https://user-images.githubusercontent.com/22267601/165868740-0609872f-8377-4f91-b51c-1857b9c471ea.png)
    
#### Passos para utilizar o Appium Inspector ####
    
1. Abrir Appium Inspector que agora é um componente isolado: </br>
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165869125-41a6db09-b3d8-4ecf-b19e-966844c96643.png" width=100% height=40% >
      </p>
      
2. Montar o JSON
 ```
  {
  "platformName": "Android",
  "platformVersion": "9.0",
  "app": "pasta apk",
  "deviceName": "nome do device",
  "automationName": "uiautomator2"
  }

  ```
      
      
 ps: Será explicado mais a frente como pegar o nome do device

3. Salvar o Json 
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165870225-ad6bc887-62be-4ad9-a5d6-ab03d0f5d816.png" width=100% height=40% >
      </p>
     
4. Dar o Start na Seção 
         <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165870335-f1c6166d-30b1-46f7-9a5e-556ba22a31c1.png" width=100% height=40% >
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
      ##ajustar
   Configurações Emulador e Browserstack <br>     
     - É necessário para rodar no Browserstack retirar o teste de Input de Double Click
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167217906-09ece542-7b2e-4517-929e-ef1dc74443e8.jpg" width=100% height=40% >
      </p>
    - Resultado de um relatório 
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167218048-fda20b9c-6f73-4c87-96b5-4b119bf34ba3.jpg" width=100% height=40% >
      </p>
![executarescritas](https://user-images.githubusercontent.com/22267601/167218496-73bc6ee8-f546-448e-bb95-dd7c80179d13.png)
## Configuração no Intellij para rodar o Device ##
- No global parameters e necessário ajustar as seguintes variáveis:
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167220624-320a68c2-b7be-4b1c-825c-4221adb239b8.png" width=50% height=40% >
      </p>
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167220789-8f128dd9-89d8-4621-947f-7b05feba2796.png" width=100% height=40% >
      </p>
ps: a configuração para um Emulador é a mesma de um deviceReal 
      
![executarescritas2](https://user-images.githubusercontent.com/22267601/167221029-cdf03edc-3a68-4ae2-9ef0-7e12bc4df1ae.png) 
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167221514-eb76df9d-3c41-4b7b-a5ee-c21ba10d0ada.jpg" width=100% height=40% >
      </p>
- Upload APK
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167221926-977a6c74-6c5b-493d-889c-1a36cbb29022.png" width=100% height=40% >
      </p>
- Abrirá essa nova janela (Para achar o AppAndroidUploadBrowserStack)
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167222191-6d292767-3dda-4f0c-b8f1-04861b2d258c.jpg" width=80% height=40% >
      </p>
- Para achar os dados do AcessKey e Username
         <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167222426-39eb0a30-82e0-4062-8932-552c26216e3c.png" width=100% height=40% >
      </p>
- Configuração no Intellij
         <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167222525-eb155f15-2659-4bcb-8031-2444fc7d01e0.png" width=100% height=40% >
      </p>

