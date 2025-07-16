@echo off
cd ..

echo [ Compiling Java files...]
javac -d . basic\behavior\*.java basic\*.java

if %errorlevel% neq 0 (
    echo [Compilation failed.]
    exit /b
)

echo [ Running MiniDuckSimulator...]
java basic.MiniDuckSimulator