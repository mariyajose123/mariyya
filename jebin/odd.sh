#!/bin/bash
echo "Enter the number"
read n
if [ $n -eq 0 ] 
then
echo "no is 0"
fi
if [ $((n % 2)) -eq 0 ] 
then
echo "$n is even"
else
echo "$n is odd" 
fi
