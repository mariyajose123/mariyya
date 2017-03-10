#!/bin/bash
echo " Arithmetic Operations "
echo " Enter Two Numbers "
read a,b
echo " Enter Your Choice "
read n
case $n in
1)  $c=$(a+b) 
echo " $c "
;;
esac
