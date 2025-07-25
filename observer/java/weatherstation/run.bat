@echo off
cd ..

echo [ Compiling Java files...]
javac -d . weatherstation\displays\*.java weatherstation\interfaces\*.java weatherstation\*.java

if %errorlevel% neq 0 (
    echo [ Compilation failed.]
    exit /b
)

echo [ Running WeatherStation...]
java weatherstation.WeatherStation

echo [ WeatherStation Ended ]