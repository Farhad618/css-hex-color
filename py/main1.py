f = open("full.html", "a")
o = open("only-hex.txt", "a")
l = open("last-hex.txt", "r")

r = int(l.read())


for x in range(r, r+4096):
	if x > 16777216:
		print("end")
		break
	hexnum = format(x, 'X')
	f.write("<div style='background-color:#"+hexnum.rjust(6, "0")+";'>&nbsp;</div>\n")
	o.write(hexnum.rjust(6, "0")+"\n")

# print(x)

l = open("last-hex.txt", "w")
l.write(str(x+1))



f.close()
o.close()
l.close()