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


//        Parts

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
            alternator.setCompanyName("Carquest");
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
            battery.setCompanyName("DieHard");
            outsourcedPartRepository.save(battery);




            //created serpentine object

            OutsourcedPart serpentine= new OutsourcedPart();
            serpentine.setId(7);
            serpentine.setImagePath("belt.jpg");
            serpentine.setName("Dayco Poly Rib Belt Serpentine Belt");
            serpentine.setPrice(49.99);
            serpentine.setInv(20);
            serpentine.setMinInv(1);
            serpentine.setMaxInv(30);
            serpentine.setCompanyName("Dayco");
            outsourcedPartRepository.save(serpentine);


            //created fuelPump object

            OutsourcedPart fuelPump= new OutsourcedPart();
            fuelPump.setId(8);
            fuelPump.setImagePath("fuelPump.jpg");
            fuelPump.setName("Carquest Premium Mechanical Fuel Pump");
            fuelPump.setPrice(26.99);
            fuelPump.setInv(50);
            fuelPump.setMinInv(10);
            fuelPump.setMaxInv(90);
            fuelPump.setCompanyName("Carquest");
            outsourcedPartRepository.save(fuelPump);



            //created wipers object

            OutsourcedPart wipers= new OutsourcedPart();
            wipers.setId(10);
            wipers.setImagePath("wipers.jpg");
            wipers.setName("Rain-X Vision Wiper Blade: 24\", Standard Beam, All Weather Performance, Pack of 1");
            wipers.setPrice(22.99);
            wipers.setInv(50);
            wipers.setMinInv(1);
            wipers.setMaxInv(100);
            wipers.setCompanyName("Rain-X Vision");
            outsourcedPartRepository.save(wipers);


            //created oilFilter object

            OutsourcedPart oilFilter= new OutsourcedPart();
            oilFilter.setId(9);
            oilFilter.setImagePath("oilFilter.jpg");
            oilFilter.setName("Carquest Premium Oil Filter");
            oilFilter.setPrice(9.99);
            oilFilter.setInv(80);
            oilFilter.setMinInv(5);
            oilFilter.setMaxInv(100);
            oilFilter.setCompanyName("Carquest");
            outsourcedPartRepository.save(oilFilter);

        }

        if(inhousePartRepository.count() == 0) {


            //created engine object

            InhousePart engine = new InhousePart();
            engine.setId(2);
            engine.setImagePath("engine.jpg");
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




//        Products

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
            wd40.setId(5);
            wd40.setImagePath("wd.jpg");
            wd40.setName("WD-40 Multi-Purpose Lubricant Spray - Smart Straw, 12 oz.");
            wd40.setPrice(11.99);
            wd40.setInv(30);
            wd40.setMinInv(1);
            wd40.setMaxInv(60);
            productRepository.save(wd40);


            //created Coolant object

            Product coolant = new Product();
            coolant.setId(6);
            coolant.setImagePath("coolant.jpg");
            coolant.setName("Arctic Freeze Synthetic R-134a Refrigerant Kit: Includes Hose with Gauge, Seals & Delivers Colder Air");
            coolant.setPrice(47.99);
            coolant.setInv(10);
            coolant.setMinInv(1);
            coolant.setMaxInv(70);
            productRepository.save(coolant);


            //created transfluid object

            Product transfluid = new Product();
            transfluid.setId(7);
            transfluid.setImagePath("transfluid.jpg");
            transfluid.setName("Valvoline MaxLife Multi-Vehicle Automatic Transmission Fluid, 1 Gallon");
            transfluid.setPrice(36.99);
            transfluid.setInv(20);
            transfluid.setMinInv(1);
            transfluid.setMaxInv(75);
            productRepository.save(transfluid);


            //created powerSteering object
            Product powerSteering = new Product();
            powerSteering.setId(8);
            powerSteering.setImagePath("powersteering.jpg");
            powerSteering.setName("Prestone MAX Power Steering Fluid");
            powerSteering.setPrice(14.99);
            powerSteering.setInv(35);
            powerSteering.setMinInv(8);
            powerSteering.setMaxInv(95);
            productRepository.save(powerSteering);

            //created funnel object
            Product funnel = new Product();
            funnel.setId(9);
            funnel.setImagePath("funnel.jpg");
            funnel.setName("Performance Tool Clear View Long Reach Funnel, 1/2 Pint");
            funnel.setPrice(2.99);
            funnel.setInv(35);
            funnel.setMinInv(23);
            funnel.setMaxInv(100);
            productRepository.save(funnel);

            //created tirePump object
            Product tirePump = new Product();
            tirePump.setId(10);
            tirePump.setImagePath("powersteering.jpg");
            tirePump.setName("Slime 12V Tire Inflator: 8 Min Inflation, 0-100 PSI Dial Gauge");
            tirePump.setPrice(34.99);
            tirePump.setInv(57);
            tirePump.setMinInv(13);
            tirePump.setMaxInv(105);
            productRepository.save(tirePump);


            //created toolSet object
            Product toolSet = new Product();
            toolSet.setId(10);
            toolSet.setImagePath("toolSet.jpg");
            toolSet.setName("DieHard 1/4, 3/8 and 1/2 Drive Tool Set, SAE & Metric, 118-Piece, 90 Tooth");
            toolSet.setPrice(121.99);
            toolSet.setInv(44);
            toolSet.setMinInv(11);
            toolSet.setMaxInv(70);
            productRepository.save(toolSet);





            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());

        }
    }
}

