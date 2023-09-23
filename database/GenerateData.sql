USE watchstore;

# USER_TYPE TABLE
INSERT INTO USER_TYPE VALUES ('ADMIN');
INSERT INTO USER_TYPE VALUES ('CLIENT');

# ACCOUNT TABLE
INSERT INTO ACCOUNT (Username, Password, UserType) VALUES ('admin', 'admin', 'ADMIN');
    
# BRAND TABLE
INSERT INTO BRAND VALUES ('ROLEX');
INSERT INTO BRAND VALUES ('CASIO');
INSERT INTO BRAND VALUES ('HUBLOX');
INSERT INTO BRAND VALUES ('MOVADO');
INSERT INTO BRAND VALUES ('FREDERIQUE CONSTANT');
INSERT INTO BRAND VALUES ('NAKZEN');
INSERT INTO BRAND VALUES ('CITIZEN');
    
# WATCH_CHAIN TABLE
INSERT INTO WATCH_CHAIN VALUES ('Leather');
INSERT INTO WATCH_CHAIN VALUES ('Metal');
INSERT INTO WATCH_CHAIN VALUES ('Silicon');
    
# WATCH_FACE_MATERIAL TABLE
INSERT INTO WATCH_FACE_MATERIAL VALUES ('Shapphire');
INSERT INTO WATCH_FACE_MATERIAL VALUES ('Mineral');
INSERT INTO WATCH_FACE_MATERIAL VALUES ('Plastic Resin');
    
# DIAL_TYPE TABLE
INSERT INTO DIAL_TYPE VALUES ('Analog');
INSERT INTO DIAL_TYPE VALUES ('Digital');
INSERT INTO DIAL_TYPE VALUES ('Ana-Digi');
    
# WATCH_FACE_SHAPE TABLE
INSERT INTO WATCH_FACE_SHAPE VALUES ('Square');
INSERT INTO WATCH_FACE_SHAPE VALUES ('Circle');
INSERT INTO WATCH_FACE_SHAPE VALUES ('Rectangle');
    
# WATCH_MACHINE TABLE
INSERT INTO WATCH_MACHINE VALUES ('Automatic');
INSERT INTO WATCH_MACHINE VALUES ('Using Battery');
INSERT INTO WATCH_MACHINE VALUES ('Lighting Energy');
    
# FOR_OBJECT TABLE 
INSERT INTO FOR_OBJECT VALUES ('Male');
INSERT INTO FOR_OBJECT VALUES ('Female');
INSERT INTO FOR_OBJECT VALUES ('Unisex');
INSERT INTO FOR_OBJECT VALUES ('Couple');

# PRODUCT TABLE
INSERT INTO PRODUCT (Title, BrandName, Chain, FaceMaterial, Dial, FaceShape, Machine, ForObject, CurrentPrice, HasLeft)
	VALUES ('MOVADO 0605560', 'MOVADO', 'Metal', 'Shapphire', 'Analog', 'Rectangle', 'Using Battery', 'Male', 1867, 10);
INSERT INTO PRODUCT (Title, BrandName, Chain, FaceMaterial, Dial, FaceShape, Machine, ForObject, CurrentPrice, HasLeft)
	VALUES ('MOVADO 0606473', 'MOVADO', 'Metal', 'Shapphire', 'Analog', 'Rectangle', 'Using Battery', 'Female', 1193, 10);
INSERT INTO PRODUCT (Title, BrandName, Chain, FaceMaterial, Dial, FaceShape, Machine, ForObject, CurrentPrice, HasLeft)
	VALUES ('FRE CON 200MC14', 'FREDERIQUE CONSTANT', 'Leather', 'Shapphire', 'Analog', 'Rectangle', 'Using Battery', 'Female', 864, 10);
INSERT INTO PRODUCT (Title, BrandName, Chain, FaceMaterial, Dial, FaceShape, Machine, ForObject, CurrentPrice, HasLeft)
	VALUES ('Nakzen SL4118GBN-7', 'NAKZEN', 'Leather', 'Mineral', 'Analog', 'Circle', 'Using Battery', 'Couple', 70, 10);
INSERT INTO PRODUCT (Title, BrandName, Chain, FaceMaterial, Dial, FaceShape, Machine, ForObject, CurrentPrice, HasLeft)
	VALUES ('Citizen BN2036-14E', 'CITIZEN', 'Silicon', 'Mineral', 'Analog', 'Circle', 'Using Battery', 'Male', 617, 10);
    
# LINK_IMAGE TABLE
INSERT INTO LINK_IMAGE VALUES (1, 'https://cdn.tgdd.vn/Products/Images/7264/246003/dong-ho-movado-0605560-nam.jpg');
INSERT INTO LINK_IMAGE VALUES (1, 'https://cdn.tgdd.vn/Products/Images/7264/246003/movado-0605560-nam-2.jpg');
INSERT INTO LINK_IMAGE VALUES (1, 'https://cdn.tgdd.vn/Products/Images/7264/246003/movado-0605560-nam-3.jpg');
INSERT INTO LINK_IMAGE VALUES (2, 'https://cdn.tgdd.vn/Products/Images/7264/245915/movado-0606473-nu-1-org.jpg');
INSERT INTO LINK_IMAGE VALUES (2, 'https://cdn.tgdd.vn/Products/Images/7264/245915/movado-0606473-nu-2.jpg');
INSERT INTO LINK_IMAGE VALUES (2, 'https://cdn.tgdd.vn/Products/Images/7264/245915/movado-0606473-nu-4.jpg');
INSERT INTO LINK_IMAGE VALUES (3, 'https://cdn.tgdd.vn/Products/Images/7264/245274/frederique-constant-fc-200mc14-nu1-org.jpg');
INSERT INTO LINK_IMAGE VALUES (3, 'https://cdn.tgdd.vn/Products/Images/7264/245274/frederique-constant-fc-200mc14-nu2-org.jpg');
INSERT INTO LINK_IMAGE VALUES (3, 'https://cdn.tgdd.vn/Products/Images/7264/245274/frederique-constant-fc-200mc14-nu3-org.jpg');
INSERT INTO LINK_IMAGE VALUES (4, 'https://cdn.tgdd.vn/Products/Images/7264/304717/nakzen-sl4118gbn-7-sl4118lbn-7-thumb-600x600.jpg');
INSERT INTO LINK_IMAGE VALUES (4, 'https://cdn.tgdd.vn/Products/Images/7264/236064/nakzen-sl4118gbn-7-nam-up-4-org.jpg');
INSERT INTO LINK_IMAGE VALUES (4, 'https://cdn.tgdd.vn/Products/Images/7264/236064/nakzen-sl4118gbn-7-nam-up-5-org.jpg');
INSERT INTO LINK_IMAGE VALUES (5, 'https://cdn.tgdd.vn/Products/Images/7264/313025/citizen-bn2036-14e-nam-1.jpg');
INSERT INTO LINK_IMAGE VALUES (5, 'https://cdn.tgdd.vn/Products/Images/7264/313025/citizen-bn2036-14e-nam-2.jpg');
INSERT INTO LINK_IMAGE VALUES (5, 'https://cdn.tgdd.vn/Products/Images/7264/313025/citizen-bn2036-14e-nam-3.jpg');