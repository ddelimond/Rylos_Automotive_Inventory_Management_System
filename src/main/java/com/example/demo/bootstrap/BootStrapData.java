package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart part : outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }


        if(outsourcedPartRepository.count() == 0) {

//created alternator object
            OutsourcedPart alternator = new OutsourcedPart();
            alternator.setId(1);
            alternator.setImagePath("alternator.jpg");
            alternator.setName("Carquest Premium Alternator");
            alternator.setPrice(197.99);
            alternator.setInv(30);
            alternator.setMinInv(1);
            alternator.setMaxInv(50);
            outsourcedPartRepository.save(alternator);


            //created battery object

            OutsourcedPart battery = new OutsourcedPart();
            battery.setId(3);
            battery.setImagePath("battery.jpg");
            battery.setName("DieHard Gold Battery: 35 Group Size, 3 Year Warranty");
            battery.setPrice(229.99);
            battery.setInv(12);
            battery.setMinInv(1);
            battery.setMaxInv(50);
            outsourcedPartRepository.save(battery);
        }

        if(inhousePartRepository.count() == 0) {


            //created engine object

            InhousePart engine = new InhousePart();
            engine.setId(2);
            engine.setImagePath("engine.webp");
            engine.setName("Rylo's Premium Drive Train Engine Assembly");
            engine.setPrice(3429.99);
            engine.setInv(19);
            engine.setMinInv(1);
            engine.setMaxInv(50);
            inhousePartRepository.save(engine);

            //created brakes object

            InhousePart brakes = new InhousePart();
            brakes.setId(4);
            brakes.setImagePath("frontBrakes.jpg");
            brakes.setName("Rylo's Standard Brake Pads: Ceramic");
            brakes.setPrice(54.99);
            brakes.setInv(27);
            brakes.setMinInv(1);
            brakes.setMaxInv(50);

            inhousePartRepository.save(brakes);

            //created transmission object

            InhousePart transmission = new InhousePart();
            transmission.setId(5);
            transmission.setImagePath("transmission.jpg");
            transmission.setName("Rylo's Spartan Automatic Transmission Assembly; ");
            transmission.setPrice(2999.99);
            transmission.setInv(30);
            transmission.setMinInv(1);
            transmission.setMaxInv(50);
            inhousePartRepository.save(transmission);
        }

        if (productRepository.count() == 0) {

        //created gasCan object
        Product gasCan = new Product();
        gasCan.setId(1);
        gasCan.setImagePath("gascan.jpg");
        gasCan.setName("Midwest Can 5 Gallon Auto Shut Off Gasoline Can");
        gasCan.setPrice(28.99);
        gasCan.setInv(20);
        gasCan.setMinInv(1);
        gasCan.setMaxInv(60);
        productRepository.save(gasCan);


        //created cables object

            Product cables = new Product();
            cables.setId(2);
            cables.setImagePath("jumperCables.jpg");
            cables.setName("Solar JUMP-N-CARRY 12V Professional Jump Starter, 1700 Peak Amps");
            cables.setPrice(189.99);
            cables.setInv(23);
            cables.setMinInv(1);
            cables.setMaxInv(60);
            productRepository.save(cables);


            //created engineChecker object

            Product engineChecker = new Product();
            engineChecker.setId(3);
            engineChecker.setImagePath("engineChecker.jpg");
            engineChecker.setName("Innova CarScan Code Scanner: Live Data, Battery/Charging System Test, Free Fix & Part Recommendations");
            engineChecker.setPrice(94.99);
            engineChecker.setInv(18);
            engineChecker.setMinInv(1);
            engineChecker.setMaxInv(60);
            productRepository.save(engineChecker);


            //created conventional oil object

            Product oil = new Product();
            oil.setId(4);
            oil.setImagePath("conventional.jpg");
            oil.setName("Valvoline Daily Protection Conventional SAE 40 Motor Oil: Maximizes Engine Life, 1 Quart");
            oil.setPrice(8.99);
            oil.setInv(30);
            oil.setMinInv(1);
            oil.setMaxInv(60);
            productRepository.save(oil);

            //created WD-40 object

            Product wd40 = new Product();
            wd40.setImagePath("wd.jpg");
            wd40.setName("WD-40 Multi-Purpose Lubricant Spray - Smart Straw, 12 oz.");
            wd40.setPrice(11.99);
            wd40.setInv(30);
            wd40.setMinInv(1);
            wd40.setMaxInv(60);
            productRepository.save(wd40);

            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());

        }
    }
}

