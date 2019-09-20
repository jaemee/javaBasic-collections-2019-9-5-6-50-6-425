# Questions:

1. What is the knowledge point of the test? Where is the offical document to the knowledge point?
2. Why the test failed at first?
3. Why you corrected the test that way?
4. Do you have further questions on this knowledge point?

## CollectionsTest
### should_go_through_an_iterator
1. To be able to use iterator.
2. No error. Changed the test before running.
3. Changed the test with iterator default syntax
4. None.

### should_create_a_sequence_without_putting_all_items_into_memory
1. To create own iterator method based in the logic of real Iterator
2. Error encountered during first and following code changes due to wrong method call
3. I pass the value to the class called by the public class that extends iterator then added 1 to value everytime the class is called 
   because iterator is used by using hasNext and next so values need to have addition everytime.
4. None.

### should_predict_linked_list_operation_result
1. To learn different operations of linked list.
2. No error. Changed the test before running.
3. I changed that way because since we get the next item and insert a new item, we then proceed with the next item in the list and remove the previous 
   therefore we just removed the value we added and retained the original value of the list.
4. None.

### should_reflects_back_to_original_list_for_sub_range
1. To learn the usage or sublist and how to modify List by using subrange
2. No error. Changed the test before running.
3. Because as per code we remove the value of index 3 to 10 from the list that  means in a list of 0 to 12 we removed the 4th number to the 10th,
since index count starts at 0 .
4. None.

### should_generate_distinct_sequence_on_the_fly
1. To create own distinct iterator.
2. Exception encountered while running the test because my first code change can't handle the loop and cause OutOfMemoryException
3. I changed the code that way because at first I tried to modify the next() method like in Sequence class but in this case since need to check all value and cannot return null 
value from next() then I put  the validation in hasNext() 
4. None. 

## ArrayTest
### should_resize_array
1. To modify and update array.
2. Encountered error, tried to run the test to check the process. Caught an exception on the default throws.
3. Changed the test that way to get the expected result while modifying and updating the array inside the method with own version of pop and push from the original logic of the method itself.
4. None.