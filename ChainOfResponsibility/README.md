This pattern sends data to an object and if that object can't use, it
sends it to any number of other objects that may be able to use it.

The chain of responsibility design pattern allows us to design an 
effective and loosely coupled approval flow. Chain of responsibility
pattern is best understood through an example. As a company 
employee, you need to request an advance from the company. 
You request around 10,000 $ and this request enters an approval 
flow. While your manager handles requests up to 2000 $, 
the amounts above go to the group manager. While the group manager 
can handle requests up to 5000 $, requests above that go to the 
director for approval, and the director approves it if he finds it 
appropriate. If you try to code such approval flow, especially 
approvers, with if else blocks, you get a tightly coupled system 
that is completely closed to change, and you may need to make code 
changes when a new approver needs to be included in the system or 
when the order of approvers needs to change. We can code such 
approval flow cases effectively with chain of responsilibilty 
pattern.