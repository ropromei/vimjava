rm -r out
mkdir -p out
javac -d out src/helpers/*.java
javac -cp "out" -d out src/*.java
