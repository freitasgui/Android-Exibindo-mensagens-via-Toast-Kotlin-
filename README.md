# Reproduzindo uma Mensagem de Feedback na Tela (TOAST)

Toast é um aviso simples sobre uma determinada atividade ou simplesmente uma mensagem de interação com o usuário. Seus parâmetros básicos são:

![](https://i.ibb.co/wY3ZtNc/02.png)
* Contexto do APP
* O Texto a ser exibido
* Duração da exibição

A documentação do Kotlin recomenda que:

1. Se o APP estiver em primeiro plano, recorrer ao _snackbar_, que possuem uma gama maior de recursos acionáveis que proporcionam uma experiência melhor ao usuário

2. Se o APP estiver em uma segunda tela, talvez o melhor recurso seja uma _notificação_.


***


###  Step 1. Criando seu projeto!

Este momento é suuuper importante, pois o futuro do seu projeto dependerá exclusivamente disso! Aqui definiremos em quais versões do Android sua aplicação será compativel. Primeiramente daremos um nome ao nosso projeto e apontaremos em qual pasta colocaremos os arquivos do projeto:

![](https://i.ibb.co/VJf0bq1/stp3.png)

Depois disso, precisaremos apontar quais as versões que poderão executar nossa aplicação:

![](https://i.ibb.co/B3LsLYw/stp2.png)


###  Step 1. _Lets Code!_

Copie o Código abaixo e experimente seu primeiro Toast. Sinta-se livre para alterar o texto a ser exibido. Para tal, substitua o "Olá Gui! Seja Bem-vindo" por qualquer outra frase!


```Kotlin
package com.example.kotlin_toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto_a_ser_exibido = "Olá Gui! Seja Bem-vindo."
        val duracao = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, texto_a_ser_exibido, duracao)

        toast.show()
    }
}

```
Grande abraço!
Guilherme Freitas

Dezembro de 2022

### Referências:
Toast - documentação oficial: https://developer.android.com/guide/topics/ui/notifiers/toasts
Snackbar: https://m2.material.io/components/snackbars
