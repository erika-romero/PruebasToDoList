#Pruebas Automatizacion Selenium ToDoList

Para ejecutar las pruebas es necesario tener JDK mas reciente

Se encuentran en la siguiente pagina:

https://www.oracle.com/co/java/technologies/downloads/

Se recomienda utilizar el IDE eclipse ide for java developers .

En la carpeta src/test/java se encuentran las pruebas funcionales:

- Base.java: Contiene los metodos de Selenium que se usarán en los Test al igual que la inicializacion del driver de chrome.

- Crearlista.java, DeleteItem.java, Additem.java: Contienen los localizadores necesarios, y las funciones de cada acción. 

- Crearlista_Test.java, DeleteItem_Test.java, Additem_Test.java: Ejecutables que contienen las pruebas unitarias para cada acción (JUnit Test Case).

- AllTest.java: Archivo principal, reune los casos de prueba de la aplicación web por medio de un JUnit Test Suite. 


