@echo off
cd ..

echo [ Compiling Java files...]
javac -d . duck\behavior\*.java duck\*.java

if %errorlevel% neq 0 (
    echo [ Compilation failed.]
    exit /b
)

echo [ Running MiniDuckSimulator...]
java duck.MiniDuckSimulator