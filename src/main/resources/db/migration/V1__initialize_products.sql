CREATE TABLE IF NOT EXISTS product (
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  name VARCHAR(500) NOT NULL,
  description VARCHAR(1200),
  price DECIMAL(19, 2) NOT NULL,
  image_url VARCHAR(1000),
  category VARCHAR(50),
  producer VARCHAR(255)
);

INSERT INTO product (name, price, description, image_url, category, producer) VALUES 
('Trockenfutter Junior Mini / Medium 8kg mit Huhn und Truthahn', 49.99, 'Das exklusive Trockenfutter für Welpen mit hochwertigen und ursprünglichen Zutaten. PURE INSTINCT verwöhnt Ihren Hund artgemäß und schmackhaft mit Huhn und Truthahn. Für Hunde von 2 bis 12 Monaten.', 'https://shop.zooundco.de/out/pictures/generated/product/1/540_340_75/tml9c4507a26cd054d3be5fea4d894c3_pi_woodlands_12kg.jpg', 'DOG', 'PURE INSTINCT');

INSERT INTO product (name, price, description, image_url, category, producer) VALUES 
('Hund Junior 6x800g Dose mit Kalb und Süßkartoffel', 17.94, 'Glutenfreies Alleinfuttermittel für heranwachsende Hunde. Mit 68% Kalb und wertvollem Leinöl. Unterstützt die Darmflora, sorgt für eine gesunde Haut und glänzendes Fell und optimiert die Zahnpflege Ihres Hundes.', 'https://shop.zooundco.de/out/pictures/generated/product/1/540_340_75/24cb95c3ad3c0ef9e9fae40b9fe21856_majestic_junior_-_kalb__skartoffel_-_800g_186877_sagaflor_ag_web_4056727110115.jpg', 'DOG', 'MAJESTIC');

INSERT INTO product (name, price, description, image_url, category, producer) VALUES 
('feine Kauknochen 2x10cm (120g)', 2.79, 'Die feinen Kauknochen von Lukullus in 3 verschiedenen Sorten sind die schmackhafte Belohnung für Ihren Vierbeiner. Sie pflegen das Zahnfleisch und die Zähne und sorgen für eine lang anhaltende Beschäftigung. Sie bestehen aus den Hauptzutaten schonend luftgetrockneter Rinderhaut und schmackhaftem Fleisch, das in einer Art Sandwich angeordnet ist: ein köstlicher Rinderhautknochen, belegt mit leckerem Fleisch. Eine gleichbleibend hohe Qualität wird durch ständige Kontrollen gewährleistet und resultiert aus der Verwendung qualitativ hochwertiger Zutaten. In dieser Größe eignen sich die Lukullus Kauknochen besonders für mittelgroße Hunde oder für eine kurze Beschäftigung bei größeren Hunden.', 'https://shop-cdn-m.mediazs.com/bilder/5/800/50859_PLA_Lukullus_Feine_Kauknochen_Huhn_2_x_10_cm_5_5.jpg', 'DOG', 'Lukullus');

INSERT INTO product (name, price, description, image_url, category, producer) VALUES 
('Kratzbaum La Digue III', 96.49, 'Standfester Kratzbaum mit bequemer Hängematte, großem Häuschen, weichem Liegeplatz in Pfotenform und hohem Aussichtspunkt mit waschbarem, gepolstertem Kuschelkissen. Maße: H 163 x L 49 x B 49 cm', 'https://shop-cdn-m.mediazs.com/bilder/kratzbaum/la/digue/iii/3/800/69848_la_digue_hellgrau_fg_6768_3.jpg', 'CAT', 'Cat paradise');

INSERT INTO product (name, price, description, image_url, category, producer) VALUES 
('Katzenhaus Madeira', 99.99, 'Outdoor-Katzenhaus aus Holz mit drei separaten Schlafhöhlen, ideale Rückzugsmöglichkeit für Ihren Stubentiger vor Wind, Kälte und Hitze, Tür auf der Rückseite zur einfachen Reinigung.', 'https://shop-cdn-m.mediazs.com/bilder/5/800/51590_PLA_Katzenhaus_Madeira_FG_JN19148_5.jpg', 'CAT', 'Zooplus');

INSERT INTO product (name, price, description, image_url, category, producer) VALUES 
('Dental Care mit Huhn', 34.99, 'Hochwertiges Trockenfutter für ausgewachsene Katzen, mit Huhn, spezielle Form und Textur der Futterkroketten unterstützt die Zahnreinigung bis zum Zahnfleischrand, kann schlechten Atem reduzieren.', 'https://shop-cdn-m.mediazs.com/bilder/6/800/243999_pla_hills_prescriptiondiet_td_dentalcare_katzenfutter_huhn_hs_01_6.jpg', 'CAT', 'Hill''s Prescription Diet');

INSERT INTO product (name, price, description, image_url, category, producer) VALUES 
('Amazone Papagei Mix', 6.99, 'Alleinfutter für südamerikanische Papageien, mit spezieller Saatenmischung, hochwertig und schmackhaft.', 'https://shop-cdn-m.mediazs.com/bilder/1/800/1_106035_pla_verselelaga_prestigeloro_parque_amazone_papageimix_hs_01_1.jpg', 'BIRD', 'Prestige Loro Parque');

INSERT INTO product (name, price, description, image_url, category, producer) VALUES 
('Holz Vogelkäfig Robin XXL', 217.99, 'Großer Holzrahmen Käfig für Kanarien- & andere kleinere Vögel, voll ausgestattet, mit frei positionier- & formbaren zweigähnlichen Stangen, leichte Reinigung, nachhaltig, Gitterabstand: 9,8 mm.', 'https://shop-cdn-m.mediazs.com/bilder/6/800/378898_pla_tiaki_robin_xxl_fg_5644_6.jpg', 'BIRD', 'TIAKI');

INSERT INTO product (name, price, description, image_url, category, producer) VALUES 
('Papageienfreisitz aus Java Holz', 36.00, 'Natürliche Sitzstange für Papageien & andere exotische Vögel, aus hochwertigem Java Kaffeeholz, jedes Teil ein Unikat, mit Metallösen für Snacks oder Spielzeug, große flache Basis, frei aufstellbar.', 'https://shop-cdn-m.mediazs.com/bilder/7/800/378006_pla_tiaki_java_wooden_parrot_stand_fg_0097_7.jpg', 'BIRD', 'TIAKI');

INSERT INTO product (name, price, description, image_url, category, producer) VALUES 
('Badehaus Splash Giant', 26.49, 'Hochwertige Metallverschraubungen machen dieses Badehaus zu einer sicheren Wellnessoase. Das Badehaus Splash Giant ist aus Kunststoff und somit hygienisch und einfach zu reinigen.', 'https://shop-cdn-m.mediazs.com/bilder/2/800/26260_PLA_Savic_Papagaienbad_Splash_Giant_2.jpg', 'BIRD', 'Savic');
