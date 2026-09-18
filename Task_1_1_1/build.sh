#!/bin/bash
set -e

SRC=src/main/java
OUT=build

rm -rf "$OUT"
mkdir -p "$OUT/classes" "$OUT/docs" "$OUT/libs"

# Компиляция
javac -d "$OUT/classes" "$SRC"/ru/nsu/nexlly/*.java

# Документация
javadoc -d "$OUT/docs" -sourcepath "$SRC" -subpackages ru.nsu.nexlly

# Сборка jar с указанием главного класса
jar cfe "$OUT/libs/heapsort.jar" ru.nsu.nexlly.HeapSort -C "$OUT/classes" .

# Запуск
java -jar "$OUT/libs/heapsort.jar"