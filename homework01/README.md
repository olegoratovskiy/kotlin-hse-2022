Задания в комментариях.

Общий смысл - делаем кусок библиотеки, подобной numpy.  
Универсальные многомерные массивы на основе одномерного.

Требуемая функциональность описана в сигнатурах интерфейсов и в комментариях.  

Ожидается, что в реализации  NDArray у нас лежит одномерный IntArray и вся многомерность - это интерпретация базового одномерного IntArray.  

В  пространстве есть тесты, но это бейслайн. Их прохождение не гарантирует высшего балла.

На этапе проверки будут задействовавны более обширные тесты.  
И будет проверяться общий стиль.

В нескольких местах сказано, какие должны быть исключения и что в них должно быть.  
В этих местах их правильное бросание будет тестироваться.  
Если ничего не сказано и здравый смысл подсказывает, что стоит кинуть, то лучше киньте.  
Если не кинете, то баллов не потеряется.  

Ну просто мне кажется, что стоит проверить умение кинуть правильное исключение один раз, а повторять  
в задании однотипные требования в нескольких местах не хочется.

Не стесняйтесь спрашивать, если что-то непонятно.