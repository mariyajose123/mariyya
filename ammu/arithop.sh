#!/bin/bash
echo  "Enter two number "
read a b
echo  " 1.Add  	2.Sub 	3.Mul 	4.Div 	5.Exit "
read n
case $n in
1) expr "$c Sum = $((a+b))" ;;
2) expr  "$c Diff = $((a-b))" ;;
3) expr  "$c Mul = $((a*b))" ;;
4) expr  "$c Div = $((a/b))" ;;
5) exit
esac
echo $c
