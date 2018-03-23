#### Java 9 modularity demonstration
- Requires java 9

To run the main application:
```./gradlew run```

##### Compile and run modular java without gradle
```
$ mkdir mods
```

Compile library-module: 
```
$ java -d mods/library \
    library/src/main/java/module-info.java \
    library/src/main/java/library/Library.java \
    library/src/main/java/library/internal/NotVisibleOutSideLibraryModule.java
```

Compile application-module: 
``` 
$ javac --module-path mods -d mods/application \
    application/src/main/java/module-info.java \
    application/src/main/java/application/Main.java
```

Execute main from application:
``` 
$ java --module-path mods -m application/application.Main
```

#### TODO
- tests
- ServiceLoader

