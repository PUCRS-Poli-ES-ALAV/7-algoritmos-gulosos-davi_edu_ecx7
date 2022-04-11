from calendar import c
import numpy as np

def Nrainhas(n, size):
    posHistory = list()
    tabuleiro = np.zeros((size,size))

    
    for i in range(0,size):
        for j in range(0,size):
            if tabuleiro[i][j]==0:
                posHistory.append(tabuleiro)
                tabuleiro = insereRainha(i,j,tabuleiro)
                n = n-1
            if n ==0:
                break
        if n ==0:
                break

    return tabuleiro

def insereRainha(row,collum,tabuleiro):
    for i in range(0,len(tabuleiro[row])):
        tabuleiro[row][i]=1
    
    for i in range(0,len(tabuleiro[row])):
        tabuleiro[i][collum]=1
    
    count = 0
    for i in range(row,len(tabuleiro[row])):
        if collum+count < len(tabuleiro[row]):
            tabuleiro[i][collum+count]=1
        if collum-count >= 0:
            tabuleiro[i][collum-count]=1
        count = count +1

    count = row
    for i in range(0,row):
        if collum+count < len(tabuleiro[row]):
            print(collum+count,i)
            tabuleiro[i][collum+count]=1
        if collum-count >= 0:
            tabuleiro[i][collum-count]=1
        count = count -1

    tabuleiro[row][collum] = 5
    return tabuleiro

print(Nrainhas(2,7))
    
