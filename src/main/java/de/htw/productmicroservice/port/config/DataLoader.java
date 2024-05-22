package de.htw.productmicroservice.port.config;

import de.htw.productmicroservice.core.domain.model.Category;
import de.htw.productmicroservice.core.domain.model.Product;
import de.htw.productmicroservice.core.domain.service.interfaces.IProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class DataLoader implements CommandLineRunner {

//    private final IProductRepository productRepository;
//
//    public DataLoader(IProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @Override
    public void run(String... args) throws Exception {
//        log.info("Loading data");
//        List<Product> products = createProducts();
//        productRepository.saveAll(products);
//        log.info("Data loaded");
    }
//
//    private List<Product> createProducts() {
//        List<Product> petShopItems = Arrays.asList(
//                Product.builder()
//                        .name("Trockenfutter Junior Mini / Medium 8kg mit Huhn und Truthahn")
//                        .price(new BigDecimal("49.99"))
//                        .description("Das exklusive Trockenfutter für Welpen mit hochwertigen und ursprünglichen Zutaten. PURE INSTINCT verwöhnt Ihren Hund artgemäß und schmackhaft mit Huhn und Truthahn. Für Hunde von 2 bis 12 Monaten.")
//                        .imageUrl("https://shop.zooundco.de/out/pictures/generated/product/1/540_340_75/tml9c4507a26cd054d3be5fea4d894c3_pi_woodlands_12kg.jpg")
//                        .producer("PURE INSTINCT")
//                        .category(Category.DOG)
//                        .build()
//                ,
//
//                Product.builder()
//                        .name("Hund Junior 6x800g Dose mit Kalb und Süßkartoffel")
//                        .price(new BigDecimal("17.94"))
//                        .description("Glutenfreies Alleinfuttermittel für heranwachsende Hunde. Mit 68% Kalb und wertvollem Leinöl. Unterstützt die Darmflora, sorgt für eine gesunde Haut und glänzendes Fell und optimiert die Zahnpflege Ihres Hundes.")
//                        .imageUrl("https://shop.zooundco.de/out/pictures/generated/product/1/540_340_75/24cb95c3ad3c0ef9e9fae40b9fe21856_majestic_junior_-_kalb__skartoffel_-_800g_186877_sagaflor_ag_web_4056727110115.jpg")
//                        .producer("MAJESTIC")
//                        .category(Category.DOG)
//                        .build()
//                ,
//
//                Product.builder()
//                        .name("feine Kauknochen 2x10cm (120g)")
//                        .price(new BigDecimal("2.79"))
//                        .description("Die feinen Kauknochen von Lukullus in 3 verschiedenen Sorten sind die schmackhafte Belohnung für Ihren Vierbeiner. Sie pflegen das Zahnfleisch und die Zähne und sorgen für eine lang anhaltende Beschäftigung. Sie bestehen aus den Hauptzutaten schonend luftgetrockneter Rinderhaut und schmackhaftem Fleisch, das in einer Art Sandwich angeordnet ist: ein köstlicher Rinderhautknochen, belegt mit leckerem Fleisch. Eine gleichbleibend hohe Qualität wird durch ständige Kontrollen gewährleistet und resultiert aus der Verwendung qualitativ hochwertiger Zutaten. In dieser Größe eignen sich die Lukullus Kauknochen besonders für mittelgroße Hunde oder für eine kurze Beschäftigung bei größeren Hunden.")
//                        .imageUrl("https://shop-cdn-m.mediazs.com/bilder/5/800/50859_PLA_Lukullus_Feine_Kauknochen_Huhn_2_x_10_cm_5_5.jpg")
//                        .producer("Lukullus")
//                        .category(Category.DOG)
//                        .build()
//                ,
//
//                Product.builder()
//                        .name("Kratzbaum La Digue III")
//                        .price(new BigDecimal("96.49"))
//                        .description("Standfester Kratzbaum mit bequemer Hängematte, großem Häuschen, weichem Liegeplatz in Pfotenform und hohem Aussichtspunkt mit waschbarem, gepolstertem Kuschelkissen. Maße: H 163 x L 49 x B 49 cm")
//                        .imageUrl("https://shop-cdn-m.mediazs.com/bilder/kratzbaum/la/digue/iii/3/800/69848_la_digue_hellgrau_fg_6768_3.jpg")
//                        .producer("Cat paradise")
//                        .category(Category.CAT)
//                        .build()
//                ,
//
//                Product.builder()
//                        .name("Katzenhaus Madeira")
//                        .price(new BigDecimal("99.99"))
//                        .description("Outdoor-Katzenhaus aus Holz mit drei separaten Schlafhöhlen, ideale Rückzugsmöglichkeit für Ihren Stubentiger vor Wind, Kälte und Hitze, Tür auf der Rückseite zur einfachen Reinigung.")
//                        .imageUrl("https://shop-cdn-m.mediazs.com/bilder/5/800/51590_PLA_Katzenhaus_Madeira_FG_JN19148_5.jpg")
//                        .producer("Zooplus")
//                        .category(Category.CAT)
//                        .build()
//                ,
//
//                Product.builder()
//                        .name("Dental Care mit Huhn")
//                        .price(new BigDecimal("34.99"))
//                        .description("Hochwertiges Trockenfutter für ausgewachsene Katzen, mit Huhn, spezielle Form und Textur der Futterkroketten unterstützt die Zahnreinigung bis zum Zahnfleischrand, kann schlechten Atem reduzieren.")
//                        .imageUrl("https://shop-cdn-m.mediazs.com/bilder/6/800/243999_pla_hills_prescriptiondiet_td_dentalcare_katzenfutter_huhn_hs_01_6.jpg")
//                        .producer("Hill's Prescription Diet")
//                        .category(Category.CAT)
//                        .build()
//                ,
//
//                Product.builder()
//                        .name("Amazone Papagei Mix")
//                        .price(new BigDecimal("6.99"))
//                        .description("Alleinfutter für südamerikanische Papageien, mit spezieller Saatenmischung, hochwertig und schmackhaft.")
//                        .imageUrl("https://shop-cdn-m.mediazs.com/bilder/1/800/1_106035_pla_verselelaga_prestigeloro_parque_amazone_papageimix_hs_01_1.jpg")
//                        .producer("Prestige Loro Parque")
//                        .category(Category.BIRD)
//                        .build()
//                ,
//
//                Product.builder()
//                        .name("Holz Vogelkäfig Robin XXL")
//                        .price(new BigDecimal("217.99"))
//                        .description("Großer Holzrahmen Käfig für Kanarien- & andere kleinere Vögel, voll ausgestattet, mit frei positionier- & formbaren zweigähnlichen Stangen, leichte Reinigung, nachhaltig, Gitterabstand: 9,8 mm.")
//                        .imageUrl("https://shop-cdn-m.mediazs.com/bilder/6/800/378898_pla_tiaki_robin_xxl_fg_5644_6.jpg")
//                        .producer("TIAKI")
//                        .category(Category.BIRD)
//                        .build()
//                ,
//
//                Product.builder()
//                        .name("Papageienfreisitz aus Java Holz")
//                        .price(new BigDecimal("36.00"))
//                        .description("Natürliche Sitzstange für Papageien & andere exotische Vögel, aus hochwertigem Java Kaffeeholz, jedes Teil ein Unikat, mit Metallösen für Snacks oder Spielzeug, große flache Basis, frei aufstellbar.")
//                        .imageUrl("https://shop-cdn-m.mediazs.com/bilder/7/800/378006_pla_tiaki_java_wooden_parrot_stand_fg_0097_7.jpg")
//                        .producer("TIAKI")
//                        .category(Category.BIRD)
//                        .build()
//                ,
//
//                Product.builder()
//                        .name("Badehaus Splash Giant")
//                        .price(new BigDecimal("26.49"))
//                        .description("Hochwertige Metallverschraubungen machen dieses Badehaus zu einer sicheren Wellnessoase. Das Badehaus Splash Giant ist aus Kunststoff und somit hygienisch und einfach zu reinigen.")
//                        .imageUrl("https://shop-cdn-m.mediazs.com/bilder/2/800/26260_PLA_Savic_Papagaienbad_Splash_Giant_2.jpg")
//                        .producer("Savic")
//                        .category(Category.BIRD)
//                        .build()
//        );
//        return petShopItems;
//    }
}
