//จากโค้ดด้านล่าง เราจะสามารถเขียน  specification ได้โดย
//1. gotATK() ใน Mage
//Preconditions:
//ไม่มี
//Postconditions:
//ค่าที่คืนคือผลรวมของค่า ATK และ magicDamage ที่ถูกคำนวณมา
//Side Effects:
//ไม่มี side effects
//อธิบาย:
//methodนี้คำนวณและคืนค่า ATK ที่ถูกเพิ่มขึ้นด้วยความเสียหายจากทางเวทย์ (magicDamage) ของตัวละคร Mage
//
//2. gotHP() ใน Mage และ Tank
//Preconditions:
//ไม่มี
//Postconditions:
//ค่าที่คืนคือค่า HP ปัจจุบันของตัวละคร
//Side Effects:
//ไม่มี side effects
//อธิบาย:
//methodนี้คืนค่า HP ปัจจุบันของตัวละคร Mage หรือ Tank ซึ่งเป็นค่าที่ถูกกำหนดไว้ตั้งแต่เริ่มต้น
//
//3. Teleport() ใน Mage
//Preconditions:
//ไม่มี
//Postconditions:
//ไม่มี postconditions เนื่องจากเป็น methodที่ไม่คืนค่า
//Side Effects:
//แสดงข้อความ "Teleporting to a magical location!" ที่อาจมีผลกระทบต่อการแสดงผลหรือสถานะของระบบ
//อธิบาย:
//methodนี้ให้ความสามารถในการเคลื่อนที่ทางเวทย์ (Teleport) และแสดงข้อความที่บอกถึงการ Teleport นั้น
//
//4. job() ใน Mage และ Tank
//Preconditions:
//ไม่มี
//Postconditions:
//ค่าที่คืนคือชื่อของอาชีพของตัวละคร (เช่น "Mage" หรือ "Tank")
//Side Effects:
//ไม่มี side effects
//อธิบาย:
//methodนี้คืนค่าชื่อของอาชีพของตัวละคร (job) ซึ่งถูกกำหนดไว้ตั้งแต่เริ่มต้น
//
//5. hat() ใน Accessories
//Preconditions:
//ไม่มี
//Postconditions:
//ค่าที่คืนคือค่าที่บวกเข้ากับ ATK ของตัวละครเมื่อใส่หมวกน่ารัก
//Side Effects:
//ไม่มี side effects
//อธิบาย:
//methodนี้คืนค่า ATK เพิ่มขึ้น 10 เมื่อตัวละครใส่หมวกน่ารัก (Power-up lovely hat)
//
//6.  (enboot(), neckless(), spplus()) ใน Accessories
//Preconditions:
//ไม่มี
//Postconditions:
//ค่าที่คืนคือค่าที่บวกเข้ากับ HP, defense, หรือ speed ของตัวละครตามที่ระบุไว้ในแต่ละmethod
//Side Effects:
//ไม่มี side effects
//อธิบาย:
//methทั้งหมดนี้คืนค่าที่บวกเข้ากับค่า HP, defense, หรือ speed ของตัวละครเมื่อใส่อุปกรณ์ที่ระบุไว้ตามชื่อของmethod








//// RPGCharacter.java
//public abstract class RPGCharacter {
//    protected int HP;
//    protected int ATK;
//
//    public abstract int gotATK();
//    public abstract int gotHP();
//}
//
//// Mage.java
//public class Mage extends RPGCharacter {
//    private int magicDamage;
//
//    public Mage() {
//        this.HP = 150;
//        this.ATK = 50;
//        this.magicDamage = 20; // เพิ่มความเสียหายจากทางเวทย์
//    }
//
//    @Override
//    public int gotATK() {
//        return ATK + magicDamage;
//    }
//
//    @Override
//    public int gotHP() {
//        return HP;
//    }
//
//    //  Teleport สำหรับการเคลื่อนที่ทางเวทย์
//    public void Teleport() {
//        System.out.println("Teleporting to a magical location!");
//    }
//
//    // job() สำหรับกำหนด job ของตัวละคร
//    public String job() {
//        return "Mage";
//    }
//}
//
//// Tank.java
//public class Tank extends RPGCharacter {
//    private int defense;
//
//    public Tank() {
//        this.HP = 300;
//        this.ATK = 10;
//        this.defense = 50; // เพิ่มความเกราะ
//    }
//
//    @Override
//    public int gotATK() {
//        return ATK;
//    }
//
//    @Override
//    public int gotHP() {
//        return HP;
//    }
//
//    //  job() สำหรับกำหนด job ของตัวละคร
//    public String job() {
//        return "Tank";
//    }
//}
//
//// Accessories.java
//public class Accessories {
//    private int enboot() {
//        return 50; // เพิ่ม HP
//    }
//
//    private int hat() {
//        return 10; // เพิ่ม ATK
//    }
//
//    private int neckless() {
//        return 30; // เพิ่ม defense
//    }
//
//    private int spplus() {
//        return 50; // เพิ่มความเร็ว
//    }
//
//    // gotATK() สำหรับการรวม ATK จากอุปกรณ์
//    public int gotATK() {
//        return hat();
//    }
//
//    //  gotHP() สำหรับการรวม HP จากอุปกรณ์
//    public int gotHP() {
//        return enboot();
//    }
//
//    //  gotDef() สำหรับการรวม defense จากอุปกรณ์
//    public int gotDef() {
//        return neckless();
//    }
//
//    // เ gotSpeed() สำหรับการรวมความเร็วจากอุปกรณ์
//    public int gotSpeed() {
//        return spplus();
//    }
//}