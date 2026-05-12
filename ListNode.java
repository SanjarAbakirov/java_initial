class ListNode {
    int val;        // значение в вагончике (число)
    ListNode next;  // ссылка на следующий вагончик

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


    // 2. Главный класс с методом reverseList и main
    class Main {
        public static ListNode reverseList(ListNode head) {
            ListNode prv = null;
            while (head != null) {
                ListNode nextNode = head.next;
                head.next = prv;
                prv = head;
                head = nextNode;
            }
            return prv;
        }

        // 3. Вспомогательный метод - печатает список на экран
        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val);
                if (current.next != null) {
                    System.out.print(" → ");
                }
                current = current.next;
            }
            System.out.println(" → null");
        }

        static void main(String[] args) {
            ListNode node1 = new ListNode(1);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(3);
            ListNode node4 = new ListNode(4);

            node1.next = node2;  // 1 → 2
            node2.next = node3;  // 2 → 3
            node3.next = node4;  // 3 → 4
            ListNode head = node1;

            System.out.print("Исходный список: ");
            printList(head);
            ListNode reversedHead = reverseList(head);

            System.out.print("Перевернутый список: ");
            printList(reversedHead);
        }
    }