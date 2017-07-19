package rc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Александр on 19.07.2017.
 */

@Component
public class DbSeeder implements CommandLineRunner { // executed when springboot starts

    @Override
    public void run(String... strings) throws Exception {
        
        Hotel marriot = new Hotel(
                "Marriot",
                130,
                new Address(
                        "Paris",
                        "France"
                ),
                Arrays.asList(
                        new Review(
                                "John",
                                8,
                                false
                        ),
                        new Review(
                                "Mary",
                                7,
                                true
                        )
                )
        );

        Hotel ibis = new Hotel(
                "Ibis",
                90,
                new Address(
                        "Bucharest",
                        "Romania"
                ),
                Arrays.asList(
                        new Review(
                                "Teddy",
                                9,
                                true
                        )
                )
        );

        Hotel sofitel = new Hotel(
                "Sofitel",
                200,
                new Address(
                        "Rome",
                        "Italy"
                ),
                new ArrayList<>()
        );

    }
}
