# DSA_Practice Questions
**Question 1**

There are total n number of Monkeys sitting on the branches of a huge Tree. As travelers offer Bananas and Peanuts,
the Monkeys jump down the Tree. If every Monkey can eat k Bananas and j Peanuts. If total m number of Bananas and p 
number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to 
eat.

At a time one Monkeys gets down and finishes eating and go to the other side of the road. The Monkey who climbed down 
does not climb up again after eating until the other Monkeys finish eating.
Monkey can either eat k Bananas or j Peanuts. If for last Monkey there are less than k Bananas left on the ground or 
less than j Peanuts left on the ground, only that Monkey can eat Bananas(<k) along with the Peanuts(<j).
Where, n= Total no of Monkeys
k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
m = Total number of Bananas
p  = Total number of Peanuts

Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero

Example 1:

Input Values    
20
2
3
12
12


Output Values

Number of  Monkeys left on the tree:10

Note: Kindly follow  the order of inputs as n,k,j,m,p as given in the above example. 
And output must include  the same format  as in above example(Number of Monkeys left on the Tree:)

For any wrong input display INVALID INPUT

**Question 2**

A railway authority is planning to lay railway tracks to connect N cities. Each possible track between two cities has a
certain cost of construction. The goal is to connect all the cities with the minimum total cost, without forming any 
circular routes (cycles).

You are hired as a software engineer to help simulate the minimum cost to connect all cities using railway tracks.
Use Prim's Algorithm to determine the Minimum Spanning Tree (MST) and print the total cost along with the selected
 connections.

Input:

Cities: A, B, C, D, E

Available Tracks and Costs:

A-B: 2
A-C: 3
B-C: 1
B-D: 4
C-D: 5
C-E: 6
D-E: 7

Output :

Selected Edges in MST:

B - C with cost 1
A - B with cost 2
B - D with cost 4
C - E with cost 6

Total Minimum Cost: 13


**Question 3**

You are working as a network administrator for a company. The company has several computers (nodes) 
connected via network cables (edges). The connections are bidirectional, and not all computers are directly 
connected to each other.

Sometimes, when a computer sends a broadcast message, it should reach all other computers in the network
in the shortest number of hops (i.e., fewest intermediate computers). You are tasked to simulate this broadcast 
operation using Breadth-First Search (BFS).

Your goal is to write a function that:

Traverses the network from a given source computer

Returns the order in which the computers receive the broadcast message

Assumes each edge takes equal time to traverse	

Test Case 1 – Small Office Network

Computers: [A,B,C,D] 

Connections:

A - B
A - C
B - D

Start: A

Expected Output:

Broadcast Order: A, B, C, D

Test Case 2 – Medium Network

Computers: [P, Q, R, S, T, U]

Connections:

P - Q
P - R
Q - S
R - T
T - U

Start: P

Output :

Broadcast Order: P, Q, R, S, T, U

**Question 4**

You are working as a network engineer responsible for ensuring that all parts of a company's internal computer network are properly connected.

The network consists of several computers (nodes) connected by network cables (edges with weights representing latency). However, due to missing or faulty cables, some computers might be disconnected from others, forming separate components.

You are tasked to:

Apply Prim’s Algorithm starting from any computer in a component.

Continue running Prim's on unvisited components to ensure all parts are checked.

Detect and report all disconnected components in the network.

For each connected component, return:

Its Minimum Spanning Tree (MST)

The total cost (latency)

Input Format:
List of computers (nodes): ["A", "B", "C", "D", "E", "F"]

List of weighted connections: [("A", "B", 3), ("A", "C", 1), ...]

Graph is undirected and weighted

 Output Format:
For each disconnected component:

List of edges in MST with weights

Total cost of that MST

Test Case 1 – Fully Connected Network

Computers: [A, B, C, D]
Connections:
A - B (1)
A - C (2)
B - C (2)
C - D (3)


Expected Output:

Component 1:
MST Edges: A-B(1), A-C(2), C-D(3)
Total Cost: 6


 Test Case 2 – Disconnected Network

Computers: [P, Q, R, S, T, U]
Connections:
P - Q (4)
Q - R (1)
S - T (3)
T - U (2)

Component 1:
MST Edges: Q-R(1), P-Q(4)
Total Cost: 5

Component 2:
MST Edges: T-U(2), S-T(3)
Total Cost: 5

**Question 5**

The Indian Railway Network is planning to lay down new train tracks between cities to form a minimum cost railway network that connects all the cities directly or indirectly, avoiding any circular connections (i.e., loops).

You are given a list of cities, and the cost to build a train track between each pair of cities.

As a railway planner, your job is to select the train tracks to be laid down so that:

All cities are connected (directly or indirectly)

The total cost is minimum

No circular paths (i.e., no cycle) should be formed

Use Kruskal's Algorithm to find the Minimum Spanning Tree (MST) and print the selected tracks and total cost.

Test Case 01 :

Cities = [A, B, C, D]
Tracks and Costs:
A-B = 1
A-C = 3
B-C = 2
B-D = 4
C-D = 5

Selected Tracks in MST:

A-B (1)
B-C (2)
B-D (4)

Total Minimum Cost = 7

Test Case 02 :

Cities = [P, Q, R, S, T]


Tracks and Costs:

P-Q = 6
P-R = 1
Q-R = 5
Q-S = 3
R-S = 5
S-T = 2
R-T = 4

Selected Tracks in MST:

P-R (1)
S-T (2)
Q-S (3)
R-T (4)

Total Minimum Cost = 10
