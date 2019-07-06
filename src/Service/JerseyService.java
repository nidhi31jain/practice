package Service;

import Model.Jersey;

import java.util.*;

public class JerseyService {

    public static void main(String[] args) {
        Jersey jersey1 = new Jersey(11, "Man United", "L", 100);
        Jersey jersey2 = new Jersey(12, "Westham", "S", 50);
        Jersey jersey3 = new Jersey(22, "Dublin", "L", 250);
        Jersey jersey4 = new Jersey(11, "Man United", "L", 900);
        Jersey jersey5 = new Jersey(20, "London", "L", 2000);
        Jersey jersey6 = new Jersey(15, "USA", "S", 650);

        Map<Integer, Object> objectMap = new HashMap<>();
        objectMap.put(jersey1.getId(), jersey1);
        objectMap.put(jersey2.getId(), jersey2);
        objectMap.put(jersey3.getId(), jersey3);
        objectMap.put(jersey4.getId(), jersey4);
        objectMap.put(jersey5.getId(), jersey5);
        objectMap.put(jersey6.getId(), jersey6);


        System.out.println(objectMap.keySet());

        Set<Integer> keySet = objectMap.keySet();
        Iterator keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            int mapKey = (Integer) keyIterator.next();
            Jersey mapVal = (Jersey) objectMap.get(mapKey);
            System.out.println("Key = " + mapKey + " Value is = " + mapVal.getClub());
        }


        ArrayList<Jersey> list = new ArrayList<>();
        list.add(jersey1);
        list.add(jersey2);
        list.add(jersey3);
        list.add(jersey4);
        list.add(jersey5);
        list.add(jersey6);

        Set<Jersey> jerseySet = new HashSet<>();
        Iterator<Jersey> iterator = list.iterator();
        while (iterator.hasNext()) {
            jerseySet.add(iterator.next());
        }
        System.out.println("Size of list is :" + list.size());
        System.out.println("Size of set is : " + jerseySet.size());

        Iterator<Jersey> iteratorSet = jerseySet.iterator();
        while (iteratorSet.hasNext()) {
            System.out.println(iteratorSet.next().getId());
        }


        Comparator<Jersey> jerseyComparator = new Comparator<Jersey>() {
            @Override
            public int compare(Jersey o1, Jersey o2) {
                if (o1.getCut() > o2.getCut()) {
                    return -1;
                } else {
                    return 1;
                }

            }

        };
        Collections.sort(list,jerseyComparator);
        System.out.println(list);

    }

}