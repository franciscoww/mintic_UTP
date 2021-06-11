dict = {5: 60, 6: 71, 7: 54, 8: 77, 9: 58, 10: 40, 11: 41, 12: 57, 13: 66, 14: 49, 15: 64, 16: 43, 17: 24, 18: 36, 19: 55, 20: 36, 21: 57, 22: 26, 23: 84}
 
clave_mayor = max(dict.values())
print(clave_mayor)
 
print ("Clave con mayor valor:  y su valor %s" % (clave_mayor, dict.get(clave_mayor)))