echo Area of rectangle
if test  $# -eq 0
then 
echo Not enough parametre
else
ar=`expr $1 \* $2`
echo area=$ar
fi
