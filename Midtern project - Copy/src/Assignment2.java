import org.w3c.dom.Node;

public class Assignment2 {
    // лишний код, коменыт, поменять местами код
    public static int findMaxArea(int[] array) {
        int contender = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                contender = Math.max(contender, Math.min(array[j], array[i]) * (j - i));
            }
        }
        return contender;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 4, 3};
        int[] array2 = {3, 1, 2, 4, 5};
        System.out.println(findMaxArea(array));
        System.out.println(findMaxArea(array2));
    }


    public void bfs(Node source){
        if(source == null) return;

        Queue<Node> q = new LinkedList<Node>();
        q.add(source);

        while(!q.isEmpty()){
            Node current = q.poll();
            System.out.println(current.val);

            for(Node neighbor: current.neighbors){
                q.add(neighbor);
            }
        }
    }

}