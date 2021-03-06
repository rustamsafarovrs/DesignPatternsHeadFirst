# DesignPatternsHeadFirst

## Знакомство с паттернами
**Принцип проектирования:** Выделите аспекты приложения, которые могут изменяться, и отделите их от тех которые всегда
остаются постоянными.

**Принцип проектирования:** Программируйте на уровне интерфейса, а не на уровне реализации.

**Принцип проектирования:** Отдавайте предпочтение композиции перед наследованием.

## Паттерн Стратегия

**Паттерн Стратегия** определяет семейство алгоритмов, инкапсулирует каждый из них и обеспечивает 
их взаимозаменяемость. Он позволяет модифицировать алгоритмы независимо от их использования на стороне клиента.

**Принципы:**

Инкапсулируйте то, что изменяется.

Отдавайте предпочтение композиции перед наследованием.

Программируйте на уровне интерфейсов, а не реализации.

**Ключевые моменты:**

Знание основ ООП не сделает из вас хорошего ОО-проектировщика.

Хорошие ОО-архитектуры хорошо расширяются, простоты в сопровождении и пригодны 
для повторного использования.

Паттерны показывают, как строить системы с хорошими качествами ОО-проектирования.

Паттерны содержать проверенный опыт ОО-проектирования.

Паттерны описывают общие решения проблем проектирования и применяются в конкретных приложения.

Паттерны не придумывают — их находят.

Большинство паттернов и принципов направлено на решение проблем изменения программных архитектур.

Многие паттерны основаны на инкапсуляции переменных аспектов системы.

Паттерны образуют единую номенклатуру, которая повышает эффективность вашего общения с другим разработчикам.

## Паттерн Наблюдатель

Паттерн Наблюдатель определяет отношение «один-ко-многим» между объектами таким образом, что при изменении состояния
одного объекта происходит автоматическое оповещение и обновление всех зависимых объектов. Паттерн Наблюдатель определяет
отношение типа «один-ко-многим» между объектами. Когда состояние одного объекта изменяется, все зависимые объекты
получают оповещения.

**Принцип проектирования:** Стремитесь к слабой связанности взаимодействующих объектов.

**Принципы**

Стремитесь к слабой связанности взаимодействующих объектов. 

**Ключевые моменты:**

Паттерн Наблюдатель определяет отношение "один-к-многим" между объектами.

Субъекты обновляют наблюдателей через единый интерфейс.

Субъект ничего не знает о наблюдателей — кроме того, что они реализуют интерфейс Observer.

При использовании паттерна возможен как запрос, так и активная доставка данных от субъекта (запрос считается более "
правильным").

Работа кода не должно зависеть от порядка оповещения наблюдателей.

Java содержит несколько реализации паттерна Наблюдатель, включая обобщенную реализацию java.util.Observable.

Помните о недостатках java.util.Observable.

Не бойтесь самостоятельно реализовать Observable при необходимости.

Swing, как и многие GUI-инфраструктуры, широко применяет паттерн Наблюдатель.

Паттерн также встречается во многих других местах, включая JavaBeans и RMI.

## Паттерн Декоратор

**Принцип проектирования:** Классы должны быть открыты для расширения, но закрыты для изменения.

Паттерн декоратор динамически наделяет объект новыми возможностями и является гибкой альтернативой субклассированию в
области расширения функциональности.

## Contributors

<a href="https://github.com/rustamsafarovrs/DesignPatternsHeadFirst/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=rustamsafarovrs/DesignPatternsHeadFirst" alt="contributors" />
</a>

Made with [contributors-img](https://contrib.rocks).
