@echo off
cd ..

echo [ Compiling Java files...]
javac -d . game\behavior\*.java game\*.java

if %errorlevel% neq 0 (
    echo [ Compilation failed.]
    exit /b
)

echo [ Running GameSimulator...]
java game.GameSimulator

echo [ GameSimulator Ended ]