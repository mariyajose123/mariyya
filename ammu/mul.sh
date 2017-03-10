#!/bin/bash
echo "enter a number"
read a
i=1
for  ((i=1;i<=10;i++))
do
c=$((i * a))
echo " $i * $a = $c"
done

