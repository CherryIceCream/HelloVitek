public class Zoo {

    public static class Kletka {

        public static class Animal {
            private String typeAnimal;
            private String color;

            public Animal(String typeAnimal, String color) {
                this.typeAnimal = typeAnimal;
                this.color = color;
            }

            public  String getTypeAnimal() {
                return typeAnimal;
            }

            public String getColor() {
                return color;
            }

            public void Golos() {
                if (typeAnimal.equals("Лев"))
                    System.out.println(typeAnimal + " рычит!");
                else if (typeAnimal.equals("Кенгуру"))
                    System.out.println(typeAnimal + " кричит что-то на австралийском");
            }


            public void Vstal() {
                if (typeAnimal.equals("Кенгуру")) {
                    System.out.println(typeAnimal + " встал на хвост!");
                } else {
                    System.out.println(typeAnimal + " встал на лапы!");
                }
            }

            public static class Lion extends Animal {
                public Lion(String typeAnimal, String color) {
                    super(typeAnimal, color);
                }
            }

            public static class Kango extends Animal {
                public Kango(String typeAnimal, String color) {
                    super(typeAnimal, color);
                }
            }
        }
    }
    public static void main(String[] args) {
        Kletka.Animal.Lion lev = new Kletka.Animal.Lion("Лев", "зеленый");
        lev.Golos();
        lev.Vstal();

        Kletka.Animal.Kango kango = new Kletka.Animal.Kango("Кенгуру", "желтый");
        kango.Golos();
        kango.Vstal();
    }
}
