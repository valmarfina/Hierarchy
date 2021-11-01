# Hierarchy

Создайте иерархию животного царства на свое усмотрение - выбираем один тип (простейшие/губки/хордовые и т. д.), а далее наследуйте
классы, отряды, семейства, роды и виды) - должна получиться иерархия в 6 уровней, выбор животных на ваш вкус, особо много создавать не
нужно. Затем, для получившейся иерархии, выполняем следующее:
 - Создаем обобщенный класс Queue, представляющий из себя
очередь фиксированного размера со стандартными методами
очереди - add и get
 - Создаем методы produce и consume: первый метод должен
возвращать upper bound generic очередь (например, наследники
позвоночных) из n животных, которая будет генерироваться на
ваше усмотрение и подаваться во второй метод. Consume будет их
распределять в 2 или более lower bound очереди - например,
родители кошек и родители змей, выбор типов также остаётся за
вами.
 - Демонстрируем работу всех методов на конкретных собственных
кейсах


# Hierarchy.

Create a hierarchy of the animal kingdom of your choice - choose one type (protozoan/sponges/chordates, etc.) and then inherit
classes, orders, families, genera and species) - you should get a hierarchy of 6 levels, the choice of animals to your taste, you do not need to create much
you don't need to create much. Then, for the resulting hierarchy, do the following:
 - Create a generalized Queue class, which is a
a fixed-size queue with standard methods
standard queue methods - add and get
 - Let's create methods produce and consume: the first method should
return an upper bound generic queue (for example, the descendants of
vertebrates) of n animals, which will be generated at
at your discretion and fed into the second method. Consume will
distributed into 2 or more lower bound queues - e.g,
cat parents and snake parents, the choice of types is also left to
you.
 - Let's demonstrate how all methods work on specific cases of our own
cases
