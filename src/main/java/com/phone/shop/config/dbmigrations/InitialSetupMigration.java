package com.phone.shop.config.dbmigrations;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.phone.shop.entity.Phone;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.math.BigDecimal;

@ChangeLog(order = "001")
public class InitialSetupMigration {

    @ChangeSet(order = "01", author = "initiator", id = "01-addPhones")
    public void addPhones(MongoTemplate mongoTemplate) {
        final Phone iphone11 = new Phone();
        iphone11.setName("Iphone 11");
        iphone11.setDescription("Экран (6.1\", IPS (Liquid Retina HD), 1792x828)/ Apple A13 Bionic/ основная двойная камера: 12 Мп + 12 Мп, фронтальная камера: 12 Мп/ RAM 4 ГБ/ 128 ГБ встроенной памяти/ 3G/ LTE/ GPS/ ГЛОНАСС/ Nano-SIM/ iOS 13 / 3046 мА*ч");
        iphone11.setPrice(new BigDecimal(400));
        iphone11.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(iphone11);

        final Phone iphone7 = new Phone();
        iphone7.setName("Iphone 7");
        iphone7.setDescription("Экран (4.7\", IPS, 1334x750)/ Apple A10 Fusion/ основная камера: 12 Мп, фронтальная камера: 7 Мп/ RAM 2 ГБ/ 32 ГБ встроенной памяти/ 3G/ LTE/ GPS/ Nano-SIM/ iOS 10");
        iphone7.setPrice(new BigDecimal(600));
        iphone7.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(iphone7);

        final Phone samsungS9 = new Phone();
        samsungS9.setName("Samsung S9");
        samsungS9.setDescription("Экран (5.8\", Super AMOLED, 2960х1440)/ Samsung Exynos 9810 (4 x 2.7 ГГц + 4 x 1.7 ГГц)/ основная камера 12 Мп + фронтальная 8 Мп/ RAM 4 ГБ/ 64 ГБ встроенной памяти + microSD (до 400 ГБ)/ 3G/ LTE/ GPS/ поддержка 2х SIM-карт (Nano-SIM)/ Android 8.0 (Oreo) / 3000 мА*ч\n" +
                "Поддерживается установка двух SIM-карт или одной SIM-карты и карты памяти. Слот для второй SIM-карты совмещен со слотом для карты памяти.");
        samsungS9.setPrice(new BigDecimal(300));
        samsungS9.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(samsungS9);

        final Phone huaweiPSmart = new Phone();
        huaweiPSmart.setName("Huawei P Smart");
        huaweiPSmart.setDescription("Экран (6.21\", IPS, 2340x1080)/ HiSilicon Kirin 710 (4 x 2.2 ГГц + 4 x 1.7 ГГц)/ две основные камеры: 13 Мп + 2 Мп, фронтальная камера: 8 Мп/ RAM 3 ГБ/ 64 ГБ встроенной памяти + microSD (до 512 ГБ)/ 3G/ LTE/ GPS/ GLONASS/ поддержка 2х SIM-карт (Nano-SIM)/ Android 9.0 (Pie)/ 3400 мА*ч");
        huaweiPSmart.setPrice(new BigDecimal(100));
        huaweiPSmart.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(huaweiPSmart);

        final Phone iphoneXR = new Phone();
        iphoneXR.setName("Iphone Xr");
        iphoneXR.setDescription("Экран (6.1\", IPS, 1792x828)/ Apple A12 Bionic/ основная камера: 12 Мп, фронтальная камера: 7 Мп/ RAM 3 ГБ/ 64 ГБ встроенной памяти/ 3G/ LTE/ GPS/ Nano-SIM/ iOS 12");
        iphoneXR.setPrice(new BigDecimal(700));
        iphoneXR.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(iphoneXR);

        final Phone iphone11Pro = new Phone();
        iphone11Pro.setName("Iphone 11 Pro");
        iphone11Pro.setDescription("Экран (5.8\", OLED (Super Retina XDR), 2436x1125)/ Apple A13 Bionic/ основная тройная камера: 12 Мп + 12 Мп + 12 Мп, фронтальная камера: 12 Мп/ RAM 4 ГБ/ 256 ГБ встроенной памяти/ 3G/ LTE/ GPS/ ГЛОНАСС/ Nano-SIM/ iOS 13");
        iphone11Pro.setPrice(new BigDecimal(700));
        iphone11Pro.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(iphone11Pro);

        final Phone iphone11ProMax = new Phone();
        iphone11ProMax.setName("Iphone 11 Pro Max");
        iphone11ProMax.setDescription("Экран (6.5\", OLED (Super Retina XDR), 2688x1242)/ Apple A13 Bionic/ основная тройная камера: 12 Мп + 12 Мп + 12 Мп, фронтальная камера: 12 Мп/ RAM 4 ГБ/ 256 ГБ встроенной памяти/ 3G/ LTE/ GPS/ ГЛОНАСС/ Nano-SIM/ iOS 13");
        iphone11ProMax.setPrice(new BigDecimal(700));
        iphone11ProMax.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(iphone11ProMax);

        final Phone iphoneXsMax = new Phone();
        iphoneXsMax.setName("Iphone Xs Max");
        iphoneXsMax.setDescription("Экран (6.5\", OLED (Super Retina XDR), 2688x1242)/ Apple A13 Bionic/ основная тройная камера: 12 Мп + 12 Мп + 12 Мп, фронтальная камера: 12 Мп/ RAM 4 ГБ/ 256 ГБ встроенной памяти/ 3G/ LTE/ GPS/ ГЛОНАСС/ Nano-SIM/ iOS 13");
        iphoneXsMax.setPrice(new BigDecimal(700));
        iphoneXsMax.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(iphoneXsMax);

        final Phone iphone7Plus = new Phone();
        iphone7Plus.setName("Iphone 7 Plus");
        iphone7Plus.setDescription("Экран (5.5\", IPS, 1920x1080)/ Apple A10 Fusion/ основная камера: двойная 12 Мп, фронтальная камера: 7 Мп/ RAM 3 ГБ/ 32 ГБ встроенной памяти/ 3G/ LTE/ GPS/ Nano-SIM/ iOS 10");
        iphone7Plus.setPrice(new BigDecimal(900));
        iphone7Plus.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(iphone7Plus);

        final Phone samsungS20Ultra = new Phone();
        samsungS20Ultra.setName("Samsung Galaxy S20 Ultra");
        samsungS20Ultra.setDescription("Экран (6.9\", Dynamic AMOLED 2X, 3200x1440)/ Samsung Exynos 990 (2 x 2.73 ГГц + 2 x 2.5 ГГц + 4 x 2.0 ГГц)/ основная квадро-камера: 108 Мп + 48 Мп + 12 Мп + ToF, фронтальная: 40 Мп / RAM 12 ГБ/ 128 ГБ встроенной памяти + microSD (до 1 ТБ)/ 3G/ LTE/ 5G /GPS/ поддержка 2х SIM-карт (Nano-SIM)/ Android 10.0 (Q) / 5000 мА*ч");
        samsungS20Ultra.setPrice(new BigDecimal(1500));
        samsungS20Ultra.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(samsungS20Ultra);

        final Phone samsungS20Plus = new Phone();
        samsungS20Plus.setName("Samsung Galaxy S20 Plus");
        samsungS20Plus.setDescription("Экран (6.7\", Dynamic AMOLED 2X, 3200x1440)/ Samsung Exynos 990 (2 x 2.73 ГГц + 2 x 2.5 ГГц + 4 x 2.0 ГГц)/ основная квадро-камера: 12 Мп + 64 Мп + 12 Мп + ToF, фронтальная: 10 Мп / RAM 8 ГБ/ 128 ГБ встроенной памяти + microSD (до 1 ТБ)/ 3G/ LTE/ GPS/ поддержка 2х SIM-карт (Nano-SIM)/ Android 10.0 (Q) / 4500 мА*ч");
        samsungS20Plus.setPrice(new BigDecimal(1200));
        samsungS20Plus.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(samsungS20Plus);

        final Phone samsungA51 = new Phone();
        samsungA51.setName("Samsung Galaxy A51");
        samsungA51.setDescription("Экран (6.5\", Super AMOLED, 2400x1080)/ Samsung Exynos 9611 (2.3 ГГц + 1.7 ГГц)/ основная квадро-камера: 48 Мп + 12 Мп + 5 Мп + 5 Мп, фронтальная 32 Мп/ RAM 6 ГБ/ 128 ГБ встроенной памяти + microSD (до 512 ГБ)/ 3G/ LTE/ GPS/ поддержка 2х SIM-карт (Nano-SIM)/ Android 10.0 (Q)/ 4000 мА*ч");
        samsungA51.setPrice(new BigDecimal(600));
        samsungA51.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(samsungA51);

        final Phone samsungS10Lite = new Phone();
        samsungS10Lite.setName("Samsung Galaxy S10 Lite");
        samsungS10Lite.setDescription("Экран (6.7\", Super AMOLED Plus, 2400x1080)/ Qualcomm Snapdragon 855 (1 x 2.8 ГГц + 2 x 2.4 ГГц + 4 x 1.7 ГГц)/ тройная основная камера: 48 Мп + 12 Мп + 5 Мп/ фронтальная: 32 Мп / RAM 6 ГБ/ 128 ГБ встроенной памяти + microSD (до 1 ТБ)/ 3G/ LTE/ GPS/ A-GPS/ ГЛОНАСС/ BDS/ поддержка 2х SIM-карт (Nano-SIM)/ Android 10 (Q)/ 4500 мА*ч");
        samsungS10Lite.setPrice(new BigDecimal(700));
        samsungS10Lite.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(samsungS10Lite);

        final Phone samsungNote10Lite = new Phone();
        samsungNote10Lite.setName("Samsung Galaxy Note 10 Lite");
        samsungNote10Lite.setDescription("Экран (6.7\", Super AMOLED Plus, 2400x1080)/ Qualcomm Snapdragon 855 (1 x 2.8 ГГц + 2 x 2.4 ГГц + 4 x 1.7 ГГц)/ тройная основная камера: 48 Мп + 12 Мп + 5 Мп/ фронтальная: 32 Мп / RAM 6 ГБ/ 128 ГБ встроенной памяти + microSD (до 1 ТБ)/ 3G/ LTE/ GPS/ A-GPS/ ГЛОНАСС/ BDS/ поддержка 2х SIM-карт (Nano-SIM)/ Android 10 (Q)/ 4500 мА*ч");
        samsungNote10Lite.setPrice(new BigDecimal(1100));
        samsungNote10Lite.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(samsungNote10Lite);

        final Phone samsungS20 = new Phone();
        samsungS20.setName("Samsung Galaxy S20");
        samsungS20.setDescription("Экран (6.9\", Dynamic AMOLED 2X, 3200x1440)/ Samsung Exynos 990 (2 x 2.73 ГГц + 2 x 2.5 ГГц + 4 x 2.0 ГГц)/ основная квадро-камера: 108 Мп + 48 Мп + 12 Мп + ToF, фронтальная: 40 Мп / RAM 12 ГБ/ 128 ГБ встроенной памяти + microSD (до 1 ТБ)/ 3G/ LTE/ 5G /GPS/ поддержка 2х SIM-карт (Nano-SIM)/ Android 10.0 (Q) / 5000 мА*ч");
        samsungS20.setPrice(new BigDecimal(900));
        samsungS20.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(samsungS20);

        final Phone samsungS20T = new Phone();
        samsungS20T.setName("Samsung Galaxy S20 64G");
        samsungS20T.setDescription("Экран (6.9\", Dynamic AMOLED 2X, 3200x1440)/ Samsung Exynos 990 (2 x 2.73 ГГц + 2 x 2.5 ГГц + 4 x 2.0 ГГц)/ основная квадро-камера: 108 Мп + 48 Мп + 12 Мп + ToF, фронтальная: 40 Мп / RAM 12 ГБ/ 128 ГБ встроенной памяти + microSD (до 1 ТБ)/ 3G/ LTE/ 5G /GPS/ поддержка 2х SIM-карт (Nano-SIM)/ Android 10.0 (Q) / 5000 мА*ч");
        samsungS20T.setPrice(new BigDecimal(900));
        samsungS20T.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(samsungS20T);

        final Phone iphone8 = new Phone();
        iphone8.setName("Iphone 8");
        iphone8.setDescription("Экран (4.7\", IPS, 1334x750)/ Apple A10 Fusion/ основная камера: 12 Мп, фронтальная камера: 7 Мп/ RAM 2 ГБ/ 32 ГБ встроенной памяти/ 3G/ LTE/ GPS/ Nano-SIM/ iOS 10");
        iphone8.setPrice(new BigDecimal(600));
        iphone8.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(iphone8);

        final Phone huaweiP20 = new Phone();
        huaweiP20.setName("Huawei P20");
        huaweiP20.setDescription("Экран (6.21\", IPS, 2340x1080)/ HiSilicon Kirin 710 (4 x 2.2 ГГц + 4 x 1.7 ГГц)/ две основные камеры: 13 Мп + 2 Мп, фронтальная камера: 8 Мп/ RAM 3 ГБ/ 64 ГБ встроенной памяти + microSD (до 512 ГБ)/ 3G/ LTE/ GPS/ GLONASS/ поддержка 2х SIM-карт (Nano-SIM)/ Android 9.0 (Pie)/ 3400 мА*ч");
        huaweiP20.setPrice(new BigDecimal(100));
        huaweiP20.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(huaweiP20);

        final Phone huaweiP10 = new Phone();
        huaweiP10.setName("Huawei P10");
        huaweiP10.setDescription("Экран (6.21\", IPS, 2340x1080)/ HiSilicon Kirin 710 (4 x 2.2 ГГц + 4 x 1.7 ГГц)/ две основные камеры: 13 Мп + 2 Мп, фронтальная камера: 8 Мп/ RAM 3 ГБ/ 64 ГБ встроенной памяти + microSD (до 512 ГБ)/ 3G/ LTE/ GPS/ GLONASS/ поддержка 2х SIM-карт (Nano-SIM)/ Android 9.0 (Pie)/ 3400 мА*ч");
        huaweiP10.setPrice(new BigDecimal(100));
        huaweiP10.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(huaweiP10);

        final Phone iphoneXRMax = new Phone();
        iphoneXRMax.setName("Iphone Xr Max");
        iphoneXRMax.setDescription("Экран (6.1\", IPS, 1792x828)/ Apple A12 Bionic/ основная камера: 12 Мп, фронтальная камера: 7 Мп/ RAM 3 ГБ/ 64 ГБ встроенной памяти/ 3G/ LTE/ GPS/ Nano-SIM/ iOS 12");
        iphoneXRMax.setPrice(new BigDecimal(700));
        iphoneXRMax.setImagePath("../../../assets/images/apple_iphone_7.jpg");
        mongoTemplate.save(iphoneXRMax);
    }
}
