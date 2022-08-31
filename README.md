## NOME DO PROJETO: AGENDA

## VERSÃO DO APLICATIVO: 1.0

## DESCRIÇÃO DO PROJETO:

O aplicativo  pertencente a Zup tem como objetivo ser um modulo de agenda que por ser integrado a outros sistemas como cadastro de clientes, sistemas de vendas... etc 
## STATUS DO PROJETO:

Projeto em desenvolvimento

## LINK FIGMA DO PROJETO:
<a href="https://www.figma.com/file/1aHLQEI1eDPqVoboFqTVoD/Agenda?node-id=0%3A1" target="_blank">ACESSE PROTÓTIPO NAVEGAVÉL PLATAFORMA FIGMA</a>


## FUNCIONALIDADES E DEMONSTRAÇÃO DA APLICAÇÃO:

PRINCIPAIS FUNCIONALIDADES:

○ Busca endereço automaticamente pelo cep atrazes da api

○ cadastro de clientes com todos os dados

○ Exclui e edita os dados do cliente







## ACESSO AO APLICATIVO:

Em breve disponivel na play store android de seu celular

## TECNOLOGIAS UTILIZADAS:

○ Navegação via fragment

○ Implementação de arquitetura mvvm

○ Dados dinâmicos(consumo de API)

○ utilização de bando de dados Room

○ Aplicação de conceito SOLID

○ Aplicação de conceito clean code

## DEPENDÊNCIAS DO PROJETO:
Para implementar as dependências do projeto basta acessar o build.gradle do aplicativo localizado em Agenda\app

![greade1](https://user-images.githubusercontent.com/102183303/185227636-901762e3-3175-46b6-9a8f-0429271d1c2d.JPG)


ou localizando o arquivo  clicando em  shift shift e digitando build.gradle selecionando o build.gradle do app

![grEADE2](https://user-images.githubusercontent.com/102183303/185227742-5881f3e7-cfa0-49e8-a5e7-9667f42e751d.JPG)


Ao abrir o arquivo adicione as linhas de dependência como abaixo descrito

dependencies {

    implementation 'androidx.core:core-ktx:1.8.0'
    implementation 'androidx.appcompat:appcompat:1.5.0'
    implementation 'com.google.android.material:material:1.6.1'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'

    implementation("androidx.navigation:navigation-fragment-ktx:2.5.1")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.1")
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'

    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1'
    implementation 'androidx.annotation:annotation:1.4.0'
    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.5.1'

    implementation 'com.squareup.retrofit2:retrofit:2.9.0'

    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1'

    implementation 'com.google.code.gson:gson:2.9.0'
    implementation "com.squareup.retrofit2:converter-gson:2.6.0"

    implementation "com.squareup.retrofit2:retrofit:2.9.0"
    implementation "com.squareup.okhttp3:logging-interceptor:4.2.1"

    implementation 'com.google.android.material:material:1.7.0-beta01'
    implementation 'com.google.android.material:material:1.6.1'
    implementation("androidx.room:room-runtime:2.4.3")
    kapt("androidx.room:room-compiler:2.4.3")
}

## PESSOAS DESENVOLVEDORAS DO PROJETO:

| [<img src="https://avatars.githubusercontent.com/u/94246969?s=400&u=fc440c507c176ecc3e7cf8f069f9e080310f8746&v=4" width=115><br><sub>Allan Alex Bittencourt Neves</sub>](https://github.com/allanzup) 
