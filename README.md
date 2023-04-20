## Java 8

### Link document:
[Java-8](https://messagemedia.udemy.com/course/modern-java-learn-java-8-features-by-coding-it/learn/lecture/11154348#overview)

### Some features:
- Lambda
- Streams
- Optionals
- Method References
- ...

### Stream Terminal Operations
- Terminal Operations collects the data for you.
- Terminal Operations starts the whole stream pipeline.
- Terminal Operations:
  - forEach()
  - min()
  - max()
  - reduce()
  - collect() and etc

### How Parallel Stream works?
Parallel Stream uses the Fork/Join framework that got introduced in java 7.
How many Threads are created?
- Number of threads created == number of processors available in this machine

### Introduction to New Date/Time Libraries
- LocalDate, LocalTime and LocalDateTime and part of java.time package.
- These new classes are created with the inspiration from the Joda-Time library.
- Supporting classes like Instant, Duration, Period and etc.
- Date, Calendar prior to Java 8.