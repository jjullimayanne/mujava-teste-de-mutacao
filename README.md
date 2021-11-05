# mujava-teste-de-mutacao
Interface do Mujava após o comando 
java mujava.gui.GenMutantsMain
![teste1](https://user-images.githubusercontent.com/79465402/140442059-b8936d48-cef7-4bdd-a5f7-99648a35aa42.JPG)

Analisando os mutantes gerados:
Na parte de cima o código original do programa, já na parte de baixo o código mutado que na linha 32 apresenta está sinalizado com a cor vermelha, o original a variável i é igual a v já no mutado existe um operador de negação que torna v um número negativo 

![cap2](https://user-images.githubusercontent.com/79465402/140442963-ce7137bd-a728-4a31-935b-3f53bf01168f.JPG)

link do mujava https://cs.gmu.edu/~offutt/mujava/

Execução dos casos de teste sendo aplicados no arquivo original
![image](https://user-images.githubusercontent.com/79465402/140443989-bb801248-4f03-4ef6-a872-ae0b0276112e.png)
Analisando se existem resultados diferentes do mutante para o software original 
![image](https://user-images.githubusercontent.com/79465402/140444038-2ed79f6c-81cb-495a-8c6a-37c2223f4992.png)

Score de mutação: 
O score varia de 0 a 1, quanto mais próximo de 1 mais adequado está o conjunto de casos de teste. Assim, se um teste de mutação tem resultado 1 isso significa que todos os mutantes apresentaram resultados diferentes do software em teste, e foram mortos e descartados. O que isso significa? que os defeitos produzidos nos mutantes não existem do software original. Quando esse score está mais próximo de 0 significa que os casos de testes não são adequados, ou seja, não identificam a diferença dos mutantes para o software original. 


#resultado
![resul](https://user-images.githubusercontent.com/79465402/140444828-6e7b9a00-e3da-4b49-b1b5-af11d8e76d85.JPG)

Nenhum mutante foi morto 


