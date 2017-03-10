#!/bin/bash
echo "Enter two distance in kilometer"
echo "Distance !:"
read n1
echo "Enter Distance 2:"
read n2
tot=$((n1+n2))
met=$((tot*100))
cm=$((met*1000))
fet=$((cm/30))
echo "Distance in Kilometer=$tot"
echo "Distance in meter=$met"
echo "Distance in centimeter=$cm"
echo "Distance in feet=$fet"
