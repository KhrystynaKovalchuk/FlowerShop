import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<FlowerBucket> flowerBucketList = new ArrayList<>();

    public void addBucketToStore(FlowerBucket flowerBucket) {
        flowerBucketList.add(flowerBucket);
    }

    public int search(FlowerType flowerType) {
        int counter = 0;
        for (FlowerBucket flowerBucket : flowerBucketList) {
            for (int i = 0; i < flowerBucket.flowerPackList.size(); i++) {
                if (flowerBucket.flowerPackList.get(i).getFlower().getFlowerType() == flowerType) {
                    counter += 1;
                }
            }
        }
        return counter;
    }
}






//        for (int i=0; i<bucket.flowerPackList.size(); i++){
//            if(bucket.flowerPackList.get(i).getFlower() == flower_search){
//                return true;
//            }
//            }
//        }
//    }
//}
