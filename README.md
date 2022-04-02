# Proyecto 1 - Samancito Delivery
## Requerimiento funcionales
### 1. General
#### A. Cargar archivo: El usuario puede seleccionar a través de JFileChooser un archivo samancito.txt para ser cargado en el sistema, el cual contará con la información necesaria para la creación del grafo, es decir: restaurantes, platos, clientes, pedidos y caminos. Cuando el usuario cargue un nuevo archivo, el sistema debe enviar un mensaje de alerta indicando al usuario la necesidad de guardar los datos actualmente cargados en memoria. La estructura del archivo de datos (archivo de texto plano) se indicará posteriormente.
#### B. Actualizar repositorio: Esta función permitirá que la información cargada en memoria, referente a los clientes, locales y sus menús. Es decir, los cambios realizados a cualquiera de estos deben de actualizarse en el archivo texto detal forma que cuando se vuelva a cargar ese archivo contenga todos los cambios realizados. Al iniciarse el programa por primera vez debe cargarse el archivo de texto dado al final del enunciado (debe de mantener el mismo formato).
#### C. Mostrar grafo: El sistema deberá mostrar una representación visual del grafo según la información contenida en la memoria, es decir, los caminos disponibles entre los restaurantes y la información de estos. (Graphviz, ver final)
#### D. Recorrer grafo: Con el fin de conocer todos los nodos que forman parte del grafo, se podrá seleccionar esta opción, la cual mostrará todos los nodos del grafo mediante el recorrido de anchura (BFS) y el recorrido de profundidad (DFS).
#### E. Seleccionar rol de usuario: En la ventana inicial del sistema se debe poder seleccionar el rol del usuario, en este caso se contemplarán 3 roles:
####    ➢ Cliente: Pueden registrarse en el sistema y seleccionar el local donde desean hacer su pedido, junto con los platos que quieran del mismo.
####    ➢ Driver: Pueden visualizar las órdenes que han realizado los clientes y el sistema les debe mostrar la ruta ideal para el despacho.
####    ➢ Administrador: Encargado de añadir locales y caminos en el sistema, con sus respectivos menús.
### 2. Cliente
#### A. Nuevo cliente: Para el registro se solicitan los siguientes datos: nombre, apellido, cédula, dirección. Para la dirección debe seleccionar dos nodos, indicando sus respectivas distancias (elección del usuario).
#### B. Ordenar: A la hora de realizar una orden, el usuario deberá seleccionar el número de cliente correspondiente y el restaurante en el cual desea ordenar. Posteriormente se mostrará el menú y se procederá a seleccionar los platos deseados y la cantidad de los mismos. Finalmente, al confirmar toda la información el pedido se añadirá a la lista de entregas pendientes.
### 3. Driver
#### A. Realizar entrega: Al seleccionar la opción de driver, el usuario podrá realizar la entrega. Esta opción debe mostrar la lista de pedidos pendientes; el driver seleccionará el pedido que desea entregar y se generará la ruta más corta para que el driver despache la orden. Para calcular la ruta más corta se emplearán los algoritmos de Dijkstra y Floyd-Warshall.
### 4. Administrador
#### A. Agregar nuevos locales al sistema: Al ingresar como administrador al sistema, se podrán agregar nuevas empresas que utilizarán los servicios de Samancito Delivery. Dicha empresa debe tener su respectivo menú, es decir, una lista de platos. Además, los locales deben anexarse al grafo seleccionando dos nodos y agregando sus respectivas distancias.
#### B. Agregar nuevo camino: El administrador podrá hacer más caminos en el grafo, para esto debe seleccionar los nodos que serán unidos y el tamaño de la arista que los conecta.
#### C. Agregar platos: Un usuario con el rol de administrador será capaz de agregar nuevos platillos al menú de un restaurante, para esto seleccionará el restaurante y escribirá el nombre del nuevo plato
#### D. Eliminar platos: Luego de realizar un estudio de mercado, los locales pueden decidir eliminar un platillo de su menú por las pocas ganancias que genera al establecimiento.

## Graphviz: Visualización del grafo
#### Para instalarlo EN WINDOWS 64 Bits:

#### 1. Descargar Graphviz desde https://graphviz.org/download/
#### 2. Descargar el archivo .exe graphviz-2.49.3 (64-bit) EXE installer [sha256]
#### 3. Abrir el archivo y darle continuar hasta instalarlo
#### 4. Configurar la variable de entorno siguiendo los pasos del siguiente video: https://www.youtube.com/watch?v=qMtJSWlWZlI&t=83s (min. 1:50)
#### 5. Ejecutar el proyecto
#### Nota: desde el programa se ejecuta un archivo dot.exe, dependerá de la ruta donde se encuentre el programa en nuestro caso, se encontraba en
``` C:\\Program Files\\Graphviz\\bin\\dot.exe ```
#### Si se presenta fallos se podría cambiar de manera forzada la ruta para adaptarla a la pc donde se ejecute el proyecto
``` src -- > Proyecto 1 --> pkg1 -- > Funciones.java --> generarGrafoJpg() --> String dotPath = "//colocar la ruta acá//"; ``` 
