# Aplicativo de Lista de Música (README em construção)

### Introdução:

### Objetivo:

### Interface do Projeto da Live:
![image-20210602232509548](C:\Users\anagu\AppData\Roaming\Typora\typora-user-images\image-20210602232509548.png)

### Passos de criação do projeto do Instrutor Kaique (com explicação):

#### 1) Adicionar as dependências no build.gradle (Module: App) e sincronizar;

1. ​	Recuperação do ID dos componentes utilizando Android **Synthetics**;

   . Em plugins, adicione o Synthethics, id 'kotlin-android-extensions';

2. ​	Adição da biblioteca do **CardView** (Material Design) para usar no item do RecyclerView;

   . Em dependencies, adicione: implementation "androidx.cardview:cardview:1.0.0"

3. ​	Adição do **RecyclerView** no projeto para utilizá-lo:

   . Em dependencies, adicione: implementation "androidx.recyclerview:recyclerview:1.2.1"

4. ​	Adição da biblioteca **Glide** para carregar a URL das imagens no RecyclerView:

   . Em dependencies, adicione: 

```
def glide_version = "4.12.0"
implementation "com.github.bumptech.glide:glide:$glide_version"
annotationProcessor "com.github.bumptech.glide:compiler:$glide_version"
```



#### 2) Modelar os dados que serão mostrados no RecyclerView; 

1. Criar um package models dentro do diretório Java e no mesmo arquivo da MainActivity;

​		. Dentro de models criar um data class, chamado Live, para armazenar as informações dos itens. 



#### 3) Criar a fonte de dados mockados;

1. Criar uma class DataSource (fonte de dados):

   . Criar o método createDataSet() do tipo arraylist e do tipo Live (a partir de seus dados);

   . Encontre a Thumbnail, do Youtube, neste link: https://boingboing.net/features/getthumbs

Obs.: ThumbnailUrl é um link que aponta para a imagem do vídeo; 

Obs.: Em prática, os dados não podem ser mockados. Ou seja, este é apenas um projeto didático.



#### 4) Criar o Layout de itens da lista;

​	. Criar o layout dos itens da lista do RecyclerView em res;

​	. Configurar o ConstraintLayout para ocupar todo o container e se adaptar ao tamanho do seu conteúdo;

​	. Adicionar dentro do ConstraintLayout o CardView>ConstraintLayout>ImageView>LinearLayout>(2x)TextView.



#### 5) Criar o adapter para o RecylerView (Parte mais complicada);

1. Criar o LiveAdapter e adicionar dependências que ele vai implementar:

   ​	a) As dependências são: RecyclerView, Adapter e o ViewHolder;

2. Inserir uma variável privada dos itens que seram iniciados com os dados;

3. Inserir os métodos sobrescritos indicados: 

   ​	a) onCreateViewHolder(), 

   ​	b) onBindViewHolder(): 

   ​	c) getItemCount(): indica quantos itens a lista retornara no RecyclerView;

4. Inserir a classe LiveViewHolder constructor() que representa o layout do xml;

   ​	a) Criar o método bind para inserir os dados no layout do item do RecyclerView; 

Obs.: O adapter recebe os dados do Live para serem inseridos no item e depois no RecyclerView;

#### 6) Cria o RecyclerView na MainActivity;



#### 7) Detectar clicks nos itens do RecyclerView. 



### Passos de criação do meu projeto (com explicação):

1) Adicionar as dependências no build.gradle (Module: App);

. 

2) Modelar os dados que serão mostrados no RecyclerView; 



3) Criar a fonte de dados mockados;



4) Criar o Layout de itens da lista;



5) Criar o adapter para o RecylerView;



6) Cria o RecyclerView na MainActivity;



7) Detectar clicks nos itens do RecyclerView. 
