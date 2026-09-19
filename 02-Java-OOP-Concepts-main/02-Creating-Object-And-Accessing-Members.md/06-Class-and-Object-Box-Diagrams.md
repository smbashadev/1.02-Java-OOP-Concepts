# Box and Arrow Diagrams for Class and Object in Java

---

## 1) Basic Box-and-Arrow Diagram

```text
┌──────────────────────┐
│        Class         │
│  (Blueprint / Template) │
└──────────┬────────────┘
           │
           │ creates
           │
           ▼
┌──────────────────────┐
│        Object        │
│   (Real instance)     │
└──────────────────────┘

```

---

## 2) Class Contains Data and Methods

```text
┌────────────────────────────┐
│           Class            │
│         Student            │
├────────────────────────────┤
│ name: String               │
│ age: int                   │
├────────────────────────────┤
│ display()                  │
└────────────┬────────────────┘
             │
             │ creates
             │
             ▼
┌────────────────────────────┐
│           Object           │
│             s1             │
├────────────────────────────┤
│ name = "Amit"              │
│ age = 21                   │
└────────────────────────────┘

```

---

## 3) Multiple Objects from One Class

```text
┌────────────────────────────┐
│           Class            │
│         Student            │
├────────────────────────────┤
│ name                       │
│ age                        │
│ display()                  │
└────────────┬────────────────┘
             │
             ┌─────┴─────┐
             │           │
             ▼           ▼
┌─────────┐   ┌─────────┐
│   s1    │   │   s2    │
│ name=AI │   │ name=Riya│
│ age=21  │   │ age=22  │
└─────────┘   └─────────┘

```

---

## 4) Easy Real-Life Box Diagram

```text
┌──────────────────┐
│      Class       │
│      Car         │
├──────────────────┤
│ color            │
│ brand            │
│ speed            │
│ start()          │
└─────────┬────────┘
          │
          │ creates
          │
          ▼
┌──────────────────┐
│      Object      │
│      car1        │
│ color = Red      │
│ brand = Toyota   │
└──────────────────┘

```

---

## 5) Very Short Note Version

```text
Class
└── defines data + behavior

Object
└── created from class

```

