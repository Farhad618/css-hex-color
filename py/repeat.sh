a=0
# -lt is less than operator

#Iterate the loop until a less than 10
while [ $a -lt 100 ]
do
	# Print the values
	echo $a
	
	python main1.py
	sleep 5

	# increment the value
	a=`expr $a + 1`
done
