#!/bin/bash
echo "Enter the year"
read y
if [ $y  -eq 0 ] 
then
y=$(date |cut  -f6 -d " ")
echo "year:$y"
fi
if [ $(( y%400 )) -eq 0 ] 
then
if [ $(( y%100 )) -eq 0 ]
 then
echo "leapyear"
fi
fi
if [ $((y%4 )) -eq 0 ]
then
echo "$y is leapyear"
else
echo "$y is not leapyear" 
fi
