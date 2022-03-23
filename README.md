# Task Title: Stack

# Task Description: 
Let’s create a Stack. A Stack is a common data structure to store objects in the LIFO
principle (Last In – First Out). This means that the last object you push on the Stack is
the one to be removed first.

![image](https://user-images.githubusercontent.com/47972946/159762404-69fd41e5-573b-4c47-add8-f127b14e8f0d.png)


Our Stack should use generics, so it can be created like this:

Stack<String> stringStack = new Stack<String>();

• Create a generic class Stack with type T. This class has a private ArrayList<T>
attribute. Initialise this attribute within the constructor.

Implement the following generic methods:

• the push method puts an object (parameter) on top of our Stack. Internally this
means that we will put this object into our ArrayList at the last position

• the pop method removes the topmost object from our Stack. To do that we
remove the last object from our ArrayList and return it.

• The peak method return a reference to the topmost element, but this object
remains on the Stack

And the following method:

• The size method returns the number of elements on our Stack
