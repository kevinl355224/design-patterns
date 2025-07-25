@echo off
cd ..

echo [ Compiling Java files...]
javac -d . withoutpattern\*.java

if %errorlevel% neq 0 (
    echo [ Compilation failed.]
    exit /b
)

echo [ Running WeatherStation...]
java withoutpattern.WeatherStation

echo [ WeatherStation Ended ]