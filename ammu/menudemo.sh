ch=`y`
echo menudriven
while test ch=`y`
do
echo 1.list of all files
echo 2.present working directory
echo 3.current user
echo 4.list .c files
echo 5.list of output of whos
echo 6.print lines starting with uppercase
echo 7.contents of /etc/passwds
echo 8.exit
echo enter choice
read opt
case $opt in
1)ls;;
2)pwd;;
3)logname;;
4)ls *.c;;
5)who | more ;;
6)echo Enter file
read f
cat $f | grep [A-Z] ;;
7)cat /etc/passwd ;;
8)exit ;;
esac
echo "Do u want to continue(y/n)"
read ch
done
