-- Insert data into users table
INSERT INTO users (is_truck_owner, created_on, user_id, user_email, user_name, user_type)
VALUES
    (true, NOW(), 1, 'owner@example.com', 'TruckOwner1', 'TRUCK'),
    (false, NOW(), 2, 'customer@example.com', 'Customer1', 'CUSTOMER'),
    (true, NOW(), 3, 'owner2@example.com', 'TruckOwner2', 'TRUCK'),
    (false, NOW(), 4, 'customer2@example.com', 'Customer2', 'CUSTOMER'),
    (true, NOW(), 5, 'owner3@example.com', 'TruckOwner3', 'TRUCK'),
    (false, NOW(), 6, 'customer3@example.com', 'Customer3', 'CUSTOMER');

-- Insert data into trucks table
INSERT INTO trucks (truck_id, user_id, description, truck_name)
VALUES
    (1, 1, 'Best food truck in town', 'Truck A'),
    (2, 3, 'Delicious street food', 'Truck B'),
    (3, 5, 'Gourmet burgers and fries', 'Truck C');

-- Insert data into schedule table
INSERT INTO schedule (latitude, longitude, end_time, start_time, truck_id, location_name)
VALUES
    (34.0522, -118.2437, TIMESTAMP '2024-07-20 18:00:00', TIMESTAMP '2024-07-20 10:00:00', 1, 'Downtown Plaza'),
    (34.0522, -118.2437, TIMESTAMP '2024-07-21 18:00:00', TIMESTAMP '2024-07-21 10:00:00', 2, 'Uptown Mall'),
    (34.0522, -118.2437, TIMESTAMP '2024-07-22 18:00:00', TIMESTAMP '2024-07-22 10:00:00', 3, 'City Park');

-- Insert data into favourites table
INSERT INTO favourites (added_at, truck_id, user_id)
VALUES
    (NOW(), 1, 2),
    (NOW(), 2, 4),
    (NOW(), 3, 6);

-- Insert data into reviews table
INSERT INTO reviews (rating, created_on, truck_id, user_id, text)
VALUES
    (5, NOW(), 1, 2, 'Amazing food, will definitely visit again!'),
    (4, NOW(), 2, 4, 'Great taste, but a bit pricey.'),
    (3, NOW(), 3, 6, 'Nice variety of menu items.'),
    (5, NOW(), 1, 4, 'Excellent service and quality.'),
    (2, NOW(), 2, 5, 'Food was okay, could be better.'),
    (4, NOW(), 3, 2, 'Good experience overall.');
