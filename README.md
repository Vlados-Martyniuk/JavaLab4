# Лабораторна робота №4
**Тема:** Відношення між класами в мові програмування Java.


**Мета:** Ознайомлення з відношеннями між класами в мові програмування Java. Здобуття навичок у використанні відношень між класів в мові програмування Java.


---


## Основні функції програми
1. **Створення тексту:**
    - Текст автоматично розбивається на речення, речення — на слова, а слова — на літери.
    - Визначаються символи пунктуації, які зберігаються окремо.

2. **Операції над текстом:**
    - Перестановка першого і останнього слів у кожному реченні.

3. **Виведення результатів:**
    - Виводиться початковий текст.
    - Виводиться текст після обробки.

---

## Структура проєкту
### 1. Клас `Letter`
Клас представляє одну літеру тексту.

#### Атрибути:
- `value` (тип `char`) — значення літери.

#### Методи:
- Конструктор: створює літеру за заданим символом.
- `getValue`: повертає значення літери.
- `toString`: повертає текстове представлення літери.

---

### 2. Клас `Punctuation`
Клас представляє символ пунктуації.

#### Атрибути:
- `value` (тип `char`) — значення символу пунктуації.

#### Методи:
- Конструктор: створює символ пунктуації за заданим значенням.
- `getValue`: повертає значення символу пунктуації.
- `toString`: повертає текстове представлення пунктуаційного символу.

---

### 3. Клас `Word`
Клас представляє слово, яке складається з літер.

#### Атрибути:
- `letters` (тип `List<Letter>`) — список літер, які складають слово.

#### Методи:
- Конструктор: створює слово за текстовим представленням.
- `toString`: повертає текстове представлення слова.

---

### 4. Клас `Sentence`
Клас представляє речення, яке складається зі слів і пунктуації.

#### Атрибути:
- `words` (тип `List<Word>`) — список слів у реченні.
- `punctuation` (тип `Punctuation`) — пунктуація в кінці речення.

#### Методи:
- Конструктор: створює речення за текстовим представленням.
- `getWords`: повертає список слів.
- `getPunctuation`: повертає символ пунктуації.
- `toString`: повертає текстове представлення речення.

---

### 5. Клас `Text`
Клас представляє текст, який складається з речень.

#### Атрибути:
- `sentences` (тип `List<Sentence>`) — список речень у тексті.

#### Методи:
- Конструктор: створює текст за текстовим представленням.
- `getSentences`: повертає список речень.
- `toString`: повертає текстове представлення тексту.

---

### 6. Клас `TextOperation`
Клас виконує операції над текстом.

#### Методи:
- `processText`: міняє місцями перше і останнє слово в кожному реченні тексту.

---

### 7. Клас `Main`
Головний клас для демонстрації роботи програми.

#### Основна логіка:
1. Ініціалізація початкового тексту.
2. Розбиття тексту на компоненти.
3. Застосування операції перестановки слів.
4. Виведення початкового та обробленого текстів.

---

## Як запустити програму
1. Завантажте або скопіюйте проєкт.
2. Відкрийте його в будь-якому середовищі розробки Java (наприклад, IntelliJ IDEA, Eclipse, NetBeans).
3. Переконайтеся, що встановлена версія JDK 8 або новіша.
4. Запустіть клас `Main`.

---