# vimjava
Testing Neovim with plugins to create Java project from scratch

## Shell scripts in repo

| Script name | Description                                           |
| ----------- | ----------------------------------------------------- |
| compile.sh  | creates class files                                   |
| build.sh    | creates class files and builds vimajava.jar from them |
| run.sh      | runs created class files directly                     |

## .jar-archive running

### No arguments given

```
java -jar vimjava.jar
```
returns
```
Tere!

Tervitades
Reio Opromei
```

### 1 argument given

```
java -jar vimjava.jar Kalle
```
returns
```
Tere, Kalle!

Tervitades
Reio Opromei
```

### 2 or more arguments given

```
java -jar vimjava.jar Kalle Kaaviar [maybe some more arguments]
```
returns
```
Tere, Kalle Kaaviar!

Tervitades
Reio Opromei
```
