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

To Create modular JAR:
```
$ mkdir mlib
$ jar --create --file=mlib/library@0.1.jar --module-version=1.0 -C mods/library .
$ jar --create --file=mlib/application.jar --main-class=application.Main -C mods/application .
$ jar --describe-module --file=mlib/application.jar
$ java -p mlib --list-modules
$ java -p mlib -m application
```

#### TODO
- tests
- ServiceLoader

