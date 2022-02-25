import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int N = sc.nextInt(); //문서의 개수
            int M = sc.nextInt(); //찾고자 하는 문서는 M번째에 놓여져있다.
            List<Docs> list = new LinkedList<>();
            Integer[] priorities = new Integer[N]; //문서의 우선순위를 저장할 배열

            for (int i = 0; i < N; i++) {
                int priority = sc.nextInt();
                list.add(new Docs(i,priority));
                priorities[i] = priority;
            }

            //우선순위의 내림차순으로 정렬 =>우선순위가 높은것부터므로 4,3,2,1
            List<Integer> tempList = Arrays.asList(priorities);
            Collections.sort(tempList, Comparator.reverseOrder());
            priorities = tempList.toArray(priorities);

            int res = 1;

        here: for (int i = 0; i < priorities.length ; i++) {
                for (int j = 0; j < N ; j++) {

                    //현재 우선순위와 현재 가장 앞의 원소의 우선순위가 같고, 그게 우리가 찾는 M번쨰이면 출력하고 바깥 for문 빠져나가기
                    if(priorities[i] == list.get(0).priority && list.get(0).pos == M){
                        System.out.println(res);
                        break here;
                    }

                    //현재 우선순위와 현재 가장 앞의 원소의 우선순위가 다르면 맨 뒤로 보내버리기
                    if(priorities[i] != list.get(0).priority){
                        list.add(new Docs(list.get(0).pos,list.get(0).priority)); //맨 뒤로 넣고
                        list.remove(0); //원래 맨 앞에 있던건 없애기
                    }
                    //현재 우선순위와 현재 가장 앞의 원소의 우선순위가 같으면 카운트를 하나 올리고 제거하기
                    else if(priorities[i] == list.get(0).priority){
                        res++;
                        list.remove(0);
                        break;
                    }
                }
            }
        }
    }

    private static class Docs{
        int pos; //위치
        int priority; //중요도

        public Docs(int pos, int priority) {
            this.pos = pos;
            this.priority = priority;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }
    }
}