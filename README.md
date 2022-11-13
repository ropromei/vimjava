# vimjava
Testing Neovim with plugins to create Java project from scratch

## Shell scripts in repo

| Script name | Description                                          |
| ----------- | ---------------------------------------------------- |
| compile.sh  | creates class files to directory *out/*              |
| build.sh    | creates class files and builds vimjava.jar from them |
| run.sh      | runs created class files from directory *out/*       |

Please run the script files in the directory they are located in by default.


## Running class-files

Make sure you have already compiled your class-files.
You can easily compile the project by running *compile.sh* script.

### No arguments given

```
./run.sh
```
returns
```
Tere!

Tervitades
Reio Opromei
```

### 1 argument given

```
./run.sh Kalle
```
returns
```
Tere, Kalle!

Tervitades
Reio Opromei
```

### 2 or more arguments given

```
./run.sh Kalle Kaaviar [maybe some more arguments]
```
returns
```
Tere, Kalle Kaaviar!

Tervitades
Reio Opromei
```


## .jar-archive running

*compile.sh* script auto-generates the class files needed into the *out/* directory.
The archive *vimjava.jar* can be found from the project root.

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
