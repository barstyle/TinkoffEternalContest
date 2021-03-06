## Задание 7

### Условие:

> Ограничение времени: **1 секунда**

> Ограничение памяти: **256 Mb.**

В школе перед Новым Годом устраивают игру в Тайного Санту. 
Каждому ученику *i* выдается ученик *a<sub>i</sub>*, которому он должен подарить подарок.

Костя, как администратор игры, определил каждому школьнику свое число *a<sub>i</sub>*. 
Но потом его коллега Маша спросила: А правда ли, что если начать цепочку подарков от школьника *1* к школьнику , потом *a<sub>a1</sub>* и так далее, то цепочка замкнется на школьнике 1, после того, как задействует всех остальных учеников ровно по одному разу?

Костя не знает, правда это или нет, но он собирается изменить **ровно одно число** *a<sub>i</sub>*, чтобы получить конфигурацию, которая устроит Машу. 
Помогите ему с этим.

### Формат входных данных

В первой строке находится натуральное число *n* — количество школьников *(2 ≤ n ≤ 10<sup>5</sup>)*. 
В следующей строке находится *n* натуральных чисел *a<sub>i</sub>* — ученик, который достался Тайному Санте с номером *i(1 ≤ a<sub>i</sub> ≤ n)*.

### Формат выходных данных

В первой строке выведите два числа *(1 ≤ x, y ≤ n, x &ne; y)* — номер ученика *x*, которому нужно изменить число *a<sub>x</sub>*, и новое значение *a<sub>x</sub>*.

Должно выполняться условие *a<sub>x</sub> &ne; y*.
Если ответов несколько — выведите любой.

Если сделать это невозможно — выведите -1 -1

### Замечание

В первом примере хотя бы один школьник будет дарить подарок сам себе.
Во втором примере после изменения происходят передачи подарков 1 → 2 → 3 →1.

### Примеры данных

#### Пример 1

<table>
    <tr>
        <td>INPUT</td>
        <td>OUTPUT</td>
    </tr>
    <tr>
        <td>3</td>
        <td rowspan="2">-1 -1</td>
    </tr>    
    <tr>
        <td>1 2 3</td>
    </tr>
</table>

#### Пример 2

<table>
    <tr>
        <td>INPUT</td>
        <td>OUTPUT</td>
    </tr>
    <tr>
        <td>3</td>
        <td rowspan="2">1 2</td>
    </tr>    
    <tr>
        <td>1 3 1</td>
    </tr>
</table>