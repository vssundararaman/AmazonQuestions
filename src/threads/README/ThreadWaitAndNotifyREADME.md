**Thread Communication Using Wait and Notify in Java**

In java, threads can communicate to each other in many ways. One of the way is using wait and notify. 
wait() and notify() belongs to Object class in java. In our example we have a producer thread and second is consumer thread. 
Producer is adding element in a list and this value is being fetched by consumer. 
Here communication means producer will not add next element until consumer will fetch that. 
To achieve it producer will add the element in the list and will call wait() method. 
It stops executing and releases the lock on calling object. Now consumer starts executing and removes the value from the list. 
It notifies the producer and then goes into waiting state releasing the lock on calling object.

Output:

    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A
    Producer Added A
    Consumer Consumes A