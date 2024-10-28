class Node:
    def __init__(self, data):
        self.data = data
        self.next = None 

class LinkedList:  # Changed class name to LinkedList for consistency
    def __init__(self):
        self.head = None 

    # INSERT A NEW NODE AT THE END OF THE LIST 
    def insert_at_end(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        last_node = self.head 
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node

    # DELETE A NODE BY VALUE
    def delete_by_value(self, data):
        if not self.head:
            print("List is empty.")
            return
        if self.head.data == data: 
            self.head = self.head.next
            return
        current_node = self.head
        while current_node.next and current_node.next.data != data:
            current_node = current_node.next
        if current_node.next is None:
            print(f"Node with value '{data}' not found.")
        else:
            current_node.next = current_node.next.next

    # PRINT THE LINKED LIST
    def print_list(self):
        current_node = self.head 
        while current_node:
            print(current_node.data, end=" -> ")
            current_node = current_node.next
        print("None")  

    # GET THE LENGTH OF THE LINKED LIST
    def get_length(self):
        current_node = self.head 
        count = 0
        while current_node:
            count += 1
            current_node = current_node.next
        return count 

# EXAMPLE USAGE OF THE LINKEDLIST CLASS
linked_list = LinkedList()  # Create an instance of LinkedList
linked_list.insert_at_end("Node 1")
linked_list.insert_at_end("Node 2")
linked_list.insert_at_end("Node 3")

# PRINT THE LIST 
print("Initial list:")
linked_list.print_list()

# DELETE A NODE BY VALUE
linked_list.delete_by_value("Node 2")
    
# PRINT THE LIST AFTER DELETION
print("After deleting 'Node 2':")    
linked_list.print_list()

# GET THE LENGTH OF THE LIST
print("Length of the list:", linked_list.get_length())
