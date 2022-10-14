class Graph:
    def __init__(self,city) -> None:
        self.city=city
        self.adjMatrix=[[0 for i in range(city)] for j in range(city)]
        #Initialize the matrix as zero.
        
    def addEdge(self,v1,v2):
        self.adjMatrix[v1][v2]=1
        self.adjMatrix[v2][v1]=1
        #Undirected Graph Isliye Adding Both Sides.
    def removeEdge(self,v1,v2):
        if self.containsEdge(v1,v2) is False:
            return
        self.adjMatrix[v1][v2]=0
        self.adjMatrix[v2][v1]=0
    
    def containsEdge(self,v1,v2):
         if self.adjMatrix[v1][v2]>0:
             return True
         else:
             return False
    def __str__(self) -> str:
        return str(self.adjMatrix)

g= Graph(5)
g.addEdge(0,1)
g.addEdge(1,3)
g.addEdge(2,4)
g.addEdge(3,3)
print(g)
