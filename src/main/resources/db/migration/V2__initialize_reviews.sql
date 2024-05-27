CREATE TABLE IF NOT EXISTS review (
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  author VARCHAR(255) NOT NULL,
  content TEXT NOT NULL,
  rating INT NOT NULL CHECK (rating BETWEEN 1 AND 5),
  title VARCHAR(255) NOT NULL,
  date TIMESTAMP NOT NULL,
  product_id UUID NOT NULL,
  FOREIGN KEY (product_id) REFERENCES product(id)
);

DO $$
DECLARE
  product_id UUID;
BEGIN
  SELECT id INTO product_id FROM product WHERE name = 'Trockenfutter Junior Mini / Medium 8kg mit Huhn und Truthahn';
  INSERT INTO review (author, content, rating, title, date, product_id) VALUES
  ('Max Mustermann', 'Mein Welpe liebt dieses Futter! Es ist hochwertig und gut bekömmlich.', 5, 'Tolles Welpenfutter', '2024-05-01 10:00:00', product_id),
  ('Anna Müller', 'Gute Zutaten und mein Hund verträgt es sehr gut.', 4, 'Gutes Futter', '2024-05-03 12:30:00', product_id);
END $$;

DO $$
DECLARE
  product_id UUID;
BEGIN
  SELECT id INTO product_id FROM product WHERE name = 'Hund Junior 6x800g Dose mit Kalb und Süßkartoffel';
  INSERT INTO review (author, content, rating, title, date, product_id) VALUES
  ('Hans Schmidt', 'Mein Hund liebt es. Gute Qualität!', 5, 'Hochwertig', '2024-05-10 14:15:00', product_id),
  ('Petra Klein', 'Super Futter, aber etwas teuer.', 4, 'Gut, aber teuer', '2024-05-11 09:45:00', product_id);
END $$;

DO $$
DECLARE
  product_id UUID;
BEGIN
  SELECT id INTO product_id FROM product WHERE name = 'feine Kauknochen 2x10cm (120g)';
  INSERT INTO review (author, content, rating, title, date, product_id) VALUES
  ('Lisa Hoffmann', 'Mein Hund liebt diese Kauknochen. Sie sind perfekt für zwischendurch.', 5, 'Perfekt für zwischendurch', '2024-05-20 17:30:00', product_id),
  ('Karl Bauer', 'Gute Qualität und langlebig.', 4, 'Gute Kauknochen', '2024-05-21 08:20:00', product_id),
  ('Sabine Fischer', 'Mein Hund ist begeistert, aber sie riechen etwas streng.', 3, 'Gut, aber riecht', '2024-05-22 19:10:00', product_id);
END $$;

DO $$
DECLARE
  product_id UUID;
BEGIN
  SELECT id INTO product_id FROM product WHERE name = 'Kratzbaum La Digue III';
  INSERT INTO review (author, content, rating, title, date, product_id) VALUES
  ('Claudia Weber', 'Meine Katzen lieben diesen Kratzbaum. Stabil und schön.', 5, 'Stabil und schön', '2024-05-05 11:00:00', product_id),
  ('Michael Wolf', 'Guter Kratzbaum, aber die Montage war etwas schwierig.', 4, 'Guter Kratzbaum', '2024-05-06 15:45:00', product_id),
  ('Monika Neumann', 'Schön und stabil, aber etwas teuer.', 4, 'Schön, aber teuer', '2024-05-07 13:30:00', product_id);
END $$;

DO $$
DECLARE
  product_id UUID;
BEGIN
  SELECT id INTO product_id FROM product WHERE name = 'Katzenhaus Madeira';
  INSERT INTO review (author, content, rating, title, date, product_id) VALUES
  ('Thomas Krause', 'Perfekt für draußen. Unsere Katze liebt es.', 5, 'Perfekt für draußen', '2024-05-08 16:25:00', product_id),
  ('Sarah Becker', 'Gute Qualität, aber die Türen sind etwas klein.', 4, 'Gute Qualität', '2024-05-09 18:40:00', product_id);
END $$;

DO $$
DECLARE
  product_id UUID;
BEGIN
  SELECT id INTO product_id FROM product WHERE name = 'Dental Care mit Huhn';
  INSERT INTO review (author, content, rating, title, date, product_id) VALUES
  ('Stefan Richter', 'Meine Katze hat weniger Zahnstein. Empfehlenswert.', 5, 'Weniger Zahnstein', '2024-05-15 20:00:00', product_id),
  ('Katrin Wagner', 'Gutes Futter, aber meine Katze mag es nicht so sehr.', 3, 'Gutes Futter', '2024-05-16 07:50:00', product_id);
END $$;

DO $$
DECLARE
  product_id UUID;
BEGIN
  SELECT id INTO product_id FROM product WHERE name = 'Amazone Papagei Mix';
  INSERT INTO review (author, content, rating, title, date, product_id) VALUES
  ('Julia Lange', 'Meine Papageien lieben es. Gute Mischung.', 5, 'Gute Mischung', '2024-05-17 14:10:00', product_id);
END $$;

DO $$
DECLARE
  product_id UUID;
BEGIN
  SELECT id INTO product_id FROM product WHERE name = 'Holz Vogelkäfig Robin XXL';
  INSERT INTO review (author, content, rating, title, date, product_id) VALUES
  ('Bernd Scholz', 'Viel Platz und schön verarbeitet. Empfehlenswert.', 5, 'Viel Platz', '2024-05-18 10:30:00', product_id),
  ('Heike Schwarz', 'Gute Qualität, aber schwer zu reinigen.', 3, 'Schwer zu reinigen', '2024-05-19 12:45:00', product_id),
  ('Matthias Lehmann', 'Toller Käfig, aber etwas teuer.', 4, 'Toller Käfig', '2024-05-20 16:00:00', product_id);
END $$;

DO $$
DECLARE
  product_id UUID;
BEGIN
  SELECT id INTO product_id FROM product WHERE name = 'Papageienfreisitz aus Java Holz';
  INSERT INTO review (author, content, rating, title, date, product_id) VALUES
  ('Uwe Müller', 'Sehr stabil und schön. Meine Vögel lieben es.', 5, 'Sehr stabil', '2024-05-25 09:20:00', product_id);
END $$;

DO $$
DECLARE
  product_id UUID;
BEGIN
  SELECT id INTO product_id FROM product WHERE name = 'Badehaus Splash Giant';
  INSERT INTO review (author, content, rating, title, date, product_id) VALUES
  ('Bettina Meier', 'Gute Qualität und leicht zu reinigen.', 5, 'Leicht zu reinigen', '2024-05-26 11:10:00', product_id),
  ('Frank Sommer', 'Meine Vögel lieben es. Sehr empfehlenswert.', 4, 'Sehr empfehlenswert', '2024-05-27 13:50:00', product_id);
END $$;
