package telran.arrays;
//package - для организации классов в логические группы и управления доступом

//Модификаторы доступа:
//1. public - используется для переменных, методов и классов
//Метод, класс или переменная public доступны в любом другом классе, объекте или пакете
//2. ptotected (защищенный) - доступ внутри пакета для всех классов  
//или внутри подклассов этого класса (даже из другого пакета)
//3. default или package-private - доступ внутри пакета для всех классов
//4. private - доступ только внутри одного класса
//private - используется для переменных, методов и вложенных (внутренних классов)

//Модификаторы доступа (например, public) - управляют доступом, т.е. видимостью 
//как ЧЛЕНОВ класса (переменных, блоков кода, методов), так и самого КЛАССА,
//т.е. Могут ли использовать этот ЧЛЕН класса или сам КЛАСС другие классы и объекты?

//Основная функция модификаторов  - обеспечение безопасности 
//и инкапсуляция - скрытие внутренного состояния от прямого доступа и изменений
//извне класса

//static - это принадлежность и общность. Применяется ТОЛЬКО для ЧЛЕНОВ класса!
//static могут быть:
// 1. Переменные (поля)
// 2. Методы, включая КОНСТРУКТОР
// 3. Блок кода
// 4. Вложенные классы
//Это ключевое слово, которое показывает, что переменная, метод, блок кода или вложенный класс 
//являются ОБЩИМИ для всех экземпляров класса (объектов),
//а не привязанным к конкретному экземпляру. 
//Например, когда переменная или метод объявлены static, они принадлежат самому классу! 
//А не экземплярам класса! Это значит, что если, например,
//мы меняем переменную static не важно где - в самом классе (через имя класса), либо в ЛЮБОМ
//из созданных объектов, то для ВСЕХ объектов ее значение поменяется.
//Нельзя для каждого объекта иметь свое значение статичной переменной!

// class A { static int field;}
//Поле field будет существовать всегда в ЕДИНСТВЕННОМ варианте 
//ДЛЯ ВСЕХ ЭКЗЕМПЛЯРОВ класса. Принцип - ОДНО ЗНАЧЕНИЕ ДЛЯ ВСЕХ!

//Доступ к статическим полям осуществляется либо через имя класса, 
//либо через имя экземпляра класса. 
// A.field=1; 1й вариант
// System.out.println(A.field); результат= 1
// A a1=new A(); a1.field=2; 2й вариант
// System.out.println(A.field); System.out.println(a1.field); результат= 2 
//В ОБОИХ СЛУЧАЯХ! По сути, мы обращаемся к одной и той же переменной field.

//Доступ к статическим методам осуществляется при загрузке класса:
//либо при создании объекта класса, либо при вызове статического метода этого класса


//Класс - шаблон, описание объекта. Он содержит :
//1. Состояние - переменные (поля класса class fields), объявленные внутри класса
//2. Поведение - методы. Метод - блок кода, выполняющий определенные действия.
//3. Внутренние классы.

//Внутренний (inner) класс в java - это класс, который объявлен внутри другого класса
//Внутренние классы улучшают читаемость кода и являются способом группировки 
//внутри одного файла

//Внутренние классы могут быть static и non-static
//1. Нестатические - доступ ко всем членам внешнего класса, включая private
//2. static - доступ только к статическим членам внешнего класса.
//Внутренние классы имеют доступ к членам внешнего класса без геттеров и сеттеров.

//Подкласс - это наследующий класс из суперкласса (родительского)
//Подкласс наследует все члены класса, кроме private. У себя может добавлять новые поля
//и методы, переопределять методы суперкласса.
//Используется для расширения функциональности существующего класса

public class ArrayChar {
private  char[] array;
//Описываем состояние - поле класса array
//char - примитивный тип данных для хранения символов Юникода. Каждый символ java
//2 байта (16 бит). Для этого типа используются одинарные кавычки. В отличие от Srting
//char - массив символов. String a = "abc"; char[] arr ={'a','b','c'};

//Создаем конструктор по умолчанию. Этот конструктор просто инициализирует поле array 
//класса ArrayChar нулевыми значениями
public ArrayChar(char[] array) {
	this.array = array;
	//Присваиваем полю (состоянию) array в классе ArrayChar локальное значение array 
	 
	}
//char[] getArray() {
//	return array;
//}
public int compareTo(ArrayChar another) {
	int length = Math.min(array.length, another.array.length);
	int index=0;
	while(index<length && this.array[index]==another.array[index]) {
		index++;
	}
	return index == length ? this.array.length - another.array.length :
		this.array[index]- another.array[index]  ;
}
public int indexOf(char character) {
	int index=0;
	while (index<array.length && array[index] != character) {
		index++;
	}
	
	return index == array.length ? -1 : index;
}
public int lastIndexOf(char character) {
	int index = array.length-1;
	while(index > -1 && array[index]!=character) {
	index--;	
	}
	return index ;
	}

public int compareToIgnoreCase(ArrayChar another) {
	int length = Math.min(array.length, another.array.length);
	int index=0;
	for(int i=0;i< array.length;i++) {
	if(( array[i]>=65 &&  array[i]<=90)
			||( array[i]>=192 &&  array[i]<=223) )
		  array[i]+=32;
	}
	for(int i=0;i<another.array.length;i++) {
		if((another.array[i]>=65 && another.array[i]<=90)
				|| (another.array[i]>=192 && another.array[i]<=223))
			  another.array[i]+=32;
		}
	while(index<length && (array[index]==another.array[index]) 
			) {
		index++;
	}
	return index == length ?  array.length - another.array.length :
		 array[index]- another.array[index]  ;
}

public boolean equals(ArrayChar another) {
	int index=0;
	if (array.length==another.array.length) {
	while(index<array.length && (array[index]==another.array[index]) 
			) {
		index++;
	}
	}
	return index == array.length ?  true : false ;
}

public boolean contains(char character) {
	
	int index=0;
	while(index<array.length && (array[index]!=character)) 
	{
		index++;
	}
		 
	return  index == array.length ?  false : true ; 
}

public int lengthArr(ArrayChar another) {
	 return array.length;

}

	//compareTo
//ignore
// contains
//equals
// проблема в нашем уроке
//сколько символов в массиве


}