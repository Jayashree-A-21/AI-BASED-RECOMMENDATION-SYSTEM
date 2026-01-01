import java.io.File;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

/*
 * Program Name : RecommendationSystem
 * Description  : Product recommendation system using Apache Mahout
 * Author       : Jayashree A
 */

public class RecommendationSystem {

    public static void main(String[] args) {

        try {
            // Load data model
            DataModel model =
                new FileDataModel(new File("data.csv"));

            // Calculate similarity between users
            UserSimilarity similarity =
                new PearsonCorrelationSimilarity(model);

            // Define neighborhood (top 2 similar users)
            UserNeighborhood neighborhood =
                new NearestNUserNeighborhood(2, similarity, model);

            // Create recommender
            UserBasedRecommender recommender =
                new GenericUserBasedRecommender(model, neighborhood, similarity);

            // Generate recommendations for user ID = 1
            List<RecommendedItem> recommendations =
                recommender.recommend(1, 3);

            System.out.println("Recommended products for User 1:");
            for (RecommendedItem recommendation : recommendations) {
                System.out.println(
                    "Product ID: " + recommendation.getItemID() +
                    " | Predicted Preference: " + recommendation.getValue()
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
