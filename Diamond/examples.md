```
A
```

```
_A_
B_B
_A_
```


```
__A__
_B_B_
C_3_C
_B_B_
__A__
```

index (i)  
Letters (l) = 3  
padding (p) = 3 = l



```
___A___
__B_B__
_C_3_C_
D__5__D
_C_3_C_
__B_B__
___A___
```
index (i)  
Letters (l) = 4  
padding (p) = 5 = l+1  

```
____A____
___B_B___
__C_3_C__
_D__5__D_
E___7___E
_D__5__D_
__C_3_C__
___B_B___
____A____
```
index (i)  
Letters (l) = 5  
padding (p) = 7 = L+2  
padding side (ps) = l-i-1   
padding middle (pm) = p-(ps*2)   


```
     A     
    B B    
   C   C   
  D     D  
 E       E 
F    9    F
 E       E 
  D     D  
   C   C   
    B B    
     A     

```
index (i)  
Letters (l) = 6  
padding (p) = 9 = L+3  
padding side (ps) = l-i-1   
padding middle (pm) = p-(ps*2)


```
                 l   p (diff)
       A         1 = 0 (-1)
      B B        2 = 1 (-1)
     C   C       3 = 3 (0)
    D     D      4 = 5 (1)
   E       E     5 = 7 (2) 
  F    9    F    6 = 9 (3)
 G     11    G   7 = 11 (4)
H      13     H  8 = 13 (5)
```
