Maybe now you can edit this stuff and it will detect changes!

# LabE
Stacks and Queues

This is a starting place for Lab E:

You will modify the standard stack and queue so that they do not allow duplicate items and they provide a method to change the priority of a particular element. Use an array-based implementation of each data structure.

Part A: Stacks (40 points)

Implement a new kind of stack that only accepts a single copy of an object in the stack (i.e., it does not allow duplicates).
If an element is pushed onto the stack, and the element already exists in the stack, the stack will remain unchanged.
Include a method moveToTop that allows you to prioritize an element in the stack.
If invoked with an element currently in the stack, the method moves the element to the top of the stack.
If invoked with an element not in the stack, the method adds the element to the top of the stack (as would normally happen with push).
Your class extends ArrayStack and implements NoDupsPrioritizeStackInterface (provided).
The modified ArrayStack class has protected variables so you can directly access them in NoDupsPrioritizeArrayStack.
In addition to implementing the two new methods moveToTop and display, you must override push so that duplicates are not added.
Part B: Queues (60 points)

Implement a new kind of queue that only accepts a single copy of an object in the queue (i.e., it does not allow duplicates).
If an element is enqueued, and the element already exists in the queue, the queue will remain unchanged.
Include a method moveToBack that allows you to de-prioritize an element in the queue.
If invoked with an element currently in the queue, the method moves the element to the back of the queue .
If invoked with an element not in the queue , the method adds the element to the back of the queue (as would normally happen with enqueue).
Your class should implement NoDupsDePrioritizeQueueInterface (provided).
The modified ArrayQueue class has protected variables so you can directly access them in NoDupsDePrioritizeArrayQueue.
In addition to implementing the two new methods moveToBack and display, you must override enqueue so that duplicates are not added.
Notes for both parts:

Only modify the two new classes- do not change any other classes or interfaces.
Start by reviewing the provided ArrayStack/ArrayQueue classes. 
Make sure you have a strong understanding of how these original classes are implemented.
Both classes use expandable arrays as the underlying data structure.
The ArrayStack class stores the bottom of the stack in the 0 position.
The ArrayQueue class uses a circular array with one unused location. The front index changes with dequeues and the back index changes with enqueues.
For full credit:
Access the underlying array directly. Do not destroy/rebuild the stack/queue each time you need to examine its entries!
Make your solution efficient by considering the front/back/top indexes. Don't examine positions if it's not necessary to do so.
Reuse code when possible.
Think about special cases (like empty and singleton stacks and queues).
I have provided two driver programs to test your code.
You might want to run additional tests to make sure your classes function correctly when the number of elements approaches capacity.
Zip all files together and upload them for submission. Include the driver programs and interface files in your zip file, even though these files were not edited.
